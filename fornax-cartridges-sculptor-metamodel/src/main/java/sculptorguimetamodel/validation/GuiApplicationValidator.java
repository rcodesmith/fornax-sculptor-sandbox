/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.validation;

import org.eclipse.emf.common.util.EList;

import sculptormetamodel.Application;

/**
 * A sample validator interface for {@link sculptorguimetamodel.GuiApplication}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GuiApplicationValidator {
	boolean validate();

	boolean validateGuiForApplication(Application value);
	boolean validateModules(EList value);
	boolean validateBasePackage(String value);
}