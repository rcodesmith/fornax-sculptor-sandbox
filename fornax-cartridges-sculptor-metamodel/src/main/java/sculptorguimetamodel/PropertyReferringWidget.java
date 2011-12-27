/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import sculptormetamodel.Attribute;
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
 *   <li>{@link sculptorguimetamodel.PropertyReferringWidget#getForAttribute <em>For Attribute</em>}</li>
 *   <li>{@link sculptorguimetamodel.PropertyReferringWidget#getForReference <em>For Reference</em>}</li>
 *   <li>{@link sculptorguimetamodel.PropertyReferringWidget#getForOp <em>For Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyReferringWidget()
 * @model
 * @generated
 */
public interface PropertyReferringWidget extends Widget {
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
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyReferringWidget_ForAttribute()
	 * @model
	 * @generated
	 */
	Attribute getForAttribute();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PropertyReferringWidget#getForAttribute <em>For Attribute</em>}' reference.
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
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyReferringWidget_ForReference()
	 * @model
	 * @generated
	 */
	Reference getForReference();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PropertyReferringWidget#getForReference <em>For Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Reference</em>' reference.
	 * @see #getForReference()
	 * @generated
	 */
	void setForReference(Reference value);

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

} // PropertyReferringWidget
