/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.common.util.EList;
import sculptormetamodel.DomainObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.TableWidget#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.TableWidget#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableWidget()
 * @model
 * @generated
 */
public interface TableWidget extends PropertyReferringWidget {

	/**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(DomainObject)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableWidget_For()
	 * @model
	 * @generated
	 */
	DomainObject getFor();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.TableWidget#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link sculptorguimetamodel.TableColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableWidget_Columns()
	 * @model type="sculptorguimetamodel.TableColumn" containment="true"
	 * @generated
	 */
	EList getColumns();
} // TableWidget
