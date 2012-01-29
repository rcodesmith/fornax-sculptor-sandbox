package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtViewImplTemplateTest extends TemplateTestBase {
	
    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }

    @Test
    public void assertTableViewBaseCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	Assert.assertNotNull(tableView);
    	
    	HashMap<String, Object> globalVars = new HashMap<String, Object>();
//    	slots.put("TO_SRC", getXpandTempDir());
        XpandUnit.xpand("templates::gwt::View::viewImplForUnitTest", tableView,
                globalVars, getXpandTempDir());
        
        String tableViewCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/view/TableViewViewImpl.java");
    }
    
}
