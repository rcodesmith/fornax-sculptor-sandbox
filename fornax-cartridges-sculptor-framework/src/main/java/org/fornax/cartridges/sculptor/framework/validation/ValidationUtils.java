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

package org.fornax.cartridges.sculptor.framework.validation;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.validator.InvalidValue;


/**
 * Utility class for bean validation.
 *
 * @author Oliver Ringel
 *
 */
public class ValidationUtils {
	/**
	 * Handling invalid values as map
	 *
	 * @param bean bean to validate
	 * @return map containing invalid properties
	 */
	public static Map<String, InvalidValue> getInvalidValuesAsMap(InvalidValue[] invalidValues)
	{
		Map<String, InvalidValue> invalidValuesMap = new HashMap<String, InvalidValue>();
		for (InvalidValue invalidValue : invalidValues) {
			invalidValuesMap.put(invalidValue.getPropertyPath(), invalidValue);
		}
		return invalidValuesMap;
	}
}
