/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Populate Panel Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.PopulatePanelBehavior#getPanel <em>Panel</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPopulatePanelBehavior()
 * @model
 * @generated
 */
public interface PopulatePanelBehavior extends UiBehavior {

	/**
	 * Returns the value of the '<em><b>Panel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel</em>' reference.
	 * @see #setPanel(PanelWidget)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getPopulatePanelBehavior_Panel()
	 * @model required="true"
	 * @generated
	 */
	PanelWidget getPanel();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.PopulatePanelBehavior#getPanel <em>Panel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel</em>' reference.
	 * @see #getPanel()
	 * @generated
	 */
	void setPanel(PanelWidget value);
} // PopulatePanelBehavior
