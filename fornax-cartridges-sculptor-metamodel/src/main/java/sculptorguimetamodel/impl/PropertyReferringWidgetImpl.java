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
 *   <li>{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl#getForAttribute <em>For Attribute</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl#getForReference <em>For Reference</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl#getForOp <em>For Op</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl#getPropertyPath <em>Property Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyReferringWidgetImpl extends WidgetImpl implements PropertyReferringWidget {
	/**
	 * The cached value of the '{@link #getForAttribute() <em>For Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute forAttribute;
	/**
	 * The cached value of the '{@link #getForReference() <em>For Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForReference()
	 * @generated
	 * @ordered
	 */
	protected Reference forReference;
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
	public Attribute getForAttribute() {
		if (forAttribute != null && forAttribute.eIsProxy()) {
			InternalEObject oldForAttribute = (InternalEObject)forAttribute;
			forAttribute = (Attribute)eResolveProxy(oldForAttribute);
			if (forAttribute != oldForAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_ATTRIBUTE, oldForAttribute, forAttribute));
			}
		}
		return forAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetForAttribute() {
		return forAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForAttribute(Attribute newForAttribute) {
		Attribute oldForAttribute = forAttribute;
		forAttribute = newForAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_ATTRIBUTE, oldForAttribute, forAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getForReference() {
		if (forReference != null && forReference.eIsProxy()) {
			InternalEObject oldForReference = (InternalEObject)forReference;
			forReference = (Reference)eResolveProxy(oldForReference);
			if (forReference != oldForReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_REFERENCE, oldForReference, forReference));
			}
		}
		return forReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetForReference() {
		return forReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForReference(Reference newForReference) {
		Reference oldForReference = forReference;
		forReference = newForReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_REFERENCE, oldForReference, forReference));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_ATTRIBUTE:
				if (resolve) return getForAttribute();
				return basicGetForAttribute();
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_REFERENCE:
				if (resolve) return getForReference();
				return basicGetForReference();
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP:
				if (resolve) return getForOp();
				return basicGetForOp();
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR:
				if (resolve) return getFor();
				return basicGetFor();
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH:
				return getPropertyPath();
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
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_ATTRIBUTE:
				setForAttribute((Attribute)newValue);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_REFERENCE:
				setForReference((Reference)newValue);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP:
				setForOp((DomainObjectOperation)newValue);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR:
				setFor((DomainObject)newValue);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH:
				setPropertyPath((String)newValue);
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
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_ATTRIBUTE:
				setForAttribute((Attribute)null);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_REFERENCE:
				setForReference((Reference)null);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP:
				setForOp((DomainObjectOperation)null);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR:
				setFor((DomainObject)null);
				return;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH:
				setPropertyPath(PROPERTY_PATH_EDEFAULT);
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
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_ATTRIBUTE:
				return forAttribute != null;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_REFERENCE:
				return forReference != null;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP:
				return forOp != null;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR:
				return for_ != null;
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH:
				return PROPERTY_PATH_EDEFAULT == null ? propertyPath != null : !PROPERTY_PATH_EDEFAULT.equals(propertyPath);
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
