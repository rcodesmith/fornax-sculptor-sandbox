package org.customer.inquiry.domain;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * Entity representing Inquiry. This class is responsible for the domain object related business logic for Inquiry.
 * Properties and associations are implemented in the generated base class
 * {@link org.customer.inquiry.domain.InquiryBase}.
 */
@Entity
@Table(name = "Inquiry")
// TODO below query doesn't work No field 'sendDone', because it is is placed in InquiryBase. For now we filter in java.
// @NamedQuery(name = "Inquiry.FindInquiriesNotSent", query = "select e from Inquiry e where e.sendDone = false")
@NamedQuery(name = "Inquiry.FindInquiriesNotSent", query = "select e from Inquiry e")
public class Inquiry extends InquiryBase {

    private static final int MAX_SEND_ATTEMPTS = 50;

    public Inquiry() {
    }

    public void wasSentToSupplier(Supplier supplier, int totalNumberOfSuppliers) {
        getSentToSuppliersIds().add(supplier.getId());

        if (totalNumberOfSuppliers == getSentToSuppliersIds().size()) {
            setSendDone(true);
        }
    }

    public boolean isSentToSupplier(Supplier supplier) {
        return getSentToSuppliersIds().contains(supplier.getId());
    }

    public long secondsSinceCreated() {
        return (System.currentTimeMillis() - getCreatedDate().getTime()) / 1000;
    }

    public void increaseSendAttempt() {
        Integer counter = getSendAttemptCounter();
        if (counter == null) {
            counter = 0;
        }
        counter++;
        setSendAttemptCounter(counter);
        if (counter > MAX_SEND_ATTEMPTS) {
            setSendDone(true);
        }
    }

    public boolean isSendDone() {
        return Boolean.TRUE.equals(getSendDone());
    }

}
