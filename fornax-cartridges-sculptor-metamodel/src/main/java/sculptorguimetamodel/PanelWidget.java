/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import sculptormetamodel.DomainObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.PanelWidget#isDisclosure <em>Disclosure</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPanelWidget()
 * @model
 * @generated
 */
public interface PanelWidget extends WidgetsContainer, PropertyReferringWidget {

	/**
	 * Returns the value of the '<em><b>Disclosure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disclosure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disclosure</em>' attribute.
	 * @see #setDisclosure(boolean)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPanelWidget_Disclosure()
	 * @model
	 * @generated
	 */
	boolean isDisclosure();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PanelWidget#isDisclosure <em>Disclosure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disclosure</em>' attribute.
	 * @see #isDisclosure()
	 * @generated
	 */
	void setDisclosure(boolean value);
} // PanelWidget
