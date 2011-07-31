package org.fornax.cartridges.sculptor.generator.transformation;

import java.util.List;

import junit.framework.Assert;

import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptormetamodel.Application;
import sculptormetamodel.Entity;
import sculptormetamodel.Module;
import sculptormetamodel.NamedElement;

@SuppressWarnings("unchecked")
public class DefectTest extends TransformationTestBase {

	private static Application app;

	private static XtendFacade xtend;

	@BeforeClass
	public static void setUp() throws Exception {
		initWorkflowContext("workflow-test-defect.mwe");

		EmfRegistryMetaModel metaModel = new EmfRegistryMetaModel();
		xtend = XtendFacade.create("extensions::helper",
				"extensions::dbhelper", "extensions::properties");
		xtend.registerMetaModel(metaModel);

		app = (Application) ctx.get("transformedModel");
	}

	private Module module() {
		return (Module) getNamedElement("order", app.getModules());
	}

	@Test
	public void assertEmpty() {
		
	}
	
	//@Test
	public void assertEntityConstructorParamsOrderConsistent() {

		Entity order = (Entity) this.getNamedElement("Order", module()
				.getDomainObjects());
		Assert.assertNotNull(order);

		List<NamedElement> refs = order.getReferences();

		assertOrderedNames(refs, "status", "history");

		List<NamedElement> params = (List<NamedElement>) xtend.call(
				"getConstructorParameters", new Object[] { order });
		assertOrderedNames(params, "orderId", "status", "history");

	}

	protected Object xtendCall(String method, Object... args) {
		return (List<NamedElement>) xtend.call(method, args);

	}

	protected void assertOrderedNames(List<NamedElement> listOfNamedElements,
			String... expectedNames) {
		Assert.assertEquals(expectedNames.length, listOfNamedElements.size());
		for (int i = 0; i < listOfNamedElements.size(); i++) {
			Assert.assertEquals(expectedNames[i], listOfNamedElements.get(i)
					.getName());
		}
	}

}
