/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.BehaviorBinding#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link sculptorguimetamodel.BehaviorBinding#getWidget <em>Widget</em>}</li>
 *   <li>{@link sculptorguimetamodel.BehaviorBinding#getBindingTypeName <em>Binding Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getBehaviorBinding()
 * @model
 * @generated
 */
public interface BehaviorBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' reference list.
	 * The list contents are of type {@link sculptorguimetamodel.UiBehavior}.
	 * It is bidirectional and its opposite is '{@link sculptorguimetamodel.UiBehavior#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getBehaviorBinding_Behaviors()
	 * @see sculptorguimetamodel.UiBehavior#getBindings
	 * @model type="sculptorguimetamodel.UiBehavior" opposite="bindings" required="true"
	 * @generated
	 */
	EList getBehaviors();

	/**
	 * Returns the value of the '<em><b>Widget</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sculptorguimetamodel.Widget#getBehaviorBindings <em>Behavior Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget</em>' reference.
	 * @see #setWidget(Widget)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getBehaviorBinding_Widget()
	 * @see sculptorguimetamodel.Widget#getBehaviorBindings
	 * @model opposite="behaviorBindings" required="true"
	 * @generated
	 */
	Widget getWidget();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.BehaviorBinding#getWidget <em>Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget</em>' reference.
	 * @see #getWidget()
	 * @generated
	 */
	void setWidget(Widget value);

	/**
	 * Returns the value of the '<em><b>Binding Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Type Name</em>' attribute.
	 * @see #setBindingTypeName(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getBehaviorBinding_BindingTypeName()
	 * @model
	 * @generated
	 */
	String getBindingTypeName();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.BehaviorBinding#getBindingTypeName <em>Binding Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Type Name</em>' attribute.
	 * @see #getBindingTypeName()
	 * @generated
	 */
	void setBindingTypeName(String value);

} // BehaviorBinding
