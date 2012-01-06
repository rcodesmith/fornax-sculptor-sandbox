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
 * A representation of the model object '<em><b>Gui Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.GuiDto#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiDto#getGuiModule <em>Gui Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiDto()
 * @model
 * @generated
 */
public interface GuiDto extends DomainObject {
	/**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(DomainObject)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiDto_For()
	 * @model
	 * @generated
	 */
	DomainObject getFor();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.GuiDto#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Gui Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sculptorguimetamodel.GuiModule#getDtos <em>Dtos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gui Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gui Module</em>' container reference.
	 * @see #setGuiModule(GuiModule)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiDto_GuiModule()
	 * @see sculptorguimetamodel.GuiModule#getDtos
	 * @model opposite="dtos" transient="false"
	 * @generated
	 */
	GuiModule getGuiModule();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.GuiDto#getGuiModule <em>Gui Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gui Module</em>' container reference.
	 * @see #getGuiModule()
	 * @generated
	 */
	void setGuiModule(GuiModule value);

} // GuiDto
