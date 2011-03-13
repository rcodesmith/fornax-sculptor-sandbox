package org.supplier.sales.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.supplier.sales.domain.Salesman;

import com.google.appengine.api.datastore.Key;

/**
 * Implementation of SalesmanResource.
 */
@Controller
public class SalesmanResource extends SalesmanResourceBase {
    public SalesmanResource() {
    }

    @RequestMapping(value = "/salesman/form", method = RequestMethod.GET)
    public String createForm(ModelMap modelMap) {
        Salesman entity = new Salesman();
        modelMap.addAttribute("entity", entity);
        return "salesman/create";

    }

    @RequestMapping(value = "/salesman/{id}/form", method = RequestMethod.GET)
    public String updateForm(@PathVariable("id")
    Key id, ModelMap modelMap) throws Exception {
        Salesman entity = getSalesmanService()
                              .findById(serviceContext(), id);
        modelMap.addAttribute("entity", entity);
        return "salesman/update";

    }
}
