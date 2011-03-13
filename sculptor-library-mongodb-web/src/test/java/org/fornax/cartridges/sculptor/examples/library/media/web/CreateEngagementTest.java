package org.fornax.cartridges.sculptor.examples.library.media.web;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Book;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Country;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Gender;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Person;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Ssn;

public class CreateEngagementTest extends CreateEngagementTestBase {

    /**
     * Populates the valid form values.
     */
    @SuppressWarnings("serial")
    protected void populateFormSuccess(CreateEngagementForm form) {
        form.setRole("Actor");
        form.setRequiredPerson("1");
        form.setPerson(new Person(Gender.FEMALE, new Ssn("1111", Country.SWEDEN)) {
            {
                setId("1");
            }
        });
        form.setRequiredMedia("1");
        form.setMedia(new Book("aaa", "1234") {
            {
                setId("1");
            }
        });

    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreateEngagementForm form) {
        form.setRole(null);
        form.setRequiredPerson(null);
        form.setRequiredMedia(null);

    }
}
