package org.fornax.cartridges.sculptor.framework.gwt.client.util;

public class GwtConvertUtils {

	public static Long convert(String from, Long dummyTo) {
		return (from == null? null : Long.parseLong(from));
	}
}
