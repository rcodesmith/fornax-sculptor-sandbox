package org.fornax.cartridges.sculptor.examples.library.media.web;

public class UpdateBookTest extends UpdateBookTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(UpdateBookForm form) {
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(UpdateBookForm form) {
        // nothing can be updated
        throw new UnsupportedOperationException("skip");

    }
}
