/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.common.util.EList;
import sculptormetamodel.NamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.UiBehavior#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getUiBehavior()
 * @model
 * @generated
 */
public interface UiBehavior extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' reference list.
	 * The list contents are of type {@link sculptorguimetamodel.BehaviorBinding}.
	 * It is bidirectional and its opposite is '{@link sculptorguimetamodel.BehaviorBinding#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getUiBehavior_Bindings()
	 * @see sculptorguimetamodel.BehaviorBinding#getBehaviors
	 * @model type="sculptorguimetamodel.BehaviorBinding" opposite="behaviors"
	 * @generated
	 */
	EList getBindings();
} // UiBehavior
