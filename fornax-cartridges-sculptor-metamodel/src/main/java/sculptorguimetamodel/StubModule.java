/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import sculptormetamodel.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stub Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.StubModule#getStubFor <em>Stub For</em>}</li>
 *   <li>{@link sculptorguimetamodel.StubModule#getGuiModule <em>Gui Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getStubModule()
 * @model
 * @generated
 */
public interface StubModule extends Module {
	/**
	 * Returns the value of the '<em><b>Stub For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stub For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stub For</em>' reference.
	 * @see #setStubFor(Module)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getStubModule_StubFor()
	 * @model
	 * @generated
	 */
	Module getStubFor();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.StubModule#getStubFor <em>Stub For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stub For</em>' reference.
	 * @see #getStubFor()
	 * @generated
	 */
	void setStubFor(Module value);

	/**
	 * Returns the value of the '<em><b>Gui Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gui Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gui Module</em>' reference.
	 * @see #setGuiModule(GuiModule)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getStubModule_GuiModule()
	 * @model required="true"
	 * @generated
	 */
	GuiModule getGuiModule();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.StubModule#getGuiModule <em>Gui Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gui Module</em>' reference.
	 * @see #getGuiModule()
	 * @generated
	 */
	void setGuiModule(GuiModule value);

} // StubModule
