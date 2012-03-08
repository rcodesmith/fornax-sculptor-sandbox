package org.fornax.cartridges.sculptor.examples.library.media.repositoryimpl;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Library;

import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Repository implementation for Library
 */
@Repository("libraryRepository")
public class LibraryRepositoryImpl extends LibraryRepositoryBase {
    public LibraryRepositoryImpl() {
    }

    public Library findLibraryByName(String name) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "findLibraryByName not implemented");

    }

    public Library findLibraryByNameAndDate(String name, Date effDate) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "findLibraryByNameAndDate not implemented");

    }
}
