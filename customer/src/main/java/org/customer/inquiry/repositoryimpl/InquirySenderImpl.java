package org.customer.inquiry.repositoryimpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.customer.inquiry.domain.Inquiry;
import org.customer.inquiry.domain.Supplier;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContextStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component
public class InquirySenderImpl implements InquirySender {

    private final Log log = LogFactory.getLog(getClass());

    @Autowired
    private RestTemplate supplierRestTemplate;

    public boolean sendInquiryToSupplier(Inquiry inquiry, Supplier supplier) {
        try {
            MultiValueMap<String, String> formData = new LinkedMultiValueMap<String, String>();
            formData.add("message", inquiry.getMessage());
            String appId = appId();
            formData.add("customer", appId);
            String url = supplierSendInquiryUrl(supplier);
            String appUrl = (String) ServiceContextStore.get().getProperty("appUrl");
            formData.add("replyUrl", appUrl + "/rest/inquiry/" + inquiry.getId().getId() + "/offer");
            supplierRestTemplate.postForLocation(url, formData);
            return true;
        } catch (RuntimeException e) {
            log.error("Couldn't send inquiry to " + supplier.getName(), e);
            return false;
        }
    }

    private String supplierSendInquiryUrl(Supplier supplier) {
        String url = supplier.getUrl();
        // TODO real RESTful would retrieve the content from the base url and grab the rest/inquiry from a link
        if (!url.endsWith("/")) {
            url += "/";
        }
        url += "rest/inquiry";
        return url;
    }

    private String appId() {
        return ServiceContextStore.get().getApplicationId();
    }

}
