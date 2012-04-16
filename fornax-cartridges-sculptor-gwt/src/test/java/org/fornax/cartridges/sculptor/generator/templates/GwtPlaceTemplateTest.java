package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtPlaceTemplateTest extends TemplateTestBase {

	private GuiModule personModule() {
		return (GuiModule) getNamedElement("person", guiApp.getModules());
	}

	@Test
	public void assertTableViewBaseCode() throws IOException {
		View personForm = (View) getNamedElement("PersonForm", personModule()
				.getViews());

		Assert.assertNotNull(personForm);
		
		XpandUnit.xpand("templates::gwt::Place::placeBaseForUnitTest", personForm,
				new HashMap<String, Object>(), getXpandTempDir());

		String placeBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/place/PersonFormPlace.java");

		assertContains(
				placeBaseCode,
				"package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.gen.place;");

		assertContains(
				placeBaseCode,
				"public class PersonFormPlace extends com.google.gwt.place.shared.Place {");

		assertContains(placeBaseCode, "private Long personId;");
		assertContains(placeBaseCode, "private String displayMode;");

		assertContainsConsecutiveFragments(placeBaseCode,
				"public PersonFormPlace(", "Long personId",
				") {");

	}

}
