package org.fornax.cartridges.sculptor.examples.library.person.domain;

import static org.fornax.cartridges.sculptor.examples.library.person.domain.PersonProperties.name;
import static org.fornax.cartridges.sculptor.examples.library.person.domain.PersonProperties.sex;
import static org.fornax.cartridges.sculptor.examples.library.person.domain.PersonProperties.ssn;
import static org.fornax.cartridges.sculptor.examples.library.person.domain.Ssn.ssn;
import static org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder.criteriaFor;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.fornax.cartridges.sculptor.examples.library.person.exception.PersonNotFoundException;
import org.fornax.cartridges.sculptor.examples.library.util.JpaProviderHelper;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria;
import org.fornax.cartridges.sculptor.framework.domain.PagedResult;
import org.fornax.cartridges.sculptor.framework.domain.PagingParameter;
import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.junit.Assume;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based transactional test with DbUnit support.
 */
public class PersonRepositoryTest extends AbstractDbUnitJpaTests {

    private PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    protected String getDataSetFile() {
        return "dbunit/PersonRepositoryTest.xml";
    }

    @Test
    public void shouldFindByNamedQuery() throws Exception {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("country", Country.SWEDEN);
        List<Person> persons = personRepository.findByQuery("Person.findByCountry", parameters);
        assertNotNull(persons);
        assertEquals(1, persons.size());
        assertEquals(Country.SWEDEN, persons.get(0).getSsn().getCountry());
    }

    @Test
    public void shouldFindByPagedNamedQuery() throws Exception {
        // there are 7 persons from Norway
        PagingParameter pagingParameter = PagingParameter.pageAccess(3, 1, true);
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("country", Country.NORWAY);
        PagedResult<Person> pagedResult = personRepository.findByQuery("Person.findByCountry", parameters,
                pagingParameter);
        assertEquals(3, pagedResult.getValues().size());
        assertTrue(pagedResult.isTotalCounted());
        assertEquals(3, pagedResult.getTotalPages());
        assertEquals(7, pagedResult.getTotalRows());
    }

    @Test
    public void shouldFindByDynamicQuery() throws Exception {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("country", Country.SWEDEN);
        List<Person> persons = personRepository.findByQuery("select e from Person e where e.ssn.country = :country",
                parameters);
        assertNotNull(persons);
        assertEquals(1, persons.size());
        assertEquals(Country.SWEDEN, persons.get(0).getSsn().getCountry());
    }

    @Test
    public void shouldFindBySimplePropertyCondition() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        List<ConditionalCriteria> conditionalCriteria = criteriaFor(Person.class).withProperty(sex()).eq(Gender.FEMALE)
                .build();
        List<Person> persons = personRepository.findByCondition(conditionalCriteria);
        assertEquals(2, persons.size());
    }

    @Test
    public void shouldFindByNestedPropertyCondition() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        List<ConditionalCriteria> conditionalCriteria = criteriaFor(Person.class).withProperty(ssn().country()).eq(
                Country.SWEDEN).orderBy(name().last()).build();
        List<Person> persons = personRepository.findByCondition(conditionalCriteria);
        assertEquals(1, persons.size());
        assertEquals(Country.SWEDEN, persons.get(0).getSsn().getCountry());
    }

    @Test
    public void shouldFindByOrCondition() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        List<ConditionalCriteria> conditionalCriteria = criteriaFor(Person.class).withProperty(name().first()).eq(
                "Aaaa").or().withProperty(name().last()).eq("Dddd").orderBy(name().last()).build();
        List<Person> persons = personRepository.findByCondition(conditionalCriteria);
        assertEquals(2, persons.size());
        assertEquals("123456", persons.get(0).getSsn().getNumber());
        assertEquals("987654", persons.get(1).getSsn().getNumber());
    }

    @Test
    public void shouldFindByGroupedCondition() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        List<ConditionalCriteria> conditionalCriteria = criteriaFor(Person.class).withProperty(sex()).eq(Gender.FEMALE)
                .and().lbrace().withProperty(name().first()).eq("Aaaa").or().withProperty(name().last()).eq("Dddd")
                .rbrace().orderBy(name().last()).build();
        List<Person> persons = personRepository.findByCondition(conditionalCriteria);
        assertEquals(1, persons.size());
        assertEquals("987654", persons.get(0).getSsn().getNumber());
    }

    @Test
    public void shouldFindByKey() throws Exception {
        Person found = personRepository.findByKey(ssn("123456", Country.DENMARK));
        assertNotNull(found);
        assertEquals(Country.DENMARK, found.getSsn().getCountry());
    }

    @Test(expected = PersonNotFoundException.class)
    public void shouldNotFindByKey() throws Exception {
        personRepository.findByKey(ssn("123456", Country.NORWAY));
    }

    @Test
    public void shouldFindByNaturalKeys() throws Exception {
        Set<Ssn> keys = new HashSet<Ssn>();
        Ssn ssn1 = new Ssn("123456", Country.DENMARK);
        keys.add(ssn1);
        Ssn ssn2 = new Ssn("987654", Country.DENMARK);
        keys.add(ssn2);
        Ssn ssn3 = new Ssn("999999", Country.SWEDEN);
        keys.add(ssn3);
        Map<Ssn, Person> persons = personRepository.findByNaturalKeys(keys);
        assertEquals(2, persons.size());
        assertNull(persons.get(ssn3));
        assertEquals("Aaaa", persons.get(ssn1).getName().getFirst());
        assertEquals(Gender.MALE, persons.get(ssn1).getSex());
        assertEquals("Cccc", persons.get(ssn2).getName().getFirst());
        assertEquals(Gender.FEMALE, persons.get(ssn2).getSex());
    }

    @Test
    public void shouldFindAllFirstPage() throws Exception {
        // thera are 10 persons
        PagingParameter pagingParameter = PagingParameter.pageAccess(3, 1, true);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(1, pagedResult.getPage());
        assertEquals(3, pagedResult.getPageSize());
        assertEquals(3, pagedResult.getValues().size());
        assertTrue(pagedResult.isTotalCounted());
        assertEquals(4, pagedResult.getTotalPages());
        assertEquals(10, pagedResult.getTotalRows());
    }

    @Test
    public void shouldFindAllSecondPage() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(3, 2);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(2, pagedResult.getPage());
        assertEquals(3, pagedResult.getPageSize());
        assertEquals(3, pagedResult.getValues().size());
        assertFalse(pagedResult.isTotalCounted());
    }

    @Test
    public void shouldFindAllThirdPage() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(3, 3);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(3, pagedResult.getPage());
        assertEquals(3, pagedResult.getPageSize());
        assertEquals(3, pagedResult.getValues().size());
        assertFalse(pagedResult.isTotalCounted());
        assertFalse(pagedResult.isAddionalResultCounted());
    }

    @Test
    public void shouldFindAllLastPage() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(3, 4);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(4, pagedResult.getPage());
        assertEquals(3, pagedResult.getPageSize());
        assertEquals(1, pagedResult.getValues().size());
        // when end reached last page we get the total, even though we didn't
        // ask for it
        assertTrue(pagedResult.isTotalCounted());
        assertEquals(4, pagedResult.getTotalPages());
        assertEquals(10, pagedResult.getTotalRows());
    }

    @Test
    public void shouldNotFindAllWhenPageNumberTooBig() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(3, 17);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(17, pagedResult.getPage());
        assertEquals(3, pagedResult.getPageSize());
        assertEquals(0, pagedResult.getValues().size());
        // when end reached last page we get the total, even though we didn't
        // ask for it
        // but only if it's really last page (some rows was fetched)
        assertFalse(pagedResult.isTotalCounted());
        assertFalse(pagedResult.isAddionalResultCounted());
    }

    @Test
    public void shouldFindAllFillAddionalResultRows() throws Exception {
        PagingParameter pagingParameter = PagingParameter.rowAccess(4, 6, 3);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(-1, pagedResult.getPage());
        assertEquals(-1, pagedResult.getPageSize());
        assertEquals(2, pagedResult.getValues().size());

        assertFalse(pagedResult.isTotalCounted());
        assertEquals(-1, pagedResult.getTotalPages());
        assertEquals(-1, pagedResult.getTotalRows());

        assertTrue(pagedResult.isAddionalResultCounted());
        assertEquals(-1, pagedResult.getAdditionalResultPages());
        assertEquals(3, pagedResult.getAdditionalResultRows());
    }

    @Test
    public void shouldFindAllFillAddionalResultPage2() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(3, 2, 2);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(2, pagedResult.getPage());
        assertEquals(3, pagedResult.getPageSize());
        assertEquals(3, pagedResult.getValues().size());

        assertFalse(pagedResult.isTotalCounted());
        assertEquals(-1, pagedResult.getTotalPages());
        assertEquals(-1, pagedResult.getTotalRows());

        assertTrue(pagedResult.isAddionalResultCounted());
        assertEquals(2, pagedResult.getAdditionalResultPages());
        assertEquals(4, pagedResult.getAdditionalResultRows());
    }

    @Test
    public void shouldFindAllFillCountPage3() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(3, 3, 2);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(3, pagedResult.getPage());
        assertEquals(3, pagedResult.getPageSize());
        assertEquals(3, pagedResult.getValues().size());

        // when end reached last page we get the total, even though we didn't
        // ask for it
        assertTrue(pagedResult.isTotalCounted());
        assertEquals(4, pagedResult.getTotalPages());
        assertEquals(10, pagedResult.getTotalRows());

        assertTrue(pagedResult.isAddionalResultCounted());
        assertEquals(1, pagedResult.getAdditionalResultPages());
        assertEquals(1, pagedResult.getAdditionalResultRows());
    }

    @Test
    public void shouldFindAllFillCountPage4() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(3, 4, 2);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(4, pagedResult.getPage());
        assertEquals(3, pagedResult.getPageSize());
        assertEquals(1, pagedResult.getValues().size());

        // when end reached last page we get the total, even though we didn't
        // ask for it
        assertTrue(pagedResult.isTotalCounted());
        assertEquals(4, pagedResult.getTotalPages());
        assertEquals(10, pagedResult.getTotalRows());

        assertTrue(pagedResult.isAddionalResultCounted());
        assertEquals(0, pagedResult.getAdditionalResultPages());
        assertEquals(0, pagedResult.getAdditionalResultRows());
    }

    @Test
    public void shouldCalculateMaxPagesWhenSmallPageSize() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(3, 1, true);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(4, pagedResult.getTotalPages());
    }

    @Test
    public void shouldCalculateMaxPagesWhenPageSizeEqualToCount() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(10, 1, true);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(1, pagedResult.getTotalPages());
    }

    @Test
    public void shouldCalculateMaxPagesWhenHalfPageSizeToCount() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(5, 1, true);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(2, pagedResult.getTotalPages());
    }

    @Test
    public void shouldCalculateMaxPagesWhenLargePageSize() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(100, 1, true);
        PagedResult<Person> pagedResult = personRepository.findAll(pagingParameter);
        assertEquals(1, pagedResult.getTotalPages());
    }

    @Test
    public void shouldFetchAllWithRowAccess() throws Exception {
        Set<Person> all = new HashSet<Person>();
        int row = 0;
        while (row < 20) {
            PagingParameter pagingParameter = PagingParameter.rowAccess(row, row + 3, 1);
            PagedResult<Person> result = personRepository.findAll(pagingParameter);
            all.addAll(result.getValues());
            if (result.getAdditionalResultRows() <= 0) {
                break;
            }
            row = result.getEndRow();
        }

        assertEquals(10, all.size());
    }

    @Test
    public void shouldFetchAllWithPageAccess() throws Exception {
        Set<Person> all = new HashSet<Person>();
        for (int page = 1; page < 20; page++) {
            PagingParameter pagingParameter = PagingParameter.pageAccess(3, page, 1);
            PagedResult<Person> result = personRepository.findAll(pagingParameter);
            all.addAll(result.getValues());
            if (result.getAdditionalResultPages() <= 0) {
                break;
            }
        }

        assertEquals(10, all.size());
    }

    @Test
    public void shouldFetchAllWithNextPageAccess() throws Exception {
        Set<Person> all = new HashSet<Person>();
        PagedResult<Person> result = null;
        while (true) {
            PagingParameter pagingParameter;
            if (result == null) {
                pagingParameter = PagingParameter.pageAccess(3, 1);
            } else {
                pagingParameter = PagingParameter.getNextPage(result);
            }
            result = personRepository.findAll(pagingParameter);
            if (result.getValues().isEmpty()) {
                break;
            }
            all.addAll(result.getValues());
        }

        assertEquals(10, all.size());
    }

}
