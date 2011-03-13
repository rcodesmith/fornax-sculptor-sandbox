package org.fornax.cartridges.sculptor.examples.library.media.serviceapi;

import static org.fornax.cartridges.sculptor.framework.errorhandling.SimpleJUnitServiceContextFactory.getServiceContext;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.fornax.cartridges.sculptor.examples.library.media.domain.LibraryTestData;
import org.fornax.cartridges.sculptor.examples.library.media.domain.Media;
import org.fornax.cartridges.sculptor.framework.accessimpl.mongodb.DbManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
public class MediaServiceTest extends AbstractJUnit4SpringContextTests implements MediaServiceTestBase {

    @Autowired
    private MediaService mediaService;

    @Autowired
    private LibraryTestData testData;
    @Autowired
    private DbManager dbManager;

    @Before
    public void initialData() throws Exception {
        testData.saveInitialData();
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

    @Override
    @Test
    public void testFindAll() throws Exception {
        List<Media> all = mediaService.findAll(getServiceContext());
        assertEquals(3, all.size());
    }
}
