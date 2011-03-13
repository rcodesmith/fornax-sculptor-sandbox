package org.fornax.cartridges.sculptor.examples.library.person.domain;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Map;

import org.fornax.cartridges.sculptor.framework.errorhandling.ValidationException;
import org.fornax.cartridges.sculptor.framework.validation.validator.DomainObjectValidator;
import org.hibernate.validator.InvalidValue;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testGetAge() {
        Person p = new Person(Gender.FEMALE, new Ssn("12345", Country.SWEDEN));
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -17);
        cal.add(Calendar.MONTH, 1);
        p.setBirthDate(cal.getTime());
        assertEquals(new Integer(16), p.getAge());
    }

    @Test(expected = ValidationException.class)
    public void testValidationThrowingValidationException() {
        DomainObjectValidator<Person> validator = new DomainObjectValidator<Person>(Person.class);
        Person person = new Person(Gender.FEMALE, new Ssn("0815", Country.DENMARK));
        validator.assertValid(person);
    }

    @Test
    public void testValidation() {
        DomainObjectValidator<Person> validator = new DomainObjectValidator<Person>(Person.class);
        Person person = new Person(Gender.FEMALE, new Ssn("0815", Country.DENMARK));
        Map<String, InvalidValue> map = validator.getInvalidValuesAsMap(person);
        assertEquals(2, map.size());
        assertEquals(true, map.containsKey("birthDate"));
        assertEquals(true, map.containsKey("name"));
    }
}
