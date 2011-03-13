package org.customer.inquiry.repositoryimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.customer.inquiry.domain.Inquiry;
import org.customer.inquiry.domain.InquiryRepository;
import org.customer.inquiry.domain.Supplier;
import org.customer.inquiry.exception.InquiryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.appengine.api.datastore.Key;

/**
 * Repository implementation for Inquiry
 */
@Repository("inquiryRepository")
public class InquiryRepositoryImpl extends InquiryRepositoryBase implements InquiryRepository {
    private final Log log = LogFactory.getLog(InquiryRepositoryImpl.class);

    @Autowired
    private InquirySender inquirySender;

    public InquiryRepositoryImpl() {
    }

    @Override
    public boolean sendInquiry(Key id) throws InquiryNotFoundException {
        Inquiry inquiry = findById(id);
        if (inquiry.isSendDone()) {
            return true;
        }

        List<Supplier> allSuppliers = getSupplierRepository().findAll();
        Set<Supplier> suppliersToSend = findSuppliersToSend(inquiry, allSuppliers);
        if (suppliersToSend.isEmpty()) {
            inquiry.setSendDone(true);
            return true;
        }
        boolean ok = false;
        for (Supplier supplier : suppliersToSend) {
            inquiry.increaseSendAttempt();
            ok = sendInquiryToSupplier(inquiry, supplier);
            if (ok) {
                inquiry.wasSentToSupplier(supplier, allSuppliers.size());
                log.info("Inquiry " + inquiry.getId() + " was sent to supplier: " + supplier.getName()
                        + " Inquiry message: " + inquiry.getMessage());
            } else {
                log.info("Failed to send Inquiry " + inquiry.getId() + " to supplier: " + supplier.getName());
            }
        }

        return ok;
    }

    protected boolean sendInquiryToSupplier(Inquiry inquiry, Supplier supplier) {
        return inquirySender.sendInquiryToSupplier(inquiry, supplier);
    }

    private Set<Supplier> findSuppliersToSend(Inquiry inquiry, List<Supplier> allSuppliers) {
        Set<Supplier> result = new HashSet<Supplier>();
        for (Supplier each : allSuppliers) {
            if (!inquiry.isSentToSupplier(each)) {
                result.add(each);
            }
        }
        return result;
    }

    @Override
    public List<Inquiry> findAll() {
        return sort(super.findAll());
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
