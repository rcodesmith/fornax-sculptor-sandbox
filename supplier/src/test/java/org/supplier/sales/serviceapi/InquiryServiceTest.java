package org.supplier.sales.serviceapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fornax.cartridges.sculptor.framework.test.AbstractAppEngineJpaTests;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.supplier.sales.domain.Inquiry;
import org.supplier.sales.domain.Offer;

import com.google.appengine.api.datastore.KeyFactory;

/**
 * Spring based test with DbUnit support.
 */
public class InquiryServiceTest extends AbstractAppEngineJpaTests implements InquiryServiceTestBase {
    private final Log log = LogFactory.getLog(InquiryServiceTest.class);
    private InquiryService inquiryService;

    @Autowired
    public void setInquiryService(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @Before
    public void populateDatastore() {
        try {
            Inquiry inquiry1 = new Inquiry();
            inquiry1.setMessage("Foo");
            inquiry1.setCustomer("FooOne");
            getEntityManager().persist(inquiry1);

            Inquiry inquiry2 = new Inquiry();
            inquiry2.setMessage("Foo");
            inquiry2.setCustomer("FooTwo");
            getEntityManager().persist(inquiry2);

            Inquiry inquiry3 = new Inquiry();
            inquiry3.setMessage("Foo");
            inquiry3.setCustomer("FooThree");
            inquiry3.setOffer(new Offer("1 sekin", "bargin", "Söze"));
            getEntityManager().persist(inquiry3);

        } catch (RuntimeException e) {
            log.error("Problem populating datastore: " + e.getMessage(), e);
            throw e;
        }
    }

    @Test
    public void testFindById() throws Exception {
        Inquiry found = inquiryService.findById(getServiceContext(), KeyFactory.createKey(
                Inquiry.class.getSimpleName(), 1L));
        assertEquals("Foo", found.getMessage());
        assertEquals(getServiceContext().getUserId(), found.getCreatedBy());
        assertNotNull(found.getCreatedDate());
    }

    @Test
    public void testFindUnHandledInquires() throws Exception {
        List<Inquiry> unhandledInquiries = inquiryService.findUnHandledInquires(getServiceContext());
        assertEquals(2, unhandledInquiries.size());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Inquiry> inquiries = inquiryService.findAll(getServiceContext());
        assertEquals(3, inquiries.size());

    }

    @Test
    public void testSave() throws Exception {
    }

    @Test
    public void testDelete() throws Exception {
    }

    @Test
    public void testFindLatestInquires() throws Exception {
        // TODO
    }

    @Test
    public void testSendOfferToCustomer() throws Exception {
        // TODO
    }
}
