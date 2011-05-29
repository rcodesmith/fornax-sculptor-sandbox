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
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.TableColumn;

import sculptormetamodel.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.TableColumnImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.TableColumnImpl#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.TableColumnImpl#getForProperty <em>For Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableColumnImpl extends NamedElementImpl implements TableColumn {
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
	 * The default value of the '{@link #getColumnType() <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnType()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnType() <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnType()
	 * @generated
	 * @ordered
	 */
	protected String columnType = COLUMN_TYPE_EDEFAULT;

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
	protected TableColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.TABLE_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.TABLE_COLUMN__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnType() {
		return columnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnType(String newColumnType) {
		String oldColumnType = columnType;
		columnType = newColumnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.TABLE_COLUMN__COLUMN_TYPE, oldColumnType, columnType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.TABLE_COLUMN__FOR_PROPERTY, oldForProperty, forProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.TABLE_COLUMN__FOR_PROPERTY, oldForProperty, forProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.TABLE_COLUMN__LABEL:
				return getLabel();
			case SculptorguimetamodelPackage.TABLE_COLUMN__COLUMN_TYPE:
				return getColumnType();
			case SculptorguimetamodelPackage.TABLE_COLUMN__FOR_PROPERTY:
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
			case SculptorguimetamodelPackage.TABLE_COLUMN__LABEL:
				setLabel((String)newValue);
				return;
			case SculptorguimetamodelPackage.TABLE_COLUMN__COLUMN_TYPE:
				setColumnType((String)newValue);
				return;
			case SculptorguimetamodelPackage.TABLE_COLUMN__FOR_PROPERTY:
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
			case SculptorguimetamodelPackage.TABLE_COLUMN__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.TABLE_COLUMN__COLUMN_TYPE:
				setColumnType(COLUMN_TYPE_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.TABLE_COLUMN__FOR_PROPERTY:
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
			case SculptorguimetamodelPackage.TABLE_COLUMN__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SculptorguimetamodelPackage.TABLE_COLUMN__COLUMN_TYPE:
				return COLUMN_TYPE_EDEFAULT == null ? columnType != null : !COLUMN_TYPE_EDEFAULT.equals(columnType);
			case SculptorguimetamodelPackage.TABLE_COLUMN__FOR_PROPERTY:
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
		result.append(" (label: ");
		result.append(label);
		result.append(", columnType: ");
		result.append(columnType);
		result.append(')');
		return result.toString();
	}

} //TableColumnImpl
