package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.servicestub;

import java.util.Set;

import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.domain.Moon;
import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.domain.Planet;

@org.springframework.stereotype.Service("planetService")
public class PlanetServiceStub extends PlanetServiceStubBase {
    public PlanetServiceStub() {
    }

    @Override
    protected void populateInitial(Set<Object> all) {
        Planet earth = new Planet("Earth");
        earth.setMessage("Hello");

        Moon moon = new Moon("Moon");
        earth.addMoon(moon);
        all.add(earth);

        Planet mars = new Planet("Mars");
        mars.setMessage("Hi!");
        all.add(mars);
    }


}
