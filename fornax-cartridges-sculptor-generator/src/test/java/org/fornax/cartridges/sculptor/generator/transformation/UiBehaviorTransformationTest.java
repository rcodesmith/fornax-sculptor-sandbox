package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Test;

import sculptorguimetamodel.BehaviorBinding;
import sculptorguimetamodel.ConfirmMessageBehavior;
import sculptorguimetamodel.CustomBehavior;
import sculptorguimetamodel.MarkCleanBehavior;
import sculptorguimetamodel.MarkDirtyBehavior;
import sculptorguimetamodel.OnClickBinding;
import sculptorguimetamodel.PopulatePanelBehavior;
import sculptorguimetamodel.PopupPanelBehavior;
import sculptorguimetamodel.UpdateTableBehavior;
import sculptorguimetamodel.View;
import sculptorguimetamodel.Widget;

public class UiBehaviorTransformationTest extends GuiDslTransformationBaseTest {

	@Test
	public void assertPersonModuleBehaviors() {
		assertEquals(2, personModule().getBehaviors().size());
		
        assertOneAndOnlyOne(personModule().getBehaviors(), "navigateToMediaBrowse", "compositeBehavior");

	}
	
	@Test
	public void assertPopulatePersonDetailsInViewBehavior() {
		
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		
		PopulatePanelBehavior populatePersonDetailsPanel = (PopulatePanelBehavior)getNamedElement("populatePersonDetailsPanel", tableView.getBehaviors());
		assertNotNull(populatePersonDetailsPanel);
		
		assertEquals("Populate the person details panel", populatePersonDetailsPanel.getDoc());
		assertEquals("personDetailsPanel", populatePersonDetailsPanel.getPanel().getName());
		
	}
	
	@Test
	public void assertPopupPanelBehavior() {
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		
		PopupPanelBehavior popupPersonDetails = (PopupPanelBehavior)getNamedElement("popupPersonDetails", tableView.getBehaviors());
		assertNotNull(popupPersonDetails);
		
		assertEquals("popupPersonDetails", popupPersonDetails.getName());
		assertEquals("Behavior to popup a panel", popupPersonDetails.getDoc());
		assertEquals("PersonPopup", popupPersonDetails.getView().getName());
	}
	
	
	@Test
	public void assertUpdatePersonTableBehavior() {
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		
		UpdateTableBehavior updatePersonTable = (UpdateTableBehavior)getNamedElement("updatePersonTable", tableView.getBehaviors());
		assertNotNull(updatePersonTable);
		
		assertEquals("updatePersonTable", updatePersonTable.getName());
		
		assertEquals("personTable", updatePersonTable.getTable().getName());
		
	}
	
	@Test
	public void assertConfirmMessageBehavior() {
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		
		ConfirmMessageBehavior confirmMessageBehavior = (ConfirmMessageBehavior)getNamedElement("confirmSomeMessage", tableView.getBehaviors());
		assertNotNull(confirmMessageBehavior);
		
		assertEquals("confirmSomeMessage", confirmMessageBehavior.getName());
		
		assertEquals("Are you really sure you want to do this!?!?", confirmMessageBehavior.getMessage());
	}
	
	@Test
	public void assertCustomBehavior() {
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		
		CustomBehavior customBehavior = (CustomBehavior)getNamedElement("customPersonTableBehavior", tableView.getBehaviors());
		assertNotNull(customBehavior);
		
		assertEquals("customPersonTableBehavior", customBehavior.getName());
	}

	@Test
	public void assertMarkDirtyBehavior() {
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		
		MarkDirtyBehavior markDirtyBehavior = (MarkDirtyBehavior)getNamedElement("markViewDirty", tableView.getBehaviors());
		assertNotNull(markDirtyBehavior);
		
		assertEquals("markViewDirty", markDirtyBehavior.getName());
		assertEquals("Documentation on the MarkDirty behavior", markDirtyBehavior.getDoc());
		assertEquals("customhint", markDirtyBehavior.getHint());
	}

	@Test
	public void assertMarkCleanBehavior() {
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		
		MarkCleanBehavior markCleanBehavior = (MarkCleanBehavior)getNamedElement("markViewClean", tableView.getBehaviors());
		assertNotNull(markCleanBehavior);
		
		assertEquals("markViewClean", markCleanBehavior.getName());
		assertEquals("Documentation on the MarkClean behavior", markCleanBehavior.getDoc());
		assertEquals("customhint", markCleanBehavior.getHint());
	}

	@Test
	public void assertAutocompleteBoundBehaviors() {
		View personFormView = (View)getNamedElement("PersonForm", personModule().getViews());
		
		Widget autocomp = (Widget)getNamedElement("autocomp1", personFormView.getWidgets());
		EList bindings = autocomp.getBehaviorBindings();
		assertEquals(1, bindings.size());
		
		BehaviorBinding binding = (BehaviorBinding)bindings.get(0);
		assertEquals("OnSelectItem", binding.getBindingTypeName());
	}
	
	@Test
	public void assertSaveButtonBoundBehaviors() {
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		Widget saveButton = (Widget)getNamedElement("saveButton", tableView.getWidgets());
		assertNotNull(saveButton);
		EList bindings = saveButton.getBehaviorBindings();
		assertEquals(1, bindings.size());
		OnClickBinding onClick = (OnClickBinding)bindings.get(0);
		assertEquals("OnClick", onClick.getBindingTypeName());
		EList behaviors = onClick.getBehaviors();
		assertEquals(1, behaviors.size());
		CustomBehavior custom = (CustomBehavior) behaviors.get(0);
		assertEquals("saveChanges", custom.getName());
		
		EList revBindings = custom.getBindings();
		assertEquals(1, revBindings.size());
		OnClickBinding revBinding = (OnClickBinding)revBindings.get(0);
		Assert.assertSame(revBinding, onClick);
		
	}
	//

}
