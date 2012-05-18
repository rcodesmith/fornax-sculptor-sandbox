package org.fornax.cartridges.sculptor.generator.templates;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtActivityTemplateTest extends TemplateTestBase {


	
	private GuiModule personModule() {
		return (GuiModule) getNamedElement("person", guiApp.getModules());
	}

	@Test
	public void assertTableViewBaseCode() throws IOException {
		View tableView = (View) getNamedElement("TableView", personModule()
				.getViews());

		XpandUnit.xpand("templates::gwt::Activity::activityBaseForUnitTest", tableView,
				new HashMap<String, Object>(), getXpandTempDir());

		String activityBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/activity/TableViewActivityBase.java");

		assertContains(
				activityBaseCode,
				"package org.fornax.cartridges.sculptor.examples.library.person.gwt.client.gen.activity;");

		assertContains(
				activityBaseCode,
				"public abstract class TableViewActivityBase extends org.fornax.cartridges.sculptor.framework.gwt.client.activity.ActivityBase<org.fornax.cartridges.sculptor.examples.library.person.gwt.client.gen.place.TableViewPlace> implements org.fornax.cartridges.sculptor.examples.library.person.gwt.client.gen.activity.TableViewBasePresenterIf {");

		assertContains(
				activityBaseCode,
				"protected final org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.TableViewViewIf view;");

		assertContains(activityBaseCode,
				"protected abstract void populateFromPlace();");

		assertContains(activityBaseCode,
				"protected com.google.gwt.user.client.ui.Widget getViewAsWidget() {");
	}

	@Test
	public void assertMenuViewBaseCode() throws IOException {
		View tableView = (View) getNamedElement("Menu", personModule()
				.getViews());

		XpandUnit.xpand("templates::gwt::Activity::activityBaseForUnitTest", tableView,
				new HashMap<String, Object>(), getXpandTempDir());

		String activityBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/activity/MenuActivityBase.java");

		assertContainsConsecutiveFragments(activityBaseCode,
				"protected void bind() {", "bindPersonLink();",
				"bindMediaBrowseLink();", "}");

		assertContainsConsecutiveFragments(
				activityBaseCode,
				"	protected void bindPersonLink() {",
				"view.getPersonLinkHasClickHandlers().addClickHandler(new com.google.gwt.event.dom.client.ClickHandler() {",
				"@java.lang.Override",
				"public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {",
				"placeController.goTo(new org.fornax.cartridges.sculptor.examples.library.person.gwt.client.gen.place.PersonFormPlace());",
				"}", "});", "}");
	}

	@Test
	public void assertPersonFormBaseCode() throws IOException {
		View personFormView = (View) getNamedElement("PersonForm",
				personModule().getViews());
		assertNotNull(personFormView);
		XpandUnit.xpand("templates::gwt::Activity::activityBaseForUnitTest",
				personFormView, new HashMap<String, Object>(),
				getXpandTempDir());

		String activityBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/activity/PersonFormActivityBase.java");

		assertContainsConsecutiveFragments(
				activityBaseCode,
				"public PersonFormActivityBase(com.google.gwt.event.shared.EventBus eventBus,",
				"org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.PersonFormViewIf theView,",
				"com.google.gwt.place.shared.PlaceController placeController",
				",",
				"org.fornax.cartridges.sculptor.examples.library.person.gwt.client.GwtPersonServiceAsync personService"
				, ") {"
				,"super();"
				,"this.view = theView;"
				,"this.eventBus = eventBus;"
				,"this.placeController = placeController;"
				,"this.personService = personService;"
		);
	}

}
