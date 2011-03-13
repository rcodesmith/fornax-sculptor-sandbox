package org.blog.core.web;

import java.util.HashSet;
import java.util.Set;

import org.blog.core.domain.Author;
import org.blog.core.domain.Blog;

public class UpdateBlogTest extends UpdateBlogTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(UpdateBlogForm form) {

        // TODO Auto-generated method stub, remove next line and assign valid
        // form values
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(UpdateBlogForm form) {

        // TODO Auto-generated method stub, remove next line and assign some
        // invalid form values
    }

    /**
     * Creates the Blog object to update.
     */
    @Override
    protected Blog findById() {
        Blog blog = new Blog("http://my.blogspot.com") {
            Set<Author> writers = new HashSet<Author>();

            @Override
            public Set<Author> getWriters() {
                return writers;
            }
        };
        blog.setTitle("My");
        Author author = new Author("PN");
        blog.addWriter(author);
        return blog;
    }
}
