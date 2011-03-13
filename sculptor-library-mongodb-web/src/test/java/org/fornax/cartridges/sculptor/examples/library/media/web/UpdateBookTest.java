package org.fornax.cartridges.sculptor.examples.library.media.web;

import static org.fornax.cartridges.sculptor.examples.library.util.DbManagerInitializer.initDbManager;

public class UpdateBookTest extends UpdateBookTestBase {

    @Override
    public void setUp() throws Exception {
        initDbManager();
        super.setUp();
    }

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
