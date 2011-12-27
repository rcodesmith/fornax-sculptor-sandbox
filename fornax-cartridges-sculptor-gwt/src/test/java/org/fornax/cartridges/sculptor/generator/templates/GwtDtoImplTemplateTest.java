package org.fornax.cartridges.sculptor.generator.templates;

import static org.fornax.cartridges.sculptor.generator.templates.LibraryGwtTemplateBaseTest.guiApp;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptormetamodel.DomainObject;

public class GwtDtoImplTemplateTest extends LibraryGwtTemplateBaseTest {

    @BeforeClass
    public static void before() throws Exception {
        System.setProperty("project.nature", "presentation-tier");
		System.setProperty("datetime.library", "joda");
        System.setProperty("gui.createDefaults", "false");
        System.setProperty("package.gwt", "gwt");
        System.setProperty("gwt.dto.generate.gap", "true");
        System.setProperty("gwt.enum.common.interfaces", "some.EnumInterface");
        
        System.setProperty("framework.domain.AbstractDomainObject", "org.fornax.cartridges.sculptor.framework.gwt.shared.domain.AbstractSimpleDomainObject");
        System.setProperty("generate.jpa.annotation", "false");
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
		System.getProperties().remove("gwt.enum.common.interfaces");

    }

    
	// gwt.dto.generate.gap
	
	@Test
	public void assertMediaDtoSubclass() throws IOException {
		DomainObject mediaObj = (DomainObject) getNamedElement("Media",
				mediaModule().getFor().getDomainObjects());
		Assert.assertNotNull(mediaObj);
		XpandUnit.xpand(
				"templates::gwt::GwtDto::domainObjectSubclassForUnitTest",
				mediaObj, new HashMap<String, Object>(), getXpandTempDir());

		String dtoCode = getFileText("org/fornax/cartridges/sculptor/examples/library/media/gwt/shared/domain/Media.java");
		assertContains(dtoCode,
		"public abstract class Media extends MediaBase {");
		
		// String activityBaseCode =
		// getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/activity/TableViewActivity.java");
		// assertContains(activityBaseCode,
		// "package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.activity;");
		// assertContains(activityBaseCode,
		// "public class TableViewActivity extends org.fornax.cartridges.sculptor.examples.library.person.gwt.client.activity.TableViewActivityBase {");
		//
		// assertContains(activityBaseCode,
		// "org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.TableViewView display;");

		assertContainsConsecutiveFragments(dtoCode, "public  String getDisplayTitle()       {"
				,"// TODO Auto-generated method stub"
,"throw new UnsupportedOperationException(\"getDisplayTitle not implemented\");"
     ,"}");
	}

	@Test
	public void assertDtoMediaBaseClass() throws IOException {
		DomainObject mediaObj = (DomainObject) getNamedElement("Media",
				mediaModule().getFor().getDomainObjects());
		Assert.assertNotNull(mediaObj);
		XpandUnit.xpand("templates::gwt::GwtDto::domainObjectBase", mediaObj,
				new HashMap<String, Object>(), getXpandTempDir());

		String dtoBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/media/gwt/shared/domain/MediaBase.java");

		Assert.assertFalse(dtoBaseCode.contains("@javax.persistence"));
		Assert.assertFalse(dtoBaseCode.contains("@org.hibernate"));


		assertContainsConsecutiveFragments(dtoBaseCode, "public Media(",
				"String title", ") {", "super();", "this.title = title;", "}");
		
		assertContains(dtoBaseCode, "public MediaBase() {");
		
		
		assertContainsConsecutiveFragments(dtoBaseCode, "public Media("
				,"String title"
				,") {");
	}
	
	@Test
	public void assertDtoBookBaseClass() throws IOException {
		DomainObject bookObj = (DomainObject) getNamedElement("Book",
				mediaModule().getFor().getDomainObjects());
		Assert.assertNotNull(bookObj);
		XpandUnit.xpand("templates::gwt::GwtDto::domainObjectBase", bookObj,
				new HashMap<String, Object>(), getXpandTempDir());

		String dtoBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/media/gwt/shared/domain/Book.java");

		Assert.assertFalse(dtoBaseCode.contains("@javax.persistence"));
		Assert.assertFalse(dtoBaseCode.contains("@org.hibernate"));
		
		assertContains(dtoBaseCode, "public  class Book extends org.fornax.cartridges.sculptor.examples.library.media.gwt.shared.domain.Media implements java.io.Serializable");


	}

	@Test
	public void assertGenreEnum() throws IOException {
		
		sculptormetamodel.Enum enumObj = (sculptormetamodel.Enum) getNamedElement("Genre",
				mediaModule().getFor().getDomainObjects());
		Assert.assertNotNull(enumObj);
		
		XpandUnit.xpand("templates::gwt::GwtDto::gwtEnumDto", enumObj,
				new HashMap<String, Object>(), getXpandTempDir());
		String enumCode = getFileText("org/fornax/cartridges/sculptor/examples/library/media/gwt/shared/domain/Genre.java");

		assertContainsConsecutiveFragments(enumCode, "public enum Genre", 
			"implements java.io.Serializable",
			",some.EnumInterface",
			"{");
	}
}
