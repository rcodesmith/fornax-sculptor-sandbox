package org.fornax.cartridges.sculptor.generator.templates;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Test;

import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtActivityTemplateTest extends TemplateTestBase {


	
	private GuiModule personModule() {
		return (GuiModule) getNamedElement("person", guiApp.getModules());
	}

	@Test
	public void assertCreateUpdatePersonBehavior() throws IOException {
		String activityBaseCode = getTableViewBaseActivityCode();

		assertContainsConsecutiveFragments(activityBaseCode,
				"protected org.fornax.cartridges.sculptor.framework.gwt.client.behavior.UpdateAttributeBehavior createUpdatePersonBehavior() {",
				"return new org.fornax.cartridges.sculptor.framework.gwt.client.behavior.UpdateAttributeBehavior(\"updatePerson\", new org.fornax.cartridges.sculptor.framework.gwt.client.behavior.UpdateAttributeBehavior.Invocable() {",
				"@Override",
				"public void invoke(",
				"org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event event) {",
				"org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Person targetObj = (org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Person)event.getObj();",
				"targetObj.setSex((org.fornax.cartridges.sculptor.examples.library.person.domain.Gender)event.getValue());",
				"}",
				"});",
				"}");
	}
	@Test
	public void assertTableViewBaseCode() throws IOException {
		String activityBaseCode = getTableViewBaseActivityCode();

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
		
		assertContainsConsecutiveFragments(activityBaseCode,
				"@Override",
				"public void mytableGenderSelectorOnSelectItem(org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event event) {",
				"genderSelectorOnSelectItemBehaviorDispatcher.invoke(event);",
				"}");
		
		assertContainsConsecutiveFragments(activityBaseCode, "	protected void init() {",
				"LOG.info(\"init()\");",
				
				"getView().initView(this);",
				"}");
		
		// Verify bind method
		assertContainsConsecutiveFragments(activityBaseCode,
				"protected void bind() {",
				"LOG.info(\"bind()\");",
				"// Construct behaviors - must be done in bind() because some of them depend on the view",
				"populatePersonDetailsPanelBehavior = createPopulatePersonDetailsPanelBehavior();",
				"someLinkBehaviorBehavior = createSomeLinkBehaviorBehavior();",
				"updatePersonBehavior = createUpdatePersonBehavior();",
				"confirmSomeMessageBehavior = createConfirmSomeMessageBehavior();",
				"popupPersonDetailsBehavior = createPopupPersonDetailsBehavior();",
				"updateHistoryBehavior = createUpdateHistoryBehavior();",
				"// Create behavior dispatchers.  Has to be done after behaviors because this is where the behaviors get added to the",
				"// dispatcher",
				"nameSelectorOnSelectItemBehaviorDispatcher = createNameSelectorOnSelectItemBehaviorDispatcher();",
				"goToPersonSearchLinkOnClickBehaviorDispatcher = createGoToPersonSearchLinkOnClickBehaviorDispatcher();",
				"saveButtonOnClickBehaviorDispatcher = createSaveButtonOnClickBehaviorDispatcher();",
				"genderSelectorOnSelectItemBehaviorDispatcher = createGenderSelectorOnSelectItemBehaviorDispatcher();",
				"personLinkOnClickBehaviorDispatcher = createPersonLinkOnClickBehaviorDispatcher();"
				);
		
		// Verify createConfirmSomeMessageBehavior
		assertContainsConsecutiveFragments(
				activityBaseCode,
				"/**",
				"* Confirm the user wants to do something",
				"*/",
				"protected org.fornax.cartridges.sculptor.framework.gwt.client.behavior.DisplayMessageBehavior createConfirmSomeMessageBehavior() {",
				"return new org.fornax.cartridges.sculptor.framework.gwt.client.behavior.DisplayMessageBehavior(\"confirmSomeMessage\", \"Are you really sure you want to do this!?!?\",",
				"null,",
				"view);", "}");
		
		
		
		assertContainsConsecutiveFragments(activityBaseCode,
				"public void clearData() {",
				"view.getNameFieldHasText().setText(\"\");",
				"view.clearMytableData();",
				"view.clearPersonTableData();",
				"clearPersonDetailsPanel();",
				"clearErrorPanel();", "}"
				);
		
		assertContainsConsecutiveFragments(activityBaseCode, 
				"public void clearPersonDetailsPanel() {",
				"view.getNestedNameFieldHasText().setText(\"\");",
				"view.getAddressFieldHasText().setText(\"\");",
				"}"
				);
	}

	private String getTableViewBaseActivityCode() throws IOException {
		View tableView = (View) getNamedElement("TableView", personModule()
				.getViews());

		XpandUnit.xpand("templates::gwt::Activity::activityBaseForUnitTest", tableView,
				new HashMap<String, Object>(), getXpandTempDir());

		String activityBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/activity/TableViewActivityBase.java");
		return activityBaseCode;
	}

	@Test
	public void assertMenuViewBaseCode() throws IOException {
		View tableView = (View) getNamedElement("Menu", personModule()
				.getViews());

		XpandUnit.xpand("templates::gwt::Activity::activityBaseForUnitTest", tableView,
				new HashMap<String, Object>(), getXpandTempDir());

		String activityBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/activity/MenuActivityBase.java");

		// TODO: Put back
//		assertContainsConsecutiveFragments(activityBaseCode,
//				"protected void bind() {", "bindPersonLink();",
//				"bindMediaBrowseLink();", "}");

		assertContainsConsecutiveFragments(activityBaseCode,
				"protected org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher personLinkOnClickBehaviorDispatcher = null;"
		);
		
		
		assertContainsConsecutiveFragments(
				activityBaseCode,
				"protected void bindPersonLink() {",
				"{",
				"personLinkOnClickBehaviorDispatcher = createPersonLinkOnClickBehaviorDispatcher();",
				"personLinkOnClickBehaviorDispatcher.bindHasClickHandler(view.getPersonLinkHasClickHandlers());",
				"}",
				"}");
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
	
	@Test
	public void assertIsDirtyCondition() throws IOException {
		
		String activityBaseCode = getTableViewBaseActivityCode();
		
		assertContainsConsecutiveFragments(activityBaseCode,
				"/**",
				"* @return the value of condition isDirty",
				"*/",
				"public boolean IsDirtyCondition() {",
				"return isDirty() == true;",
				"}");

	}

}
