package org.customer.inquiry.repositoryimpl;

import org.customer.inquiry.domain.Inquiry;
import org.customer.inquiry.domain.Supplier;

/**
 * Test stub to avoid HTTP communication.
 * 
 */
public class InquiryRepositoryStub extends InquiryRepositoryImpl {

    @Override
    protected boolean sendInquiryToSupplier(Inquiry inquiry, Supplier supplier) {
        return true;
    }

}
