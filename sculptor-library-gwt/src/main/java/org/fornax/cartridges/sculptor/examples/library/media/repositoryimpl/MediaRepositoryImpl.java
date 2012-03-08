package org.fornax.cartridges.sculptor.examples.library.media.repositoryimpl;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Media;
import org.fornax.cartridges.sculptor.examples.library.media.domain.Movie;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Repository implementation for Media
 */
@Repository("mediaRepository")
public class MediaRepositoryImpl extends MediaRepositoryBase {
    public MediaRepositoryImpl() {
    }

    public List<Media> findMediaByCharacter(Long libraryId, String characterName) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "findMediaByCharacter not implemented");

    }

    public List<Media> findMediaByName(Long libraryId, String name) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "findMediaByName not implemented");

    }

    public Map<String, Movie> findMovieByUrlIMDB(Set<String> keys) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "findMovieByUrlIMDB not implemented");

    }
}
