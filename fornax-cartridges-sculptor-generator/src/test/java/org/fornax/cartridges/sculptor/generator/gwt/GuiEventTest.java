package org.fornax.cartridges.sculptor.generator.gwt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.fornax.cartridges.sculptor.generator.transformation.TransformationTestBase;
import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiEvent;
import sculptorguimetamodel.GuiModule;
import sculptormetamodel.Attribute;

public class GuiEventTest extends TransformationTestBase {

	private static GuiApplication guiApp;

	private static File TEMP = new File("target/temp-xpandoutput");

	private GuiModule personModule() {
		return (GuiModule) getNamedElement("person", guiApp.getModules());
	}

	@BeforeClass
	public static void before() throws Exception {
		System.setProperty("project.nature", "business-tier, rcp");
		System.setProperty("datetime.library", "joda");
        System.setProperty("gui.createDefaults", "false");
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
		

	}

	@Test
	public void assertMyEvent1() throws IOException {
		GuiEvent event = (GuiEvent) getNamedElement("MyEvent1", personModule()
				.getEvents());
		assertNotNull(event);
		Assert.assertEquals("MyEvent1", event.getName());
		Assert.assertEquals("This is some MyEvent1 documentation",
				event.getDoc());
		
		Attribute attr1 = (Attribute) getNamedElement("attr1", event.getAttributes());
		Assert.assertNotNull(attr1);
		assertEquals("String", attr1.getType());
		
		
	}

	@Test
	public void assertMyEvent1JavaCode() throws IOException {
		GuiEvent event = (GuiEvent) getNamedElement("MyEvent1", personModule()
				.getEvents());
		
		// File tmpFile = File.createTempFile("tempJava", "txt");
		XpandUnit.xpand("templates::gwt::Event::eventBase", event,
				new HashMap<String, Object>(), TEMP);
		// XpandUnit.xpand("templates::gwt::Event::eventBase", event);

		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/event/MyEvent1Base.java");
		Assert.assertTrue(javaCode.contains("private String attr1;"));
		
		Assert.assertTrue(javaCode.contains("private java.util.Date date1;"));
		
		assertTrue(javaCode.contains("public java.util.Date getDate1()"));
		
		assertTrue(javaCode.contains("public void setDate1(java.util.Date date1) {"));
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

}
