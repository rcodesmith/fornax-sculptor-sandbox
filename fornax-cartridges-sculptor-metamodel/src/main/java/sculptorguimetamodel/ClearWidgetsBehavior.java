/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clear Widgets Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.ClearWidgetsBehavior#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getClearWidgetsBehavior()
 * @model
 * @generated
 */
public interface ClearWidgetsBehavior extends UiBehavior {
	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' reference list.
	 * The list contents are of type {@link sculptorguimetamodel.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getClearWidgetsBehavior_Widgets()
	 * @model type="sculptorguimetamodel.Widget"
	 * @generated
	 */
	EList getWidgets();

} // ClearWidgetsBehavior
