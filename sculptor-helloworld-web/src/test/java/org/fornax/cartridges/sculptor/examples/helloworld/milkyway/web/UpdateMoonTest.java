package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.web;

public class UpdateMoonTest extends UpdateMoonTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(UpdateMoonForm form) {
        // form.setDiameter(null);
        form.setRequiredPlanet(1L);

    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(UpdateMoonForm form) {
        // nothing can be updated
        throw new UnsupportedOperationException("skip");

    }
}
