/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import sculptormetamodel.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.ServiceProxy#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.ServiceProxy#getGuiModule <em>Gui Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getServiceProxy()
 * @model
 * @generated
 */
public interface ServiceProxy extends Service {
	/**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(Service)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getServiceProxy_For()
	 * @model required="true"
	 * @generated
	 */
	Service getFor();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.ServiceProxy#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(Service value);

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
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getServiceProxy_GuiModule()
	 * @model
	 * @generated
	 */
	GuiModule getGuiModule();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.ServiceProxy#getGuiModule <em>Gui Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gui Module</em>' reference.
	 * @see #getGuiModule()
	 * @generated
	 */
	void setGuiModule(GuiModule value);

} // ServiceProxy
