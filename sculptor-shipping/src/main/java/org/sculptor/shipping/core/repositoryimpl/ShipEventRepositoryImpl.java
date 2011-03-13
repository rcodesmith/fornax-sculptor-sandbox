package org.sculptor.shipping.core.repositoryimpl;

import static org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder.criteriaFor;
import static org.sculptor.shipping.core.domain.ShipEventProperties.changeSequence;
import static org.sculptor.shipping.core.domain.ShipEventProperties.ship;

import java.util.List;

import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria;
import org.sculptor.shipping.core.domain.ShipEvent;
import org.sculptor.shipping.core.domain.ShipId;
import org.sculptor.shipping.core.mapper.ShipIdMapper;
import org.springframework.stereotype.Repository;

import com.mongodb.DBObject;

/**
 * Repository implementation for ShipEvent
 */
@Repository("shipEventRepository")
public class ShipEventRepositoryImpl extends ShipEventRepositoryBase {
    public ShipEventRepositoryImpl() {
    }

    @Override
    public List<ShipEvent> findAllForShip(ShipId shipId) {
        DBObject shipIdDBObject = ShipIdMapper.getInstance().toData(shipId);
        List<ConditionalCriteria> criteria = criteriaFor(ShipEvent.class)
                .withProperty(ship()).eq(shipIdDBObject)
                .orderBy(changeSequence()).build();
        return findByCondition(criteria);

    }
}
