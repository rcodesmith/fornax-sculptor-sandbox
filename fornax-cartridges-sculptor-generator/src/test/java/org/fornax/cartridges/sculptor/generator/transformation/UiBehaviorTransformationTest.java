package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import sculptorguimetamodel.ConfirmMessageBehavior;
import sculptorguimetamodel.CustomBehavior;
import sculptorguimetamodel.PopulatePanelBehavior;
import sculptorguimetamodel.UpdateTableBehavior;
import sculptorguimetamodel.View;

public class UiBehaviorTransformationTest extends GuiDslTransformationBaseTest {

	@Test
	public void assertPersonModuleBehaviors() {
		assertEquals(1, personModule().getBehaviors().size());
		
        assertOneAndOnlyOne(personModule().getBehaviors(), "navigateToMediaBrowse");

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
	
	//

}
