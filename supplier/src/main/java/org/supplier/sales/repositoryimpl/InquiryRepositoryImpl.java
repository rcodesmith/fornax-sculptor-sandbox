package org.supplier.sales.repositoryimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.supplier.sales.domain.Inquiry;
import org.supplier.sales.domain.InquiryRepository;

/**
 * Repository implementation for Inquiry
 */
@Repository("inquiryRepository")
public class InquiryRepositoryImpl extends InquiryRepositoryBase implements InquiryRepository {
    private final Log log = LogFactory.getLog(InquiryRepositoryImpl.class);
    @Autowired
    private RestTemplate supplierRestTemplate;

    public InquiryRepositoryImpl() {
    }

    @Override
    public Inquiry sendOfferToCustomer(Inquiry inquiry) {

        boolean sent = sendToCustomer(inquiry);
        if (sent) {
            inquiry.setOffer(inquiry.getOffer().withIsSent("true"));
            inquiry = save(inquiry);
        }
        return inquiry;

    }

    private boolean sendToCustomer(Inquiry inquiry) {
        try {
            MultiValueMap<String, String> formData = new LinkedMultiValueMap<String, String>();
            formData.add("message", inquiry.getOffer().getComment());
            String supplierName = System.getProperty("supplier.name", "Unknown Supplier");
            formData.add("supplier", supplierName);
            String url = inquiry.getReplyUrl();
            supplierRestTemplate.postForLocation(url, formData);

            return true;
        } catch (RuntimeException e) {
            log.error("Couldn't send inquiry to " + inquiry.getReplyUrl(), e);
            return false;
        }

    }

    @Override
    public List<Inquiry> findAll() {
        return sort(super.findAll());
    }

    @Override
    public List<Inquiry> findUnHandledInquires() {
        return sort(super.findUnHandledInquires());
    }

    @Override
    public List<Inquiry> findLatestInquires() {
        return sort(super.findLatestInquires());
    }

    /**
     * Latest first
     */
    private List<Inquiry> sort(List<Inquiry> list) {
        List<Inquiry> result = new ArrayList<Inquiry>(list);
        Collections.sort(list, new Comparator<Inquiry>() {
            @Override
            public int compare(Inquiry inq1, Inquiry inq2) {
                return inq2.getCreatedDate().compareTo(inq1.getCreatedDate());
            }
        });
        return result;
    }
}
