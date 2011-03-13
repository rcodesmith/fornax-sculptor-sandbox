package org.fornax.cartridges.sculptor.examples.library.media.repositoryimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Library;
import org.fornax.cartridges.sculptor.examples.library.media.domain.LibraryProperties;
import org.fornax.cartridges.sculptor.examples.library.media.domain.LibraryRepository;
import org.fornax.cartridges.sculptor.examples.library.media.exception.LibraryNotFoundException;
import org.fornax.cartridges.sculptor.framework.errorhandling.ValidationException;
import org.springframework.stereotype.Repository;

/**
 * Repository for Library
 */
@Repository("libraryRepository")
public class LibraryRepositoryImpl extends LibraryRepositoryBase implements LibraryRepository {
    public LibraryRepositoryImpl() {
    }

    @Override
    public Library findLibraryByName(String name) throws LibraryNotFoundException {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put(LibraryProperties.name().toString(), name);

        List<Library> result = findByQuery("Library.findLibraryByName", parameters);

        if (result.isEmpty()) {
            throw new LibraryNotFoundException("Library not found: " + name);
        } else {
            return result.get(0);
        }
    }

    @Override
    public Library save(Library entity) {
        if (entity.getName().equals("err")) {
            throw new RuntimeException("SimulatedRuntimeException");
        }
        if (entity.getName().equals("validation")) {
            throw new ValidationException("foo", "Simulated validation exception");
        }
        return super.save(entity);
    }

}
