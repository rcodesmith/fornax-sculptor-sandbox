package org.supplier.sales.accessimpl;

import java.util.Date;
import java.util.List;

import org.supplier.sales.domain.Inquiry;

/**
 * Implementation of Access object for InquiryRepository.findLatestInquires.
 * 
 */
public class FindLatestInquiresAccessImpl extends FindLatestInquiresAccessImplBase {
    @SuppressWarnings("unchecked")
    public void performExecute() {
        long timestamp = System.currentTimeMillis() - (1000 * 60 * 60);
        List<Inquiry> find = (List<Inquiry>) getJpaTemplate().find("select e from Inquiry e where e.createdDate > ?1",
                new Date(timestamp));
        setResult(find);
    }
}
