package org.blog.core.web;

public class CreateBlogTest extends CreateBlogTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreateBlogForm form) {
        form.setTitle("Cool");
        form.setIntro("bla bla");
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreateBlogForm form) {
    }
}
