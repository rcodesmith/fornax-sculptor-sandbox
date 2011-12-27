package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Test;

import sculptorguimetamodel.GuiCommand;
import sculptorguimetamodel.GuiModule;

public class GwtCommandTemplateTest extends LibraryGwtTemplateBaseTest {
    
    
	@Test
	public void assertCreatePersonCmdCode() throws IOException {
		GuiCommand cmd = (GuiCommand)getNamedElement("CreatePersonCmd", personModule().getCommands());
		
		XpandUnit.xpand("templates::gwt::GwtCommand::gwtCommandBase", cmd,
				new HashMap<String, Object>(), TEMP);

		
		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/shared/command/CreatePersonCmd.java");

		assertMatchesRegexp(javaCode, "package org\\.fornax\\.cartridges\\.sculptor\\.examples\\.library\\.person\\.gwt\\.shared\\.command\\;");
		assertContainsConsecutiveFragments(javaCode, "public", "class CreatePersonCmd extends org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.command.PersonCmd implements java.io.Serializable {");
//		assertMatchesRegexp(javaCode, "public void findPersonByName\\(\\s*String name\\s*,\\s*com.google.gwt.user.client.rpc.AsyncCallback\\<java\\.util\\.List\\<org\\.fornax\\.cartridges\\.sculptor\\.examples\\.library\\.person\\.gwt\\.shared\\.domain\\.Person\\>\\> callback\\)\\;");
	
		// Make sure joda time types not being used
		assertContains(javaCode, "private java.util.Date birthDate;");
		
		assertContains(javaCode, "public java.util.Date getBirthDate() {");
		
		assertContains(javaCode, "public void setBirthDate(java.util.Date birthDate) {");

		// Verify properties constructor with base class call is there
	    assertMatchesRegexp(javaCode, "\\Qpublic CreatePersonCmd(\\E\\s*"
	    		+ "\\Qorg.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn ssn\\E\\s*\\,\\s*"
	    		+ "\\Qjava.util.Date birthDate\\E\\s*"
	    		+ "\\Q) {\\E\\s*"
	    		+ "\\Qsuper(ssn);\\E"
	    		);
	    
	    // Shouldn't generate notNull checks in constructor
	    assertNotContains(javaCode, "org.apache.commons.lang.Validate.notNull");
	}

	@Test
	public void assertPersonCmdCode() throws IOException {
		GuiCommand cmd = (GuiCommand)getNamedElement("PersonCmd", personModule().getCommands());
		
		XpandUnit.xpand("templates::gwt::GwtCommand::gwtCommandBase", cmd,
				new HashMap<String, Object>(), TEMP);

		
		String javaCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/shared/command/PersonCmd.java");

		assertMatchesRegexp(javaCode, "package org\\.fornax\\.cartridges\\.sculptor\\.examples\\.library\\.person\\.gwt\\.shared\\.command\\;");
		
		assertContainsConsecutiveFragments(javaCode, "public", "class PersonCmd extends org.fornax.cartridges.sculptor.framework.gwt.shared.domain.AbstractGwtCommand implements java.io.Serializable {");
		
//		assertContains(javaCode, "@org.hibernate.validator.NotNull");
		assertContains(javaCode, "private org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn ssn;");

		assertMatchesRegexp(javaCode, "\\Qpublic PersonCmd(\\E\\s*"
				+ "\\Qorg.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn\\E ssn\\s*\\) \\{\\s*"
				+ "\\Qsuper();\\E\\s*"
				+ "\\Qthis.ssn = ssn;\\E\\s*"
				+ "\\}");

		assertContains(javaCode, "public org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn getSsn() {");
		assertContains(javaCode, "public void setSsn(org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn ssn) {");
	}


}
