package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.AutocompleteWidget;
import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.InputTextWidget;
import sculptorguimetamodel.ServiceProxy;
import sculptorguimetamodel.ServiceProxyOperation;
import sculptorguimetamodel.TableColumn;
import sculptorguimetamodel.TableWidget;
import sculptorguimetamodel.View;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Parameter;
import sculptormetamodel.Service;

//@Ignore("Skip this test now, due to problems when running from maven")
@SuppressWarnings("unchecked")
public class LibraryGwtGuiDslTransformationTest extends TransformationTestBase {
	
	
    private static final boolean VALIDATE_SERVICE_OPERATION = true;
    private static final boolean DONT_VALIDATE_SERVICE_OPERATION = false;
    private static GuiApplication guiApp;

	private static File TEMP = new File("target/temp-xpandoutput");


    @BeforeClass
    public static void before() throws Exception {
        System.setProperty("project.nature", "business-tier, rcp");
        System.setProperty("gui.createDefaults", "false");
        
        initWorkflowContext("workflowguidsl-test-library-gwt.mwe");
        guiApp = (GuiApplication) ctx.get("guiModel");
        
		TEMP.mkdirs();
		XpandUnit.initXpand(new EmfRegistryMetaModel());

    }

    @AfterClass
    public static void after() {
        System.getProperties().remove("project.nature");
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
		
		System.out.println("Operation params:" + op.getParameters());
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
	public void assertServiceImplJavaCode() throws IOException {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getServiceProxies());
		
		ServiceProxyOperation findByDateOp = (ServiceProxyOperation)getNamedElement("findByDate", proxy.getOperations());
		
		XpandUnit.xpand("templates::gwt::GwtService::gwtServiceImpl", proxy,
				new HashMap<String, Object>(), TEMP);
		// XpandUnit.xpand("templates::gwt::Event::eventBase", event);

		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/server/GwtPersonServiceImpl.java");
//		Assert.assertTrue(javaCode.contains("private String attr1;"));
//		
//		Assert.assertTrue(javaCode.contains("private java.util.Date date1;"));
//		
//		assertTrue(javaCode.contains("public java.util.Date getDate1()"));
//		
//		assertTrue(javaCode.contains("public void setDate1(java.util.Date date1) {"));
	}


	@Test
	public void assertGwtSyncServiceJavaCode() throws IOException {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getServiceProxies());
		
		XpandUnit.xpand("templates::gwt::GwtService::gwtSyncService", proxy,
				new HashMap<String, Object>(), TEMP);

		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/GwtPersonService.java");
		Assert.assertTrue(javaCode.contains("@com.google.gwt.user.client.rpc.RemoteServiceRelativePath(\"PersonService.gwt\""));
		Assert.assertTrue(javaCode.contains("@org.fornax.cartridges.sculptor.framework.gwt.shared.GwtRemoteService(\"PersonService.gwt\")"));
		Assert.assertTrue(javaCode.contains("public interface GwtPersonService extends com.google.gwt.user.client.rpc.RemoteService {"));
		
		
	}

	@Test
	public void assertGwtAsyncServiceJavaCode() {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getServiceProxies());
		
		XpandUnit.xpand("templates::gwt::GwtService::gwtAsyncService", proxy,
				new HashMap<String, Object>(), TEMP);

		
		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/GwtPersonServiceAsync.java");
		
		assertMatchesRegexp(javaCode, "public interface GwtPersonServiceAsync *\\{");
		assertMatchesRegexp(javaCode, "public interface GwtPersonServiceAsync *\\{");
		assertMatchesRegexp(javaCode, "public void findPersonByName\\(\\s*String name\\s*,\\s*com.google.gwt.user.client.rpc.AsyncCallback\\<java\\.util\\.List\\<org\\.fornax\\.cartridges\\.sculptor\\.examples\\.library\\.person\\.gwt\\.shared\\.domain\\.Person\\>\\> callback\\)\\;");
		
		
	}
	
	protected void validateServiceOperation(ServiceProxyOperation op, String expectedName, int expectedNumParams) {
		assertEquals(expectedName, op.getName());
		assertEquals(expectedName, op.getFor().getName());
		assertEquals(expectedNumParams, op.getParameters().size());
		
	}
	
	protected String getFileText(String filePath) {
		File f = new File(
				TEMP, filePath);
		return getFileText(f);		
	}

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
		Pattern p = Pattern.compile(regexp);
		Assert.assertTrue("Text did not contain pattern \"" + regexp  + "\"", p.matcher(text).find());
		
	}
	
	
    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }


}
