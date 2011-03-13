package org.customer.inquiry.rest;

import org.customer.inquiry.domain.Supplier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Implementation of SupplierResource.
 */
@Controller
public class SupplierResource extends SupplierResourceBase {
    public SupplierResource() {
    }

    @Override
    @RequestMapping(value = "/supplier/form", method = RequestMethod.GET)
    public String createForm(ModelMap modelMap) {
        SupplierForm supplier = new SupplierForm();
        modelMap.addAttribute("supplier", supplier);
        return "supplier/create";

    }

    @Override
    @RequestMapping(value = "/supplier", method = RequestMethod.POST)
    public String create(@ModelAttribute("supplier") SupplierForm supplierForm, BindingResult result) {
        if (supplierForm == null) {
            throw new IllegalArgumentException("A supplier is required");
        }
        if (result.hasErrors()) {
            return "supplier/create";
        }

        Supplier supplier = new Supplier(supplierForm.getName());
        supplier.setUrl(supplierForm.getUrl());

        Supplier savedSupplier = getSupplierService().save(serviceContext(), supplier);

        return "redirect:/rest/supplier/" + savedSupplier.getId().getId();
    }
}
