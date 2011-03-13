/*
 * Copyright 2007 The Fornax Project Team, including the original
 * author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fornax.cartridges.sculptor.framework.validation.validator;

import java.util.Map;

import org.fornax.cartridges.sculptor.framework.errorhandling.ValidationException;
import org.fornax.cartridges.sculptor.framework.validation.ValidationUtils;
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidStateException;
import org.hibernate.validator.InvalidValue;


/**
 * Base class for bean validation. Adds some methods to the Hibernate ClassValidator
 *
 * @author Oliver Ringel
 *
 */
public class DomainObjectValidator<T> extends ClassValidator<T> {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 *
	 * @param beanClass
	 */
	public DomainObjectValidator(Class<T> beanClass) {
		super(beanClass);
	}

	/**
	 * Throws an InvalidDomainObjectException if bean validation fails
	 *
	 * @param bean bean to validate
	 */
	@Override
	public void assertValid(T bean) {
	    try {
	        super.assertValid(bean);
	    } catch (InvalidStateException e) {
	        ValidationException ex = new ValidationException(e.getMessage());
	        ex.setInvalidValues(e.getInvalidValues());
	        throw ex;
	    }
	}

	/**
	 * Handling invalid values as map
	 *
	 * @param bean bean to validate
	 * @return map containing invalid properties
	 */
	public Map<String, InvalidValue> getInvalidValuesAsMap(T bean) {
		return ValidationUtils.getInvalidValuesAsMap(getInvalidValues(bean));
	}
}
