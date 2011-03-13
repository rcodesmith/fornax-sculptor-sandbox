package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.web;

public class CreateMoonTest extends CreateMoonTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreateMoonForm form) {
        form.setName("Moon");
        // form.setDiameter(null);
        form.setRequiredPlanet(1L);

    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreateMoonForm form) {
        form.setName("");
        // form.setDiameter(null);
//        form.setRequiredPlanet(null);

    }
}
