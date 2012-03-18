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
 * A representation of the model object '<em><b>Behavior Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.BehaviorContainer#getConditions <em>Conditions</em>}</li>
 *   <li>{@link sculptorguimetamodel.BehaviorContainer#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getBehaviorContainer()
 * @model
 * @generated
 */
public interface BehaviorContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link sculptorguimetamodel.UiCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getBehaviorContainer_Conditions()
	 * @model type="sculptorguimetamodel.UiCondition" containment="true"
	 * @generated
	 */
	EList getConditions();

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link sculptorguimetamodel.UiBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getBehaviorContainer_Behaviors()
	 * @model type="sculptorguimetamodel.UiBehavior" containment="true"
	 * @generated
	 */
	EList getBehaviors();

} // BehaviorContainer
