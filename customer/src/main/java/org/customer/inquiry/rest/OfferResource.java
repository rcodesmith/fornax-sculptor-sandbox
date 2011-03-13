package org.customer.inquiry.rest;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.customer.inquiry.domain.Inquiry;
import org.customer.inquiry.domain.Offer;
import org.customer.inquiry.domain.Supplier;
import org.customer.inquiry.exception.InquiryNotFoundException;
import org.customer.inquiry.exception.OfferNotFoundException;
import org.customer.inquiry.exception.SupplierNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

/**
 * Implementation of OfferResource.
 */
@Controller
public class OfferResource extends OfferResourceBase {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public OfferResource() {
    }

    @Override
    @RequestMapping(value = "/inquiry/{inquiryId}/offer", method = RequestMethod.POST)
    public ModelAndView receiveOffer(@PathVariable("inquiryId") long inquiryId,
            @RequestParam("message") String message, @RequestParam("supplier") String supplierName)
            throws InquiryNotFoundException, SupplierNotFoundException {

        Offer offer = new Offer();
        offer.setMessage(message);
        offer.setSupplierName(supplierName);

        Inquiry inquiry = findInquiry(inquiryId);
        Key inquriyKey = inquiry.getId();
        offer.setRelatedInquiryId(inquriyKey);

        Supplier supplier = findSupplierByName(supplierName);
        Key supplierKey = supplier.getId();
        offer.setFromSupplierId(supplierKey);

        Offer savedOffer = getOfferService().save(serviceContext(), offer);

        sendEmail(inquiry, supplier, savedOffer);

        ModelAndView mav = new ModelAndView();
        mav.setView(new RedirectView("/rest/inquiry/" + inquiryId + "/offer/" + savedOffer.getId().getId(), true));
        return mav;
    }

    private void sendEmail(Inquiry inquiry, Supplier supplier, Offer offer) {
        if (inquiry.getOwnerEmail() == null) {
            return;
        }

        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);

        String msgBody = emailBody(inquiry, supplier, offer);

        try {

            Message msg = new MimeMessage(session);
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(inquiry.getOwnerEmail()));
            InternetAddress from = new InternetAddress("fornax.sculptor@gmail.com", serviceContext().getApplicationId());
            msg.setFrom(from);
            msg.setReplyTo(new InternetAddress[] { from });
            msg.setSubject("Offer from " + supplier.getName());
            msg.setText(msgBody.toString());
            Transport.send(msg);

        } catch (Exception e) {
            log.warn(e.getMessage());
            log.info(msgBody.toString());
        }
    }

    private String emailBody(Inquiry inquiry, Supplier supplier, Offer offer) {
        StringBuilder msgBody = new StringBuilder();
        msgBody.append("We received an offer from ");
        msgBody.append(supplier.getName());

        String appUrl = (String) serviceContext().getProperty("appUrl");
        msgBody.append(appUrl).append("/rest/inquiry/").append(inquiry.getId().getId()).append("/offer/")
                .append(offer.getId().getId());
        return msgBody.toString();
    }

    @Override
    @RequestMapping(value = "/inquiry/{inquiryId}/offer/{offerId}", method = RequestMethod.GET)
    public String show(@PathVariable("inquiryId") Long inquiryId, @PathVariable("offerId") Long offerId,
            ModelMap modelMap) throws OfferNotFoundException, InquiryNotFoundException, SupplierNotFoundException {

        Inquiry inquiry = findInquiry(inquiryId);
        modelMap.addAttribute("inquiry", inquiry);

        Offer offer = findOffer(offerId);
        modelMap.addAttribute("offer", offer);

        Supplier supplier = findSupplier(offer.getFromSupplierId());
        modelMap.addAttribute("supplier", supplier);

        return "offer/show";
    }

    private Offer findOffer(Long offerId) throws OfferNotFoundException {
        if (offerId == null) {
            throw new IllegalArgumentException("An Offer identifier is required");
        }
        Key key = KeyFactory.createKey(Offer.class.getSimpleName(), offerId);
        Offer offer = getOfferService().findById(serviceContext(), key);
        return offer;
    }

    private Inquiry findInquiry(Long inquiryId) throws InquiryNotFoundException {
        if (inquiryId == null) {
            throw new IllegalArgumentException("An Inquiry identifier is required");
        }
        Key inquiryKey = KeyFactory.createKey(Inquiry.class.getSimpleName(), inquiryId);
        return getInquiryService().findById(serviceContext(), inquiryKey);
    }

    private Supplier findSupplierByName(String supplierName) throws SupplierNotFoundException {
        return getSupplierService().findByName(serviceContext(), supplierName);
    }

    private Supplier findSupplier(Key supplierId) throws SupplierNotFoundException {
        if (supplierId == null) {
            throw new IllegalArgumentException("An supplier identifier is required");
        }
        return getSupplierService().findById(serviceContext(), supplierId);
    }
}
