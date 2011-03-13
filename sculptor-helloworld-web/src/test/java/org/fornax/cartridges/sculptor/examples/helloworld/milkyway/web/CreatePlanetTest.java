package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.web;

public class CreatePlanetTest extends CreatePlanetTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreatePlanetForm form) {
        form.setName("Earth");
        form.setMessage("Hello from Earth");

        // form.setDiameter(null);
        // form.setPopulation(null);
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreatePlanetForm form) {
        form.setName("");
        form.setMessage("");

        // form.setDiameter(null);
        // form.setPopulation(null);
    }
}
