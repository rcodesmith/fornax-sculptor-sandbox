package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.fornax.cartridges.sculptor.gwt.generator.util.GwtGenerationHelper;
import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.AutocompleteWidget;
import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiCommand;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.InputTextWidget;
import sculptorguimetamodel.ServiceProxy;
import sculptorguimetamodel.ServiceProxyOperation;
import sculptorguimetamodel.TableColumn;
import sculptorguimetamodel.TableWidget;
import sculptorguimetamodel.View;
import sculptormetamodel.Attribute;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Parameter;
import sculptormetamodel.Reference;
import sculptormetamodel.Service;
import sculptormetamodel.ServiceOperation;

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
		System.setProperty("datetime.library", "joda");
        System.setProperty("gui.createDefaults", "false");
        System.setProperty("package.gwt", "gwt");
        
        initWorkflowContext("workflowguidsl-test-library-gwt.mwe");
        guiApp = (GuiApplication) ctx.get("guiModel");
        
		TEMP.mkdirs();
		XpandUnit.initXpand(new EmfRegistryMetaModel());

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
	public void assertCreatePersonCmdCode() {
		GuiCommand cmd = (GuiCommand)getNamedElement("CreatePersonCmd", personModule().getCommands());
		
		XpandUnit.xpand("templates::gwt::GwtCommand::gwtCommandBase", cmd,
				new HashMap<String, Object>(), TEMP);

		
		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/shared/command/CreatePersonCmd.java");

		assertMatchesRegexp(javaCode, "package org\\.fornax\\.cartridges\\.sculptor\\.examples\\.library\\.person\\.gwt\\.shared\\.command\\;");
		assertContains(javaCode, "public class CreatePersonCmd extends org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.command.PersonCmd implements java.io.Serializable {");
//		assertMatchesRegexp(javaCode, "public void findPersonByName\\(\\s*String name\\s*,\\s*com.google.gwt.user.client.rpc.AsyncCallback\\<java\\.util\\.List\\<org\\.fornax\\.cartridges\\.sculptor\\.examples\\.library\\.person\\.gwt\\.shared\\.domain\\.Person\\>\\> callback\\)\\;");
	
		// Make sure joda time types not being used
		assertContains(javaCode, "private java.util.Date birthDate;");
		
		assertContains(javaCode, "public java.util.Date getBirthDate() {");
		
		assertContains(javaCode, "public void setBirthDate(java.util.Date birthDate) {");

		// Verify properties constructor with base class call is there
	    assertMatchesRegexp(javaCode, "\\Qpublic CreatePersonCmd(\\E\\s*"
	    		+ "\\Qorg.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn ssn\\E\\s*\\,\\s*"
	    		+ "\\Qjava.util.Date birthDate\\E\\s*"
	    		+ "\\Q) {\\E\\s*"
	    		+ "\\Qsuper(ssn);\\E"
	    		);
	    
	    // Shouldn't generate notNull checks in constructor
	    assertNotContains(javaCode, "org.apache.commons.lang.Validate.notNull");
	}

	@Test
	public void assertPersonCmdCode() {
		GuiCommand cmd = (GuiCommand)getNamedElement("PersonCmd", personModule().getCommands());
		
		XpandUnit.xpand("templates::gwt::GwtCommand::gwtCommandBase", cmd,
				new HashMap<String, Object>(), TEMP);

		
		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/shared/command/PersonCmd.java");

		assertMatchesRegexp(javaCode, "package org\\.fornax\\.cartridges\\.sculptor\\.examples\\.library\\.person\\.gwt\\.shared\\.command\\;");
		
		assertContains(javaCode, "public class PersonCmd extends org.fornax.cartridges.sculptor.framework.gwt.shared.domain.AbstractGwtCommand implements java.io.Serializable {");
		
		assertContains(javaCode, "@org.hibernate.validator.NotNull");
		assertContains(javaCode, "private org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn ssn;");

		assertMatchesRegexp(javaCode, "\\Qpublic PersonCmd(\\E\\s*"
				+ "\\Qorg.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn\\E ssn\\s*\\) \\{\\s*"
				+ "\\Qsuper();\\E\\s*"
				+ "\\Qthis.ssn = ssn;\\E\\s*"
				+ "\\}");

		assertContains(javaCode, "public org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn getSsn() {");
		assertContains(javaCode, "public void setSsn(org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn ssn) {");
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
		Pattern p = Pattern.compile(regexp, Pattern.MULTILINE);
		Assert.assertTrue("Text did not contain pattern \"" + regexp  + "\"", p.matcher(text).find());		
	}

	protected void assertContains(String text, String subStr) {
		Assert.assertTrue("Text did not contain substring \"" + subStr  + "\"", text.contains(subStr));		
	}

	protected void assertNotContains(String text, String subStr) {
		Assert.assertFalse("Text contained substring \"" + subStr  + "\"", text.contains(subStr));		
	}

	
    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }


}
