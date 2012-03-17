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

import sculptorguimetamodel.ListBoxWidget;
import sculptorguimetamodel.SculptorguimetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Box Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.ListBoxWidgetImpl#getForEnum <em>For Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListBoxWidgetImpl extends PropertyReferringWidgetImpl implements ListBoxWidget {
	/**
	 * The cached value of the '{@link #getForEnum() <em>For Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForEnum()
	 * @generated
	 * @ordered
	 */
	protected sculptormetamodel.Enum forEnum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListBoxWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.LIST_BOX_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sculptormetamodel.Enum getForEnum() {
		if (forEnum != null && forEnum.eIsProxy()) {
			InternalEObject oldForEnum = (InternalEObject)forEnum;
			forEnum = (sculptormetamodel.Enum)eResolveProxy(oldForEnum);
			if (forEnum != oldForEnum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.LIST_BOX_WIDGET__FOR_ENUM, oldForEnum, forEnum));
			}
		}
		return forEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sculptormetamodel.Enum basicGetForEnum() {
		return forEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForEnum(sculptormetamodel.Enum newForEnum) {
		sculptormetamodel.Enum oldForEnum = forEnum;
		forEnum = newForEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.LIST_BOX_WIDGET__FOR_ENUM, oldForEnum, forEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.LIST_BOX_WIDGET__FOR_ENUM:
				if (resolve) return getForEnum();
				return basicGetForEnum();
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
			case SculptorguimetamodelPackage.LIST_BOX_WIDGET__FOR_ENUM:
				setForEnum((sculptormetamodel.Enum)newValue);
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
			case SculptorguimetamodelPackage.LIST_BOX_WIDGET__FOR_ENUM:
				setForEnum((sculptormetamodel.Enum)null);
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
			case SculptorguimetamodelPackage.LIST_BOX_WIDGET__FOR_ENUM:
				return forEnum != null;
		}
		return super.eIsSet(featureID);
	}

} //ListBoxWidgetImpl
