/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.common.util.EList;
import sculptormetamodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.GuiEvent#getModule <em>Module</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiEvent#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiEvent()
 * @model
 * @generated
 */
public interface GuiEvent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(GuiModule)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiEvent_Module()
	 * @model
	 * @generated
	 */
	GuiModule getModule();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.GuiEvent#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(GuiModule value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link sculptorguimetamodel.GuiAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiEvent_Attributes()
	 * @model type="sculptorguimetamodel.GuiAttribute" containment="true"
	 * @generated
	 */
	EList getAttributes();

} // GuiEvent
