package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.ServiceProxy;
import sculptorguimetamodel.ServiceProxyOperation;
import sculptormetamodel.Parameter;

public class GuiServiceProxyTest extends GuiDslTransformationBaseTest {

	@Test
	public void assertServiceProxy() {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getServiceProxies());
		assertNotNull(proxy);
		assertNotNull(proxy.getFor());
		assertNotNull(proxy.getFor().getModule());
		
		GuiModule guiModule = (GuiModule)proxy.eContainer();
		assertNotNull(guiModule);
		
//		assertEquals("blah", guiModule.getBasePackage());
		
		EList ops = proxy.getOperations();
		System.out.println(ops);
		assertEquals(3, ops.size());

		ServiceProxyOperation op = (ServiceProxyOperation)ops.get(0);
		assertNotNull(op);
		
//		System.out.println("Operation params:" + op.getParameters());
		validateServiceOperation(op, "findPersonByName", 1);
		Parameter p1 = (Parameter)op.getParameters().get(0);
		assertEquals("name", p1.getName());
		assertEquals("String", p1.getType());
		
		
		
		ServiceProxyOperation findByDateOp = (ServiceProxyOperation)ops.get(2);
		assertNotNull(findByDateOp);
		validateServiceOperation(findByDateOp, "findByDate", 1);
		
		assertEquals("Person", findByDateOp.getDomainObjectType().getName());
		assertEquals("List", findByDateOp.getCollectionType());
		
		Parameter entryDateParam = (Parameter)findByDateOp.getParameters().get(0);
		assertEquals("entryDate", entryDateParam.getName());
//		assertEquals("java.util.Date", entryDateParam.getType());

	}
	
	
	
	protected void validateServiceOperation(ServiceProxyOperation op, String expectedName, int expectedNumParams) {
		assertEquals(expectedName, op.getName());
		assertEquals(expectedName, op.getFor().getName());
		assertEquals(expectedNumParams, op.getParameters().size());
		
	}

}
