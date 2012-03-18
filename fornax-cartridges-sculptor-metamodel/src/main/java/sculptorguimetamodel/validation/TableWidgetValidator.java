/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.validation;

import org.eclipse.emf.common.util.EList;
import sculptorguimetamodel.TableColumn;
import sculptormetamodel.DomainObject;


/**
 * A sample validator interface for {@link sculptorguimetamodel.TableWidget}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TableWidgetValidator {
	boolean validate();

	boolean validateFor(DomainObject value);

	boolean validateColumns(EList value);

	boolean validatePaging(boolean value);

	boolean validateSize(int value);

	boolean validateColumns(TableColumn value);

}
