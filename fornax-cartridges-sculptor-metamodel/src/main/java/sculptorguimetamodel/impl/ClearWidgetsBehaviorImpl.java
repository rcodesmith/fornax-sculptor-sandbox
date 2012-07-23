/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sculptorguimetamodel.ClearWidgetsBehavior;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clear Widgets Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.ClearWidgetsBehaviorImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClearWidgetsBehaviorImpl extends UiBehaviorImpl implements ClearWidgetsBehavior {
	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList widgets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearWidgetsBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.CLEAR_WIDGETS_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWidgets() {
		if (widgets == null) {
			widgets = new EObjectResolvingEList(Widget.class, this, SculptorguimetamodelPackage.CLEAR_WIDGETS_BEHAVIOR__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.CLEAR_WIDGETS_BEHAVIOR__WIDGETS:
				return getWidgets();
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
			case SculptorguimetamodelPackage.CLEAR_WIDGETS_BEHAVIOR__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection)newValue);
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
			case SculptorguimetamodelPackage.CLEAR_WIDGETS_BEHAVIOR__WIDGETS:
				getWidgets().clear();
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
			case SculptorguimetamodelPackage.CLEAR_WIDGETS_BEHAVIOR__WIDGETS:
				return widgets != null && !widgets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClearWidgetsBehaviorImpl
