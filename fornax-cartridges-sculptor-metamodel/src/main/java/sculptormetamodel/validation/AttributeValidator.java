/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptormetamodel.validation;


/**
 * A sample validator interface for {@link sculptormetamodel.Attribute}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AttributeValidator {
	boolean validate();

	boolean validateChangeable(boolean value);
	boolean validateDatabaseType(String value);
	boolean validateNullable(boolean value);
	boolean validateNaturalKey(boolean value);
	boolean validateVisibility(String value);
	boolean validateRequired(boolean value);
	boolean validateLength(String value);
	boolean validateIndex(boolean value);
	boolean validateDatabaseColumn(String value);
	boolean validateValidate(String value);
	boolean validateTransient(boolean value);
}
