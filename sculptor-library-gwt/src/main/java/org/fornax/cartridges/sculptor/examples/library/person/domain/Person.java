package org.fornax.cartridges.sculptor.examples.library.person.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Entity representing Person.
 * <p>
 * This class is responsible for the domain object related
 * business logic for Person. Properties and associations are
 * implemented in the generated base class {@link org.fornax.cartridges.sculptor.examples.library.person.domain.PersonBase}.
 */
@Entity
@Table(name = "PERSON", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "SSN_NUMBER", "SSN_COUNTRY"}
)
)
public class Person extends PersonBase {
    private static final long serialVersionUID = 1L;

    protected Person() {
    }

    public Person(Gender sex, Ssn ssn) {
        super(sex, ssn);
    }

    public String getDisplayName() {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "getDisplayName not implemented");
    }
}
