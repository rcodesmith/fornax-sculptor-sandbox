package org.sculptor.dddsample.location.serviceapi;

import static org.junit.Assert.assertNotNull;

import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.junit.Test;
import org.sculptor.dddsample.location.domain.Location;
import org.sculptor.dddsample.location.domain.UnLocode;
import org.sculptor.dddsample.location.exception.LocationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;

/**
 * Spring based transactional test with DbUnit support.
 */
public class LocationServiceTest extends AbstractDbUnitJpaTests implements LocationServiceTestBase {
    private LocationService locationService;

    @Autowired
    public void setLocationService(LocationService locationService) {
        this.locationService = locationService;
    }

    @Override
    protected String getDataSetFile() {
        return "dbunit/TestData.xml";
    }

    @Test
    public void testFind() throws Exception {
        Location found = locationService.find(getServiceContext(), new UnLocode("USCHI"));
        assertNotNull(found);
    }

    @Test
    @ExpectedException(LocationNotFoundException.class)
    public void testNotFound() throws LocationNotFoundException {
        locationService.find(getServiceContext(), new UnLocode("ZZZZZ"));
    }
}
