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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sculptorguimetamodel.PropertyPathElement;
import sculptorguimetamodel.SculptorguimetamodelPackage;

import sculptormetamodel.Attribute;
import sculptormetamodel.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Path Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.PropertyPathElementImpl#getRemainingPath <em>Remaining Path</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PropertyPathElementImpl#getForAttribute <em>For Attribute</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PropertyPathElementImpl#getForReference <em>For Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyPathElementImpl extends EObjectImpl implements PropertyPathElement {
	/**
	 * The cached value of the '{@link #getRemainingPath() <em>Remaining Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingPath()
	 * @generated
	 * @ordered
	 */
	protected PropertyPathElement remainingPath;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyPathElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.PROPERTY_PATH_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyPathElement getRemainingPath() {
		return remainingPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemainingPath(PropertyPathElement newRemainingPath, NotificationChain msgs) {
		PropertyPathElement oldRemainingPath = remainingPath;
		remainingPath = newRemainingPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__REMAINING_PATH, oldRemainingPath, newRemainingPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingPath(PropertyPathElement newRemainingPath) {
		if (newRemainingPath != remainingPath) {
			NotificationChain msgs = null;
			if (remainingPath != null)
				msgs = ((InternalEObject)remainingPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__REMAINING_PATH, null, msgs);
			if (newRemainingPath != null)
				msgs = ((InternalEObject)newRemainingPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__REMAINING_PATH, null, msgs);
			msgs = basicSetRemainingPath(newRemainingPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__REMAINING_PATH, newRemainingPath, newRemainingPath));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_ATTRIBUTE, oldForAttribute, forAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_ATTRIBUTE, oldForAttribute, forAttribute));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_REFERENCE, oldForReference, forReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_REFERENCE, oldForReference, forReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__REMAINING_PATH:
				return basicSetRemainingPath(null, msgs);
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
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__REMAINING_PATH:
				return getRemainingPath();
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_ATTRIBUTE:
				if (resolve) return getForAttribute();
				return basicGetForAttribute();
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_REFERENCE:
				if (resolve) return getForReference();
				return basicGetForReference();
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
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__REMAINING_PATH:
				setRemainingPath((PropertyPathElement)newValue);
				return;
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_ATTRIBUTE:
				setForAttribute((Attribute)newValue);
				return;
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_REFERENCE:
				setForReference((Reference)newValue);
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
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__REMAINING_PATH:
				setRemainingPath((PropertyPathElement)null);
				return;
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_ATTRIBUTE:
				setForAttribute((Attribute)null);
				return;
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_REFERENCE:
				setForReference((Reference)null);
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
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__REMAINING_PATH:
				return remainingPath != null;
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_ATTRIBUTE:
				return forAttribute != null;
			case SculptorguimetamodelPackage.PROPERTY_PATH_ELEMENT__FOR_REFERENCE:
				return forReference != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyPathElementImpl
