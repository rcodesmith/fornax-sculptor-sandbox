package org.fornax.cartridges.sculptor.generator.templates;

import java.io.File;

import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;

public class LibraryGwtTemplateBaseTest  extends TemplateTestBase {
    protected static GuiApplication guiApp;

	protected static File TEMP = new File("target/temp-xpandoutput");

    @BeforeClass
    public static void before() throws Exception {
        System.setProperty("project.nature", "presentation-tier");
		System.setProperty("datetime.library", "joda");
        System.setProperty("gui.createDefaults", "false");
        System.setProperty("package.gwt", "gwt");
        System.setProperty("gwt.dto.generate.gap", "true");
        
        System.setProperty("framework.domain.AbstractDomainObject", "org.fornax.cartridges.sculptor.framework.gwt.shared.domain.AbstractSimpleDomainObject");
        System.setProperty("generate.jpa.annotation", "false");
        initWorkflowContext("workflowguidsl-test-library-gwt.mwe");
        guiApp = (GuiApplication) ctx.get("guiModel");
        
		TEMP.mkdirs();
		XpandUnit.initXpand(new EmfRegistryMetaModel());

    }

    @AfterClass
    public static void after() {
        System.getProperties().remove("project.nature");
		System.getProperties().remove("datetime.library");
		System.getProperties().remove("gui.createDefaults");
		System.getProperties().remove("package.gwt");

    }

    
    protected GuiModule mainModule() {
        return (GuiModule) getNamedElement("main", guiApp.getModules());
    }
    
    protected GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }

    protected GuiModule mediaModule() {
        return (GuiModule) getNamedElement("media", guiApp.getModules());
    }


}
