package org.fornax.cartridges.sculptor.framework.errorhandling;

import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.fornax.cartridges.sculptor.framework.errorhandling.annotation.ApplicationException;
import org.fornax.cartridges.sculptor.framework.validation.ValidationUtils;

/**
 * Thrown when the bean has violated one or several of its constraints
 * You can get the violation details in getInvalidValues()
 *
 */
@ApplicationException
public class ValidationException extends SystemException {
    private static final long serialVersionUID = 1L;

    public static final String ERROR_CODE = ValidationException.class.getName();

    private String invalidValuesStr="";
    private ConstraintViolation<?>[] invalidValues;

    public ValidationException(String message) {
        super(ERROR_CODE, message);
    }

    public ValidationException(String errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }

    public ValidationException(String errorCode, String message) {
        super(errorCode, message);
    }

    public void setInvalidValues(Set<ConstraintViolation<?>> invalidValues) {
		this.invalidValues = (ConstraintViolation[])invalidValues.toArray();
	}

    public ConstraintViolation<?>[] getInvalidValues() {
        return invalidValues;
    }

    public Map<String, ConstraintViolation<?>> getInvalidValuesAsMap() {
        return ValidationUtils.getInvalidValuesAsMap(invalidValues);
    }

    @Override
    public String toString() {
        if (invalidValuesStr == null) {
            StringBuilder invValues = new StringBuilder();
            for (int i = 0; i < invalidValues.length; i++) {
                invValues.append(", ").append(invalidValues[i].getPropertyPath()).append("=").append(
                        invalidValues[i].getInvalidValue());
            }
            invalidValuesStr = invValues.length() > 0 ? invValues.substring(2) : "";
        }
        String errorCodeStr = getErrorCode() != null ? "[" + getErrorCode() + "] " : "";
        return errorCodeStr + getMessage() + " (invalid values: " + invalidValuesStr + ")";
    }
}