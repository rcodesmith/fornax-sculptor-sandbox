/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.common.util.EList;
import sculptormetamodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.Widget#getView <em>View</em>}</li>
 *   <li>{@link sculptorguimetamodel.Widget#getLabel <em>Label</em>}</li>
 *   <li>{@link sculptorguimetamodel.Widget#getBehaviorBindings <em>Behavior Bindings</em>}</li>
 *   <li>{@link sculptorguimetamodel.Widget#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link sculptorguimetamodel.Widget#getWidgetType <em>Widget Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends NamedElement {
	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(View)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getWidget_View()
	 * @model
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.Widget#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

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
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getWidget_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.Widget#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Behavior Bindings</b></em>' reference list.
	 * The list contents are of type {@link sculptorguimetamodel.BehaviorBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Bindings</em>' reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getWidget_BehaviorBindings()
	 * @model type="sculptorguimetamodel.BehaviorBinding" required="true"
	 * @generated
	 */
	EList getBehaviorBindings();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' reference.
	 * @see #setEnabled(UiCondition)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getWidget_Enabled()
	 * @model
	 * @generated
	 */
	UiCondition getEnabled();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.Widget#getEnabled <em>Enabled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' reference.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(UiCondition value);

	/**
	 * Returns the value of the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget Type</em>' attribute.
	 * @see #setWidgetType(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getWidget_WidgetType()
	 * @model
	 * @generated
	 */
	String getWidgetType();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.Widget#getWidgetType <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget Type</em>' attribute.
	 * @see #getWidgetType()
	 * @generated
	 */
	void setWidgetType(String value);

} // Widget
