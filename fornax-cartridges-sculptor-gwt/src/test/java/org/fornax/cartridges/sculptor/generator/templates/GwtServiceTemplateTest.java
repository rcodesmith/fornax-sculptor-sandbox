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
    
	@Test
	public void assertServiceImplJavaCode() throws IOException {
		System.out.println("Module = " + personModule());
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getStubModule().getServices());
		System.out.println("svc proxy = " + proxy);
		ServiceProxyOperation findByDateOp = (ServiceProxyOperation)getNamedElement("findByDate", proxy.getOperations());
		System.out.println("op=" + findByDateOp);
		assertNotNull(findByDateOp.getService());
		
		XpandUnit.xpand("templates::gwt::GwtService::gwtServiceImpl", proxy,
				new HashMap<String, Object>(), getXpandTempDir());

		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/server/GwtPersonServiceImpl.java");
	}


	@Test
	public void assertGwtSyncServiceJavaCode() throws IOException {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getStubModule().getServices());
		
		XpandUnit.xpand("templates::gwt::GwtService::gwtSyncService", proxy,
				new HashMap<String, Object>(), getXpandTempDir());

		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/GwtPersonService.java");
		Assert.assertTrue(javaCode.contains("@com.google.gwt.user.client.rpc.RemoteServiceRelativePath(\"PersonService.gwt\""));
		Assert.assertTrue(javaCode.contains("@org.fornax.cartridges.sculptor.framework.gwt.shared.GwtRemoteService(\"PersonService.gwt\")"));
		Assert.assertTrue(javaCode.contains("public interface GwtPersonService extends com.google.gwt.user.client.rpc.RemoteService {"));
		
		
	}

	@Test
	public void assertGwtAsyncServiceJavaCode() throws IOException {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getStubModule().getServices());
		
		XpandUnit.xpand("templates::gwt::GwtService::gwtAsyncService", proxy,
				new HashMap<String, Object>(), getXpandTempDir());
		
		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/GwtPersonServiceAsync.java");
		
		assertMatchesRegexp(javaCode, "public interface GwtPersonServiceAsync *\\{");
		assertMatchesRegexp(javaCode, "public interface GwtPersonServiceAsync *\\{");
		assertMatchesRegexp(javaCode, "public void findPersonByName\\(\\s*String name\\s*,\\s*com.google.gwt.user.client.rpc.AsyncCallback\\<java\\.util\\.List\\<org\\.fornax\\.cartridges\\.sculptor\\.examples\\.library\\.person\\.gwt\\.shared\\.domain\\.Person\\>\\> callback\\)\\;");
		
		
	}
	
	
	@Test
	public void assertAltBasepackageServiceAsyncInterface() throws IOException {
		GuiModule media = mediaModule();
		ServiceProxy proxy = (ServiceProxy) getNamedElement("MediaService", media
				.getStubModule().getServices());
		Assert.assertNotNull(proxy);
		
		XpandUnit.xpand("templates::gwt::GwtService::gwtAsyncService", proxy,
				new HashMap<String, Object>(), getXpandTempDir());
		
		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/client/GwtMediaServiceAsync.java");
		
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
