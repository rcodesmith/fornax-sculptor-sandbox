package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import junit.framework.Assert;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Test;

import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtActivityImplTemplateTest extends LibraryGwtTemplateBaseTest {

    @Test
    public void assertTableViewImplCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	GuiModule guiModule = personModule();
    	Assert.assertNotNull(tableView);
    	
        XpandUnit.xpand("templates::gwt::Activity::activityImplForUnitTest", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String activityCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/activity/TableViewActivity.java");
        assertContains(activityCode, "package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.activity;");
        assertContains(activityCode, "public class TableViewActivity extends org.fornax.cartridges.sculptor.examples.library.person.gwt.client.gen.activity.TableViewActivityBase implements org.fornax.cartridges.sculptor.examples.library.person.gwt.client.activity.TableViewPresenterIf {");
        
        assertContains(activityCode, "org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.TableViewViewIf display;");

        // Verify constructor
        assertContainsConsecutiveFragments(activityCode,
        		"public TableViewActivity(org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.TableViewViewIf theDisplay,",
        		"com.google.gwt.event.shared.EventBus eventBus,",
        		"com.google.gwt.place.shared.PlaceController placeController",
        		") {",
        		"super(eventBus, theDisplay, placeController",
        		");",
        		"display = theDisplay;",
        		"display.initView(this);",
        		"}");
        

    }
    
    @Test
    public void assertPersonFormImplCode() {
    	View personFormView = (View) getNamedElement("PersonForm", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::Activity::activityImplForUnitTest", personFormView,
                new HashMap<String, Object>(), getXpandTempDir());
    	
    }
    
}
