package org.fornax.cartridges.sculptor.generator.transformation;

import java.util.List;

import junit.framework.Assert;

import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslApplication;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslModel;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptormetamodel.Application;
import sculptormetamodel.Module;
import sculptormetamodel.NamedElement;

@SuppressWarnings("unchecked")
public class ValidationTest extends TransformationTestBase {
	
	private static Application app;
	private static DslModel dslModel;
	
	private static XtendFacade xtend;
	
    @BeforeClass
    public static void setUp() throws Exception {
        initWorkflowContext("workflow-test-validation.mwe");
        
        EmfRegistryMetaModel metaModel = new EmfRegistryMetaModel();
        xtend = XtendFacade.create("extensions::helper", "extensions::dbhelper", "extensions::properties");
        xtend.registerMetaModel(metaModel);

        //app = (Application) ctx.get("transformedModel");
        dslModel = (DslModel) ctx.get("model");
        
        
    }
  
    private Module module() {
        return (Module) getNamedElement("animals", app.getModules());
    }

    protected Object xtendCall(String method, Object... args) {
        return (List<NamedElement>)xtend.call(method, args);
    }
    
    protected void assertOrderedNames(List<NamedElement> listOfNamedElements, String... expectedNames) {
    	Assert.assertEquals(expectedNames.length, listOfNamedElements.size());
    	for(int i = 0; i < listOfNamedElements.size(); i++) {
    		Assert.assertEquals(expectedNames[i], listOfNamedElements.get(i).getName());
    	}
    }
    
    @Test
    public void assertApplication() {
    	
        DslApplication dslApp = dslModel.getApp();

        
    }


}
