/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.LinkWidget#getToView <em>To View</em>}</li>
 *   <li>{@link sculptorguimetamodel.LinkWidget#getToDestination <em>To Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getLinkWidget()
 * @model
 * @generated
 */
public interface LinkWidget extends PropertyReferringWidget {
	/**
	 * Returns the value of the '<em><b>To View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To View</em>' reference.
	 * @see #setToView(View)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getLinkWidget_ToView()
	 * @model
	 * @generated
	 */
	View getToView();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.LinkWidget#getToView <em>To View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To View</em>' reference.
	 * @see #getToView()
	 * @generated
	 */
	void setToView(View value);

	/**
	 * Returns the value of the '<em><b>To Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Destination</em>' attribute.
	 * @see #setToDestination(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getLinkWidget_ToDestination()
	 * @model
	 * @generated
	 */
	String getToDestination();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.LinkWidget#getToDestination <em>To Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Destination</em>' attribute.
	 * @see #getToDestination()
	 * @generated
	 */
	void setToDestination(String value);

} // LinkWidget
