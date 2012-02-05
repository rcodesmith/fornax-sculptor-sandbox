package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Test;

import sculptorguimetamodel.GuiCommand;
import sculptorguimetamodel.GuiDto;
import sculptorguimetamodel.ServiceProxy;
import sculptorguimetamodel.ServiceProxyOperation;
import sculptorguimetamodel.StubModule;
import sculptormetamodel.Parameter;

public class GuiServiceProxyTest extends GuiDslTransformationBaseTest {

	@Test
	public void assertServiceProxy() {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getStubModule().getServices());
		assertNotNull(proxy);
		assertNotNull(proxy.getFor());
		assertNotNull(proxy.getFor().getModule());
		
		assertNotNull(proxy.getModule());
		Assert.assertSame(personModule().getStubModule(), proxy.getModule());
		
		assertNotNull(proxy.getGuiModule());
		Assert.assertSame(proxy.getGuiModule(), personModule());
		
//		GuiModule guiModule = (GuiModule)proxy.eContainer();
//		assertNotNull(guiModule);
		
		EList ops = proxy.getOperations();
		assertEquals(5, ops.size());

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
		
		assertNotNull(findByDateOp.getDomainObjectType());
		assertEquals("Person", findByDateOp.getDomainObjectType().getName());
		Assert.assertTrue(findByDateOp.getDomainObjectType() instanceof GuiDto);
		
		assertEquals("List", findByDateOp.getCollectionType());
		
		Parameter entryDateParam = (Parameter)findByDateOp.getParameters().get(0);
		assertEquals("entryDate", entryDateParam.getName());
//		assertEquals("java.util.Date", entryDateParam.getType());

		
		ServiceProxyOperation sendOp = (ServiceProxyOperation)ops.get(4);
		assertNotNull(sendOp);
		validateServiceOperation(sendOp, "send", 2);
		
		Parameter fromParam = (Parameter)sendOp.getParameters().get(0);
		assertNotNull(fromParam);
		assertEquals("from", fromParam.getName());
		assertEquals("String", fromParam.getType());

		Parameter cmdParam = (Parameter)sendOp.getParameters().get(1);
		assertNotNull(cmdParam);
		assertEquals("cmd", cmdParam.getName());
		assertNotNull(cmdParam.getDomainObjectType());
		assertEquals("CreatePersonCmd", cmdParam.getDomainObjectType().getName());
		
		// Make sure same object as can be found in stub module
		GuiCommand createPersonCmd = (GuiCommand)getNamedElement("CreatePersonCmd", personModule().getStubModule().getDomainObjects());
		Assert.assertSame(createPersonCmd, cmdParam.getDomainObjectType());
		assertNotNull(createPersonCmd.getExtends());
		assertEquals("PersonCmd", createPersonCmd.getExtends().getName());
//		// And that extended base class should also be in StubModule
//		// Some of these tests should go in a GuiCommand-specific area rather than in service proxy
//		GuiCommand personCmd = (GuiCommand)getNamedElement("PersonCmd", personModule().getStubModule().getDomainObjects());
//		Assert.assertSame(personCmd, createPersonCmd.getExtends());
		
	}
	
	@Test
	public void assertMediaServiceProxy() {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("MediaService", mediaModule()
				.getStubModule().getServices());
		assertNotNull(proxy);
		StubModule stubModule = (StubModule)proxy.getModule();
		assertNotNull(stubModule);
		Assert.assertSame(stubModule, proxy.getModule());
		
		assertNotNull(stubModule.getGuiModule());
		Assert.assertSame(stubModule.getGuiModule(), mediaModule());
		
		// Following will be null because stub module contained in GuiModule, not Application
		//assertNotNull(proxy.getModule().getApplication());
		
	}
	
	@Test
	public void assertServiceProxyGuiDtoParam() {
		ServiceProxy proxy = (ServiceProxy) getNamedElement("PersonService", personModule()
				.getStubModule().getServices());
		
		ServiceProxyOperation op = (ServiceProxyOperation)getNamedElement("findRelatedPeople",
				proxy.getOperations());
		
		assertNotNull(op);
		assertEquals(1, op.getParameters().size());
		Parameter param = (Parameter)op.getParameters().get(0);
		Assert.assertTrue(param.getDomainObjectType() instanceof GuiDto);
		

	}
	
	
	protected void validateServiceOperation(ServiceProxyOperation op, String expectedName, int expectedNumParams) {
		assertEquals(expectedName, op.getName());
		assertEquals(expectedName, op.getFor().getName());
		assertEquals(expectedNumParams, op.getParameters().size());
		
	}

}
