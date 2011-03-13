package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.web;

import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.domain.Planet;

public class UpdatePlanetTest extends UpdatePlanetTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(UpdatePlanetForm form) {
        form.setMessage("Hello from Tellus");

        // form.setDiameter(null);
        // form.setPopulation(null);
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(UpdatePlanetForm form) {
        form.setMessage("");

        // form.setDiameter(null);
        // form.setPopulation(null);
    }

    /**
     * Creates the Planet object to update.
     */
    protected Planet findById() {
        return new Planet("Earth");
    }
}
