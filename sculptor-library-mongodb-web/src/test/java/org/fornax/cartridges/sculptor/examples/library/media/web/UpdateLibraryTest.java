package org.fornax.cartridges.sculptor.examples.library.media.web;

import static org.fornax.cartridges.sculptor.examples.library.util.DbManagerInitializer.initDbManager;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Library;

public class UpdateLibraryTest extends UpdateLibraryTestBase {

    @Override
    public void setUp() throws Exception {
        initDbManager();
        super.setUp();
    }

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(UpdateLibraryForm form) {
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(UpdateLibraryForm form) {
        throw new UnsupportedOperationException("skip");

    }

    /**
     * Creates the Library object to update.
     */
    @Override
    protected Library findById() {
        return new Library("test library");
    }
}
