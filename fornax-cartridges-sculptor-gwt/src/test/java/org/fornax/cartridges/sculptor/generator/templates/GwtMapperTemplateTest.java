package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Assert;
import org.junit.Test;

import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.StubModule;
import sculptorguimetamodel.View;

public class GwtMapperTemplateTest extends TemplateTestBase {
	
    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }

    @Test
    public void assertMapperCode() throws IOException {
    	GuiModule guiMod = personModule();
    	StubModule stubMod = guiMod.getStubModule();
    	Assert.assertEquals(5, stubMod.getDomainObjects().size());
    	
    	HashMap<String, Object> globalVars = new HashMap<String, Object>();
        XpandUnit.xpand("templates::gwt::GwtMapper::domainObjectUIMapperDispatch", personModule(),
                globalVars, getXpandTempDir());
        
        String mapperCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/domain/PersonDtoMapper.java");
        
        assertContains(mapperCode,
        		"public static org.fornax.cartridges.sculptor.examples.library.person.domain.Person mapPersonToDomain(org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Person dtoObj) {");
     
        
        assertContains(mapperCode,
        		"public static org.fornax.cartridges.sculptor.examples.library.person.domain.Person mapToDomain(org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Person dtoObj) {");
        
        
        assertContains(mapperCode,
        		"public static org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Person mapPersonFromDomain(org.fornax.cartridges.sculptor.examples.library.person.domain.Person domainObj) {");
        
        assertContains(mapperCode,
        		"public static org.fornax.cartridges.sculptor.examples.library.person.domain.Ssn mapSsnToDomain(org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Ssn dtoObj) {");
    }

}
