package org.blog.core.serviceapi;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.blog.core.domain.Author;
import org.fornax.cartridges.sculptor.framework.accessimpl.mongodb.DbManager;
import org.fornax.cartridges.sculptor.framework.errorhandling.SimpleJUnitServiceContextFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Spring based test with MongoDB.
 */
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
public class AuthorServiceTest extends AbstractJUnit4SpringContextTests implements AuthorServiceTestBase {
    @Autowired
    private DbManager dbManager;
    @Autowired
    private AuthorService authorService;
    private String authorId1;

    @Before
    public void initTestData() {
        Author author1 = new Author("Patrik");
        Author saved = authorService.save(SimpleJUnitServiceContextFactory.getServiceContext(), author1);
        authorId1 = saved.getId();
    }

    @Override
    @Test
    public void testFindById() throws Exception {
        Author found = authorService.findById(SimpleJUnitServiceContextFactory.getServiceContext(), authorId1);
        assertEquals("Patrik", found.getName());
    }

    @After
    public void dropDatabase() {
        Set<String> names = dbManager.getDB().getCollectionNames();
        for (String each : names) {
            if (!each.startsWith("system")) {
                dbManager.getDB().getCollection(each).drop();
            }
        }
        // dbManager.getDB().dropDatabase();
    }

    private int countRowsInDBCollection(String name) {
        return (int) dbManager.getDBCollection(name).getCount();
    }

    @Override
    @Test
    public void testFindAll() throws Exception {
        // TODO Auto-generated method stub
    }

    @Override
    @Test
    public void testSave() throws Exception {
        // TODO Auto-generated method stub
    }

    @Override
    @Test
    public void testDelete() throws Exception {
        // TODO Auto-generated method stub
    }
}
