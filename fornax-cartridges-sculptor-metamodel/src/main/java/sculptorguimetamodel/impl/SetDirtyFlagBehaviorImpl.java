/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.SetDirtyFlagBehavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Dirty Flag Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.SetDirtyFlagBehaviorImpl#isMarkSpecificObj <em>Mark Specific Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetDirtyFlagBehaviorImpl extends UiBehaviorImpl implements SetDirtyFlagBehavior {
	/**
	 * The default value of the '{@link #isMarkSpecificObj() <em>Mark Specific Obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkSpecificObj()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARK_SPECIFIC_OBJ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMarkSpecificObj() <em>Mark Specific Obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkSpecificObj()
	 * @generated
	 * @ordered
	 */
	protected boolean markSpecificObj = MARK_SPECIFIC_OBJ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetDirtyFlagBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.SET_DIRTY_FLAG_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMarkSpecificObj() {
		return markSpecificObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkSpecificObj(boolean newMarkSpecificObj) {
		boolean oldMarkSpecificObj = markSpecificObj;
		markSpecificObj = newMarkSpecificObj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.SET_DIRTY_FLAG_BEHAVIOR__MARK_SPECIFIC_OBJ, oldMarkSpecificObj, markSpecificObj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.SET_DIRTY_FLAG_BEHAVIOR__MARK_SPECIFIC_OBJ:
				return isMarkSpecificObj() ? Boolean.TRUE : Boolean.FALSE;
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
			case SculptorguimetamodelPackage.SET_DIRTY_FLAG_BEHAVIOR__MARK_SPECIFIC_OBJ:
				setMarkSpecificObj(((Boolean)newValue).booleanValue());
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
			case SculptorguimetamodelPackage.SET_DIRTY_FLAG_BEHAVIOR__MARK_SPECIFIC_OBJ:
				setMarkSpecificObj(MARK_SPECIFIC_OBJ_EDEFAULT);
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
			case SculptorguimetamodelPackage.SET_DIRTY_FLAG_BEHAVIOR__MARK_SPECIFIC_OBJ:
				return markSpecificObj != MARK_SPECIFIC_OBJ_EDEFAULT;
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
		result.append(" (markSpecificObj: ");
		result.append(markSpecificObj);
		result.append(')');
		return result.toString();
	}

} //SetDirtyFlagBehaviorImpl
