package org.sculptor.shipping.core.serviceapi;

import static org.junit.Assert.assertEquals;
import static org.sculptor.shipping.core.domain.ShipId.shipId;
import static org.sculptor.shipping.core.domain.UnLocode.unLocode;

import java.util.Set;

import org.fornax.cartridges.sculptor.framework.accessimpl.mongodb.DbManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sculptor.shipping.core.domain.Cargo;
import org.sculptor.shipping.core.domain.Country;
import org.sculptor.shipping.core.domain.Port;
import org.sculptor.shipping.core.domain.Ship;
import org.sculptor.shipping.core.domain.ShipId;
import org.sculptor.shipping.core.domain.UnLocode;
import org.sculptor.shipping.core.mapper.CargoMapper;
import org.sculptor.shipping.core.mapper.PortMapper;
import org.sculptor.shipping.core.mapper.ShipEventMapper;
import org.sculptor.shipping.core.mapper.ShipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Spring based test with MongoDB.
 */
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
public class ReferenceDataServiceTest extends AbstractJUnit4SpringContextTests implements ReferenceDataServiceTestBase {
    @Autowired
    private DbManager dbManager;
    @Autowired
    private ReferenceDataService referenceDataService;

    @Before
    public void initTestData() {
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

    @Override
    @Test
    public void testGetShip() throws Exception {
        String name = "King Roy";
        ShipId shipId = shipId("KR");
        referenceDataService.createShip(shipId, name);
        Ship ship = referenceDataService.getShip(shipId);
        assertEquals(name, ship.getName());
    }

    @Override
    @Test
    public void testCreateShip() throws Exception {
        ShipId shipId = shipId("KR");
        referenceDataService.createShip(shipId, "King Roy");
        assertEquals(1, countRowsInDBCollection(ShipMapper.getInstance().getDBCollectionName()));
        assertEquals(1, countRowsInDBCollection(ShipEventMapper.getInstance().getDBCollectionName()));
    }

    @Override
    @Test
    public void testSavePort() throws Exception {
        UnLocode unLocode = unLocode("USSFO");
        Port sfo = new Port(unLocode);
        sfo.setCity("San Francisco");
        sfo.setCountry(Country.US);
        referenceDataService.savePort(sfo);
        assertEquals(1, countRowsInDBCollection(PortMapper.getInstance().getDBCollectionName()));
    }

    @Override
    @Test
    public void testSaveCargo() throws Exception {
        referenceDataService.saveCargo(new Cargo("Refactoring"));
        assertEquals(1, countRowsInDBCollection(CargoMapper.getInstance().getDBCollectionName()));
    }

    @Override
    public void testGetCargo() throws Exception {
    }

    @Override
    public void testGetPort() throws Exception {
    }
}
