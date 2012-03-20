package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import junit.framework.Assert;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import sculptorguimetamodel.CustomWidget;
import sculptorguimetamodel.GuiDto;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.InformationalTextWidget;
import sculptorguimetamodel.InputTextWidget;
import sculptorguimetamodel.LinkWidget;
import sculptorguimetamodel.ListBoxWidget;
import sculptorguimetamodel.OnClickBinding;
import sculptorguimetamodel.PanelWidget;
import sculptorguimetamodel.PopulatePanelBehavior;
import sculptorguimetamodel.TableColumn;
import sculptorguimetamodel.TableWidget;
import sculptorguimetamodel.UiCondition;
import sculptorguimetamodel.View;
import sculptorguimetamodel.ViewParameter;
import sculptorguimetamodel.Widget;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Service;

public class ViewGuiDslTransformationTest extends GuiDslTransformationBaseTest {
	@Test
	public void assertMediaBrowseView() {
		GuiModule mediaBrowseModule = mediaModule();

		View view = (View) getNamedElement("MediaBrowse",
				mediaBrowseModule.getViews());
		assertNotNull(view);

		EList<Widget> widgets = view.getWidgets();

		assertEquals(3, widgets.size());

		TableWidget table = (TableWidget) widgets.get(0);
		assertEquals("Library Table", table.getLabel());

		DomainObject library = table.getFor();
		assertNotNull(library);
		assertEquals("Library", library.getName());
	}

	@Test
	public void assertTableView() {
		View tableView = (View) getNamedElement("TableView", personModule()
				.getViews());
		assertNotNull(tableView);

		assertEquals("somehint", tableView.getHint());
		
		EList widgets = tableView.getWidgets();
		TableWidget personTable = (TableWidget) widgets.get(0);
		assertEquals("Person Table", personTable.getLabel());

		GuiDto person = (GuiDto)personTable.getFor();
		assertNotNull(person);
		assertEquals("Person", person.getName());

		assertNotNull(person.getGuiModule());
		assertNotNull(person.getGuiModule().getFor());
		
		EList tableCols = personTable.getColumns();
		assertNotNull(tableCols);
		assertOneAndOnlyOne(tableCols, "name", "birthDate", "edit");

		TableColumn nameCol = (TableColumn) tableCols.get(0);
		assertEquals("name", nameCol.getName());
		assertEquals("Text", nameCol.getColumnType());
		assertEquals(true, nameCol.isFilterable());
		assertEquals(true, nameCol.isSortable());
		// assertEquals("getDisplayName", nameCol.getForOp().getName());

		TableColumn birthDateCol = (TableColumn) tableCols.get(1);
		assertEquals("birthDate", birthDateCol.getName());
		assertEquals("Date", birthDateCol.getColumnType());
		assertEquals(false, birthDateCol.isFilterable());
		assertEquals(false, birthDateCol.isSortable());

		// assertEquals("birthDate", birthDateCol.getForAttribute().getName());

		TableColumn editCol = (TableColumn) tableCols.get(2);
		assertNotNull(editCol);
		assertEquals("Button", editCol.getColumnType());
		assertEquals(1, editCol.getBehaviorBindings().size());
		assertEquals(false, editCol.isFilterable());
		assertEquals(false, editCol.isSortable());

		OnClickBinding onClick = (OnClickBinding) editCol.getBehaviorBindings()
				.get(0);
		assertEquals(1, onClick.getBehaviors().size());
		PopulatePanelBehavior populatePanel = (PopulatePanelBehavior) onClick
				.getBehaviors().get(0);
		assertEquals("personDetailsPanel", populatePanel.getPanel().getName());
		
		CustomWidget customLink = (CustomWidget)getNamedElement("customLink", widgets);
		assertNotNull(customLink);
		assertEquals("customLink", customLink.getName());
		assertEquals("Custom Link", customLink.getLabel());

		
		UiCondition enabledCond = personTable.getEnabled();
		assertNotNull(enabledCond);
		assertEquals("isTableEditable", enabledCond.getName());
		
		UiCondition visibleCond = personTable.getEnabled();
		assertNotNull(visibleCond);
		assertTrue(visibleCond == enabledCond);
		
		
		
	}

	@Test
	public void assertEmptyPersonDetailsPanel() {
		View tableView = (View) getNamedElement("TableView", personModule()
				.getViews());

		PanelWidget emptyPane = (PanelWidget) getNamedElement(
				"personDetailsEmptyPanel", tableView.getWidgets());
		assertNotNull(emptyPane);
		assertEquals(0, emptyPane.getWidgets().size());
		assertEquals("this is an empty panel", emptyPane.getDoc());		
	}
	
	@Test
	public void assertPersonDetailsPanel() {
		View tableView = (View) getNamedElement("TableView", personModule()
				.getViews());

		PanelWidget personDetailsPane = (PanelWidget) getNamedElement(
				"personDetailsPanel", tableView.getWidgets());
		assertNotNull(personDetailsPane);
		assertEquals(2, personDetailsPane.getWidgets().size());
		Assert.assertSame(tableView, personDetailsPane.getView());
		
		assertEquals("paneltype=SimplePanel", personDetailsPane.getHint());
		
		// Check contents of person detail panel
		InputTextWidget widget1 = (InputTextWidget)personDetailsPane.getWidgets().get(0);
		assertEquals("nameField", widget1.getName());
		Assert.assertSame(tableView, widget1.getView());

	}

	@Test
	public void assertMenuView() {
		View menuView = (View) getNamedElement("Menu", mainModule().getViews());
		assertNotNull(menuView);

		EList widgets = menuView.getWidgets();
		assertEquals(2, widgets.size());
		assertOneAndOnlyOne(widgets, "personLink", "mediaBrowseLink");

		LinkWidget personLink = (LinkWidget) widgets.get(1);
		assertEquals("Person Form", personLink.getLabel());
		assertEquals("PersonForm", personLink.getToView().getName());
		assertEquals("Link to PersonForm view", personLink.getDoc());

		LinkWidget mediaBrowseLink = (LinkWidget) widgets.get(0);
		assertEquals("Media Browse", mediaBrowseLink.getLabel());
		assertEquals("MediaBrowse", mediaBrowseLink.getToView().getName());

	}

	@Test
	public void assertPersonFormView() {
		View personForm = (View) getNamedElement("PersonForm", personModule()
				.getViews());
		assertNotNull(personForm);

		DomainObject forObj = personForm.getFor();
		assertNotNull(forObj);
		assertEquals("Person", forObj.getName());
		assertTrue(forObj instanceof GuiDto);

		assertEquals(2, personForm.getParameters().size());

		ViewParameter commandParam = (ViewParameter) personForm.getParameters()
				.get(0);
		assertNotNull(commandParam);
		assertEquals("String", commandParam.getType());
		assertEquals(Boolean.FALSE, commandParam.isNullable());

		ViewParameter idParam = (ViewParameter) personForm.getParameters().get(
				1);
		assertNotNull(idParam);
		assertEquals("Integer", idParam.getType());
		assertEquals(Boolean.TRUE, idParam.isNullable());

		assertEquals(1, personForm.getServiceProxies().size());
		assertOneAndOnlyOne(personForm.getServiceProxies(), "PersonService");
		Service svc = (Service)personForm.getServiceProxies().get(0);
		assertTrue(personModule().getStubModule().getServices().contains(svc));
		

		EList widgets = personForm.getWidgets();
		assertEquals(8, widgets.size());
		assertOneAndOnlyOne(widgets, "nameField", "birthDateField", "table1",
				"saveButton", "info1", "fullName", "textArea1", "genderSelector"); // "autocomp1"

		InputTextWidget nameField = (InputTextWidget) widgets.get(0);
		assertEquals("Name", nameField.getLabel());
		// assertNotNull(nameField.getForReference());
		// assertEquals("name", nameField.getForReference().getName());

		InputTextWidget birthDateField = (InputTextWidget) widgets.get(1);
		assertEquals("Birth Date", birthDateField.getLabel());
		// assertNotNull(birthDateField.getForAttribute());
		// assertEquals("birthDate",
		// birthDateField.getForAttribute().getName());

		InformationalTextWidget fullName = (InformationalTextWidget) getNamedElement("fullName", widgets);
		assertEquals("Full name", fullName.getLabel());
		// assertNotNull(fullName.getForOp());
		// assertEquals("getDisplayName", fullName.getForOp().getName());

		// getDisplayName

		// assertNotNull(nameField.getForProperty());
		// ViewAttributeReference nameRef =
		// (ViewAttributeReference)nameField.getForProperty();
		// nameRef.getAttribute();

		// AutocompleteWidget autoComp = (AutocompleteWidget)widgets.get(5);
		// assertEquals("Auto complete one", autoComp.getLabel());

		ListBoxWidget genderSelector = (ListBoxWidget)getNamedElement("genderSelector", widgets);
		assertNotNull(genderSelector);
		assertEquals("genderSelector", genderSelector.getName());
		assertNotNull(genderSelector.getForEnum());
		assertEquals("Gender", genderSelector.getForEnum().getName());
		assertEquals(2, genderSelector.getForEnum().getValues().size());
	}
	

}
