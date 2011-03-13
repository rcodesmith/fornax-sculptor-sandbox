package org.customer.inquiry.serviceapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.customer.inquiry.domain.Supplier;
import org.fornax.cartridges.sculptor.framework.test.AbstractAppEngineJpaTests;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

/**
 * Spring based test with GAE support.
 */
public class SupplierServiceTest extends AbstractAppEngineJpaTests implements SupplierServiceTestBase {
    private final Log log = LogFactory.getLog(SupplierServiceTest.class);
    private SupplierService supplierService;

    @Autowired
    public void setSupplierService(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @Before
    public void populateDatastore() {
        try {
            Supplier supplier1 = new Supplier("S1");
            getEntityManager().persist(supplier1);

            Supplier supplier2 = new Supplier("S2");
            getEntityManager().persist(supplier2);

        } catch (RuntimeException e) {
            log.error("Problem populating datastore: " + e.getMessage(), e);
            throw e;
        }
    }

    @Test
    public void testFindById() throws Exception {
        Key key = KeyFactory.createKey(Supplier.class.getSimpleName(), 1L);
        Supplier found = supplierService.findById(getServiceContext(), key);
        assertNotNull(found);
        assertEquals("S1", found.getName());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Supplier> all = supplierService.findAll(getServiceContext());
        assertEquals(2, all.size());
    }

    @Test
    public void testSave() throws Exception {
        int countBefore = countRowsInTable(Supplier.class);
        Supplier supplier3 = new Supplier("S3");
        supplierService.save(getServiceContext(), supplier3);
        assertEquals(countBefore + 1, countRowsInTable(Supplier.class));
    }

    @Test
    public void testDelete() throws Exception {
        int countBefore = countRowsInTable(Supplier.class);
        Key key = KeyFactory.createKey(Supplier.class.getSimpleName(), 1L);
        Supplier found = supplierService.findById(getServiceContext(), key);
        supplierService.delete(getServiceContext(), found);
        assertEquals(countBefore - 1, countRowsInTable(Supplier.class));
    }

    @Test
    public void testFindByName() throws Exception {
        Supplier found = supplierService.findByName(getServiceContext(), "S2");
        assertNotNull(found);
        assertEquals("S2", found.getName());

    }
}
