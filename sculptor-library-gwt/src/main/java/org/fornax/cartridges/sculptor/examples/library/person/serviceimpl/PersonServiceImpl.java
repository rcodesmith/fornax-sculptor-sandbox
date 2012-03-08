package org.fornax.cartridges.sculptor.examples.library.person.serviceimpl;

import org.fornax.cartridges.sculptor.examples.library.person.domain.CreatePersonCmd;
import org.fornax.cartridges.sculptor.examples.library.person.domain.Person;
import org.fornax.cartridges.sculptor.framework.domain.PagedResult;
import org.fornax.cartridges.sculptor.framework.domain.PagingParameter;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Implementation of PersonService.
 */
@Service("personService")
public class PersonServiceImpl extends PersonServiceImplBase {
    public PersonServiceImpl() {
    }

    public PagedResult<Person> findPaged(ServiceContext ctx, String name,
        PagingParameter pagingParameter) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("findPaged not implemented");

    }

    public List<Person> findByDate(ServiceContext ctx, Date entryDate) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("findByDate not implemented");

    }

    public List<Person> findRelatedPeople(ServiceContext ctx, Person person) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "findRelatedPeople not implemented");

    }

    public void send(ServiceContext ctx, String from, CreatePersonCmd cmd) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("send not implemented");

    }
}
