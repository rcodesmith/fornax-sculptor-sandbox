/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptorguimetamodel.PropertyPathElement;
import sculptorguimetamodel.PropertyReference;
import sculptorguimetamodel.PropertyReferringWidget;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptormetamodel.Attribute;
import sculptormetamodel.DomainObject;
import sculptormetamodel.DomainObjectOperation;
import sculptormetamodel.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Referring Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl#getForOp <em>For Op</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl#getForProperty <em>For Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyReferringWidgetImpl extends WidgetImpl implements PropertyReferringWidget {
	/**
	 * The cached value of the '{@link #getForOp() <em>For Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForOp()
	 * @generated
	 * @ordered
	 */
	protected DomainObjectOperation forOp;
	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected DomainObject for_;
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
	 * The cached value of the '{@link #getForProperty() <em>For Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyPathElement forProperty;
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
	public DomainObjectOperation getForOp() {
		if (forOp != null && forOp.eIsProxy()) {
			InternalEObject oldForOp = (InternalEObject)forOp;
			forOp = (DomainObjectOperation)eResolveProxy(oldForOp);
			if (forOp != oldForOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP, oldForOp, forOp));
			}
		}
		return forOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectOperation basicGetForOp() {
		return forOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForOp(DomainObjectOperation newForOp) {
		DomainObjectOperation oldForOp = forOp;
		forOp = newForOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP, oldForOp, forOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject getFor() {
		if (for_ != null && for_.eIsProxy()) {
			InternalEObject oldFor = (InternalEObject)for_;
			for_ = (DomainObject)eResolveProxy(oldFor);
			if (for_ != oldFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR, oldFor, for_));
			}
		}
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(DomainObject newFor) {
		DomainObject oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR, oldFor, for_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH, oldPropertyPath, propertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyPathElement getForProperty() {
		return forProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForProperty(PropertyPathElement newForProperty, NotificationChain msgs) {
		PropertyPathElement oldForProperty = forProperty;
		forProperty = newForProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY, oldForProperty, newForProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForProperty(PropertyPathElement newForProperty) {
		if (newForProperty != forProperty) {
			NotificationChain msgs = null;
			if (forProperty != null)
				msgs = ((InternalEObject)forProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY, null, msgs);
			if (newForProperty != null)
				msgs = ((InternalEObject)newForProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY, null, msgs);
			msgs = basicSetForProperty(newForProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY, newForProperty, newForProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY:
				return basicSetForProperty(null, msgs);
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
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP:
				if (resolve) return getForOp();
				return basicGetForOp();
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR:
				if (resolve) return getFor();
				return basicGetFor();
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH:
				return getPropertyPath();
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY:
				return getForProperty();
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
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP:
				setForOp((DomainObjectOperation)newValue);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR:
				setFor((DomainObject)newValue);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH:
				setPropertyPath((String)newValue);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY:
				setForProperty((PropertyPathElement)newValue);
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
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP:
				setForOp((DomainObjectOperation)null);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR:
				setFor((DomainObject)null);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH:
				setPropertyPath(PROPERTY_PATH_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY:
				setForProperty((PropertyPathElement)null);
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
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP:
				return forOp != null;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR:
				return for_ != null;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH:
				return PROPERTY_PATH_EDEFAULT == null ? propertyPath != null : !PROPERTY_PATH_EDEFAULT.equals(propertyPath);
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_PROPERTY:
				return forProperty != null;
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

} //PropertyReferringWidgetImpl
