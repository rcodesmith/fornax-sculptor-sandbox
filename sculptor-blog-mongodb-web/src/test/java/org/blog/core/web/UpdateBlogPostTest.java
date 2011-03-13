package org.blog.core.web;

import org.blog.core.domain.BlogPost;

public class UpdateBlogPostTest extends UpdateBlogPostTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(UpdateBlogPostForm form) {

        // TODO Auto-generated method stub, remove next line and assign valid
        // form values
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(UpdateBlogPostForm form) {

        // TODO Auto-generated method stub, remove next line and assign some
        // invalid form values
    }

    /**
     * Creates the BlogPost object to update.
     */
    @Override
    protected BlogPost findById() {
        BlogPost post = new BlogPost("aaa-bbb");
        post.setTitle("AAA");
        return post;
    }
}
