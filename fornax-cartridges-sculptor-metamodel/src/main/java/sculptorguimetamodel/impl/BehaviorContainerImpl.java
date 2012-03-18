/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sculptorguimetamodel.BehaviorContainer;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.UiBehavior;
import sculptorguimetamodel.UiCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.BehaviorContainerImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.BehaviorContainerImpl#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorContainerImpl extends EObjectImpl implements BehaviorContainer {
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList conditions;

	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList behaviors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.BEHAVIOR_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList(UiCondition.class, this, SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList(UiBehavior.class, this, SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__CONDITIONS:
				return ((InternalEList)getConditions()).basicRemove(otherEnd, msgs);
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__BEHAVIORS:
				return ((InternalEList)getBehaviors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__CONDITIONS:
				return getConditions();
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__BEHAVIORS:
				return getBehaviors();
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
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection)newValue);
				return;
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection)newValue);
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
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__CONDITIONS:
				getConditions().clear();
				return;
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__BEHAVIORS:
				getBehaviors().clear();
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
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorContainerImpl
