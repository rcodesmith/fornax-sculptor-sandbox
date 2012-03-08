package org.fornax.cartridges.sculptor.examples.library.media.serviceimpl;

import org.fornax.cartridges.sculptor.framework.domain.AssociationSpecification;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;

import org.springframework.stereotype.Service;

/**
 * Implementation of LibraryService.
 */
@Service("libraryService")
public class LibraryServiceImpl extends LibraryServiceImplBase {
    public LibraryServiceImpl() {
    }

    public void saveLibrary(ServiceContext ctx) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("saveLibrary not implemented");

    }

    public void populate(ServiceContext ctx, AssociationSpecification spec) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("populate not implemented");

    }

    public void someOtherMethod(ServiceContext ctx, String foo) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "someOtherMethod not implemented");

    }
}
