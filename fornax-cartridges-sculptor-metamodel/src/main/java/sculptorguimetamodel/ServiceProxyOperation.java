/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.ecore.EObject;

import sculptormetamodel.ServiceOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Proxy Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.ServiceProxyOperation#getFor <em>For</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getServiceProxyOperation()
 * @model
 * @generated
 */
public interface ServiceProxyOperation extends ServiceOperation {
	/**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(ServiceOperation)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getServiceProxyOperation_For()
	 * @model required="true"
	 * @generated
	 */
	ServiceOperation getFor();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.ServiceProxyOperation#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(ServiceOperation value);

} // ServiceProxyOperation
