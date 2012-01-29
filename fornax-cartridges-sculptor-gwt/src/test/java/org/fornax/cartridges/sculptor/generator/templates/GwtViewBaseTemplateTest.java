package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtViewBaseTemplateTest extends TemplateTestBase {
	

    
    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }

    private GuiModule mediaModule() {
        return (GuiModule) getNamedElement("media", guiApp.getModules());
    }

    @Test
    public void assertTableViewBaseCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::View::viewBase", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String tableViewBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/view/TableViewViewBase.java");
        
        assertContainsConsecutiveFragments(tableViewBaseCode,
        		"public abstract class TableViewViewBase extends com.google.gwt.user.client.ui.Composite",
        		"implements org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.TableViewView {");

        	
        assertContainsConsecutiveFragments(tableViewBaseCode,
        		"private static TableViewViewBaseUiBinder uiBinder = com.google.gwt.core.client.GWT",
        		".create(TableViewViewBaseUiBinder.class);");
    }

    @Test
    public void assertViewAltPkgBaseCode() throws IOException {
    	View browseView = (View) getNamedElement("MediaBrowse", mediaModule().getViews());
    	
    	Assert.assertEquals("org.fornax.cartridges.sculptor.examples.library.mediaalt", browseView.getModule().getBasePackage());
    	
        XpandUnit.xpand("templates::gwt::View::viewBase", browseView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String tableViewBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/client/view/MediaBrowseViewBase.java");
        
    }

}
