package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import junit.framework.Assert;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Test;

import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtActivityImplTemplateTest extends LibraryGwtTemplateBaseTest {
//    private static GuiApplication guiApp;
//
//    
//    @BeforeClass
//    public static void before() throws Exception {
//        System.setProperty("project.nature", "business-tier, rcp");
//		System.setProperty("datetime.library", "joda");
//        System.setProperty("gui.createDefaults", "false");
//        System.setProperty("package.gwt", "gwt");
//        
//        initWorkflowContext("workflowguidsl-test-library-gwt.mwe");
//        guiApp = (GuiApplication) ctx.get("guiModel");
//    }
//
//    @AfterClass
//    public static void after() {
//        System.getProperties().remove("project.nature");
//		System.getProperties().remove("datetime.library");
//		System.getProperties().remove("gui.createDefaults");
//		System.getProperties().remove("package.gwt");
//
//    }
//
//    
//    private GuiModule personModule() {
//        return (GuiModule) getNamedElement("person", guiApp.getModules());
//    }

    @Test
    public void assertTableViewImplCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	GuiModule guiModule = personModule();
    	Assert.assertNotNull(tableView);
    	
        XpandUnit.xpand("templates::gwt::Activity::activityImplForUnitTest", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String activityBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/activity/TableViewActivity.java");
        assertContains(activityBaseCode, "package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.activity;");
        assertContains(activityBaseCode, "public class TableViewActivity extends org.fornax.cartridges.sculptor.examples.library.person.gwt.client.activity.TableViewActivityBase implements org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.TableViewPresenter{");
        
        assertContains(activityBaseCode, "org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.TableViewView display;");
        
    }
    
    @Test
    public void assertPersonFormImplCode() {
    	View personFormView = (View) getNamedElement("PersonForm", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::Activity::activityImplForUnitTest", personFormView,
                new HashMap<String, Object>(), getXpandTempDir());
    	
    }

}
