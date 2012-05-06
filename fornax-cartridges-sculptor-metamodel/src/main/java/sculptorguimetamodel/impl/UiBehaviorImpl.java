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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import sculptorguimetamodel.BehaviorBinding;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.UiBehavior;
import sculptormetamodel.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.UiBehaviorImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiBehaviorImpl extends NamedElementImpl implements UiBehavior {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.UI_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBindings() {
		if (bindings == null) {
			bindings = new EObjectWithInverseResolvingEList.ManyInverse(BehaviorBinding.class, this, SculptorguimetamodelPackage.UI_BEHAVIOR__BINDINGS, SculptorguimetamodelPackage.BEHAVIOR_BINDING__BEHAVIORS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.UI_BEHAVIOR__BINDINGS:
				return ((InternalEList)getBindings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.UI_BEHAVIOR__BINDINGS:
				return ((InternalEList)getBindings()).basicRemove(otherEnd, msgs);
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
			case SculptorguimetamodelPackage.UI_BEHAVIOR__BINDINGS:
				return getBindings();
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
			case SculptorguimetamodelPackage.UI_BEHAVIOR__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection)newValue);
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
			case SculptorguimetamodelPackage.UI_BEHAVIOR__BINDINGS:
				getBindings().clear();
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
			case SculptorguimetamodelPackage.UI_BEHAVIOR__BINDINGS:
				return bindings != null && !bindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UiBehaviorImpl
