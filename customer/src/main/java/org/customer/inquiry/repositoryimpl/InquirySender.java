package org.customer.inquiry.repositoryimpl;

import org.customer.inquiry.domain.Inquiry;
import org.customer.inquiry.domain.Supplier;

public interface InquirySender {

    boolean sendInquiryToSupplier(Inquiry inquiry, Supplier supplier);
}
