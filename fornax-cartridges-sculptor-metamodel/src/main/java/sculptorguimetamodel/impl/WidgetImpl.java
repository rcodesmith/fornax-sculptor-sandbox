/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import sculptorguimetamodel.BehaviorBinding;
import org.eclipse.emf.ecore.util.EcoreUtil;

import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.UiCondition;
import sculptorguimetamodel.View;
import sculptorguimetamodel.Widget;

import sculptormetamodel.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.WidgetImpl#getView <em>View</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.WidgetImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.WidgetImpl#getBehaviorBindings <em>Behavior Bindings</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.WidgetImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.WidgetImpl#getWidgetType <em>Widget Type</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.WidgetImpl#getVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetImpl extends NamedElementImpl implements Widget {
	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected View view;
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehaviorBindings() <em>Behavior Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorBindings()
	 * @generated
	 * @ordered
	 */
	protected EList behaviorBindings;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected UiCondition enabled;

	/**
	 * The default value of the '{@link #getWidgetType() <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDGET_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getWidgetType() <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected String widgetType = WIDGET_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected UiCondition visible;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getView() {
		if (view != null && view.eIsProxy()) {
			InternalEObject oldView = (InternalEObject)view;
			view = (View)eResolveProxy(oldView);
			if (view != oldView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.WIDGET__VIEW, oldView, view));
			}
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(View newView) {
		View oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.WIDGET__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.WIDGET__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBehaviorBindings() {
		if (behaviorBindings == null) {
			behaviorBindings = new EObjectWithInverseResolvingEList(BehaviorBinding.class, this, SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS, SculptorguimetamodelPackage.BEHAVIOR_BINDING__WIDGET);
		}
		return behaviorBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCondition getEnabled() {
		if (enabled != null && enabled.eIsProxy()) {
			InternalEObject oldEnabled = (InternalEObject)enabled;
			enabled = (UiCondition)eResolveProxy(oldEnabled);
			if (enabled != oldEnabled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.WIDGET__ENABLED, oldEnabled, enabled));
			}
		}
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCondition basicGetEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(UiCondition newEnabled) {
		UiCondition oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.WIDGET__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidgetType() {
		return widgetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidgetType(String newWidgetType) {
		String oldWidgetType = widgetType;
		widgetType = newWidgetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.WIDGET__WIDGET_TYPE, oldWidgetType, widgetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCondition getVisible() {
		if (visible != null && visible.eIsProxy()) {
			InternalEObject oldVisible = (InternalEObject)visible;
			visible = (UiCondition)eResolveProxy(oldVisible);
			if (visible != oldVisible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.WIDGET__VISIBLE, oldVisible, visible));
			}
		}
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCondition basicGetVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(UiCondition newVisible) {
		UiCondition oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.WIDGET__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS:
				return ((InternalEList)getBehaviorBindings()).basicAdd(otherEnd, msgs);
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
			case SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS:
				return ((InternalEList)getBehaviorBindings()).basicRemove(otherEnd, msgs);
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
			case SculptorguimetamodelPackage.WIDGET__VIEW:
				if (resolve) return getView();
				return basicGetView();
			case SculptorguimetamodelPackage.WIDGET__LABEL:
				return getLabel();
			case SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS:
				return getBehaviorBindings();
			case SculptorguimetamodelPackage.WIDGET__ENABLED:
				if (resolve) return getEnabled();
				return basicGetEnabled();
			case SculptorguimetamodelPackage.WIDGET__WIDGET_TYPE:
				return getWidgetType();
			case SculptorguimetamodelPackage.WIDGET__VISIBLE:
				if (resolve) return getVisible();
				return basicGetVisible();
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
			case SculptorguimetamodelPackage.WIDGET__VIEW:
				setView((View)newValue);
				return;
			case SculptorguimetamodelPackage.WIDGET__LABEL:
				setLabel((String)newValue);
				return;
			case SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS:
				getBehaviorBindings().clear();
				getBehaviorBindings().addAll((Collection)newValue);
				return;
			case SculptorguimetamodelPackage.WIDGET__ENABLED:
				setEnabled((UiCondition)newValue);
				return;
			case SculptorguimetamodelPackage.WIDGET__WIDGET_TYPE:
				setWidgetType((String)newValue);
				return;
			case SculptorguimetamodelPackage.WIDGET__VISIBLE:
				setVisible((UiCondition)newValue);
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
			case SculptorguimetamodelPackage.WIDGET__VIEW:
				setView((View)null);
				return;
			case SculptorguimetamodelPackage.WIDGET__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS:
				getBehaviorBindings().clear();
				return;
			case SculptorguimetamodelPackage.WIDGET__ENABLED:
				setEnabled((UiCondition)null);
				return;
			case SculptorguimetamodelPackage.WIDGET__WIDGET_TYPE:
				setWidgetType(WIDGET_TYPE_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.WIDGET__VISIBLE:
				setVisible((UiCondition)null);
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
			case SculptorguimetamodelPackage.WIDGET__VIEW:
				return view != null;
			case SculptorguimetamodelPackage.WIDGET__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS:
				return behaviorBindings != null && !behaviorBindings.isEmpty();
			case SculptorguimetamodelPackage.WIDGET__ENABLED:
				return enabled != null;
			case SculptorguimetamodelPackage.WIDGET__WIDGET_TYPE:
				return WIDGET_TYPE_EDEFAULT == null ? widgetType != null : !WIDGET_TYPE_EDEFAULT.equals(widgetType);
			case SculptorguimetamodelPackage.WIDGET__VISIBLE:
				return visible != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", widgetType: ");
		result.append(widgetType);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
