package org.fornax.cartridges.sculptor.examples.library.person.repositoryimpl;

import static org.fornax.cartridges.sculptor.examples.library.person.domain.PersonProperties.name;
import static org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder.criteriaFor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.fornax.cartridges.sculptor.examples.library.person.domain.Person;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria;
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

        List<ConditionalCriteria> firstNameCondition = criteriaFor(Person.class).withProperty(name().first()).in(names)
                .build();
        List<Person> result1 = findByCondition(firstNameCondition);

        List<ConditionalCriteria> lastNameCondition = criteriaFor(Person.class).withProperty(name().last()).in(names)
                .build();
        List<Person> result2 = findByCondition(lastNameCondition);

        Set<Person> concatenatedResult = new HashSet<Person>();
        concatenatedResult.addAll(result1);
        concatenatedResult.addAll(result2);
        return new ArrayList<Person>(concatenatedResult);
    }
}
