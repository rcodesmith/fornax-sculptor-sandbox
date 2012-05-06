/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sculptorguimetamodel.BehaviorBinding;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.UiBehavior;
import sculptorguimetamodel.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.BehaviorBindingImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.BehaviorBindingImpl#getWidget <em>Widget</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorBindingImpl extends EObjectImpl implements BehaviorBinding {
	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList behaviors;

	/**
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected Widget widget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.BEHAVIOR_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectWithInverseResolvingEList.ManyInverse(UiBehavior.class, this, SculptorguimetamodelPackage.BEHAVIOR_BINDING__BEHAVIORS, SculptorguimetamodelPackage.UI_BEHAVIOR__BINDINGS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget getWidget() {
		if (widget != null && widget.eIsProxy()) {
			InternalEObject oldWidget = (InternalEObject)widget;
			widget = (Widget)eResolveProxy(oldWidget);
			if (widget != oldWidget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.BEHAVIOR_BINDING__WIDGET, oldWidget, widget));
			}
		}
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget basicGetWidget() {
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidget(Widget newWidget, NotificationChain msgs) {
		Widget oldWidget = widget;
		widget = newWidget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.BEHAVIOR_BINDING__WIDGET, oldWidget, newWidget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidget(Widget newWidget) {
		if (newWidget != widget) {
			NotificationChain msgs = null;
			if (widget != null)
				msgs = ((InternalEObject)widget).eInverseRemove(this, SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS, Widget.class, msgs);
			if (newWidget != null)
				msgs = ((InternalEObject)newWidget).eInverseAdd(this, SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS, Widget.class, msgs);
			msgs = basicSetWidget(newWidget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.BEHAVIOR_BINDING__WIDGET, newWidget, newWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__BEHAVIORS:
				return ((InternalEList)getBehaviors()).basicAdd(otherEnd, msgs);
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__WIDGET:
				if (widget != null)
					msgs = ((InternalEObject)widget).eInverseRemove(this, SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS, Widget.class, msgs);
				return basicSetWidget((Widget)otherEnd, msgs);
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
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__BEHAVIORS:
				return ((InternalEList)getBehaviors()).basicRemove(otherEnd, msgs);
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__WIDGET:
				return basicSetWidget(null, msgs);
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
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__BEHAVIORS:
				return getBehaviors();
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__WIDGET:
				if (resolve) return getWidget();
				return basicGetWidget();
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
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection)newValue);
				return;
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__WIDGET:
				setWidget((Widget)newValue);
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
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__BEHAVIORS:
				getBehaviors().clear();
				return;
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__WIDGET:
				setWidget((Widget)null);
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
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING__WIDGET:
				return widget != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorBindingImpl
