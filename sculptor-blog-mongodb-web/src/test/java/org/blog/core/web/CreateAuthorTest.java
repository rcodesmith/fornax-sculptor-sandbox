package org.blog.core.web;

public class CreateAuthorTest extends CreateAuthorTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreateAuthorForm form) {
        form.setName("Patrik");
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreateAuthorForm form) {
    }
}
