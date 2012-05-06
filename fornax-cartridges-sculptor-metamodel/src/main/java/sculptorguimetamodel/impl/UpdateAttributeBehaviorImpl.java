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
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.UpdateAttributeBehavior;
import sculptormetamodel.DomainObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Attribute Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.UpdateAttributeBehaviorImpl#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.UpdateAttributeBehaviorImpl#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateAttributeBehaviorImpl extends UiBehaviorImpl implements UpdateAttributeBehavior {
	/**
	 * The default value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String propertyPath = PROPERTY_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected DomainObject targetClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateAttributeBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.UPDATE_ATTRIBUTE_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyPath() {
		return propertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyPath(String newPropertyPath) {
		String oldPropertyPath = propertyPath;
		propertyPath = newPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__PROPERTY_PATH, oldPropertyPath, propertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject getTargetClass() {
		if (targetClass != null && targetClass.eIsProxy()) {
			InternalEObject oldTargetClass = (InternalEObject)targetClass;
			targetClass = (DomainObject)eResolveProxy(oldTargetClass);
			if (targetClass != oldTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__TARGET_CLASS, oldTargetClass, targetClass));
			}
		}
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(DomainObject newTargetClass) {
		DomainObject oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__PROPERTY_PATH:
				return getPropertyPath();
			case SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
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
			case SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__PROPERTY_PATH:
				setPropertyPath((String)newValue);
				return;
			case SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__TARGET_CLASS:
				setTargetClass((DomainObject)newValue);
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
			case SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__PROPERTY_PATH:
				setPropertyPath(PROPERTY_PATH_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__TARGET_CLASS:
				setTargetClass((DomainObject)null);
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
			case SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__PROPERTY_PATH:
				return PROPERTY_PATH_EDEFAULT == null ? propertyPath != null : !PROPERTY_PATH_EDEFAULT.equals(propertyPath);
			case SculptorguimetamodelPackage.UPDATE_ATTRIBUTE_BEHAVIOR__TARGET_CLASS:
				return targetClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propertyPath: ");
		result.append(propertyPath);
		result.append(')');
		return result.toString();
	}

} //UpdateAttributeBehaviorImpl
