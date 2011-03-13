/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptormetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptormetamodel.Enum#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptormetamodel.SculptormetamodelPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends DomainObject {
	/**
     * Returns the value of the '<em><b>Values</b></em>' containment reference list.
     * The list contents are of type {@link sculptormetamodel.EnumValue}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Values</em>' containment reference list.
     * @see sculptormetamodel.SculptormetamodelPackage#getEnum_Values()
     * @model type="sculptormetamodel.EnumValue" containment="true"
     * @generated
     */
	EList getValues();

} // Enum
