package org.fornax.cartridges.sculptor.examples.library.media.web;

public class CreateLibraryTest extends CreateLibraryTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreateLibraryForm form) {
        form.setName("test library");

    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreateLibraryForm form) {
        form.setName(null);

    }
}
