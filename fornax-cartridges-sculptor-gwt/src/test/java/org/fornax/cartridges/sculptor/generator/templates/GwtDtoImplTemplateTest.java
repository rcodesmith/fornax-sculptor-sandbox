package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiDto;
import sculptormetamodel.DomainObject;

public class GwtDtoImplTemplateTest extends LibraryGwtTemplateBaseTest {

	@BeforeClass
	public static void before() throws Exception {
		System.setProperty("project.nature", "presentation-tier");
		System.setProperty("datetime.library", "joda");
		System.setProperty("gui.createDefaults", "false");
		System.setProperty("package.gwt", "gwt");
		System.setProperty("ui.custom.guidto", "True");
		System.setProperty("gwt.dto.generate.gap", "true");
		System.setProperty("gwt.enum.common.interfaces", "some.EnumInterface");

		System.setProperty(
				"framework.domain.AbstractDomainObject",
				"org.fornax.cartridges.sculptor.framework.gwt.shared.domain.AbstractSimpleDomainObject");
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
		System.getProperties().remove("ui.custom.guidto");
		System.getProperties().remove("gwt.enum.common.interfaces");

	}

	@Test
	public void assertPersonDtoSubclass() throws IOException {
		DomainObject personObj = (DomainObject) getNamedElement("Person",
				personModule().getStubModule().getDomainObjects());
		Assert.assertNotNull(personObj);
		Assert.assertTrue(personObj instanceof GuiDto);
		Assert.assertNotNull(((GuiDto) personObj).getGuiModule());

		XpandUnit.xpand(
				"templates::gwt::GwtDto::domainObjectSubclassForUnitTest",
				personObj, new HashMap<String, Object>(), getXpandTempDir());

		String dtoCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/shared/domain/Person.java");

	}

	@Test
	public void assertMediaDtoSubclass() throws IOException {
		DomainObject mediaObj = (DomainObject) getNamedElement("Media",
				mediaModule().getStubModule().getDomainObjects());
		Assert.assertNotNull(mediaObj);
		Assert.assertTrue(mediaObj instanceof GuiDto);
		Assert.assertNotNull(((GuiDto) mediaObj).getGuiModule());

		XpandUnit.xpand(
				"templates::gwt::GwtDto::domainObjectSubclassForUnitTest",
				mediaObj, new HashMap<String, Object>(), getXpandTempDir());

		String dtoCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/shared/domain/Media.java");
		assertContains(dtoCode,
				"public abstract class Media extends MediaBase {");

		assertContainsConsecutiveFragments(
				dtoCode,
				"public  String getDisplayTitle()       {",
				"// TODO Auto-generated method stub",
				"throw new UnsupportedOperationException(\"getDisplayTitle not implemented\");",
				"}");
	}

	@Test
	public void assertDtoMediaBaseClass() throws IOException {
		DomainObject mediaObj = (DomainObject) getNamedElement("Media",
				mediaModule().getStubModule().getDomainObjects());
		Assert.assertNotNull(mediaObj);
		Assert.assertTrue(mediaObj instanceof GuiDto);
		XpandUnit.xpand("templates::gwt::GwtDto::domainObjectBase", mediaObj,
				new HashMap<String, Object>(), getXpandTempDir());

		String dtoBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/shared/domain/MediaBase.java");

		Assert.assertFalse(dtoBaseCode.contains("@javax.persistence"));
		Assert.assertFalse(dtoBaseCode.contains("@org.hibernate"));

		assertContainsConsecutiveFragments(dtoBaseCode, "public Media(",
				"String title", ") {", "super();", "this.title = title;", "}");

		assertContains(dtoBaseCode, "public MediaBase() {");

		assertContainsConsecutiveFragments(dtoBaseCode, "public Media(",
				"String title", ") {");
	}

	@Test
	public void assertDtoBookBaseClass() throws IOException {
		DomainObject bookObj = (DomainObject) getNamedElement("Book",
				mediaModule().getStubModule().getDomainObjects());
		Assert.assertNotNull(bookObj);
		XpandUnit.xpand("templates::gwt::GwtDto::domainObjectBase", bookObj,
				new HashMap<String, Object>(), getXpandTempDir());

		String dtoBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/shared/domain/Book.java");

		Assert.assertFalse(dtoBaseCode.contains("@javax.persistence"));
		Assert.assertFalse(dtoBaseCode.contains("@org.hibernate"));

		assertContains(
				dtoBaseCode,
				"public  class Book extends org.fornax.cartridges.sculptor.examples.library.mediaalt.gwt.shared.domain.Media implements java.io.Serializable");

		assertContainsConsecutiveFragments(dtoBaseCode, "public Book(",
				"String title", ",", "String isbn", ") {", "super(title);",
				"this.isbn = isbn;", "}");
		
		// Verify that base class references and attributes not present
		Assert.assertFalse(dtoBaseCode.contains("private java.util.Set<org.fornax.cartridges.sculptor.examples.library.mediaalt.gwt.shared.domain.PhysicalMedia> physicalMedia = new java.util.HashSet<org.fornax.cartridges.sculptor.examples.library.mediaalt.gwt.shared.domain.PhysicalMedia>();"));
		Assert.assertFalse(dtoBaseCode.contains("private String title;"));
		
	}

	@Test
	public void assertEngagementBaseClass() throws IOException {
		DomainObject engagement = (DomainObject) getNamedElement("Engagement",
				mediaModule().getStubModule().getDomainObjects());
		Assert.assertNotNull(engagement);
		XpandUnit.xpand("templates::gwt::GwtDto::domainObjectBase", engagement,
				new HashMap<String, Object>(), getXpandTempDir());

		String dtoBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/shared/domain/Engagement.java");

		// assertContains(dtoBaseCode,
		// "public  class Book extends org.fornax.cartridges.sculptor.examples.library.mediaalt.gwt.shared.domain.Media implements java.io.Serializable");
	}

	@Test
	public void assertGenreEnum() throws IOException {

		sculptormetamodel.Enum enumObj = (sculptormetamodel.Enum) getNamedElement(
				"Genre", mediaModule().getStubModule().getDomainObjects());
		Assert.assertNotNull(enumObj);

		XpandUnit.xpand("templates::gwt::GwtDto::gwtEnumDto", enumObj,
				new HashMap<String, Object>(), getXpandTempDir());
		String enumCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/shared/domain/Genre.java");

		assertContainsConsecutiveFragments(enumCode, "public enum Genre",
				"implements java.io.Serializable", ", com.google.gwt.user.client.rpc.IsSerializable", ",some.EnumInterface", "{");
	}
}
