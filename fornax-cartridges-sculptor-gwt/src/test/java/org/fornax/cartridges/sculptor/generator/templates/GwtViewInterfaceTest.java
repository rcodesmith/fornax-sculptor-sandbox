package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Test;

import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtViewInterfaceTest extends LibraryGwtTemplateBaseTest {


    @Test
    public void assertTableViewBaseInterfaceCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::View::viewBaseInterface", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String tableViewCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/view/TableViewBaseView.java");
        
        assertContains(tableViewCode, "package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view;");
        
        assertContains(tableViewCode, "public interface TableViewBaseView extends com.google.gwt.user.client.ui.IsWidget");
        
        assertContains(tableViewCode, "public com.google.gwt.user.client.ui.HasText getNameFieldHasText();");
        
        assertContains(tableViewCode, "public com.google.gwt.user.client.ui.HasText getInfo1HasText();");
        
        assertContains(tableViewCode, "public com.google.gwt.view.client.HasData<org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Person> getMytableHasData();");
        assertContains(tableViewCode, "public com.google.gwt.event.dom.client.HasClickHandlers getSaveButtonHasClickHandlers();");
        
        assertContains(tableViewCode, "public com.google.gwt.user.client.ui.HasWidgets.ForIsWidget getPersonDetailsPanelForIsWidget();");
        
        assertContains(tableViewCode, "public com.google.gwt.user.client.ui.HasText getNestedNameFieldHasText();");
        
        assertContains(tableViewCode, "public com.google.gwt.user.client.ui.HasText getAddressFieldHasText();");
        
    }
    
    @Test
    public void assertTableViewInterfaceCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::View::viewInterfaceForUnitTest", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String tableViewCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/view/TableViewView.java");
        
        assertContains(tableViewCode, "package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view;");
        
        assertContains(tableViewCode, "Generated interface for the View TableView.");
        
        assertContains(tableViewCode, "public interface TableViewView extends org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.TableViewBaseView {");
    }
    
    @Test
    public void assertPersonFormViewInterfaceCode() throws IOException {
    	View personFormView = (View) getNamedElement("PersonForm", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::View::viewBaseInterface", personFormView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String tableViewCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/view/PersonFormBaseView.java");
  
        assertContains(tableViewCode, "public com.google.gwt.user.client.ui.HasValue<org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Gender> getGenderSelectorHasValue();");
//        assertContains(tableViewCode, "package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view;");

    }
}
