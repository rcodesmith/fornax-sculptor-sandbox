package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.data;

import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.domain.Planet;
import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.serviceapi.PlanetService;
import org.fornax.cartridges.sculptor.framework.domain.PagingParameter;

public class RichPlanetRepositoryTest extends RichPlanetRepositoryTestBase {
    @Override
    protected RichPlanet createNewObject() {
        RichPlanet input = new RichPlanet();

         input.setName("Earth");
         input.setMessage("Hi");
        // input.setDiameter(...);
        // input.setPopulation(...);
        return input;
    }

    @Override
    protected RichPlanet createExistingObject() {
        RichPlanet input = new RichPlanet();

        PlanetService service = getSpring()
                .getBeanFromSimpleClassName(PlanetService.class);
        Planet domainObj = service.findAll(null, PagingParameter.pageAccess(20)).getValues().iterator().next();
        input.fromDomainObject(domainObj);

        return input;
    }
}
