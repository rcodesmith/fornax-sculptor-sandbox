package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.domain;



/**
 *
 * Entity representing Planet.
 * This class is responsible for the domain object related
 * business logic for Planet. Properties and associations are
 * implemented in the generated base class {@link org.fornax.cartridges.sculptor.examples.helloworld.milkyway.domain.PlanetBase}.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PLANET")
public class Planet extends PlanetBase {
    private static final long serialVersionUID = -5098471604527709435L;

    /**
     * Don't use this constructor.
     * This constructor is public due to Castor.
     */
    protected Planet() {
    }

    public Planet(String name) {
        super(name);
    }

    public Moon getMoon(String moonName) {
        for (Moon moon : getMoons()) {
            if (moon.getName().equals(moonName)) {
                return moon;
            }
        }
        // not found
        return null;
    }

}
