package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.serviceimpl;

import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.domain.Planet;
import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.exception.PlanetNotFoundException;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;
import org.springframework.stereotype.Service;

@Service("planetService")
public class PlanetServiceImpl extends PlanetServiceImplBase {

    public PlanetServiceImpl() {
    }

    public String sayHello(ServiceContext ctx, String planetName)
        throws PlanetNotFoundException {

        Planet planet = getPlanet(ctx, planetName);
        return planet.getMessage();
    }

    public Planet getPlanet(ServiceContext ctx, String planetName)
        throws PlanetNotFoundException {

        Planet planet = findByKey(ctx, planetName);
        return planet;
    }
}
