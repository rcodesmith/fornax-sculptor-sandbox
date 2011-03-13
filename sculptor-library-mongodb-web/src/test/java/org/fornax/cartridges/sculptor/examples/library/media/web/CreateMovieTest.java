package org.fornax.cartridges.sculptor.examples.library.media.web;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Genre;

public class CreateMovieTest extends CreateMovieTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreateMovieForm form) {
        form.setTitle("Die Another Day");
        form.setUrlIMDB("abc");
        form.setPlayLength(95);

        form.setCategory(Genre.ACTION);
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreateMovieForm form) {
        form.setTitle("Die Another Day");
        form.setUrlIMDB(null);
        form.setPlayLength(null);

        // form.setCategory(null);
    }
}
