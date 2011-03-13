package org.fornax.cartridges.sculptor.examples.library.media.domain;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PreRemove;
import javax.persistence.Table;

/**
 *
 * Entity representing Library.
 * This class is responsible for the domain object related
 * business logic for Library. Properties and associations are
 * implemented in the generated base class {@link org.fornax.cartridges.sculptor.examples.library.media.domain.LibraryBase}.
 */
@Entity
@Table(name = "LIBRARY")
@NamedQueries( { @NamedQuery(name = "Library.findLibraryByName", query = "select library from Library as library where library.name = :name") })
public class Library extends LibraryBase {
    private static final long serialVersionUID = 1L;

    protected Library() {
    }

    public Library(String name) {
        super(name);
    }

    @PreRemove
    protected void preRemove() {
        removeAllMedia();
    }

}
