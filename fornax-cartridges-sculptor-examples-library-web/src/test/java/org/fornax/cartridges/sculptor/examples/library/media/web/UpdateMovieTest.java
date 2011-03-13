package org.fornax.cartridges.sculptor.examples.library.media.web;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Genre;

public class UpdateMovieTest extends UpdateMovieTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(UpdateMovieForm form) {
        form.setPlayLength(123);

        form.setCategory(Genre.DRAMA);
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(UpdateMovieForm form) {
        form.setPlayLength(null);

    }
}
