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
 *   <li>{@link sculptorguimetamodel.PanelWidget#getFor <em>For</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPanelWidget()
 * @model
 * @generated
 */
public interface PanelWidget extends Widget, WidgetsContainer {

	/**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(DomainObject)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPanelWidget_For()
	 * @model
	 * @generated
	 */
	DomainObject getFor();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PanelWidget#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(DomainObject value);
} // PanelWidget
