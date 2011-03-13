package org.customer.inquiry.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.same;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.customer.inquiry.domain.Inquiry;
import org.customer.inquiry.serviceapi.InquiryService;
import org.customer.inquiry.serviceapi.OfferService;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContextStore;
import org.fornax.cartridges.sculptor.framework.test.AppEngineTestHelper;
import org.fornax.cartridges.sculptor.framework.test.SimpleAppEngineTestEnvironment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class InquiryResourceTest {
    private InquiryResource inquiryResource;
    private InquiryService inquiryService;
    private OfferService offerService;

    @Before
    public void setUp() {
        AppEngineTestHelper.setUpAppEngine(new SimpleAppEngineTestEnvironment());
        ServiceContextStore.set(AppEngineTestHelper.getServiceContext());

        // TODO taskqueue not available in local server
        inquiryResource = new InquiryResource() {
            @Override
            protected void putInSendQueue(Inquiry inquiry) {
                // skip
            }
        };
        inquiryService = mock(InquiryService.class);
        ReflectionTestUtils.setField(inquiryResource, "inquiryService", inquiryService);
        offerService = mock(OfferService.class);
        ReflectionTestUtils.setField(inquiryResource, "offerService", offerService);
    }

    @After
    public void tearDown() {
        AppEngineTestHelper.tearDownAppEngine();
    }

    @Test
    public void testCreateForm() throws Exception {
        ModelMap modelMap = new ModelMap();
        String result = inquiryResource.createForm(modelMap);
        assertEquals("inquiry/create", result);
        assertNotNull(modelMap.get("inquiry"));
    }

    @Test
    public void testCreate() throws Exception {
        Inquiry inquiry = new Inquiry();
        inquiry.setMessage("Hi");

        Inquiry savedInquiry = inquiryWithId(3L);
        savedInquiry.setMessage(inquiry.getMessage());

        when(inquiryService.save(any(ServiceContext.class), any(Inquiry.class))).thenReturn(savedInquiry);

        BindingResult bindingResult = mock(BindingResult.class);
        String result = inquiryResource.create(inquiry, bindingResult);
        assertEquals("redirect:/rest/inquiry/3", result);
        assertNotNull(inquiry.getOwnerEmail());

        verify(inquiryService).save(any(ServiceContext.class), same(inquiry));
    }

    @SuppressWarnings("serial")
    private Inquiry inquiryWithId(final long id) {
        Inquiry inquiry = new Inquiry() {
            @Override
            public Key getId() {
                return KeyFactory.createKey(Inquiry.class.getSimpleName(), id);
            }
        };
        inquiry.setCreatedDate(new Date());
        return inquiry;
    }

    @Test
    public void testShow() throws Exception {
        Inquiry inquiry = inquiryWithId(1);
        inquiry.setMessage("Hi");

        when(inquiryService.findById(any(ServiceContext.class), any(Key.class))).thenReturn(inquiry);

        ModelMap modelMap = new ModelMap();
        String result = inquiryResource.show(KeyFactory.createKey(Inquiry.class.getSimpleName(), 1L), modelMap);
        assertEquals("inquiry/show", result);
        assertNotNull(modelMap.get("inquiry"));

        Key key = KeyFactory.createKey(Inquiry.class.getSimpleName(), 1L);
        verify(inquiryService).findById(any(ServiceContext.class), Mockito.eq(key));
    }

    @Test
    public void testSendInquiry() throws Exception {
        when(inquiryService.sendInquiry(any(ServiceContext.class), any(Key.class))).thenReturn(true);

        ModelMap modelMap = new ModelMap();
        inquiryResource.sendInquiry(modelMap, 1L, null);

        Key key = KeyFactory.createKey(Inquiry.class.getSimpleName(), 1L);
        verify(inquiryService).sendInquiry(any(ServiceContext.class), Mockito.eq(key));
    }
}
