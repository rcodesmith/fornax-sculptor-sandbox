package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.eclipse.emf.common.util.EList;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.AutocompleteWidget;
import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiAttribute;
import sculptorguimetamodel.GuiEvent;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.InputTextWidget;
import sculptorguimetamodel.TableColumn;
import sculptorguimetamodel.TableWidget;
import sculptorguimetamodel.View;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Service;

//@Ignore("Skip this test now, due to problems when running from maven")
@SuppressWarnings("unchecked")
public class LibraryGwtGuiDslTransformationTest extends TransformationTestBase {
    private static final boolean VALIDATE_SERVICE_OPERATION = true;
    private static final boolean DONT_VALIDATE_SERVICE_OPERATION = false;
    private static GuiApplication guiApp;

    @BeforeClass
    public static void before() throws Exception {
        System.setProperty("project.nature", "business-tier, rcp");
        initWorkflowContext("workflowguidsl-test-library-gwt.mwe");
        guiApp = (GuiApplication) ctx.get("guiModel");
    }

    @AfterClass
    public static void after() {
        System.getProperties().remove("project.nature");
    }

    @Test
    public void assertApplication() {
        assertEquals("LibraryWeb", guiApp.getName());
    }


    @Test
    public void assertTableView() {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	assertNotNull(tableView);
    	
        EList widgets = tableView.getWidgets();
        TableWidget table = (TableWidget)widgets.get(0);    	
    	assertEquals("My Table", table.getLabel());
    	
    	DomainObject person = table.getFor();
    	assertNotNull(person);
    	assertEquals("Person", person.getName());
    	
    	EList tableCols = table.getColumns();
    	assertNotNull(tableCols);
        assertOneAndOnlyOne(tableCols, "name");
        
        TableColumn nameCol = (TableColumn)tableCols.get(0);
        assertNotNull(nameCol);
        
        assertEquals("Text", nameCol.getColumnType());
    	
    }

    @Test
    public void assertPersonModule() {
    	GuiModule mod = personModule();
    	Assert.assertNotNull(mod);
    	
    	EList serviceDeps = mod.getServiceDependencies();
    	assertEquals(1, serviceDeps.size());
    	
        assertOneAndOnlyOne(serviceDeps, "PersonService");
    	
    }
    
    
    @Test
    public void assertPersonFormView() {
        View personForm = (View) getNamedElement("PersonForm", personModule().getViews());
        assertNotNull(personForm);
        
        DomainObject forObj = personForm.getFor();
        assertNotNull(forObj);
        assertEquals("Person", forObj.getName());
        
        assertEquals(1, personForm.getServiceDependencies().size());
        assertOneAndOnlyOne(personForm.getServiceDependencies(), "PersonService");
        Service svc = (Service)personForm.getServiceDependencies().get(0);
        
        EList widgets = personForm.getWidgets();
        assertEquals(6, widgets.size());
        assertOneAndOnlyOne(widgets, "nameField", "table1", "saveButton", "info1", "textArea1", "autocomp1");
        
        InputTextWidget nameField = (InputTextWidget)widgets.get(0);
        assertEquals("Name", nameField.getLabel());

        AutocompleteWidget autoComp = (AutocompleteWidget)widgets.get(5);
        assertEquals("Auto complete one", autoComp.getLabel());

    }

    @Test
    public void assertMyEvent1() {
    	GuiEvent event = (GuiEvent) getNamedElement("MyEvent1", personModule().getEvents());
    	assertNotNull(event);
    	assertEquals("MyEvent1", event.getName());
    	assertEquals("This is some MyEvent1 documentation", event.getDoc());
    	
    	assertEquals(2, event.getAttributes().size());
    	GuiAttribute attr1 = (GuiAttribute) getNamedElement("attr1", event.getAttributes());
    	assertNotNull(attr1);
    	assertEquals("attr1", attr1.getName());
    	assertNull(attr1.getDoc());
    	assertEquals("String", attr1.getType());
    	
    }

    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }


}
