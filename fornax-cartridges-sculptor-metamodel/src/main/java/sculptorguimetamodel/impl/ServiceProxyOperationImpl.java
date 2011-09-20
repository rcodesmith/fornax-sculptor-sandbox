/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.ServiceProxyOperation;

import sculptormetamodel.ServiceOperation;
import sculptormetamodel.impl.ServiceOperationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Proxy Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.ServiceProxyOperationImpl#getFor <em>For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProxyOperationImpl extends ServiceOperationImpl implements ServiceProxyOperation {
	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected ServiceOperation for_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProxyOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.SERVICE_PROXY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation getFor() {
		if (for_ != null && for_.eIsProxy()) {
			InternalEObject oldFor = (InternalEObject)for_;
			for_ = (ServiceOperation)eResolveProxy(oldFor);
			if (for_ != oldFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.SERVICE_PROXY_OPERATION__FOR, oldFor, for_));
			}
		}
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation basicGetFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(ServiceOperation newFor) {
		ServiceOperation oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.SERVICE_PROXY_OPERATION__FOR, oldFor, for_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.SERVICE_PROXY_OPERATION__FOR:
				if (resolve) return getFor();
				return basicGetFor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SculptorguimetamodelPackage.SERVICE_PROXY_OPERATION__FOR:
				setFor((ServiceOperation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SculptorguimetamodelPackage.SERVICE_PROXY_OPERATION__FOR:
				setFor((ServiceOperation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SculptorguimetamodelPackage.SERVICE_PROXY_OPERATION__FOR:
				return for_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceProxyOperationImpl
