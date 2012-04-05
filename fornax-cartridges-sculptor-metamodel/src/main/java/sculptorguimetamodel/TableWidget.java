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
 *   <li>{@link sculptorguimetamodel.TableWidget#getColumns <em>Columns</em>}</li>
 *   <li>{@link sculptorguimetamodel.TableWidget#isPaging <em>Paging</em>}</li>
 *   <li>{@link sculptorguimetamodel.TableWidget#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableWidget()
 * @model
 * @generated
 */
public interface TableWidget extends PropertyReferringWidget {

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

	/**
	 * Returns the value of the '<em><b>Paging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paging</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paging</em>' attribute.
	 * @see #setPaging(boolean)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableWidget_Paging()
	 * @model
	 * @generated
	 */
	boolean isPaging();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.TableWidget#isPaging <em>Paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paging</em>' attribute.
	 * @see #isPaging()
	 * @generated
	 */
	void setPaging(boolean value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getTableWidget_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.TableWidget#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);
} // TableWidget
