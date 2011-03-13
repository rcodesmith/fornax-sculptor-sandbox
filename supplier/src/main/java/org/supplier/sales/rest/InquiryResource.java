package org.supplier.sales.rest;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.supplier.sales.domain.Inquiry;
import org.supplier.sales.domain.Salesman;

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
        modelMap.addAttribute("inquiry", new Inquiry());
        return "inquiry/create";

    }

    @Override
    @RequestMapping(value = "/inquiry", method = RequestMethod.POST)
    public ModelAndView receiveInquiry(@RequestParam("message") String message,
            @RequestParam("customer") String customer, @RequestParam("replyUrl") String replyUrl) {

        Inquiry inquiry = new Inquiry();
        inquiry.setMessage(message);
        inquiry.setCustomer(customer);
        inquiry.setReplyUrl(replyUrl);
        Inquiry saved = getInquiryService().save(serviceContext(), inquiry);
        sendEmailToAllSalesman(inquiry);

        ModelAndView mav = new ModelAndView();
        mav.setView(new RedirectView("/rest/inquiry/" + saved.getId().getId(), true));
        return mav;

    }

    private void sendEmailToAllSalesman(Inquiry inquiry) {
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);

        String msgBody = emailBody(inquiry);

        try {

            Message msg = new MimeMessage(session);
            addRecipients(msg);
            if (!hasAnyRecipients(msg)) {
                return;
            }
            InternetAddress from = new InternetAddress("fornax.sculptor@gmail.com", serviceContext().getApplicationId());
            msg.setFrom(from);
            msg.setReplyTo(new InternetAddress[] { from });
            msg.setSubject("Inquiry from " + inquiry.getCustomer());
            msg.setText(msgBody.toString());
            Transport.send(msg);

        } catch (Exception e) {
            log.warn(e.getMessage());
            log.info(msgBody.toString());
        }
    }

    private boolean hasAnyRecipients(Message msg) throws MessagingException {
        return msg.getAllRecipients() != null && msg.getAllRecipients().length != 0;
    }

    private void addRecipients(Message msg) throws MessagingException, UnsupportedEncodingException {
        List<Salesman> allSalesmen = getSalesmanService().findAll(serviceContext());
        for (Salesman each : allSalesmen) {
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(each.getEmailAddress(), each.getName()));
        }
    }

    private String emailBody(Inquiry inquiry) {
        StringBuilder msgBody = new StringBuilder();
        msgBody.append("We received an inquiry: ");
        String appUrl = (String) serviceContext().getProperty("appUrl");
        msgBody.append(appUrl).append("/rest/inquiry/").append(inquiry.getId().getId());
        return msgBody.toString();
    }
}
