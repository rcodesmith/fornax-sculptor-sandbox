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

} // ServiceProxy
