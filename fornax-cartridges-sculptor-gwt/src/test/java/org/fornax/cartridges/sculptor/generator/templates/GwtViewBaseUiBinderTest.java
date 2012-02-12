package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtViewBaseUiBinderTest extends TemplateTestBase {

    
    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }

    @Test
    public void assertTableViewBaseCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::ViewTemplate::viewCompositeBaseTemplate", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String tableViewBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/view/TableViewViewBase.ui.xml");
        
        assertContainsConsecutiveFragments(tableViewBaseCode, "<g:FlowPanel ui:field=\"personDetailsPanel\">",
        		"<!-- Widget nestedNameField -->",
        		"<g:FlowPanel>",		
				"<g:Label text=\"Name\" />");
        
        assertContainsConsecutiveFragments(tableViewBaseCode, "<g:FlowPanel>",
        		"<g:Label text=\"Address\" />",
        		"<g:TextBox ui:field=\"addressField\"  name=\"addressField\"/>",	
        		"</g:FlowPanel>");	
    }
    
}
