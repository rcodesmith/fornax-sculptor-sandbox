/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Table Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.UpdateTableBehavior#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getUpdateTableBehavior()
 * @model
 * @generated
 */
public interface UpdateTableBehavior extends UiBehavior {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(TableWidget)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getUpdateTableBehavior_Table()
	 * @model required="true"
	 * @generated
	 */
	TableWidget getTable();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.UpdateTableBehavior#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TableWidget value);

} // UpdateTableBehavior
