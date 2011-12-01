package org.fornax.cartridges.sculptor.framework.gwt.server;

import org.junit.Assert;
import org.junit.Test;


public class GwtMappingUtilsTest {

	public static class Foo {
		
	}
	
	public static class Bar extends Foo {
		
	}
	
	public static class FooBar extends Bar {
		
	}

	public static class FooBarPrime extends FooBar {
		
	}
	
	public static class Donkey {
		
	}

	public static String mapFromDomain(Foo foo) {
		return "Foo";
	}
	
	public static String mapFromDomain(Bar bar) {
		return "Bar";
	}
	
	public static String mapFromDomain(FooBar fooBar) {
		return "FooBar";
	}

	public static String mapFromDomain(Donkey donkey) {
		return "Donkey";
	}

	
	@Test
	public void assertToDomainDispatchMultipleBaseClass() {
		String res = (String)GwtMappingUtils.dispatchToMapFn(GwtMappingUtilsTest.class, "mapFromDomain", new Bar());
		Assert.assertEquals("Bar", res);

		res = (String)GwtMappingUtils.dispatchToMapFn(GwtMappingUtilsTest.class, "mapFromDomain", new FooBar());
		Assert.assertEquals("FooBar", res);
	}

	@Test
	public void assertToDomainSimple() {
		String res = (String)GwtMappingUtils.dispatchToMapFn(GwtMappingUtilsTest.class, "mapFromDomain", new Donkey());
		Assert.assertEquals("Donkey", res);
	}

	@Test
	public void assertUsesDeclaredType() {
//		String res = (String)GwtMappingUtils.dispatchToMapFn(GwtMappingUtilsTest.class, "mapFromDomain", new FooBarPrime());
//		Assert.assertEquals("FooBar", res);		
	}
	
	
}
