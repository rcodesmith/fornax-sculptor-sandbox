/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import sculptormetamodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.TableColumn#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link sculptorguimetamodel.TableColumn#isFilterable <em>Filterable</em>}</li>
 *   <li>{@link sculptorguimetamodel.TableColumn#isSortable <em>Sortable</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableColumn()
 * @model
 * @generated
 */
public interface TableColumn extends PropertyReferringWidget {
	/**
	 * Returns the value of the '<em><b>Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Type</em>' attribute.
	 * @see #setColumnType(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableColumn_ColumnType()
	 * @model
	 * @generated
	 */
	String getColumnType();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.TableColumn#getColumnType <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Type</em>' attribute.
	 * @see #getColumnType()
	 * @generated
	 */
	void setColumnType(String value);

	/**
	 * Returns the value of the '<em><b>Filterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filterable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filterable</em>' attribute.
	 * @see #setFilterable(boolean)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableColumn_Filterable()
	 * @model
	 * @generated
	 */
	boolean isFilterable();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.TableColumn#isFilterable <em>Filterable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filterable</em>' attribute.
	 * @see #isFilterable()
	 * @generated
	 */
	void setFilterable(boolean value);

	/**
	 * Returns the value of the '<em><b>Sortable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortable</em>' attribute.
	 * @see #setSortable(boolean)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableColumn_Sortable()
	 * @model
	 * @generated
	 */
	boolean isSortable();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.TableColumn#isSortable <em>Sortable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortable</em>' attribute.
	 * @see #isSortable()
	 * @generated
	 */
	void setSortable(boolean value);

} // TableColumn
