/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Box Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.ListBoxWidget#getForEnum <em>For Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getListBoxWidget()
 * @model
 * @generated
 */
public interface ListBoxWidget extends PropertyReferringWidget {
	/**
	 * Returns the value of the '<em><b>For Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Enum</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Enum</em>' reference.
	 * @see #setForEnum(sculptormetamodel.Enum)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getListBoxWidget_ForEnum()
	 * @model required="true"
	 * @generated
	 */
	sculptormetamodel.Enum getForEnum();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.ListBoxWidget#getForEnum <em>For Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Enum</em>' reference.
	 * @see #getForEnum()
	 * @generated
	 */
	void setForEnum(sculptormetamodel.Enum value);

} // ListBoxWidget
