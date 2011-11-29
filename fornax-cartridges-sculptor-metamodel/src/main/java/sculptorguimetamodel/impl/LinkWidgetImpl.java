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

import sculptorguimetamodel.LinkWidget;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.LinkWidgetImpl#getToView <em>To View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkWidgetImpl extends WidgetImpl implements LinkWidget {
	/**
	 * The cached value of the '{@link #getToView() <em>To View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToView()
	 * @generated
	 * @ordered
	 */
	protected View toView;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.LINK_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getToView() {
		if (toView != null && toView.eIsProxy()) {
			InternalEObject oldToView = (InternalEObject)toView;
			toView = (View)eResolveProxy(oldToView);
			if (toView != oldToView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.LINK_WIDGET__TO_VIEW, oldToView, toView));
			}
		}
		return toView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetToView() {
		return toView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToView(View newToView) {
		View oldToView = toView;
		toView = newToView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.LINK_WIDGET__TO_VIEW, oldToView, toView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.LINK_WIDGET__TO_VIEW:
				if (resolve) return getToView();
				return basicGetToView();
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
			case SculptorguimetamodelPackage.LINK_WIDGET__TO_VIEW:
				setToView((View)newValue);
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
			case SculptorguimetamodelPackage.LINK_WIDGET__TO_VIEW:
				setToView((View)null);
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
			case SculptorguimetamodelPackage.LINK_WIDGET__TO_VIEW:
				return toView != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkWidgetImpl
