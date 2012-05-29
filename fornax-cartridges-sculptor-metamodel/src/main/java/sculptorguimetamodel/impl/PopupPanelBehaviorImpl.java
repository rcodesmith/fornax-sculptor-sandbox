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

import sculptorguimetamodel.PopupPanelBehavior;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Popup Panel Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.PopupPanelBehaviorImpl#getView <em>View</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PopupPanelBehaviorImpl#getPanelName <em>Panel Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PopupPanelBehaviorImpl extends UiBehaviorImpl implements PopupPanelBehavior {
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
	 * The default value of the '{@link #getPanelName() <em>Panel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelName()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPanelName() <em>Panel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelName()
	 * @generated
	 * @ordered
	 */
	protected String panelName = PANEL_NAME_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopupPanelBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.POPUP_PANEL_BEHAVIOR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__VIEW, oldView, view));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanelName() {
		return panelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelName(String newPanelName) {
		String oldPanelName = panelName;
		panelName = newPanelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__PANEL_NAME, oldPanelName, panelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__VIEW:
				if (resolve) return getView();
				return basicGetView();
			case SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__PANEL_NAME:
				return getPanelName();
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
			case SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__VIEW:
				setView((View)newValue);
				return;
			case SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__PANEL_NAME:
				setPanelName((String)newValue);
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
			case SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__VIEW:
				setView((View)null);
				return;
			case SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__PANEL_NAME:
				setPanelName(PANEL_NAME_EDEFAULT);
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
			case SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__VIEW:
				return view != null;
			case SculptorguimetamodelPackage.POPUP_PANEL_BEHAVIOR__PANEL_NAME:
				return PANEL_NAME_EDEFAULT == null ? panelName != null : !PANEL_NAME_EDEFAULT.equals(panelName);
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
		result.append(" (panelName: ");
		result.append(panelName);
		result.append(')');
		return result.toString();
	}

} //PopupPanelBehaviorImpl
