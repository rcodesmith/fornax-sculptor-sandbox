/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Popup Panel Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.PopupPanelBehavior#getView <em>View</em>}</li>
 *   <li>{@link sculptorguimetamodel.PopupPanelBehavior#getPanelName <em>Panel Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPopupPanelBehavior()
 * @model
 * @generated
 */
public interface PopupPanelBehavior extends UiBehavior {
	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(View)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPopupPanelBehavior_View()
	 * @model
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PopupPanelBehavior#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

	/**
	 * Returns the value of the '<em><b>Panel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Name</em>' attribute.
	 * @see #setPanelName(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPopupPanelBehavior_PanelName()
	 * @model
	 * @generated
	 */
	String getPanelName();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PopupPanelBehavior#getPanelName <em>Panel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Name</em>' attribute.
	 * @see #getPanelName()
	 * @generated
	 */
	void setPanelName(String value);

} // PopupPanelBehavior
