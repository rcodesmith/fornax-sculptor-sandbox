package org.fornax.cartridges.sculptor.examples.library.media.serviceapi;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.fornax.cartridges.sculptor.examples.library.media.domain.MediaCharacter;
import org.fornax.cartridges.sculptor.examples.library.util.JpaProviderHelper;
import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based transactional test with DbUnit support.
 */
public class MediaCharacterServiceTest extends AbstractDbUnitJpaTests implements MediaCharacterServiceTestBase {

    private MediaCharacterService mediaCharacterService;

    @Autowired
    public void setMediaCharacterService(MediaCharacterService mediaCharacterService) {
        this.mediaCharacterService = mediaCharacterService;
    }

    @Override
    protected String getDataSetFile() {
        // use same testdata as for LibraryService
        if (JpaProviderHelper.isEclipselinkJpaProvider(getEntityManager())) {
            return "dbunit/LibraryServiceTest_eclipselink.xml";
        }
        return "dbunit/LibraryServiceTest.xml";
    }

    @Test
    public void testFindAll() throws Exception {
        List<MediaCharacter> all = mediaCharacterService.findAll(getServiceContext());
        assertEquals(2, all.size());
    }
}
