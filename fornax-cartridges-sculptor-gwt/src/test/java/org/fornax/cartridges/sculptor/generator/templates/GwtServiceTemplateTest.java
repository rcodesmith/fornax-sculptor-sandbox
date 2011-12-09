package org.fornax.cartridges.sculptor.generator.templates;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.ServiceProxy;
import sculptorguimetamodel.ServiceProxyOperation;

public class GwtServiceTemplateTest extends TemplateTestBase {

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
	public void assertServiceImplJavaCode() throws IOException {
		System.out.println("Module = " + personModule());
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getServiceProxies());
		System.out.println("svc proxy = " + proxy);
		ServiceProxyOperation findByDateOp = (ServiceProxyOperation)getNamedElement("findByDate", proxy.getOperations());
		System.out.println("op=" + findByDateOp);
		assertNotNull(findByDateOp.getService());
//		assertNotNull(findByDateOp.getService().getModule());
		
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
	public void assertGwtAsyncServiceJavaCode() throws IOException {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getServiceProxies());
		
		XpandUnit.xpand("templates::gwt::GwtService::gwtAsyncService", proxy,
				new HashMap<String, Object>(), TEMP);

		
		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/GwtPersonServiceAsync.java");
		
		assertMatchesRegexp(javaCode, "public interface GwtPersonServiceAsync *\\{");
		assertMatchesRegexp(javaCode, "public interface GwtPersonServiceAsync *\\{");
		assertMatchesRegexp(javaCode, "public void findPersonByName\\(\\s*String name\\s*,\\s*com.google.gwt.user.client.rpc.AsyncCallback\\<java\\.util\\.List\\<org\\.fornax\\.cartridges\\.sculptor\\.examples\\.library\\.person\\.gwt\\.shared\\.domain\\.Person\\>\\> callback\\)\\;");
		
		
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
