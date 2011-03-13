package org.fornax.cartridges.sculptor.examples.library.media.domain;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.fornax.cartridges.sculptor.framework.errorhandling.ValidationException;

/**
 *
 * Entity representing Movie.
 * This class is responsible for the domain object related
 * business logic for Movie. Properties and associations are
 * implemented in the generated base class {@link org.fornax.cartridges.sculptor.examples.library.media.domain.MovieBase}.
 */
@Entity
@Table(name = "MOVIE")
@PrimaryKeyJoinColumn(name = "MEDIA")
//@org.hibernate.annotations.ForeignKey(name = "FK_MOVIE_MEDIA")
@NamedQueries( { @NamedQuery(name = "Movie.getNumberOfMovies",
// TODO this query doesn't take the library into account
query = "select count(e) from Movie e") })
public class Movie extends MovieBase {
    private static final long serialVersionUID = 1L;

    protected Movie() {
    }

    public Movie(String title, String urlIMDB) {
        super(title, urlIMDB);
    }

    @PreUpdate
    @PrePersist
    public void validatePlayLength() {
        if (getPlayLength() != null && Genre.SHORT.equals(getCategory()) && getPlayLength() > 15) {
            throw new ValidationException(
                    "Short movies should be less than 15 minutes");
        }
    }
}
