package org.sculptor.dddsample.cargo.domain;

import static org.junit.Assert.assertEquals;
import static org.sculptor.dddsample.cargo.domain.TrackingId.trackingId;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.joda.time.DateTime;
import org.junit.Test;
import org.sculptor.dddsample.cargo.exception.CargoNotFoundException;
import org.sculptor.dddsample.location.domain.Location;
import org.sculptor.dddsample.location.domain.LocationRepository;
import org.sculptor.dddsample.location.domain.UnLocode;
import org.sculptor.dddsample.location.exception.LocationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

public class HandlingEventRepositoryTest extends AbstractDbUnitJpaTests {

    private HandlingEventRepository handlingEventRepository;
    private CargoRepository cargoRepository;
    private LocationRepository locationRepository;

    @Autowired
    public void setHandlingEventRepository(HandlingEventRepository handlingEventRepository) {
        this.handlingEventRepository = handlingEventRepository;
    }

    @Autowired
    public void setCargoRepository(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @Autowired
    public void setLocationRepository(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    protected String getDataSetFile() {
        return "dbunit/TestData.xml";
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testSave() throws LocationNotFoundException, CargoNotFoundException {
        Location location = locationRepository.find(new UnLocode("SESTO"));

        Cargo cargo = cargoRepository.find(trackingId("XYZ"));
        DateTime completionTime = new DateTime(10);
        DateTime registrationTime = new DateTime(20);
        HandlingEvent event = new HandlingEvent(cargo, completionTime, registrationTime, Type.CLAIM, location, null);

        event = handlingEventRepository.save(event);

        Map map = getJdbcTemplate().queryForMap("select * from HandlingEvent where id =" + event.getId());
        assertEquals(1L, map.get("CARGO"));
        assertEquals(new Date(10), map.get("COMPLETIONTIME"));
        assertEquals(new Date(20), map.get("REGISTRATIONTIME"));
        assertEquals("CLAIM", map.get("TYPE"));

    }

    public void testFindEventsForCargo() throws Exception {
        List<HandlingEvent> handlingEvents = handlingEventRepository.findEventsForCargo(trackingId("XYZ"));
        assertEquals(12, handlingEvents.size());
    }

}