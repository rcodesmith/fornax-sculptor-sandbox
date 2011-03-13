package org.fornax.cartridges.sculptor.examples.library.media.repositoryimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Media;
import org.fornax.cartridges.sculptor.examples.library.media.domain.MediaCharacter;
import org.fornax.cartridges.sculptor.examples.library.media.domain.MediaProperties;
import org.fornax.cartridges.sculptor.examples.library.media.domain.MediaRepository;
import org.fornax.cartridges.sculptor.examples.library.media.domain.Movie;
import org.fornax.cartridges.sculptor.examples.library.media.domain.MovieProperties;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByQueryAccess;
import org.springframework.stereotype.Repository;

/**
 * Repository for Media
 */
@Repository("mediaRepository")
public class MediaRepositoryImpl extends MediaRepositoryBase implements
        MediaRepository {
    public MediaRepositoryImpl() {
    }

    @Override
    public java.util.List<org.fornax.cartridges.sculptor.examples.library.media.domain.Media> findMediaByName(
            Long libraryId, String name) {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("libraryId", libraryId);
        parameters.put(MediaProperties.title().toString(), name);

        FindByQueryAccess<Media> queryAccess = createFindByQueryAccess();
        queryAccess.setQuery("Media.findMediaByTitle");
        queryAccess.setParameters(parameters);
        queryAccess.execute();

        List<Media> result = queryAccess.getResult();

        return result;
    }

    @Override
    public Map<String, Movie> findMovieByUrlIMDB(Set<String> keys) {
        Map<Object, Media> media = findByKeys(keys, MovieProperties.urlIMDB()
                .toString(), Movie.class);
        Map<String, Movie> movies = new HashMap<String, Movie>();
        for (Object k : media.keySet()) {
            movies.put((String) k, (Movie) media.get(k));
        }
        return movies;
    }

    @Override
    public List<Media> findMediaByCharacter(Long libraryId, String characterName) {
        // Retrieve the MediaCharacter objects via another Repository
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("characterName", characterName);
        List<MediaCharacter> foundCharacters = getMediaCharacterRepository()
                .findByQuery("MediaCharacter.findByCharacterName", parameters);

        // filter matching Media for the found characters and the specified
        // library
        List<Media> matchingMedia = new ArrayList<Media>();
        for (MediaCharacter c : foundCharacters) {
            for (Media m : c.getExistsInMedia()) {
                if (m.existsInLibrary(libraryId)) {
                    matchingMedia.add(m);
                }
            }
        }

        return matchingMedia;
    }

    @Override
    public int getNumberOfMovies(Long libraryId) {
        Map<String, Object> parameters = new HashMap<String, Object>();
        // TODO this query doesn't take the library into account
        // parameters.put("libraryId", libraryId);
        boolean useSingleResult = true;
        Number result = (Number) findByQuery("Movie.getNumberOfMovies",
                parameters, useSingleResult);
        return result.intValue();
    }

}
