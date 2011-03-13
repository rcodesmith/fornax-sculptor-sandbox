package org.sculptor.shipping.core.serviceapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.sculptor.shipping.core.domain.ShipId.shipId;
import static org.sculptor.shipping.core.domain.UnLocode.unLocode;

import java.util.Set;

import org.fornax.cartridges.sculptor.framework.accessimpl.mongodb.DbManager;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sculptor.shipping.core.domain.Cargo;
import org.sculptor.shipping.core.domain.Country;
import org.sculptor.shipping.core.domain.Port;
import org.sculptor.shipping.core.domain.Ship;
import org.sculptor.shipping.core.domain.ShipId;
import org.sculptor.shipping.core.mapper.ShipEventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Spring based test with MongoDB.
 */
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
public class TrackingServiceTest extends AbstractJUnit4SpringContextTests implements TrackingServiceTestBase {
    @Autowired
    private DbManager dbManager;
    @Autowired
    private TrackingService trackingService;
    @Autowired
    private ReferenceDataService referenceDataService;
    private Cargo refact;
    private Port sfo;
    private Port yyv;
    private ShipId kr;

    @Before
    public void initTestData() {
        refact = new Cargo("Refactoring");
        referenceDataService.saveCargo(refact);

        kr = shipId("KR");
        referenceDataService.createShip(kr, "King Roy");

        sfo = new Port(unLocode("USSFO"));
        sfo.setCity("San Francisco");
        sfo.setCountry(Country.US);
        referenceDataService.savePort(sfo);

        yyv = new Port(unLocode("CAVAN"));
        yyv.setCity("Vancouver");
        yyv.setCountry(Country.CANADA);
        referenceDataService.savePort(yyv);
    }

    @Before
    public void initDbManagerThreadInstance() throws Exception {
        // to be able to do lazy loading of associations inside test class
        DbManager.setThreadInstance(dbManager);
    }

    @After
    public void dropDatabase() {
        Set<String> names = dbManager.getDB().getCollectionNames();
        for (String each : names) {
            if (!each.startsWith("system")) {
                dbManager.getDB().getCollection(each).drop();
            }
        }

        // dbManager.getDB().dropDatabase();
    }

    private int countRowsInDBCollection(String name) {
        return (int) dbManager.getDBCollection(name).getCount();
    }

    private int countShipEvents() {
        return countRowsInDBCollection(ShipEventMapper.getInstance().getDBCollectionName());
    }

    @Override
    @Test
    public void testRecordArrival() throws Exception {
        int before = countShipEvents();
        trackingService.recordArrival(dateTime(2005, 11, 2), kr, sfo.getUnlocode());
        assertEquals(before + 1, countShipEvents());
    }

    @Test
    public void arrivalSetsShipsLocation() throws Exception {
        trackingService.recordArrival(dateTime(2005, 11, 2), kr, sfo.getUnlocode());
        Ship ship = referenceDataService.getShip(shipId("KR"));
        assertEquals(sfo, ship.getPort());
    }

    @Override
    @Test
    public void testRecordDeparture() throws Exception {
        int before = countShipEvents();
        trackingService.recordDeparture(dateTime(2005, 11, 3), kr, sfo.getUnlocode());
        assertEquals(before + 1, countShipEvents());
    }

    @Test
    public void departurePutsShipOutToSea() throws Exception {
        trackingService.recordDeparture(dateTime(2005, 11, 3), kr, sfo.getUnlocode());
        Ship ship = referenceDataService.getShip(shipId("KR"));
        assertTrue(ship.isAtSea());
    }

    private DateTime dateTime(int year, int month, int day) {
        return new DateTime(year, month, day, 0, 0, 0, 0);
    }

    @Override
    @Test
    public void testRecordLoad() throws Exception {
        trackingService.recordLoad(dateTime(2005, 11, 1), kr, refact.getCargoId());
        Ship ship = referenceDataService.getShip(shipId("KR"));
        assertTrue(ship.getCargos().contains(refact));

    }

    @Override
    @Test
    public void testRecordUnload() throws Exception {
        trackingService.recordLoad(dateTime(2005, 11, 1), kr, refact.getCargoId());
        trackingService.recordUnload(dateTime(2005, 11, 5), kr, refact.getCargoId());
        Ship ship = referenceDataService.getShip(shipId("KR"));
        assertFalse(ship.getCargos().contains(refact));
    }

}
