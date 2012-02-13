package org.fornax.cartridges.sculptor.generator.transformation;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptormetamodel.Attribute;
import sculptormetamodel.DomainObject;

public abstract class GuiDslTransformationBaseTest extends TransformationTestBase {

//  private static final boolean VALIDATE_SERVICE_OPERATION = true;
//  private static final boolean DONT_VALIDATE_SERVICE_OPERATION = false;
  static GuiApplication guiApp;

	@BeforeClass
	public static void before() throws Exception {
	        System.setProperty("project.nature", "business-tier, rcp");
			System.setProperty("datetime.library", "joda");
	        System.setProperty("gui.createDefaults", "false");
	        System.setProperty("package.gwt", "gwt");
	        
	        System.setProperty("ui.custom.guidto", "true");
	
	        initWorkflowContext("workflowguidsl-test-library-gwt.mwe");
	        guiApp = (GuiApplication) ctx.get("guiModel");
	        
	        
	//		TEMP.mkdirs();
	//		XpandUnit.initXpand(new EmfRegistryMetaModel());
	
	    }

	@AfterClass
	public static void after() {
	    System.getProperties().remove("project.nature");
		System.getProperties().remove("datetime.library");
		System.getProperties().remove("gui.createDefaults");
		System.getProperties().remove("package.gwt");
		System.getProperties().remove("ui.custom.guidto");
	
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

	protected Attribute getAttribute(DomainObject obj, String attrName) {
		return (Attribute)getNamedElement(attrName, obj.getAttributes());
	}


}
