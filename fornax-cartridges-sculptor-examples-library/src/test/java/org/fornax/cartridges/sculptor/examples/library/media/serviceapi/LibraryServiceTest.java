package org.fornax.cartridges.sculptor.examples.library.media.serviceapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Library;
import org.fornax.cartridges.sculptor.examples.library.media.domain.LibraryProperties;
import org.fornax.cartridges.sculptor.examples.library.media.domain.Media;
import org.fornax.cartridges.sculptor.examples.library.media.domain.Movie;
import org.fornax.cartridges.sculptor.examples.library.media.domain.PhysicalMedia;
import org.fornax.cartridges.sculptor.examples.library.media.exception.LibraryNotFoundException;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Person;
import org.fornax.cartridges.sculptor.examples.library.util.JpaProviderHelper;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder;
import org.fornax.cartridges.sculptor.framework.domain.PagedResult;
import org.fornax.cartridges.sculptor.framework.domain.PagingParameter;
import org.fornax.cartridges.sculptor.framework.errorhandling.OptimisticLockingException;
import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.junit.Assume;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
import org.springframework.test.annotation.NotTransactional;

/**
 * Spring based transactional test with DbUnit support.
 */

@SuppressWarnings("deprecation")
public class LibraryServiceTest extends AbstractDbUnitJpaTests implements LibraryServiceTestBase {
    private final long libraryId = 1;

    private LibraryService libraryService;

    @Autowired
    public void setLibraryService(LibraryService libraryService) {
        this.libraryService = libraryService;
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

    @Override
    @Test
    public void testFindLibraryByName() throws Exception {
        String libraryName = "LibraryServiceTest";
        Library library = libraryService.findLibraryByName(getServiceContext(), libraryName);
        assertNotNull(library);
        assertEquals(libraryName, library.getName());
        assertTrue(library.getId() > 0);

    }

    @Test
    @ExpectedException(LibraryNotFoundException.class)
    public void testFindLibraryByNameNotFound() throws Exception {
        libraryService.findLibraryByName(getServiceContext(), "not a library");
    }

    @Override
    @Test
    public void testSave() throws Exception {
        Date now = new Date();
        String name = "TestCreateLibrary " + now;
        Library library = new Library(name);
        libraryService.save(getServiceContext(), library);
        Library foundLibrary = libraryService.findLibraryByName(getServiceContext(), name);
        assertNotNull(foundLibrary);
        assertNotNull(foundLibrary.getLastUpdated());
        assertEquals("system", foundLibrary.getLastUpdatedBy());
        assertTrue("Expected " + foundLibrary.getLastUpdated() + " > " + now,
                foundLibrary.getLastUpdated().compareTo(now) >= 0);
    }

    @Test
    @NotTransactional
    @ExpectedException(OptimisticLockingException.class)
    public void testOptimisticLocking() throws Exception {
        Library foundLibrary = libraryService.findById(getServiceContext(), 1L);
        foundLibrary.setVersion(0L);
        libraryService.save(getServiceContext(), foundLibrary);
    }

    @Override
    @Test
    public void testFindMediaByName() throws Exception {
        String title = "Pippi Långstrump i Söderhavet";
        List<Media> movieList = libraryService.findMediaByName(getServiceContext(), libraryId, title);
        assertNotNull(movieList);
        assertEquals(1, movieList.size());
        assertEquals(Movie.class, movieList.get(0).getClass());

        Movie movie = (Movie) movieList.get(0);
        assertEquals(title, movie.getTitle());

    }

    @Override
    @Test
    public void testFindMediaByCharacter() throws Exception {
        String characterName = "James Bond";
        List<Media> movieList = libraryService.findMediaByCharacter(getServiceContext(), libraryId, characterName);
        assertNotNull(movieList);
        assertEquals(1, movieList.size());
        assertEquals(Movie.class, movieList.get(0).getClass());

        Movie movie = (Movie) movieList.get(0);
        assertEquals("Die Another Day", movie.getTitle());

    }

    @Override
    @Test
    public void testFindPersonByName() throws Exception {
        String name = "Pierce Brosnan";
        List<Person> persons = libraryService.findPersonByName(getServiceContext(), name);
        assertNotNull(persons);
        assertEquals(1, persons.size());
        Person p = persons.get(0);
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());
        String s = p.toString();
        assertTrue(s.indexOf("ssn") != -1);
        assertTrue(s.indexOf("first") != -1);
        assertTrue(s.indexOf("last") != -1);
    }

    @Override
    @Test
    public void testDelete() throws Exception {
        int before = countRowsInTable(Library.class);
        int physicalMediaBefore = countRowsInTable(PhysicalMedia.class);
        Library library = libraryService.findById(getServiceContext(), new Long(1));
        libraryService.delete(getServiceContext(), library);
        assertEquals(before - 1, countRowsInTable(Library.class));
        // we remove PhysicalMedia associations before remove to avoid cascade
        // delete
        assertEquals(physicalMediaBefore, countRowsInTable(PhysicalMedia.class));
    }

    @Override
    @Test
    public void testFindAll() throws Exception {
        List<Library> all = libraryService.findAll(getServiceContext());
        assertEquals(3, all.size());
    }

    @Override
    @Test
    public void testFindById() throws Exception {
        Library library = libraryService.findById(getServiceContext(), new Long(1));
        assertNotNull(library);
        assertEquals("LibraryServiceTest", library.getName());
    }

    @Override
    @Test
    public void testFindByCondition() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));

        PagingParameter paging = PagingParameter.rowAccess(0, 2, 0);

        // Simulate wrong result without distinctRoot() - 1 row only
        List<ConditionalCriteria> wrongCondition = ConditionalCriteriaBuilder.criteriaFor(Library.class)
                .withProperty(LibraryProperties.media().version()).eq(1l).orderBy(LibraryProperties.name())
                .descending().build();
        PagedResult<Library> wrongResult = libraryService.findByCondition(getServiceContext(), wrongCondition, paging);
        assertEquals(1, wrongResult.getRowCount());
        assertEquals(1, wrongResult.getTotalRows());
        assertEquals(3l, wrongResult.getValues().get(0).getId().longValue());

        // Simulate exception when you are sorting with foreign attribute
        // You can sort only by attributes owned by primary object
        try {
            List<ConditionalCriteria> condition = ConditionalCriteriaBuilder.criteriaFor(Library.class)
                    .withProperty(LibraryProperties.media().version()).eq(1l).distinctRoot()
                    .orderBy(LibraryProperties.media().location()).build();
            libraryService.findByCondition(getServiceContext(), condition, paging);
            fail("Exception not thrown");
        } catch (Exception ex) {
            assertTrue("",
                    ex.getMessage().indexOf("create distinct condition order by foreign field 'media.location'") != -1);
        }

        // Correct run after distinctRoot() specified. Size of result is 2 and
        // order is
        // reversed (3 - Third library, 2 - My library) because of descending
        // name order
        List<ConditionalCriteria> condition = ConditionalCriteriaBuilder.criteriaFor(Library.class)
                .withProperty(LibraryProperties.media().version()).eq(1l).distinctRoot()
                .orderBy(LibraryProperties.name()).descending().build();
        PagedResult<Library> findResult = libraryService.findByCondition(getServiceContext(), condition, paging);
        assertEquals(2, findResult.getRowCount());
        assertEquals(-1, findResult.getTotalRows());
        assertEquals(3l, findResult.getValues().get(0).getId().longValue());
        assertEquals(2l, findResult.getValues().get(1).getId().longValue());
    }

    @Test
    public void testNoLimitPaging() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));

        List<ConditionalCriteria> condition = ConditionalCriteriaBuilder.criteriaFor(Library.class)
                .withProperty(LibraryProperties.version()).eq(1l).build();

        PagingParameter nolimitPaging = PagingParameter.noLimits();
        PagedResult<Library> findResult = libraryService.findByCondition(getServiceContext(), condition, nolimitPaging);
        assertEquals(3, findResult.getValues().size());
    }

    @Test
    public void testFindByConditionLazyFetch() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));

        PagingParameter paging = PagingParameter.noLimits();
        List<ConditionalCriteria> conditions = ConditionalCriteriaBuilder
            .criteriaFor(Library.class)
            .withProperty(LibraryProperties.version()).eq(1l)
            .withProperty(LibraryProperties.media()).fetchEager()
            .projectionRoot().build();
        PagedResult<Library> eagerResult = libraryService.findByCondition(getServiceContext(), conditions, paging);
        assertEquals(6, eagerResult.getRowCount());

        conditions.add(ConditionalCriteria.fetchLazy(LibraryProperties.media()));
        PagedResult<Library> lazyResult = libraryService.findByCondition(getServiceContext(), conditions, paging);
        assertEquals(3, lazyResult.getRowCount());
    }
}
