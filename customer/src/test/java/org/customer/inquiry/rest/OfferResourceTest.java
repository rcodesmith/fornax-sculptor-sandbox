package org.customer.inquiry.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.customer.inquiry.domain.Inquiry;
import org.customer.inquiry.domain.Offer;
import org.customer.inquiry.domain.Supplier;
import org.customer.inquiry.serviceapi.InquiryService;
import org.customer.inquiry.serviceapi.OfferService;
import org.customer.inquiry.serviceapi.SupplierService;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContextStore;
import org.fornax.cartridges.sculptor.framework.test.AppEngineTestHelper;
import org.fornax.cartridges.sculptor.framework.test.SimpleAppEngineTestEnvironment;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class OfferResourceTest {
    private OfferResource offerResource;
    private OfferService offerService;
    private InquiryService inquiryService;
    private SupplierService supplierService;
    private Offer savedOffer;
    private Key inquiryKey;
    private Key supplierKey;

    @Before
    public void setUp() throws Exception {
        AppEngineTestHelper.setUpAppEngine(new SimpleAppEngineTestEnvironment());
        ServiceContextStore.set(AppEngineTestHelper.getServiceContext());

        offerResource = new OfferResource();
        offerService = mock(OfferService.class);
        ReflectionTestUtils.setField(offerResource, "offerService", offerService);
        inquiryService = mock(InquiryService.class);
        ReflectionTestUtils.setField(offerResource, "inquiryService", inquiryService);
        supplierService = mock(SupplierService.class);
        ReflectionTestUtils.setField(offerResource, "supplierService", supplierService);

        inquiryKey = KeyFactory.createKey(Inquiry.class.getSimpleName(), 1L);
        supplierKey = KeyFactory.createKey(Supplier.class.getSimpleName(), 3L);

        savedOffer = offerWithId(17L);
        savedOffer.setMessage("M1");
        savedOffer.setFromSupplierId(supplierKey);
        savedOffer.setRelatedInquiryId(inquiryKey);
        when(offerService.save(any(ServiceContext.class), any(Offer.class))).thenReturn(savedOffer);
        when(offerService.findById(any(ServiceContext.class), any(Key.class))).thenReturn(savedOffer);

        Inquiry inquiry = inquiryWithId(1L);
        inquiry.setMessage("Hi...");
        inquiry.setOwnerEmail("customer@foo.com");
        when(inquiryService.findById(any(ServiceContext.class), any(Key.class))).thenReturn(inquiry);

        Supplier supplier = supplierWithId(3L);
        when(supplierService.findByName(any(ServiceContext.class), Mockito.anyString())).thenReturn(supplier);
        when(supplierService.findById(any(ServiceContext.class), any(Key.class))).thenReturn(supplier);

    }

    @SuppressWarnings("serial")
    private Supplier supplierWithId(final long id) {
        Supplier supplier = new Supplier() {
            @Override
            public Key getId() {
                return KeyFactory.createKey(Supplier.class.getSimpleName(), id);
            }
        };
        return supplier;
    }

    @SuppressWarnings("serial")
    private Inquiry inquiryWithId(final long id) {
        Inquiry inquiry = new Inquiry() {
            @Override
            public Key getId() {
                return KeyFactory.createKey(Inquiry.class.getSimpleName(), id);
            }
        };
        return inquiry;
    }

    @SuppressWarnings("serial")
    private Offer offerWithId(final long id) {
        Offer savedOffer = new Offer() {
            @Override
            public Key getId() {
                return KeyFactory.createKey(Offer.class.getSimpleName(), id);
            }
        };
        return savedOffer;
    }

    @Test
    public void testReceiveOffer() throws Exception {
        ModelAndView result = offerResource.receiveOffer(1L, "M1", "S1");
        assertTrue(result.getView() instanceof RedirectView);
        RedirectView view = (RedirectView) result.getView();
        assertEquals("/rest/inquiry/1/offer/" + savedOffer.getId().getId(), view.getUrl());

        ArgumentCaptor<Offer> offerArgument = ArgumentCaptor.forClass(Offer.class);
        verify(offerService).save(any(ServiceContext.class), offerArgument.capture());

        assertEquals(inquiryKey, offerArgument.getValue().getRelatedInquiryId());
        assertEquals(supplierKey, offerArgument.getValue().getFromSupplierId());

        assertEquals(1, AppEngineTestHelper.getLocalMailService().getSentMessages().size());
    }

    @Test
    public void testShow() throws Exception {
        ModelMap modelMap = new ModelMap();
        String result = offerResource.show(1L, 17L, modelMap);
        assertEquals("offer/show", result);
        assertNotNull(modelMap.get("offer"));
        assertNotNull(modelMap.get("inquiry"));
        assertNotNull(modelMap.get("supplier"));

        Key inquiryKey = KeyFactory.createKey(Inquiry.class.getSimpleName(), 1L);
        verify(inquiryService).findById(any(ServiceContext.class), Mockito.eq(inquiryKey));

        Key offerKey = KeyFactory.createKey(Offer.class.getSimpleName(), 17L);
        verify(offerService).findById(any(ServiceContext.class), Mockito.eq(offerKey));
    }
}
