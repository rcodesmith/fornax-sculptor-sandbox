package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Assert;
import org.junit.Test;

import sculptormetamodel.DomainObject;

public class GwtDtoImplTemplateTest extends LibraryGwtTemplateBaseTest {

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

}
