package org.supplier.sales.accessimpl;

import java.util.List;

import org.supplier.sales.domain.Inquiry;

/**
 * Implementation of Access object for InquiryRepository.findUnHandledInquires.
 * 
 */
public class FindUnHandledInquiresAccessImpl extends FindUnHandledInquiresAccessImplBase {
    @SuppressWarnings("unchecked")
    public void performExecute() {
        List<Inquiry> find = (List<Inquiry>) getJpaTemplate().find("select e from Inquiry e where e.offer.fee is null");
        setResult(find);
    }
}
