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

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * adds support for Joda-Time to built-in future validator
 * 
 */
public class PastValidator implements ConstraintValidator<Past, Object>, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public void initialize(Past parameters) {
    }

    /**
     * add validation of LodalDate, DateTime
     */
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null)
            return true;
        if (value instanceof Date) {
            return ((Date) value).before(new Date());
        } else if (value instanceof Calendar) {
            return ((Calendar) value).before(Calendar.getInstance());
        } else if (value instanceof LocalDate) {
            return ((LocalDate) value).isBefore(new LocalDate(new Date()));
        } else if (value instanceof DateTime) {
            return ((DateTime) value).isBefore(new DateTime(new Date()));
        } else {
            return false;
        }
    }

}
