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

} // BehaviorBinding
