package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Test;

import sculptorguimetamodel.BehaviorBinding;
import sculptorguimetamodel.ClearWidgetsBehavior;
import sculptorguimetamodel.CustomBehavior;
import sculptorguimetamodel.DisplayMessageBehavior;
import sculptorguimetamodel.MarkCleanBehavior;
import sculptorguimetamodel.MarkDirtyBehavior;
import sculptorguimetamodel.OnClickBinding;
import sculptorguimetamodel.PanelWidget;
import sculptorguimetamodel.PopulatePanelBehavior;
import sculptorguimetamodel.PopupPanelBehavior;
import sculptorguimetamodel.TableWidget;
import sculptorguimetamodel.UpdateHistoryBehavior;
import sculptorguimetamodel.UpdateTableBehavior;
import sculptorguimetamodel.View;
import sculptorguimetamodel.Widget;

public class UiBehaviorTransformationTest extends GuiDslTransformationBaseTest {

	@Test
	public void assertPersonModuleBehaviors() {
		assertEquals(3, personModule().getBehaviors().size());
		
        assertOneAndOnlyOne(personModule().getBehaviors(), "populatePersonDetailsPanel", "navigateToMediaBrowse", "compositeBehavior");

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
	public void assertUpdateHistoryBehavior() {
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		
		UpdateHistoryBehavior updateHistory = (UpdateHistoryBehavior)getNamedElement("updateHistory", tableView.getBehaviors());
		assertNotNull(updateHistory);
		
		assertEquals("updateHistory", updateHistory.getName());
		assertEquals("Update history based on current view", updateHistory.getDoc());
	}

	@Test
	public void assertClearWidgetsBehavior() {
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		
		ClearWidgetsBehavior clearWidgets = (ClearWidgetsBehavior)getNamedElement("clearWidgets", tableView.getBehaviors());
		assertNotNull(clearWidgets);
		
		assertEquals("clearWidgets", clearWidgets.getName());
		assertEquals("Clear me a couple widgets", clearWidgets.getDoc());
		
		assertEquals(2, clearWidgets.getWidgets().size());
		
		assertEquals("personDetailsPanel", ((PanelWidget)clearWidgets.getWidgets().get(0)).getName());
		assertEquals("personTable", ((TableWidget)clearWidgets.getWidgets().get(1)).getName());
		
		
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
		
		DisplayMessageBehavior confirmMessageBehavior = (DisplayMessageBehavior)getNamedElement("confirmSomeMessage", tableView.getBehaviors());
		assertNotNull(confirmMessageBehavior);
		
		assertEquals("confirmSomeMessage", confirmMessageBehavior.getName());
		
		assertEquals(true, confirmMessageBehavior.isCancelable());
		
		assertEquals("Are you really sure you want to do this!?!?", confirmMessageBehavior.getMessage());
		
		assertEquals("ARE_U_SURE_MSG", confirmMessageBehavior.getMessageId());
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
		assertEquals("someLinkBehavior", custom.getName());
		
		EList revBindings = custom.getBindings();
		assertEquals(3, revBindings.size());
		boolean found = false;
		for (Object binding : revBindings) {
			if(onClick == binding) {
				found = true;
			}
		}
		Assert.assertTrue(found);
	}
	//

}
