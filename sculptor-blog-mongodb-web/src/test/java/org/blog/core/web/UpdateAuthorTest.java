package org.blog.core.web;

import org.blog.core.domain.Author;

public class UpdateAuthorTest extends UpdateAuthorTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(UpdateAuthorForm form) {
        form.setName("PN");
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(UpdateAuthorForm form) {
    }

    /**
     * Creates the Author object to update.
     */
    @Override
    protected Author findById() {
        Author author = new Author("Patrik");
        return author;
    }
}
