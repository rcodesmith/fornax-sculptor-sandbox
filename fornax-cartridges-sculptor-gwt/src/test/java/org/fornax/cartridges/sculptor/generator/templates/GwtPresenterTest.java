package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import junit.framework.Assert;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Test;

import sculptorguimetamodel.View;

public class GwtPresenterTest extends LibraryGwtTemplateBaseTest {

    @Test
    public void assertPresenterBaseInterface() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	//GuiModule guiModule = personModule();
    	Assert.assertNotNull(tableView);
    	
        XpandUnit.xpand("templates::gwt::Presenter::presenterBaseInterfaceForUnitTest", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String presenterBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/activity/TableViewBasePresenterIf.java");
        assertContains(presenterBaseCode, "package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.gen.activity;");
        
        assertContains(presenterBaseCode, "public interface TableViewBasePresenterIf extends org.fornax.cartridges.sculptor.framework.gwt.client.activity.Presenter {");
        
        
    }
    
    @Test
    public void assertPresenterConditionsDeclarations() throws IOException {
    	String presenterBaseCode = getTableViewPresenterBaseCode();

        assertContainsConsecutiveFragments(presenterBaseCode, 
        "/**",
    	"* @return the value of condition isEditor",
    	 "*/",
    	"public boolean IsEditorCondition();",
    	"/**",
    	"* @return the value of condition isDirty",
    	 "*/",
    	"public boolean IsDirtyCondition();");
    	
    }

    @Test
    public void assertPresenterBaseAutocompleteOnSelectMethod() throws IOException {
    	String presenterBaseCode = getTableViewPresenterBaseCode();

		assertContainsConsecutiveFragments(
				presenterBaseCode,
				"/**",
				"* nameSelector widget OnSelectItem binding callback",
				"*/",
				"void nameSelectorOnSelectItem(org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event event);");
    	
    }
	private String getTableViewPresenterBaseCode() throws IOException {
		View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::Presenter::presenterBaseInterfaceForUnitTest", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String presenterBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/activity/TableViewBasePresenterIf.java");
		return presenterBaseCode;
	}


}
