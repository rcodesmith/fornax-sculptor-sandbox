package org.customer.inquiry.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.customer.inquiry.domain.Supplier;
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
import org.springframework.validation.BindingResult;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class SupplierResourceTest {
    private SupplierResource supplierResource;
    private SupplierService supplierService;

    @Before
    public void setUp() {
        AppEngineTestHelper.setUpAppEngine(new SimpleAppEngineTestEnvironment());
        ServiceContextStore.set(AppEngineTestHelper.getServiceContext());

        supplierResource = new SupplierResource();
        supplierService = mock(SupplierService.class);
        ReflectionTestUtils.setField(supplierResource, "supplierService", supplierService);
    }

    @Test
    public void testCreateForm() throws Exception {
        ModelMap modelMap = new ModelMap();
        String result = supplierResource.createForm(modelMap);
        assertEquals("supplier/create", result);
        assertNotNull(modelMap.get("supplier"));
    }

    @Test
    public void testCreate() throws Exception {
        SupplierForm supplier = new SupplierForm();
        supplier.setName("S3");

        Supplier savedSupplier = supplierWithId(3, supplier.getName());

        when(supplierService.save(any(ServiceContext.class), any(Supplier.class))).thenReturn(savedSupplier);

        BindingResult bindingResult = mock(BindingResult.class);
        String result = supplierResource.create(supplier, bindingResult);
        assertEquals("redirect:/rest/supplier/3", result);

        ArgumentCaptor<Supplier> supplierArgument = ArgumentCaptor.forClass(Supplier.class);
        verify(supplierService).save(any(ServiceContext.class), supplierArgument.capture());
        assertEquals(supplier.getName(), supplierArgument.getValue().getName());
    }

    @SuppressWarnings("serial")
    private Supplier supplierWithId(final long id, String name) {
        Supplier supplier = new Supplier(name) {
            @Override
            public Key getId() {
                return KeyFactory.createKey(Supplier.class.getSimpleName(), id);
            }
        };
        return supplier;
    }

    @Test
    public void testShow() throws Exception {
        Supplier supplier = new Supplier("S1");

        when(supplierService.findById(any(ServiceContext.class), any(Key.class))).thenReturn(supplier);

        ModelMap modelMap = new ModelMap();
        String result = supplierResource.show(KeyFactory.createKey(Supplier.class.getSimpleName(), 1L), modelMap);
        assertEquals("supplier/show", result);
        assertNotNull(modelMap.get("result"));

        Key key = KeyFactory.createKey(Supplier.class.getSimpleName(), 1L);
        verify(supplierService).findById(any(ServiceContext.class), Mockito.eq(key));
    }
}
