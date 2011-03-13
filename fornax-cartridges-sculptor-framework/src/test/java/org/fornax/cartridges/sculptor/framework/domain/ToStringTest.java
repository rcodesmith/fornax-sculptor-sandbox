package org.fornax.cartridges.sculptor.framework.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class ToStringTest {

    @Test
    public void shouldIncludeInt() {
        String str = new TestObj().toString();
        assertTrue(str.contains("1001"));
    }
    
    @Test
    public void shouldIncludeInteger() {
        String str = new TestObj().toString();
        assertTrue(str.contains("1002"));
    }
    
    @Test
    public void shouldIncludePrimitiveDouble() {
        String str = new TestObj().toString();
        assertTrue(str.contains("1003.0"));
    }
    
    @Test
    public void shouldNotIncludeSet() {
        String str = new TestObj().toString();
        assertFalse(str.contains("setValue"));
    }

    protected static class TestObj extends AbstractDomainObject {
        private static final long serialVersionUID = 1L;

        protected int intPrimitiveValue = 1001;
        protected Integer integerValue = 1002;
        protected double doublePrimitiveValue = 1003.0;
        protected Double doubleValue = 1004.0;
        protected Set<Object> setValue = new HashSet<Object>(); 
    }
}
