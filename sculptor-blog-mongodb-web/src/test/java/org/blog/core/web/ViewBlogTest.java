package org.blog.core.web;

import java.util.HashSet;
import java.util.Set;

import org.blog.core.domain.Author;
import org.blog.core.domain.Blog;

/**
 * Test class for view flow. All test methods are in the generated base class.
 */
public class ViewBlogTest extends ViewBlogTestBase {
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
        return blog;

    }
}
