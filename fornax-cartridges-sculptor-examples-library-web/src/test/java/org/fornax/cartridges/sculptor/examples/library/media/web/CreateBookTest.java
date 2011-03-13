package org.fornax.cartridges.sculptor.examples.library.media.web;

public class CreateBookTest extends CreateBookTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreateBookForm form) {
        form.setTitle("Domain-Driven Design");
        form.setIsbn("0-321-12521-5");

    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreateBookForm form) {
        form.setTitle(null);
        form.setIsbn(null);

    }
}
