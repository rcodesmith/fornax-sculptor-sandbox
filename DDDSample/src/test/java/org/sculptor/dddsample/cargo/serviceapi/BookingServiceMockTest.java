package org.sculptor.dddsample.cargo.serviceapi;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.isA;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.sculptor.dddsample.cargo.domain.TrackingId.trackingId;
import static org.sculptor.dddsample.location.domain.SampleLocations.CHICAGO;
import static org.sculptor.dddsample.location.domain.SampleLocations.STOCKHOLM;
import junit.framework.TestCase;

import org.fornax.cartridges.sculptor.framework.errorhandling.JUnitServiceContextFactory;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;
import org.sculptor.dddsample.cargo.domain.Cargo;
import org.sculptor.dddsample.cargo.domain.CargoRepository;
import org.sculptor.dddsample.cargo.domain.TrackingId;
import org.sculptor.dddsample.cargo.serviceimpl.BookingServiceImpl;
import org.sculptor.dddsample.location.domain.LocationRepository;
import org.sculptor.dddsample.location.domain.UnLocode;
import org.sculptor.dddsample.location.serviceimpl.LocationServiceImpl;
import org.springframework.test.util.ReflectionTestUtils;

public class BookingServiceMockTest extends TestCase {

    private final ServiceContext serviceContext = JUnitServiceContextFactory.createServiceContext();

    private BookingServiceImpl cargoService;
    private CargoRepository cargoRepository;
    private LocationRepository locationRepository;

    @Override
    protected void setUp() throws Exception {
        cargoService = new BookingServiceImpl();
        cargoRepository = createMock(CargoRepository.class);
        locationRepository = createMock(LocationRepository.class);
        ReflectionTestUtils.setField(cargoService, "cargoRepository", cargoRepository);
        LocationServiceImpl locationService = new LocationServiceImpl();
        ReflectionTestUtils.setField(locationService, "locationRepository", locationRepository);
        ReflectionTestUtils.setField(cargoService, "locationService", locationService);
    }

    public void testRegisterNew() throws Exception {
        TrackingId expectedTrackingId = trackingId("TRK1");
        UnLocode fromUnlocode = new UnLocode("USCHI");
        UnLocode toUnlocode = new UnLocode("SESTO");

        expect(cargoRepository.nextTrackingId()).andReturn(expectedTrackingId);
        expect(locationRepository.find(fromUnlocode)).andReturn(CHICAGO);
        expect(locationRepository.find(toUnlocode)).andReturn(STOCKHOLM);
        expect(cargoRepository.save(isA(Cargo.class))).andReturn(null);

        replay(cargoRepository, locationRepository);

        TrackingId trackingId = cargoService.bookNewCargo(serviceContext, fromUnlocode, toUnlocode);
        assertEquals(expectedTrackingId, trackingId);
    }

    public void testRegisterNewNullArguments() throws Exception {
        replay(cargoRepository, locationRepository);
        try {
            cargoService.bookNewCargo(serviceContext, null, null);
            fail("Null arguments should not be allowed");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Override
    protected void tearDown() throws Exception {
        verify(cargoRepository, locationRepository);
    }
}
