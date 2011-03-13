package org.fornax.cartridges.sculptor.examples.library.person.repositoryimpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fornax.cartridges.sculptor.examples.library.person.domain.Person;
import org.springframework.stereotype.Repository;

/**
 * Repository implementation for Person
 */
@Repository("personRepository")
public class PersonRepositoryImpl extends PersonRepositoryBase {
    public PersonRepositoryImpl() {
    }

    @Override
    public List<Person> findPersonByName(String name) {
        List<String> names = Arrays.asList(name.split(" "));
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("names", names);
        try {
            return findByQuery("Person.findPersonByName", parameters);
        } catch (IllegalArgumentException e) {
            // JPA 1.0/EclipseLink doesn't support IN condition with named collection parameter, but it works without brackets
            // This is probably fixed in JPA 2.0/EclipseLink
            return findByQuery(
                    "select person from Person person where person.name.first in :names or person.name.last in :names",
                    parameters);
        }
    }
}
