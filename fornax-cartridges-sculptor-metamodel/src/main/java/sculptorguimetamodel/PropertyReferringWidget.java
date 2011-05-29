/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Referring Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
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
	 * Returns the value of the '<em><b>For Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Property</em>' reference.
	 * @see #setForProperty(PropertyReference)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPropertyReferringWidget_ForProperty()
	 * @model
	 * @generated
	 */
	PropertyReference getForProperty();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PropertyReferringWidget#getForProperty <em>For Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Property</em>' reference.
	 * @see #getForProperty()
	 * @generated
	 */
	void setForProperty(PropertyReference value);

} // PropertyReferringWidget
