package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtViewBaseUiBinderTest extends TemplateTestBase {

    @BeforeClass
    public static void before() throws Exception {
		System.setProperty("widgetType.class.SimplePanel",
				"com.google.gwt.user.client.ui.SimplePanel");
		System.setProperty("widgetType.tag.SimplePanel", "g:SimplePanel");
		initTemplateTestBase();
    }

    @AfterClass
    public static void after() {
		System.getProperties().remove("widgetType.class.SimplePanel");
		System.getProperties().remove("widgetType.tag.SimplePanel");
        teardownTemplateTestBase();
    }

    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }
	@Test
	public void assertTableViewActivityCode() throws IOException {
		View tableView = (View) getNamedElement("TableView", personModule()
				.getViews());

		XpandUnit.xpand("templates::gwt::Activity::activityBaseForUnitTest", tableView,
				new HashMap<String, Object>(), getXpandTempDir());
	}
	
    @Test
    public void assertTableViewBaseCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::ViewTemplate::viewCompositeBaseTemplateForUnitTest", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String tableViewBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/view/TableViewViewBase.ui.xml");
        
        assertContainsConsecutiveFragments(tableViewBaseCode, "<g:HTMLPanel ui:field=\"personDetailsPanel\">",
        		"<!-- Widget nestedNameField -->",
        		"<g:FlowPanel>",		
				"<g:Label text=\"Name\" />");
        
        assertContainsConsecutiveFragments(tableViewBaseCode, "<g:FlowPanel>",
        		"<g:Label text=\"Address\" />",
        		"<g:TextBox ui:field=\"addressField\"  name=\"addressField\"/>",	
        		"</g:FlowPanel>");
        
        assertContainsConsecutiveFragments(tableViewBaseCode, "<g:SimplePanel ui:field=\"errorPanel\">",
		"</g:SimplePanel>");
    }
    
}
