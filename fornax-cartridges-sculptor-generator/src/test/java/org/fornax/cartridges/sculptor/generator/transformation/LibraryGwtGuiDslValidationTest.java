package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptormetamodel.Attribute;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Reference;

//@Ignore("Skip this test now, due to problems when running from maven")
@SuppressWarnings("unchecked")
public class LibraryGwtGuiDslValidationTest extends TransformationTestBase {
	
	  static GuiApplication guiApp;

		@BeforeClass
		public static void before() throws Exception {
		        System.setProperty("project.nature", "business-tier, rcp");
				System.setProperty("datetime.library", "joda");
		        System.setProperty("gui.createDefaults", "false");
		        System.setProperty("package.gwt", "gwt");
		        
		        System.setProperty("ui.custom.guidto", "true");
		
		        initWorkflowContext("workflowguidsl-test-library-gwt-validation.mwe");
		        guiApp = (GuiApplication) ctx.get("guiModel");
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

		protected Reference getReference(DomainObject obj, String attrName) {
			return (Reference)getNamedElement(attrName, obj.getReferences());
		}

    @Test
    public void assertApplication() {
    	assertNotNull(guiApp);
        assertEquals("LibraryWeb", guiApp.getName());
    }



}
