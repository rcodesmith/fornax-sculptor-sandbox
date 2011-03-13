package org.fornax.cartridges.sculptor.examples.library.media.web;

import static org.fornax.cartridges.sculptor.examples.library.util.DbManagerInitializer.initDbManager;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Genre;

public class UpdateMovieTest extends UpdateMovieTestBase {

    @Override
    public void setUp() throws Exception {
        initDbManager();
        super.setUp();
    }

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
