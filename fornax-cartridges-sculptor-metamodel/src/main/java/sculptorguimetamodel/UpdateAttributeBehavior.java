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
 * A representation of the model object '<em><b>Update Attribute Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.UpdateAttributeBehavior#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link sculptorguimetamodel.UpdateAttributeBehavior#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getUpdateAttributeBehavior()
 * @model
 * @generated
 */
public interface UpdateAttributeBehavior extends UiBehavior {

	/**
	 * Returns the value of the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Path</em>' attribute.
	 * @see #setPropertyPath(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getUpdateAttributeBehavior_PropertyPath()
	 * @model
	 * @generated
	 */
	String getPropertyPath();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.UpdateAttributeBehavior#getPropertyPath <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Path</em>' attribute.
	 * @see #getPropertyPath()
	 * @generated
	 */
	void setPropertyPath(String value);

	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class</em>' reference.
	 * @see #setTargetClass(DomainObject)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getUpdateAttributeBehavior_TargetClass()
	 * @model
	 * @generated
	 */
	DomainObject getTargetClass();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.UpdateAttributeBehavior#getTargetClass <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' reference.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(DomainObject value);
} // UpdateAttributeBehavior
