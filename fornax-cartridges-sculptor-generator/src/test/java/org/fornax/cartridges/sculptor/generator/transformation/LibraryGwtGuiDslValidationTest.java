package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslGuiApplication;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslGuiModule;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslView;
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
	static DslGuiApplication guiDslApp;

	@BeforeClass
	public static void before() throws Exception {
		System.setProperty("project.nature", "business-tier, rcp");
		System.setProperty("datetime.library", "joda");
		System.setProperty("gui.createDefaults", "false");
		System.setProperty("package.gwt", "gwt");

		System.setProperty("ui.custom.guidto", "true");

		initWorkflowContext("workflowguidsl-test-library-gwt-validation.mwe");
		guiApp = (GuiApplication) ctx.get("guiModel");

		guiDslApp = (DslGuiApplication) ctx.get("guiDslModel");
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

	protected DslGuiModule personDslModule() {
		String moduleName = "person";

		for (DslGuiModule guiModule : guiDslApp.getModules()) {
			if (guiModule.getFor().getName().equals(moduleName)) {
				return guiModule;
			}
		}
		return null;
	}

	protected DslView getNamedView(DslGuiModule guiModule, String name) {
		for (DslView view : guiModule.getViews()) {
			if (name.equals(view.getName())) {
				return view;
			}
		}
		return null;

	}

	protected GuiModule mediaModule() {
		return (GuiModule) getNamedElement("media", guiApp.getModules());
	}

	protected Attribute getAttribute(DomainObject obj, String attrName) {
		return (Attribute) getNamedElement(attrName, obj.getAttributes());
	}

	protected Reference getReference(DomainObject obj, String attrName) {
		return (Reference) getNamedElement(attrName, obj.getReferences());
	}

	public List<Diagnostic> getAllDiagnostics(EObject obj) {
		List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
		 TreeIterator<EObject> iter = obj.eAllContents();
		 
		 while(iter.hasNext()) {
			 EObject childObj = iter.next();
			 if(childObj.eResource().getErrors().size() > 0) {
				 diagnostics.addAll(childObj.eResource().getErrors());
			 }
			 if(childObj.eResource().getWarnings().size() > 0) {
				 diagnostics.addAll(childObj.eResource().getWarnings());
			 }
		 }
		 return diagnostics;
		
	}
	
	// TODO: Find better way to test validators.  Right now, just have to visually verify errors generated in logs
	@Test
	public void assertApplication() {
		assertNotNull(guiApp);
		assertNotNull(guiDslApp);
		Resource resource = guiDslApp.eResource();
		List<Diagnostic> diagnostics = getAllDiagnostics(guiDslApp);
		//assertEquals(1, diagnostics.size());

		DslGuiModule personDslModule = personDslModule();
		resource = personDslModule.eResource();

		DslView personDslForm = getNamedView(personDslModule, "PersonForm");
		assertNotNull(personDslForm);

		resource = personDslForm.getFor().eResource();

		Resource personFormRes = personDslForm.eResource();
		if (personFormRes != null) {
		}

		// assertEquals("LibraryWeb", guiApp.getName());
		// Resource res = guiDslApp.eResource();
		// EList<Diagnostic> errors = res.getErrors();
		//
		// GuiModule personModule = personModule();
		// View personForm = (View)getNamedElement("PersonForm",
		// personModule.getViews());
		// Resource personFormRes = personForm.eResource();
		// if(personFormRes != null) {
		// errors = personFormRes.getErrors();
		// assertEquals(1, errors.size());
		// }

	}

}
