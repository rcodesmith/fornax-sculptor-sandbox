package org.customer.inquiry.repositoryimpl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.customer.inquiry.domain.Offer;
import org.customer.inquiry.domain.OfferRepository;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByQueryAccess;
import org.springframework.stereotype.Repository;

import com.google.appengine.api.datastore.Key;

/**
 * Repository implementation for Offer
 */
@Repository("offerRepository")
public class OfferRepositoryImpl extends OfferRepositoryBase implements OfferRepository {
    public OfferRepositoryImpl() {
    }

    @Override
    public Set<Offer> findByRelatedInquiry(Key inquiryKey) {
        // if (true)
        // return new HashSet<Offer>();
        // TODO we should maybe move this to a named query, but that requires gap class and there are GAE problems
        // with
        // subclass queries
        FindByQueryAccess<Offer> ao = createFindByQueryAccess();
        ao.setNamedQuery(false);
        ao.setQuery("select e from Offer e where e.relatedInquiryId = :relatedInquiryId");
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("relatedInquiryId", inquiryKey);
        ao.setParameters(parameters);

        ao.execute();
        List<Offer> result = ao.getResult();
        return new HashSet<Offer>(result);
    }
}
