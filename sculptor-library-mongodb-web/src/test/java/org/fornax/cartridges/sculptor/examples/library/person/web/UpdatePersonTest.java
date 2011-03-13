package org.fornax.cartridges.sculptor.examples.library.person.web;

import java.util.Calendar;

import org.fornax.cartridges.sculptor.examples.library.person.domain.Country;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Gender;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Person;
import org.fornax.cartridges.sculptor.examples.library.person.domain.PersonName;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Ssn;

public class UpdatePersonTest extends UpdatePersonTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(UpdatePersonForm form) {
        form.setNameFirst("Alexander");
        form.setNameLast("Skarsgård");
        Calendar cal = Calendar.getInstance();
        cal.set(1976, 7, 25);
        form.setBirthDate(cal.getTime());

    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(UpdatePersonForm form) {
        form.setNameFirst(null);
        form.setNameLast(null);
        form.setBirthDate(null);

    }

    /**
     * Creates the Person object to update.
     */
    @Override
    protected Person findById() {
        Person person = new Person(Gender.MALE, new Ssn("123457", Country.SWEDEN));
        person.setName(new PersonName("Alex", "Skarsgård"));
        return person;
    }
}
