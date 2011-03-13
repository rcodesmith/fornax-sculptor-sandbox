package org.supplier.sales.serviceapi;

import org.fornax.cartridges.sculptor.framework.test.AbstractAppEngineJpaTests;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based test with Google App Engine support.
 */
public class SalesmanServiceTest extends AbstractAppEngineJpaTests implements SalesmanServiceTestBase {
    private SalesmanService salesmanService;

    @Autowired
    public void setSalesmanService(SalesmanService salesmanService) {
        this.salesmanService = salesmanService;
    }

    @Before
    public void populateDatastore() {

        // here you can add objects to data store before test methods are executed
        // getEntityManager().persist(obj);
    }

    @Test
    public void testFindById() throws Exception {
        // TODO Auto-generated method stub
    }

    @Test
    public void testFindAll() throws Exception {
        // TODO Auto-generated method stub
    }

    @Test
    public void testSave() throws Exception {
        // TODO Auto-generated method stub
    }

    @Test
    public void testDelete() throws Exception {
        // TODO Auto-generated method stub
    }
}
