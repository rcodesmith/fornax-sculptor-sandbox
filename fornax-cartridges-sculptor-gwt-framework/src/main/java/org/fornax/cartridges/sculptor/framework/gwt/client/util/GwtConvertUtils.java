package org.fornax.cartridges.sculptor.framework.gwt.client.util;

public class GwtConvertUtils {

	public static Long convert(String from, Long dummyTo) {
		return (from == null? null : Long.parseLong(from));
	}
	
	public static String toString(Long val) {
		return (val == null? null : val.toString());
	}
	
	public static String toString(Boolean val) {
		return (val == null? null : val.toString());		
	}

	public static String toString(String val) {
		return val;
	}
}
