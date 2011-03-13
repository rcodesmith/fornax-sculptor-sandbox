package org.sculptor.dddsample.location.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 *
 * Entity representing Location.
 * This class is responsible for the domain object related
 * business logic for Location. Properties and associations are
 * implemented in the generated base class {@link org.sculptor.dddsample.location.domain.LocationBase}.
 */
@Entity(name = "Location")
@Table(name = "LOCATION", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "UNLOCODE"}
)
)
public class Location extends LocationBase {
    private static final long serialVersionUID = -6499417534696844828L;
    /**
     * Special Location object that marks an unknown location.
     */
    public static final Location UNKNOWN = new Location(new UnLocode("XXXXX"), "Unknown location");

    protected Location() {
    }

    public Location(UnLocode unLocode, String name) {
        super(name, unLocode);
    }

}
