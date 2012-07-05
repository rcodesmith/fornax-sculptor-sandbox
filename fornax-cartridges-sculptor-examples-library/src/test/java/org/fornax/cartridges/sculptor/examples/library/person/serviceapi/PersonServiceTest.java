package org.fornax.cartridges.sculptor.examples.library.person.serviceapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.List;

import org.fornax.cartridges.sculptor.examples.library.person.domain.Country;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Gender;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Person;
import org.fornax.cartridges.sculptor.examples.library.person.domain.PersonName;
import org.fornax.cartridges.sculptor.examples.library.person.domain.PersonProperties;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Ssn;
import org.fornax.cartridges.sculptor.examples.library.person.exception.PersonNotFoundException;
import org.fornax.cartridges.sculptor.examples.library.util.JpaProviderHelper;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder;
import org.fornax.cartridges.sculptor.framework.domain.PagedResult;
import org.fornax.cartridges.sculptor.framework.domain.PagingParameter;
import org.fornax.cartridges.sculptor.framework.errorhandling.ValidationException;
import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.junit.Assume;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;

/**
 * Spring based transactional test with DbUnit support.
 */
public class PersonServiceTest extends AbstractDbUnitJpaTests implements PersonServiceTestBase {
    private PersonService personService;

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @Override
    @Test
    public void testFindById() throws Exception {
        Person person = personService.findById(getServiceContext(), 1L);
        assertNotNull(person);
    }

    @Test
    @ExpectedException(PersonNotFoundException.class)
    public void testFindByIdWithNotFoundException() throws Exception {
        personService.findById(getServiceContext(), -1L);
    }

    @Test
    public void testCreate() throws Exception {
        int before = countRowsInTable(Person.class);
        Person person = new Person(Gender.FEMALE, new Ssn("12345", Country.DENMARK));
        PersonName name = new PersonName("New", "Person");
        person.setName(name);

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        person.setBirthDate(cal.getTime());
        personService.save(getServiceContext(), person);
        assertEquals(before + 1, countRowsInTable(Person.class));
    }

    @Test
    @ExpectedException(ValidationException.class)
    public void testCreateThrowingValidationExceptionForBirthDate() throws Exception {
        Person person = new Person(Gender.FEMALE, new Ssn("12345", Country.DENMARK));
        PersonName name = new PersonName("New", "Person");
        person.setName(name);

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 1);
        person.setBirthDate(cal.getTime());
        personService.save(getServiceContext(), person);
    }

    @Test
    @ExpectedException(ValidationException.class)
    public void testCreateThrowingValidationException() throws Exception {
        Person person = new Person(Gender.FEMALE, new Ssn("0815", Country.DENMARK));
        PersonName name = new PersonName("New", "Person");
        person.setName(name);
        person.setBirthDate(null);
        personService.save(getServiceContext(), person);
    }

    @Override
    @Test
    public void testSave() throws Exception {
        Person person = personService.findById(getServiceContext(), 1L);
        assertNotNull(person);
        PersonName name = new PersonName("First", "Last");
        person.setName(name);
        personService.save(getServiceContext(), person);
        Person person2 = personService.findById(getServiceContext(), 1L);
        assertEquals("First", person2.getName().getFirst());
    }

    @Override
    @Test
    public void testDelete() throws Exception {
        int before = countRowsInTable(Person.class);
        Person person = personService.findById(getServiceContext(), 1L);
        assertNotNull(person);
        personService.delete(getServiceContext(), person);
        assertEquals(before - 1, countRowsInTable(Person.class));
    }

    @Override
    @Test
    public void testFindPersonByName() throws Exception {
        List<Person> persons = personService.findPersonByName(getServiceContext(), "Skarsgård");
        assertEquals(2, persons.size());
    }

    @Override
    @Test
    public void testFindAll() throws Exception {
        PagingParameter pagingParameter = PagingParameter.pageAccess(PagingParameter.DEFAULT_PAGE_SIZE);
        PagedResult<Person> pagedResult = personService.findAll(getServiceContext(), pagingParameter);
        assertEquals(3, pagedResult.getValues().size());
    }

    @Override
    @Test
    public void testFindByCondition() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));

        List<ConditionalCriteria> criteria = ConditionalCriteriaBuilder.criteriaFor(Person.class)
                .withProperty(PersonProperties.ssn().country()).eq(Country.SWEDEN)
                .orderBy(PersonProperties.contact().personName().first()).build();
        List<Person> personHaber = personService.findByCondition(getServiceContext(), criteria);
        assertEquals(3, personHaber.size());
        assertEquals(2, personHaber.get(0).getId().longValue());
        assertEquals(3, personHaber.get(1).getId().longValue());
        assertEquals(1, personHaber.get(2).getId().longValue());
    }
    
	@Test
	public void testFindByCondition2() {
		List<ConditionalCriteria> criteria = ConditionalCriteriaBuilder
				.criteriaFor(Person.class)
				.withProperty(PersonProperties.contact().personName().first())
				.eq("111")
				.build();
		List<Person> personHaber = personService.findByCondition(
				getServiceContext(), criteria);
	}
}
