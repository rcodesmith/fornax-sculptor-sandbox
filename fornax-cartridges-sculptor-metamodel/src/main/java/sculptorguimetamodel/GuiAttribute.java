/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import sculptormetamodel.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.GuiAttribute#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiAttribute()
 * @model
 * @generated
 */
public interface GuiAttribute extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(GuiEvent)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiAttribute_Event()
	 * @model required="true"
	 * @generated
	 */
	GuiEvent getEvent();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.GuiAttribute#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(GuiEvent value);

} // GuiAttribute
