/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Message Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.DisplayMessageBehavior#getMessage <em>Message</em>}</li>
 *   <li>{@link sculptorguimetamodel.DisplayMessageBehavior#isCancelable <em>Cancelable</em>}</li>
 *   <li>{@link sculptorguimetamodel.DisplayMessageBehavior#getMessageId <em>Message Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getDisplayMessageBehavior()
 * @model
 * @generated
 */
public interface DisplayMessageBehavior extends UiBehavior {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getDisplayMessageBehavior_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.DisplayMessageBehavior#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Cancelable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancelable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancelable</em>' attribute.
	 * @see #setCancelable(boolean)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getDisplayMessageBehavior_Cancelable()
	 * @model
	 * @generated
	 */
	boolean isCancelable();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.DisplayMessageBehavior#isCancelable <em>Cancelable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancelable</em>' attribute.
	 * @see #isCancelable()
	 * @generated
	 */
	void setCancelable(boolean value);

	/**
	 * Returns the value of the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Id</em>' attribute.
	 * @see #setMessageId(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getDisplayMessageBehavior_MessageId()
	 * @model
	 * @generated
	 */
	String getMessageId();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.DisplayMessageBehavior#getMessageId <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id</em>' attribute.
	 * @see #getMessageId()
	 * @generated
	 */
	void setMessageId(String value);

} // DisplayMessageBehavior
