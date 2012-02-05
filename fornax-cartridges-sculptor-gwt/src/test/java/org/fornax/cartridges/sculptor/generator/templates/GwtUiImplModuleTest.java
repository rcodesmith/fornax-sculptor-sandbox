package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Test;

import sculptorguimetamodel.GuiModule;

public class GwtUiImplModuleTest extends TemplateTestBase {
	

    
    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }

    private GuiModule mediaModule() {
        return (GuiModule) getNamedElement("media", guiApp.getModules());
    }

    @Test
    public void assertImploModuleCode() throws IOException {
//    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::GwtUiModule::gwtImplConfigForTest", mediaModule(),
                new HashMap<String, Object>(), getXpandTempDir());
        
        String moduleCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/MediaUI.gwt.xml");
        
        assertContains(moduleCode,
        		"<module rename-to='MediaUI'>");
        
        assertContains(moduleCode,
        		"<inherits name=\"org.fornax.cartridges.sculptor.examples.library.person.gwt.PersonUI\"/>");
        
    }
}
