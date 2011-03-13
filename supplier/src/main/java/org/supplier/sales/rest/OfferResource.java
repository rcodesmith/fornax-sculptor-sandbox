package org.supplier.sales.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.supplier.sales.domain.Inquiry;
import org.supplier.sales.domain.Offer;
import org.supplier.sales.exception.InquiryNotFoundException;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

/**
 * Implementation of OfferResource.
 */
@Controller
public class OfferResource extends OfferResourceBase {
    public OfferResource() {
    }

    @Override
    @RequestMapping(value = "/inquiry/{id}/offer/form", method = RequestMethod.GET)
    public String createForm(@PathVariable("id") Long id, ModelMap modelMap) {
        Inquiry inquiry = findInquiry(id);
        inquiry.setOffer(new Offer("", "", ""));
        modelMap.addAttribute("inquiry", inquiry);
        return "inquiry/createOffer";
    }

    @Override
    @RequestMapping(value = "/inquiry/{id}/offer", method = RequestMethod.POST)
    public ModelAndView createOffer(@PathVariable("id") Long id, @RequestParam("offer.comment") String comment,
            @RequestParam("offer.fee") String fee) {
        Inquiry inquiry = findInquiry(id);
        Offer offer = new Offer(fee, comment, serviceContext().getUserId());
        inquiry.setOffer(offer);
        Inquiry saved = getInquiryService().save(serviceContext(), inquiry);
        ModelAndView mav = new ModelAndView();
        mav.setView(new RedirectView("/rest/inquiry/" + saved.getId().getId(), true));
        return mav;
    }

    @Override
    @RequestMapping(value = "/inquiry/{id}/offer", method = RequestMethod.GET, params = "sendToCustomer=true")
    public ModelAndView sendToCustomer(@PathVariable("id") Long id, ModelMap modelMap) {
        Inquiry inquiry = getInquiryService().sendOfferToCustomer(serviceContext(), findInquiry(id));
        ModelAndView mav = new ModelAndView();
        modelMap.addAttribute("inquiry", inquiry);
        if (inquiry.getOffer().getIsSent() == null) {
            modelMap.addAttribute("systemMessage", "The offer wasn't sent to customer, try again later.");
            modelMap.addAttribute("inquiry", inquiry);
            mav.setViewName("inquiry/show");
            mav.addAllObjects(modelMap);
        } else {
            mav.setView(new RedirectView("/rest/inquiry/" + id, true));
        }
        return mav;
    }

    private Inquiry findInquiry(Long id) {
        Inquiry inquiry = null;
        try {
            Key key = KeyFactory.createKey(Inquiry.class.getSimpleName(), id);
            inquiry = getInquiryService().findById(serviceContext(), key);

        } catch (InquiryNotFoundException e) {
            throw new IllegalArgumentException("An inquiry with id: " + id + " doesn't exists");
        }
        return inquiry;
    }
}
