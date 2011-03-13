package org.fornax.cartridges.sculptor.examples.library.media.domain;

import static org.fornax.cartridges.sculptor.examples.library.media.domain.MediaProperties.title;
import static org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder.criteriaFor;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.fornax.cartridges.sculptor.examples.library.util.JpaProviderHelper;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria;
import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.junit.Assume;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based transactional test with DbUnit support.
 */
public class MediaRepositoryTest extends AbstractDbUnitJpaTests {

    private MediaRepository mediaRepository;

    @Autowired
    public void setMediaRepository(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    @Override
    protected String getDataSetFile() {
        if (JpaProviderHelper.isEclipselinkJpaProvider(getEntityManager())) {
            return "dbunit/LibraryServiceTest_eclipselink.xml";
        }
        return "dbunit/LibraryServiceTest.xml";
    }

    @Override
    protected String getSequenceName() {
        if (JpaProviderHelper.isHibernateJpaProvider(getEntityManager())) {
            return "hibernate_seq";
        } else if (JpaProviderHelper.isEclipselinkJpaProvider(getEntityManager())) {
            return "SEQ_GEN";
        } else {
            return null;
        }
    }

    @Test
    public void testFindMovieByKeys() throws Exception {
        Set<String> keys = new HashSet<String>();
        keys.add("abc");
        keys.add("def");
        keys.add("xyz");
        Map<String, Movie> movies = mediaRepository.findMovieByUrlIMDB(keys);
        assertEquals(2, movies.size());
        assertNotNull(movies.get("abc"));
        assertNotNull(movies.get("def"));
    }

    @Test
    public void testGetNumberOfMovies() throws Exception {
        int count = mediaRepository.getNumberOfMovies(1L);
        assertEquals(3, count);
    }

    @Test
    public void testSave() throws Exception {
        int before = countRowsInTable(Book.class);
        Book ddd = new Book("Domain-Driven Design", "0-321-12521-5");
        mediaRepository.save(ddd);
        assertEquals(before + 1, countRowsInTable(Book.class));
    }

    @Test
    public void testFindMediaByCondition() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        List<ConditionalCriteria> conditionalCriteria = criteriaFor(Media.class).withProperty(title()).ignoreCaseLike(
                "pippi%").build();
        List<Media> found = mediaRepository.findByCondition(conditionalCriteria);
        assertEquals(1, found.size());
        assertEquals("Pippi Långstrump i Söderhavet", found.get(0).getTitle());
    }

    @Test
    public void testFindMovieByCondition() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        List<ConditionalCriteria> conditionalCriteria = criteriaFor(Movie.class).withProperty(MovieProperties.title())
                .like("Pippi%").build();
        List<Media> found = mediaRepository.findByCondition(conditionalCriteria);
        assertEquals(1, found.size());
        assertEquals("Pippi Långstrump i Söderhavet", found.get(0).getTitle());
    }

    @Test
    public void testFindByNestedCondition() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        List<ConditionalCriteria> conditionalCriteria = criteriaFor(Media.class).withProperty(
                MediaProperties.physicalMedia().location()).eq("abc123").build();
        List<Media> found = mediaRepository.findByCondition(conditionalCriteria);
        assertEquals(1, found.size());
        assertEquals("Pippi Långstrump i Söderhavet", found.get(0).getTitle());
    }

}
