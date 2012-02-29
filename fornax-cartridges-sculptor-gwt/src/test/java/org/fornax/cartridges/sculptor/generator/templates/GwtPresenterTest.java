package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import junit.framework.Assert;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Test;

import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtPresenterTest extends LibraryGwtTemplateBaseTest {

    @Test
    public void assertPlaceBaseCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	//GuiModule guiModule = personModule();
    	Assert.assertNotNull(tableView);
    	
        XpandUnit.xpand("templates::gwt::Presenter::presenterBaseInterface", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String presenterBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/activity/TableViewBasePresenter.java");
        assertContains(presenterBaseCode, "package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.activity;");
        
        assertContains(presenterBaseCode, "public interface TableViewBasePresenter extends org.fornax.cartridges.sculptor.framework.gwt.client.activity.Presenter {");
//        assertContains(activityBaseCode, "package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.activity;");
//        assertContains(activityBaseCode, "public class TableViewActivity extends org.fornax.cartridges.sculptor.examples.library.person.gwt.client.activity.TableViewActivityBase {");
//        
//        assertContains(activityBaseCode, "org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.TableViewView display;");
        
    }


}
