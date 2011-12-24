package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.fornax.cartridges.sculptor.gwt.generator.util.GwtGenerationHelper;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiCommand;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.InputTextWidget;
import sculptorguimetamodel.LinkWidget;
import sculptorguimetamodel.OnClickBinding;
import sculptorguimetamodel.PanelWidget;
import sculptorguimetamodel.PopulatePanelBehavior;
import sculptorguimetamodel.ServiceProxy;
import sculptorguimetamodel.ServiceProxyOperation;
import sculptorguimetamodel.TableColumn;
import sculptorguimetamodel.TableWidget;
import sculptorguimetamodel.View;
import sculptorguimetamodel.ViewParameter;
import sculptorguimetamodel.Widget;
import sculptormetamodel.Attribute;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Parameter;
import sculptormetamodel.Reference;
import sculptormetamodel.Service;
import sculptormetamodel.ServiceOperation;

//@Ignore("Skip this test now, due to problems when running from maven")
@SuppressWarnings("unchecked")
public class LibraryGwtGuiDslTransformationTest extends TransformationTestBase {
	
	
//    private static final boolean VALIDATE_SERVICE_OPERATION = true;
//    private static final boolean DONT_VALIDATE_SERVICE_OPERATION = false;
    private static GuiApplication guiApp;

//	private static File TEMP = new File("target/temp-xpandoutput");


    @BeforeClass
    public static void before() throws Exception {
        System.setProperty("project.nature", "business-tier, rcp");
		System.setProperty("datetime.library", "joda");
        System.setProperty("gui.createDefaults", "false");
        System.setProperty("package.gwt", "gwt");
        
        initWorkflowContext("workflowguidsl-test-library-gwt.mwe");
        guiApp = (GuiApplication) ctx.get("guiModel");
        
//		TEMP.mkdirs();
//		XpandUnit.initXpand(new EmfRegistryMetaModel());

    }

    @AfterClass
    public static void after() {
        System.getProperties().remove("project.nature");
		System.getProperties().remove("datetime.library");
		System.getProperties().remove("gui.createDefaults");
		System.getProperties().remove("package.gwt");

    }

    @Test
    public void assertApplication() {
    	assertNotNull(guiApp);
        assertEquals("LibraryWeb", guiApp.getName());
    }


    @Test
    public void assertTableView() {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	assertNotNull(tableView);
    	
        EList widgets = tableView.getWidgets();
        TableWidget table = (TableWidget)widgets.get(0);    	
    	assertEquals("Person Table", table.getLabel());
    	
    	DomainObject person = table.getFor();
    	assertNotNull(person);
    	assertEquals("Person", person.getName());
    	
    	EList tableCols = table.getColumns();
    	assertNotNull(tableCols);
        assertOneAndOnlyOne(tableCols, "name", "edit");
        
        TableColumn nameCol = (TableColumn)tableCols.get(0);
        assertEquals("name", nameCol.getName());
        assertNotNull(nameCol);
        assertEquals("Text", nameCol.getColumnType());
        assertEquals(true, nameCol.isFilterable());
        assertEquals(true, nameCol.isSortable());

        TableColumn editCol = (TableColumn)tableCols.get(1);
        assertNotNull(editCol);
        assertEquals("Button", editCol.getColumnType());
        assertEquals(1, editCol.getBehaviorBindings().size());
        assertEquals(false, editCol.isFilterable());
        assertEquals(false, editCol.isSortable());

        OnClickBinding onClick = (OnClickBinding)editCol.getBehaviorBindings().get(0);
        assertEquals(1, onClick.getBehaviors().size());
        PopulatePanelBehavior populatePanel = (PopulatePanelBehavior)onClick.getBehaviors().get(0);
        assertEquals("personDetailsPanel", populatePanel.getPanel().getName());
        
        
    }
    
    @Test
    public void assertEmptyPersonDetailsPanel() {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());

    	PanelWidget emptyPane = (PanelWidget) getNamedElement("personDetailsEmptyPanel", tableView.getWidgets());
    	assertNotNull(emptyPane);
    	assertEquals(0, emptyPane.getWidgets().size());
    	assertEquals("this is an empty panel", emptyPane.getDoc());
    }
    
    @Test
    public void assertMediaModule() {
    	GuiModule mediaModule = mediaModule();
    	
    	assertEquals("org.fornax.cartridges.sculptor.examples.library.mediaalt", mediaModule.getBasePackage());
    }
    
    @Test
    public void assertMediaBrowseView() {
    	GuiModule mediaBrowseModule = mediaModule();
    	
        View view = (View) getNamedElement("MediaBrowse", mediaBrowseModule.getViews());
        assertNotNull(view);
        
        EList<Widget> widgets = view.getWidgets();
        
        assertEquals(3, widgets.size());
        
        TableWidget table = (TableWidget)widgets.get(0);    	
    	assertEquals("Library Table", table.getLabel());
    	
    	DomainObject library = table.getFor();
    	assertNotNull(library);
    	assertEquals("Library", library.getName());
    }

    @Test
    public void assertPersonModule() {
    	GuiModule mod = personModule();
    	Assert.assertNotNull(mod);
    	
    	EList serviceProxies = mod.getServiceProxies();
    	assertEquals(1, serviceProxies.size());
    	
        assertOneAndOnlyOne(serviceProxies, "PersonService");
    	
    }
    
    @Test
    public void assertMenuView() {
        View menuView = (View) getNamedElement("Menu", mainModule().getViews());
        assertNotNull(menuView);
        
        EList widgets = menuView.getWidgets();
        assertEquals(2, widgets.size());
        assertOneAndOnlyOne(widgets, "personLink", "mediaBrowseLink");
        
    	LinkWidget personLink = (LinkWidget)widgets.get(1);
    	assertEquals("Person Form", personLink.getLabel());
    	assertEquals("PersonForm", personLink.getToView().getName());
    	
    	LinkWidget mediaBrowseLink = (LinkWidget)widgets.get(0);
    	assertEquals("Media Browse", mediaBrowseLink.getLabel());
    	assertEquals("MediaBrowse", mediaBrowseLink.getToView().getName());

    }
    
    @Test
    public void assertPersonFormView() {
        View personForm = (View) getNamedElement("PersonForm", personModule().getViews());
        assertNotNull(personForm);
        
        DomainObject forObj = personForm.getFor();
        assertNotNull(forObj);
        assertEquals("Person", forObj.getName());
        
        assertEquals(2, personForm.getParameters().size());

        ViewParameter commandParam = (ViewParameter) personForm.getParameters().get(0);
        assertNotNull(commandParam);
        assertEquals("String", commandParam.getType());
        assertEquals(Boolean.FALSE, commandParam.isNullable());

        ViewParameter idParam = (ViewParameter) personForm.getParameters().get(1);
        assertNotNull(idParam);
        assertEquals("Integer", idParam.getType());
        assertEquals(Boolean.TRUE, idParam.isNullable());
        
        
//        assertEquals(1, personForm.getServiceProxies().size());
//        assertOneAndOnlyOne(personForm.getServiceProxies(), "PersonService");
//        Service svc = (Service)personForm.getServiceProxies().get(0);
        
        EList widgets = personForm.getWidgets();
        assertEquals(5, widgets.size());
        assertOneAndOnlyOne(widgets, "nameField", "table1", "saveButton", "info1", "textArea1"); //"autocomp1"
        
        InputTextWidget nameField = (InputTextWidget)widgets.get(0);
        assertEquals("Name", nameField.getLabel());

//        AutocompleteWidget autoComp = (AutocompleteWidget)widgets.get(5);
//        assertEquals("Auto complete one", autoComp.getLabel());

    }


	@Test
	public void assertServiceProxy() {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getServiceProxies());
		assertNotNull(proxy);
		assertNotNull(proxy.getFor());
		assertNotNull(proxy.getFor().getModule());
		
		GuiModule guiModule = (GuiModule)proxy.eContainer();
		assertNotNull(guiModule);
		
//		assertEquals("blah", guiModule.getBasePackage());
		
		EList ops = proxy.getOperations();
		System.out.println(ops);
		assertEquals(3, ops.size());

		ServiceProxyOperation op = (ServiceProxyOperation)ops.get(0);
		assertNotNull(op);
		
//		System.out.println("Operation params:" + op.getParameters());
		validateServiceOperation(op, "findPersonByName", 1);
		Parameter p1 = (Parameter)op.getParameters().get(0);
		assertEquals("name", p1.getName());
		assertEquals("String", p1.getType());
		
		
		
		ServiceProxyOperation findByDateOp = (ServiceProxyOperation)ops.get(2);
		assertNotNull(findByDateOp);
		validateServiceOperation(findByDateOp, "findByDate", 1);
		
		assertEquals("Person", findByDateOp.getDomainObjectType().getName());
		assertEquals("List", findByDateOp.getCollectionType());
		
		Parameter entryDateParam = (Parameter)findByDateOp.getParameters().get(0);
		assertEquals("entryDate", entryDateParam.getName());
//		assertEquals("java.util.Date", entryDateParam.getType());

	}
	
	
	@Test
	public void assertCreatePersonCommand() {
		EList cmds = personModule().getCommands();
		assertEquals(2, cmds.size());
		
		GuiCommand cmd = (GuiCommand)getNamedElement("CreatePersonCmd", cmds);
		assertNotNull(cmd);
		assertEquals("CreatePersonCmd", cmd.getName());
		
		GuiCommand ext = (GuiCommand)cmd.getExtends();
		assertNotNull(ext);
		assertEquals("PersonCmd", ext.getName());
		assertNull(cmd.getExtendsName());
		
		
		EList attrs = cmd.getAttributes();
		assertEquals(1, attrs.size());
		
		Attribute birthDate = (Attribute)getNamedElement("birthDate", attrs);
		assertNotNull(birthDate);
		assertEquals("birthDate", birthDate.getName());
		
		
		assertEquals(0, cmd.getReferences().size());
		
		
	}
	
	@Test
	public void assertPersonCmd() {
		GuiCommand cmd = (GuiCommand)getNamedElement("PersonCmd", personModule().getCommands());
		assertNotNull(cmd);
		assertEquals("PersonCmd", cmd.getName());

		EList refs = cmd.getReferences();
		assertEquals(1, refs.size());
		
		Reference ssn = (Reference)getNamedElement("ssn", refs);
		assertNotNull(ssn);
		assertEquals("ssn", ssn.getName());
		assertSame(cmd, ssn.getFrom());
		
		DomainObject ssnDto = ssn.getTo();
		assertNotNull(ssnDto);
		System.out.println("SSN DTO: " + ssnDto);
		
		// Right now, SSN object still belongs to module
//		assertNull(ssnDto.getModule());

	}
	
	

	@Test
	public void assertGetMapToDomainExpressionForDate() {
		Service svc = (Service)getNamedElement("PersonService", personModule().getFor().getServices());
		assertNotNull(svc);
		
		ServiceOperation op = (ServiceOperation)getNamedElement("findByDate", svc.getOperations());
		assertNotNull(op);
		
		Parameter param = (Parameter)getNamedElement("entryDate", op.getParameters());
		assertNotNull(param);
		
		String expr = GwtGenerationHelper.getMapToDomainExpression(param);
		assertEquals("org.fornax.cartridges.sculptor.framework.gwt.server.ConversionUtils.convertToDate(entryDate)", expr);
	}
	
	@Test
	public void assertBehaviors() {
		assertEquals(1, personModule().getBehaviors().size());
		
        assertOneAndOnlyOne(personModule().getBehaviors(), "populatePersonDetailsPanel");

	}
	
	@Test
	public void assertPopulatePersonDetailsBehavior() {
		PopulatePanelBehavior populatePersonDetailsPanel = (PopulatePanelBehavior)getNamedElement("populatePersonDetailsPanel", personModule().getBehaviors());
		assertNotNull(populatePersonDetailsPanel);
		
		assertEquals("Populate the person details panel", populatePersonDetailsPanel.getDoc());
		assertEquals("personDetailsPanel", populatePersonDetailsPanel.getPanel().getName());
		
	}
	
	
	
	
	protected void validateServiceOperation(ServiceProxyOperation op, String expectedName, int expectedNumParams) {
		assertEquals(expectedName, op.getName());
		assertEquals(expectedName, op.getFor().getName());
		assertEquals(expectedNumParams, op.getParameters().size());
		
	}
	
	
//	protected String getFileText(String filePath) {
//		File f = new File(
//				TEMP, filePath);
//		return getFileText(f);		
//	}

	protected String getFileText(File textFile) {
		try {
			StringBuffer sb = new StringBuffer();
			BufferedReader in = new BufferedReader(new FileReader(textFile));
			String str;
			while ((str = in.readLine()) != null) {
				sb.append(str);
			}
			in.close();
			return sb.toString();
		} catch (IOException e) {
		}
		return null;
	}

	
	protected void assertMatchesRegexp(String text, String regexp) {
		Pattern p = Pattern.compile(regexp, Pattern.MULTILINE);
		Assert.assertTrue("Text did not contain pattern \"" + regexp  + "\"", p.matcher(text).find());		
	}

	protected void assertContains(String text, String subStr) {
		Assert.assertTrue("Text did not contain substring \"" + subStr  + "\"", text.contains(subStr));		
	}

	protected void assertNotContains(String text, String subStr) {
		Assert.assertFalse("Text contained substring \"" + subStr  + "\"", text.contains(subStr));		
	}

	
    private GuiModule mainModule() {
        return (GuiModule) getNamedElement("main", guiApp.getModules());
    }
    
    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }

    private GuiModule mediaModule() {
        return (GuiModule) getNamedElement("media", guiApp.getModules());
    }


}
