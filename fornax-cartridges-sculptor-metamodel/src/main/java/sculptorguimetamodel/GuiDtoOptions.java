/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import sculptormetamodel.NamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Dto Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.GuiDtoOptions#isSkip <em>Skip</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiDtoOptions()
 * @model
 * @generated
 */
public interface GuiDtoOptions extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Skip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip</em>' attribute.
	 * @see #setSkip(boolean)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiDtoOptions_Skip()
	 * @model
	 * @generated
	 */
	boolean isSkip();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.GuiDtoOptions#isSkip <em>Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip</em>' attribute.
	 * @see #isSkip()
	 * @generated
	 */
	void setSkip(boolean value);

} // GuiDtoOptions
