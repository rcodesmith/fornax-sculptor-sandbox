package org.fornax.cartridges.sculptor.examples.library.media.web;

public class CreateMediaCharacterTest extends CreateMediaCharacterTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreateMediaCharacterForm form) {
        form.setName("James Bond");

    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreateMediaCharacterForm form) {
        form.setName(null);

    }
}
