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
 *   <li>{@link sculptorguimetamodel.impl.TableColumnImpl#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.TableColumnImpl#isFilterable <em>Filterable</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.TableColumnImpl#isSortable <em>Sortable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableColumnImpl extends PropertyReferringWidgetImpl implements TableColumn {
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
	 * The default value of the '{@link #isFilterable() <em>Filterable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTERABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilterable() <em>Filterable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterable()
	 * @generated
	 * @ordered
	 */
	protected boolean filterable = FILTERABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSortable() <em>Sortable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSortable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SORTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSortable() <em>Sortable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSortable()
	 * @generated
	 * @ordered
	 */
	protected boolean sortable = SORTABLE_EDEFAULT;

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
	public boolean isFilterable() {
		return filterable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterable(boolean newFilterable) {
		boolean oldFilterable = filterable;
		filterable = newFilterable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.TABLE_COLUMN__FILTERABLE, oldFilterable, filterable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSortable() {
		return sortable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortable(boolean newSortable) {
		boolean oldSortable = sortable;
		sortable = newSortable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.TABLE_COLUMN__SORTABLE, oldSortable, sortable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.TABLE_COLUMN__COLUMN_TYPE:
				return getColumnType();
			case SculptorguimetamodelPackage.TABLE_COLUMN__FILTERABLE:
				return isFilterable() ? Boolean.TRUE : Boolean.FALSE;
			case SculptorguimetamodelPackage.TABLE_COLUMN__SORTABLE:
				return isSortable() ? Boolean.TRUE : Boolean.FALSE;
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
			case SculptorguimetamodelPackage.TABLE_COLUMN__COLUMN_TYPE:
				setColumnType((String)newValue);
				return;
			case SculptorguimetamodelPackage.TABLE_COLUMN__FILTERABLE:
				setFilterable(((Boolean)newValue).booleanValue());
				return;
			case SculptorguimetamodelPackage.TABLE_COLUMN__SORTABLE:
				setSortable(((Boolean)newValue).booleanValue());
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
			case SculptorguimetamodelPackage.TABLE_COLUMN__COLUMN_TYPE:
				setColumnType(COLUMN_TYPE_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.TABLE_COLUMN__FILTERABLE:
				setFilterable(FILTERABLE_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.TABLE_COLUMN__SORTABLE:
				setSortable(SORTABLE_EDEFAULT);
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
			case SculptorguimetamodelPackage.TABLE_COLUMN__COLUMN_TYPE:
				return COLUMN_TYPE_EDEFAULT == null ? columnType != null : !COLUMN_TYPE_EDEFAULT.equals(columnType);
			case SculptorguimetamodelPackage.TABLE_COLUMN__FILTERABLE:
				return filterable != FILTERABLE_EDEFAULT;
			case SculptorguimetamodelPackage.TABLE_COLUMN__SORTABLE:
				return sortable != SORTABLE_EDEFAULT;
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
		result.append(" (columnType: ");
		result.append(columnType);
		result.append(", filterable: ");
		result.append(filterable);
		result.append(", sortable: ");
		result.append(sortable);
		result.append(')');
		return result.toString();
	}

} //TableColumnImpl
