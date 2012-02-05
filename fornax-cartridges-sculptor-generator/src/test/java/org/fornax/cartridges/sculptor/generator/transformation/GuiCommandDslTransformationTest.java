package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import junit.framework.Assert;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import sculptorguimetamodel.GuiCommand;
import sculptormetamodel.Attribute;
import sculptormetamodel.CommandEvent;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Reference;

public class GuiCommandDslTransformationTest extends GuiDslTransformationBaseTest {

	
	@Test
	public void assertCreatePersonCommand() {
		GuiCommand cmd = (GuiCommand) getNamedElement("CreatePersonCmd", personModule().getStubModule().getDomainObjects());
		
		assertNotNull(cmd);
		assertEquals("CreatePersonCmd", cmd.getName());
		
		GuiCommand ext = (GuiCommand)cmd.getExtends();
		assertNotNull(ext);
		assertEquals("PersonCmd", ext.getName());
		assertNull(cmd.getExtendsName());
		
		
		EList attrs = cmd.getAttributes();
		assertEquals(1, attrs.size());
		
		Attribute birthDate = (Attribute)getNamedElement("birthDate", attrs);
		assertNotNull(birthDate);
		assertEquals("birthDate", birthDate.getName());
		
		
		assertEquals(0, cmd.getReferences().size());
		
		// Verify 'for' reference
		DomainObject domainCreatePersonCmd = cmd.getFor();
		assertNotNull(domainCreatePersonCmd);
		assertEquals("CreatePersonCmd", domainCreatePersonCmd.getName());
		Assert.assertTrue(domainCreatePersonCmd instanceof CommandEvent);
		
		// Verify guiModule
		assertNotNull(cmd.getGuiModule());
		Assert.assertSame(personModule(), cmd.getGuiModule());
	}
	
	@Test
	public void assertPersonCmd() {
		GuiCommand cmd = (GuiCommand) getNamedElement("PersonCmd", personModule().getStubModule().getDomainObjects());
		assertNotNull(cmd);
		assertEquals("PersonCmd", cmd.getName());

		EList refs = cmd.getReferences();
		assertEquals(1, refs.size());
		
		Reference ssn = (Reference)getNamedElement("ssn", refs);
		assertNotNull(ssn);
		assertEquals("ssn", ssn.getName());
		assertSame(cmd, ssn.getFrom());
		
		DomainObject ssnDto = ssn.getTo();
		assertNotNull(ssnDto);
		System.out.println("SSN DTO: " + ssnDto);
		
		// Right now, SSN object still belongs to module
//		assertNull(ssnDto.getModule());

	}
	
	

}
