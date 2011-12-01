package org.fornax.cartridges.sculptor.framework.gwt.server;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GwtMappingUtils {

	public static Object dispatchToMapFn(Class<?> cls, String methodName, Object obj) {
		if(obj == null) {
			return null;
		}
		try {
			Method method = cls.getMethod(methodName, obj.getClass());
			return method.invoke(null, obj);
		} catch (SecurityException e) {
			throw new IllegalArgumentException("Error dispatching to method " + methodName, e);
		} catch (NoSuchMethodException e) {
			throw new IllegalArgumentException("Error dispatching to method " + methodName, e);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Error dispatching to method " + methodName, e);
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException("Error dispatching to method " + methodName, e);
		} catch (InvocationTargetException e) {
			throw new IllegalArgumentException("Error dispatching to method " + methodName, e);
		}
	}
}
