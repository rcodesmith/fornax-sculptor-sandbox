package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import sculptorguimetamodel.CustomCondition;
import sculptorguimetamodel.View;

public class UiConditionTransformationTest extends GuiDslTransformationBaseTest {

	@Test
	public void assertPersonModuleBehaviors() {
		assertEquals(1, personModule().getConditions().size());
		
        assertOneAndOnlyOne(personModule().getConditions(), "isAdministrator");

	}
	
	@Test
	public void assertIsAdministratorCondition() {
		
		CustomCondition cond = (CustomCondition)getNamedElement("isAdministrator", personModule().getConditions());
		assertNotNull(cond);
		assertEquals("isAdministrator", cond.getName());
		assertEquals("somehint1", cond.getHint());
		
	}
	
	@Test
	public void assertTableViewCondition() {
		View tableView = (View)getNamedElement("TableView", personModule().getViews());
		CustomCondition cond = (CustomCondition)getNamedElement("isTableEditable", tableView.getConditions());
		assertNotNull(cond);
		assertEquals("isTableEditable", cond.getName());
		assertEquals("somehint2", cond.getHint());
	}
	


}
