package org.blog.core.web;

public class CreateCommentTest extends CreateCommentTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreateCommentForm form) {
        form.setTitle("Hmmm");
        form.setBody("I'm not sure");
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreateCommentForm form) {
    }
}
