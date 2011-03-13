package org.customer.inquiry.serviceapi;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.customer.inquiry.domain.Inquiry;
import org.customer.inquiry.domain.Supplier;
import org.customer.inquiry.repositoryimpl.InquirySender;
import org.fornax.cartridges.sculptor.framework.test.AbstractAppEngineJpaTests;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

/**
 * Spring based test with GAE support.
 */
public class InquiryServiceTest extends AbstractAppEngineJpaTests implements InquiryServiceTestBase {
    @Autowired
    private InquiryService inquiryService;

    @Autowired
    private InquirySender inquirySenderMock;

    @Before
    public void initMock() {
        when(this.inquirySenderMock.sendInquiryToSupplier(any(Inquiry.class), any(Supplier.class))).thenReturn(true);
    }

    @Before
    public void populateDatastore() {
        Inquiry inquiry1 = new Inquiry();
        inquiry1.setMessage("M1");
        inquiry1.setOwnerEmail("foo@gmail.com2");
        getEntityManager().persist(inquiry1);

        Inquiry inquiry2 = new Inquiry();
        inquiry2.setMessage("M2");
        inquiry2.setOwnerEmail("boo@gmail.com2");
        getEntityManager().persist(inquiry2);

        Supplier supplier1 = new Supplier("S1");
        supplier1.setUrl("http://localhost:8081/rest/inquiry");
        getEntityManager().persist(supplier1);

        Supplier supplier2 = new Supplier("S2");
        supplier2.setUrl("http://localhost:8081/rest/inquiry");
        getEntityManager().persist(supplier2);
    }

    @Test
    public void testFindById() throws Exception {
        Inquiry found = inquiryService.findById(getServiceContext(), KeyFactory.createKey(
                Inquiry.class.getSimpleName(), 1L));
        assertEquals("M1", found.getMessage());
        assertNotNull(found.getCreatedBy());
        assertNotNull(found.getCreatedDate());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Inquiry> found = inquiryService.findAll(getServiceContext());
        assertEquals(2, found.size());
    }

    @Test
    public void testSave() throws Exception {
        int countBefore = countRowsInTable(Inquiry.class);
        Inquiry inquiry = new Inquiry();
        inquiry.setMessage("abc");
        inquiryService.save(getServiceContext(), inquiry);
        assertEquals(countBefore + 1, countRowsInTable(Inquiry.class));
    }

    @Test
    public void testDelete() throws Exception {
        int countBefore = countRowsInTable(Inquiry.class);
        Inquiry found = inquiryService.findById(getServiceContext(), KeyFactory.createKey(
                Inquiry.class.getSimpleName(), 2L));
        inquiryService.delete(getServiceContext(), found);
        assertEquals(countBefore - 1, countRowsInTable(Inquiry.class));
    }

    @Test
    public void testSendInquiry() throws Exception {
        Key key = KeyFactory.createKey(Inquiry.class.getSimpleName(), 1L);
        boolean ok = inquiryService.sendInquiry(getServiceContext(), key);
        assertTrue(ok);
        // there are 2 suppliers
        verify(inquirySenderMock, times(2)).sendInquiryToSupplier(any(Inquiry.class), any(Supplier.class));
    }
}
