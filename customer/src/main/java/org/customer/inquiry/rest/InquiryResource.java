package org.customer.inquiry.rest;

import static com.google.appengine.api.taskqueue.TaskOptions.Builder.withUrl;
import static com.google.appengine.api.taskqueue.TaskOptions.Method.POST;

import java.io.IOException;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.customer.inquiry.domain.Inquiry;
import org.customer.inquiry.domain.Offer;
import org.customer.inquiry.exception.InquiryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;

/**
 * Implementation of InquiryResource.
 */
@Controller
public class InquiryResource extends InquiryResourceBase {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public InquiryResource() {
    }

    @Override
    @RequestMapping(value = "/inquiry/form", method = RequestMethod.GET)
    public String createForm(ModelMap modelMap) {
        Inquiry inquiry = new Inquiry();
        modelMap.addAttribute("inquiry", inquiry);
        return "inquiry/create";

    }

    @Override
    @RequestMapping(value = "/inquiry", method = RequestMethod.POST)
    public String create(@ModelAttribute("inquiry") Inquiry inquiry, BindingResult result) {
        if (inquiry == null) {
            throw new IllegalArgumentException("A inquiry is required");
        }
        if (result.hasErrors()) {
            return "inquiry/create";
        }

        inquiry.setOwnerEmail(userEmail());

        Inquiry savedInquiry = getInquiryService().save(serviceContext(), inquiry);

        putInSendQueue(savedInquiry);

        return "redirect:/rest/inquiry/" + savedInquiry.getId().getId();
    }

    private String userEmail() {
        return (String) serviceContext().getProperty("user.email");
    }

    protected void putInSendQueue(Inquiry inquiry) {
        TaskOptions task = withUrl("/rest/inquiry/sendInquiry").method(POST).param("inquiryId",
                String.valueOf(inquiry.getId().getId()));
        Queue queue = QueueFactory.getDefaultQueue();
        queue.add(task);
        log.info("Adding task sendInquiry: " + inquiry.getId().getId());
    }

    @Override
    @RequestMapping(value = "/inquiry/{id}", method = RequestMethod.GET)
    public String show(@PathVariable("id") Key id, ModelMap modelMap) throws InquiryNotFoundException {
        Inquiry inquiry = getInquiryService().findById(serviceContext(), id);
        modelMap.addAttribute("inquiry", inquiry);

        if (!Boolean.TRUE.equals(inquiry.getSendDone()) && inquiry.secondsSinceCreated() > 60) {
            modelMap.addAttribute("showSend", Boolean.TRUE);

            log.info("showSend for inquiry " + id + " secondsSinceCreated=" + inquiry.secondsSinceCreated() + " ("
                    + System.currentTimeMillis() + ")");
        }

        Set<Offer> offers = getOfferService().findByRelatedInquiry(serviceContext(), inquiry.getId());
        modelMap.addAttribute("offers", offers);

        return "inquiry/show";
    }

    @Override
    @RequestMapping(value = "/inquiry/sendInquiry", method = RequestMethod.POST)
    public void sendInquiry(ModelMap modelMap, @RequestParam("inquiryId") Long inquiryId, HttpServletResponse response)
            throws IOException, InquiryNotFoundException {

        log.info("Running task sendInquiry: " + inquiryId);
        Key key = KeyFactory.createKey(Inquiry.class.getSimpleName(), inquiryId);
        boolean ok = getInquiryService().sendInquiry(serviceContext(), key);
        if (ok) {
            log.info("Done task sendInquiry: " + inquiryId);
        } else {
            log.error("Not possible to send inquiry: " + inquiryId);
            response.sendError(503, "Not possible to send inquiry: " + inquiryId);
        }
    }
}
