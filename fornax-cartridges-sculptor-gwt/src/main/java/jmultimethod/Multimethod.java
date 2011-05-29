package jmultimethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Multimethod {

	protected String name;
	protected final ArrayList<Method> methods = new ArrayList<Method>();
	protected final MethodComparator methodComparator = new MethodComparator();

	public Multimethod(String name, Class... classes) {
		this.name = name;
		for(Class c: classes) {
			add(c);
		}
	}
	
	public void add(Class c) {
		for(Method m: c.getMethods()) {
			for(Annotation ma: m.getAnnotations()) {
				if(ma instanceof Multi) {
					Multi g = (Multi) ma;
					if(this.name.equals(g.value())) {
						methods.add(m);
					}
				}
			}
		}
		sort();
	}
		      
	protected void sort() {
		Method[] a = new Method[methods.size()];
		methods.toArray(a);
		Arrays.sort(a, methodComparator);
		methods.clear();
		for(Method m: a) {
			methods.add(m);
		}
	}
	
	protected class MethodComparator implements Comparator<Method> {
		public int compare(Method l, Method r) {
			// most specific methods first 
			Class[] lc = l.getParameterTypes();
			Class[] rc = r.getParameterTypes();
			for(int i = 0; i < lc.length; i++) {
				String lv = value(l, i);
				String rv = value(r, i);
				if(lv == null) {
					if(rv != null) {
						return 1;
					}
				}
				if(lc[i].isAssignableFrom(rc[i])) {
					return 1;
				}
			}
			return -1;
		}
	}

	protected String value(Method method, int arg) {
		Annotation[] a = method.getParameterAnnotations()[arg];
		for(Annotation p: a) {
			if(p instanceof V) {
				V v = (V) p;
				return v.value();
			}
		}
		return null;
	}
	
	protected boolean isApplicable(Method method, Object... args) {
		Class[] c = method.getParameterTypes();
		for(int i = 0; i < c.length; i++) {
			// must be instanceof and equal to annotated value if present 
			if(c[i].isInstance(args[i])) {
				String v = value(method, i);
				if(v != null && !v.equals(args[i])) {
					return false;
				}
			} else {
				if(args[i] != null || !Object.class.equals(c[i])) {
					return false;
				}
			}
		}
		return true;
	}
	
	public Object invoke(Object self, Object... args) {
		Method m = null; // first applicable method (most specific)
		for(Method method: methods) {
			if(isApplicable(method, args)) {
				m = method;
				break;
			}
		}
		if(m == null) {
			throw new RuntimeException("No applicable method '" + name + "'.");
		}
		try {
			return m.invoke(self, args);
		} catch (Exception e) {
			throw new RuntimeException("Method invocation failed '" + name + "'.");
		}
	}
}
