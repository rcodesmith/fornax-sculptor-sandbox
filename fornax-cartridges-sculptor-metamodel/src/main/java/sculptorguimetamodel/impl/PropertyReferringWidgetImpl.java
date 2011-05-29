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

import sculptorguimetamodel.PropertyReference;
import sculptorguimetamodel.PropertyReferringWidget;
import sculptorguimetamodel.SculptorguimetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Referring Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl#getForProperty <em>For Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyReferringWidgetImpl extends WidgetImpl implements PropertyReferringWidget {
	/**
	 * The cached value of the '{@link #getForProperty() <em>For Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyReference forProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyReferringWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.PROPERTY_REFERRING_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyReference getForProperty() {
		if (forProperty != null && forProperty.eIsProxy()) {
			InternalEObject oldForProperty = (InternalEObject)forProperty;
			forProperty = (PropertyReference)eResolveProxy(oldForProperty);
			if (forProperty != oldForProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY, oldForProperty, forProperty));
			}
		}
		return forProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyReference basicGetForProperty() {
		return forProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForProperty(PropertyReference newForProperty) {
		PropertyReference oldForProperty = forProperty;
		forProperty = newForProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY, oldForProperty, forProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY:
				if (resolve) return getForProperty();
				return basicGetForProperty();
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
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY:
				setForProperty((PropertyReference)newValue);
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
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY:
				setForProperty((PropertyReference)null);
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
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY:
				return forProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyReferringWidgetImpl
