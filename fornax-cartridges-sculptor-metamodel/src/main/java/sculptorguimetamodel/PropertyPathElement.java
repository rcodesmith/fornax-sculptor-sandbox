/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.ecore.EObject;

import sculptormetamodel.Attribute;
import sculptormetamodel.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.PropertyPathElement#getRemainingPath <em>Remaining Path</em>}</li>
 *   <li>{@link sculptorguimetamodel.PropertyPathElement#getForAttribute <em>For Attribute</em>}</li>
 *   <li>{@link sculptorguimetamodel.PropertyPathElement#getForReference <em>For Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyPathElement()
 * @model
 * @generated
 */
public interface PropertyPathElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Remaining Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Path</em>' containment reference.
	 * @see #setRemainingPath(PropertyPathElement)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyPathElement_RemainingPath()
	 * @model containment="true"
	 * @generated
	 */
	PropertyPathElement getRemainingPath();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PropertyPathElement#getRemainingPath <em>Remaining Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Path</em>' containment reference.
	 * @see #getRemainingPath()
	 * @generated
	 */
	void setRemainingPath(PropertyPathElement value);

	/**
	 * Returns the value of the '<em><b>For Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Attribute</em>' reference.
	 * @see #setForAttribute(Attribute)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyPathElement_ForAttribute()
	 * @model
	 * @generated
	 */
	Attribute getForAttribute();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PropertyPathElement#getForAttribute <em>For Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Attribute</em>' reference.
	 * @see #getForAttribute()
	 * @generated
	 */
	void setForAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>For Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Reference</em>' reference.
	 * @see #setForReference(Reference)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyPathElement_ForReference()
	 * @model
	 * @generated
	 */
	Reference getForReference();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PropertyPathElement#getForReference <em>For Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Reference</em>' reference.
	 * @see #getForReference()
	 * @generated
	 */
	void setForReference(Reference value);

} // PropertyPathElement
