/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.validation;

import org.eclipse.emf.common.util.EList;
import sculptorguimetamodel.GuiModule;
import sculptormetamodel.DomainObject;

/**
 * A sample validator interface for {@link sculptorguimetamodel.View}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ViewValidator {
	boolean validate();

	boolean validateModule(GuiModule value);

	boolean validateWidgets(EList value);

	boolean validateFor(DomainObject value);

	boolean validateServiceProxies(EList value);

	boolean validateParameters(EList value);

	boolean validateLabel(String value);

	boolean validateServiceDependencies(EList value);
}