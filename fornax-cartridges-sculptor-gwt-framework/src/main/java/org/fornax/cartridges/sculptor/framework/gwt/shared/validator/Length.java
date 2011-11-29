package org.fornax.cartridges.sculptor.framework.gwt.shared.validator;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface Length {
	int max() default Integer.MAX_VALUE;

	int min() default 0;

	String message() default "{validator.length}";
}
