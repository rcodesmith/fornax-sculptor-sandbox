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
 * A representation of the model object '<em><b>Gui Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.GuiEvent#getGuiModule <em>Gui Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiEvent()
 * @model
 * @generated
 */
public interface GuiEvent extends DomainObject {

	/**
	 * Returns the value of the '<em><b>Gui Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sculptorguimetamodel.GuiModule#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gui Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gui Module</em>' container reference.
	 * @see #setGuiModule(GuiModule)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiEvent_GuiModule()
	 * @see sculptorguimetamodel.GuiModule#getEvents
	 * @model opposite="events" required="true" transient="false"
	 * @generated
	 */
	GuiModule getGuiModule();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.GuiEvent#getGuiModule <em>Gui Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gui Module</em>' container reference.
	 * @see #getGuiModule()
	 * @generated
	 */
	void setGuiModule(GuiModule value);
} // GuiEvent
