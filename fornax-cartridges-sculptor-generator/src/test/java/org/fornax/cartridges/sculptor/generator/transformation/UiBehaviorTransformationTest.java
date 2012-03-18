package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import sculptorguimetamodel.PopulatePanelBehavior;
import sculptorguimetamodel.View;

public class UiBehaviorTransformationTest extends GuiDslTransformationBaseTest {

	@Test
	public void assertBehaviors() {
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
	

}
