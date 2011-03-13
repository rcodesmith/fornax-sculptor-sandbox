package org.blog.core.web;

public class CreateBlogPostTest extends CreateBlogPostTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreateBlogPostForm form) {
        form.setSlug("aaa-bbb");
        form.setTitle("Goodies");
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreateBlogPostForm form) {
    }
}
