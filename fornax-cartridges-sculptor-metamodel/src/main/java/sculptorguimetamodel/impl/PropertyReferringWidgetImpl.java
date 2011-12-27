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
		}
		return super.eIsSet(featureID);
	}

} //PropertyReferringWidgetImpl
