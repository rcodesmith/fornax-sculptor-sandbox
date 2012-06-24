/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import sculptormetamodel.Attribute;
import sculptormetamodel.DomainObject;
import sculptormetamodel.DomainObjectOperation;
import sculptormetamodel.Reference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Referring Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.PropertyReferringWidget#getForOp <em>For Op</em>}</li>
 *   <li>{@link sculptorguimetamodel.PropertyReferringWidget#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.PropertyReferringWidget#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link sculptorguimetamodel.PropertyReferringWidget#getForProperty <em>For Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyReferringWidget()
 * @model
 * @generated
 */
public interface PropertyReferringWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Op</em>' reference.
	 * @see #setForOp(DomainObjectOperation)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyReferringWidget_ForOp()
	 * @model
	 * @generated
	 */
	DomainObjectOperation getForOp();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PropertyReferringWidget#getForOp <em>For Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Op</em>' reference.
	 * @see #getForOp()
	 * @generated
	 */
	void setForOp(DomainObjectOperation value);

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
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyReferringWidget_For()
	 * @model
	 * @generated
	 */
	DomainObject getFor();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PropertyReferringWidget#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(DomainObject value);

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
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyReferringWidget_PropertyPath()
	 * @model
	 * @generated
	 */
	String getPropertyPath();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PropertyReferringWidget#getPropertyPath <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Path</em>' attribute.
	 * @see #getPropertyPath()
	 * @generated
	 */
	void setPropertyPath(String value);

	/**
	 * Returns the value of the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Property</em>' containment reference.
	 * @see #setForProperty(PropertyPathElement)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyReferringWidget_ForProperty()
	 * @model containment="true"
	 * @generated
	 */
	PropertyPathElement getForProperty();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PropertyReferringWidget#getForProperty <em>For Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Property</em>' containment reference.
	 * @see #getForProperty()
	 * @generated
	 */
	void setForProperty(PropertyPathElement value);

} // PropertyReferringWidget
