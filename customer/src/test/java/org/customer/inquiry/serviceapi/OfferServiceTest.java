package org.customer.inquiry.serviceapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.customer.inquiry.domain.Inquiry;
import org.customer.inquiry.domain.Offer;
import org.fornax.cartridges.sculptor.framework.test.AbstractAppEngineJpaTests;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

/**
 * Spring based test with GAE support.
 */
public class OfferServiceTest extends AbstractAppEngineJpaTests implements OfferServiceTestBase {
    private final Log log = LogFactory.getLog(OfferServiceTest.class);
    private OfferService offerService;

    @Autowired
    public void setOfferService(OfferService offerService) {
        this.offerService = offerService;
    }

    @Before
    public void populateDatastore() {
        try {
            Offer offer1 = new Offer();
            offer1.setMessage("Offer1");
            offer1.setRelatedInquiryId(KeyFactory.createKey(Inquiry.class.getSimpleName(), 101L));
            getEntityManager().persist(offer1);

            Offer offer2 = new Offer();
            offer2.setMessage("Offer2");
            offer2.setRelatedInquiryId(KeyFactory.createKey(Inquiry.class.getSimpleName(), 102L));
            getEntityManager().persist(offer2);
        } catch (RuntimeException e) {
            log.error("Problem populating datastore: " + e.getMessage(), e);
            throw e;
        }
    }

    @Test
    public void testSave() throws Exception {
        int countBefore = countRowsInTable(Offer.class);
        Offer offer = new Offer();
        offerService.save(getServiceContext(), offer);
        assertEquals(countBefore + 1, countRowsInTable(Offer.class));
    }

    @Test
    public void testFindById() throws Exception {
        Key key = KeyFactory.createKey(Offer.class.getSimpleName(), 2L);
        Offer found = offerService.findById(getServiceContext(), key);
        assertNotNull(found);
        assertEquals("Offer2", found.getMessage());
    }

    @Test
    public void testFindByRelatedInquiry() throws Exception {
        Key inquiryKey = KeyFactory.createKey(Inquiry.class.getSimpleName(), 101L);
        Set<Offer> offers = offerService.findByRelatedInquiry(getServiceContext(), inquiryKey);
        assertEquals(1, offers.size());
        assertEquals("Offer1", offers.iterator().next().getMessage());
    }
}
