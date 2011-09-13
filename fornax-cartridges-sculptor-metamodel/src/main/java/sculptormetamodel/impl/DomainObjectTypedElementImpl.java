/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptormetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptormetamodel.DomainObject;
import sculptormetamodel.DomainObjectTypedElement;
import sculptormetamodel.SculptormetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptormetamodel.impl.DomainObjectTypedElementImpl#getDomainObjectType <em>Domain Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainObjectTypedElementImpl extends TypedElementImpl implements DomainObjectTypedElement {
    /**
	 * The cached value of the '{@link #getDomainObjectType() <em>Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectType()
	 * @generated
	 * @ordered
	 */
	protected DomainObject domainObjectType;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectTypedElementImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptormetamodelPackage.Literals.DOMAIN_OBJECT_TYPED_ELEMENT;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject getDomainObjectType() {
		if (domainObjectType != null && domainObjectType.eIsProxy()) {
			InternalEObject oldDomainObjectType = (InternalEObject)domainObjectType;
			domainObjectType = (DomainObject)eResolveProxy(oldDomainObjectType);
			if (domainObjectType != oldDomainObjectType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE, oldDomainObjectType, domainObjectType));
			}
		}
		return domainObjectType;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetDomainObjectType() {
		return domainObjectType;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainObjectType(DomainObject newDomainObjectType) {
		DomainObject oldDomainObjectType = domainObjectType;
		domainObjectType = newDomainObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE, oldDomainObjectType, domainObjectType));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE:
				if (resolve) return getDomainObjectType();
				return basicGetDomainObjectType();
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
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE:
				setDomainObjectType((DomainObject)newValue);
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
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE:
				setDomainObjectType((DomainObject)null);
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
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE:
				return domainObjectType != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainObjectTypedElementImpl