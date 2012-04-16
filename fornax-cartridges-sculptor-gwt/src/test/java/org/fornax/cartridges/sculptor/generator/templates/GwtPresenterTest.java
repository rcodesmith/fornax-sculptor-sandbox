package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import junit.framework.Assert;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Test;

import sculptorguimetamodel.View;

public class GwtPresenterTest extends LibraryGwtTemplateBaseTest {

    @Test
    public void assertPlaceBaseCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	//GuiModule guiModule = personModule();
    	Assert.assertNotNull(tableView);
    	
        XpandUnit.xpand("templates::gwt::Presenter::presenterBaseInterfaceForUnitTest", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String presenterBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/activity/TableViewBasePresenter.java");
        assertContains(presenterBaseCode, "package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.gen.activity;");
        
        assertContains(presenterBaseCode, "public interface TableViewBasePresenter extends org.fornax.cartridges.sculptor.framework.gwt.client.activity.Presenter {");
        
        assertContains(presenterBaseCode, "public void onClickSaveButton();");
        
        
    }


}
