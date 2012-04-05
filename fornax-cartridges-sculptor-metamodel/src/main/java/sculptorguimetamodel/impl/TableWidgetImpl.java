/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.TableColumn;
import sculptorguimetamodel.TableWidget;
import sculptormetamodel.DomainObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.TableWidgetImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.TableWidgetImpl#isPaging <em>Paging</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.TableWidgetImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableWidgetImpl extends PropertyReferringWidgetImpl implements TableWidget {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList columns;

	/**
	 * The default value of the '{@link #isPaging() <em>Paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaging()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAGING_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPaging() <em>Paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaging()
	 * @generated
	 * @ordered
	 */
	protected boolean paging = PAGING_EDEFAULT;
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.TABLE_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList(TableColumn.class, this, SculptorguimetamodelPackage.TABLE_WIDGET__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaging() {
		return paging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaging(boolean newPaging) {
		boolean oldPaging = paging;
		paging = newPaging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.TABLE_WIDGET__PAGING, oldPaging, paging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.TABLE_WIDGET__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.TABLE_WIDGET__COLUMNS:
				return ((InternalEList)getColumns()).basicRemove(otherEnd, msgs);
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
			case SculptorguimetamodelPackage.TABLE_WIDGET__COLUMNS:
				return getColumns();
			case SculptorguimetamodelPackage.TABLE_WIDGET__PAGING:
				return isPaging() ? Boolean.TRUE : Boolean.FALSE;
			case SculptorguimetamodelPackage.TABLE_WIDGET__SIZE:
				return new Integer(getSize());
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
			case SculptorguimetamodelPackage.TABLE_WIDGET__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection)newValue);
				return;
			case SculptorguimetamodelPackage.TABLE_WIDGET__PAGING:
				setPaging(((Boolean)newValue).booleanValue());
				return;
			case SculptorguimetamodelPackage.TABLE_WIDGET__SIZE:
				setSize(((Integer)newValue).intValue());
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
			case SculptorguimetamodelPackage.TABLE_WIDGET__COLUMNS:
				getColumns().clear();
				return;
			case SculptorguimetamodelPackage.TABLE_WIDGET__PAGING:
				setPaging(PAGING_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.TABLE_WIDGET__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case SculptorguimetamodelPackage.TABLE_WIDGET__COLUMNS:
				return columns != null && !columns.isEmpty();
			case SculptorguimetamodelPackage.TABLE_WIDGET__PAGING:
				return paging != PAGING_EDEFAULT;
			case SculptorguimetamodelPackage.TABLE_WIDGET__SIZE:
				return size != SIZE_EDEFAULT;
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
		result.append(" (paging: ");
		result.append(paging);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //TableWidgetImpl
