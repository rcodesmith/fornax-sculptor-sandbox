package org.fornax.cartridges.sculptor.examples.library.person.web;

import java.util.Calendar;

import org.fornax.cartridges.sculptor.examples.library.person.domain.Country;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Gender;

public class CreatePersonTest extends CreatePersonTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreatePersonForm form) {
        form.setSsnNumber("123457");
        form.setSsnCountry(Country.SWEDEN);
        form.setNameFirst("Alexander");
        form.setNameLast("Skarsgård");
        Calendar cal = Calendar.getInstance();
        cal.set(1976, 7, 25);
        form.setBirthDate(cal.getTime());
        form.setSex(Gender.MALE);

    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreatePersonForm form) {
        form.setSsnNumber(null);
        form.setSsnCountry(null);
        form.setNameFirst(null);
        form.setNameLast(null);
        form.setBirthDate(null);
        form.setSex(null);

    }
}
