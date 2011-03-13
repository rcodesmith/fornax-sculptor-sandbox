package org.fornax.cartridges.sculptor.examples.library.media.web;

import java.util.ArrayList;
import java.util.List;

import org.fornax.cartridges.sculptor.examples.library.media.domain.Library;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContextStore;
import org.springframework.stereotype.Component;
import org.springframework.webflow.execution.RequestContext;

@Component
public class ListLibraryAction extends ListLibraryActionBase {
    public String findByFilter(RequestContext ctx) {
        getRepository().clear();

        List<Library> allLibraries = getLibraryService().findAll(ServiceContextStore.get());
        List<Library> filtered = new ArrayList<Library>();
        String filter = ctx.getRequestParameters().get("libraryFilter");
        for (Library library : allLibraries) {
            if (library.getName().startsWith(filter)) {
                filtered.add(library);
            }
        }
        formObject(ctx).setAllLibraries(filtered);
        return "success";
    }
}
