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
 *   <li>{@link sculptorguimetamodel.TableColumn#getLabel <em>Label</em>}</li>
 *   <li>{@link sculptorguimetamodel.TableColumn#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link sculptorguimetamodel.TableColumn#getForProperty <em>For Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableColumn()
 * @model
 * @generated
 */
public interface TableColumn extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableColumn_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.TableColumn#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

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
	 * Returns the value of the '<em><b>For Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Property</em>' reference.
	 * @see #setForProperty(PropertyReference)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableColumn_ForProperty()
	 * @model
	 * @generated
	 */
	PropertyReference getForProperty();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.TableColumn#getForProperty <em>For Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Property</em>' reference.
	 * @see #getForProperty()
	 * @generated
	 */
	void setForProperty(PropertyReference value);

} // TableColumn
