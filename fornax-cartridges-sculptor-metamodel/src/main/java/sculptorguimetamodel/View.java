/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.common.util.EList;
import sculptormetamodel.DomainObject;
import sculptormetamodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.View#getModule <em>Module</em>}</li>
 *   <li>{@link sculptorguimetamodel.View#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.View#getServiceProxies <em>Service Proxies</em>}</li>
 *   <li>{@link sculptorguimetamodel.View#getParameters <em>Parameters</em>}</li>
 *   <li>{@link sculptorguimetamodel.View#getLabel <em>Label</em>}</li>
 *   <li>{@link sculptorguimetamodel.View#getExtendsName <em>Extends Name</em>}</li>
 *   <li>{@link sculptorguimetamodel.View#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getView()
 * @model
 * @generated
 */
public interface View extends WidgetsContainer, NamedElement, BehaviorContainer {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sculptorguimetamodel.GuiModule#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(GuiModule)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getView_Module()
	 * @see sculptorguimetamodel.GuiModule#getViews
	 * @model opposite="views" transient="false"
	 * @generated
	 */
	GuiModule getModule();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.View#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(GuiModule value);

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
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getView_For()
	 * @model
	 * @generated
	 */
	DomainObject getFor();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.View#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Service Proxies</b></em>' reference list.
	 * The list contents are of type {@link sculptorguimetamodel.ServiceProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Proxies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Proxies</em>' reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getView_ServiceProxies()
	 * @model type="sculptorguimetamodel.ServiceProxy"
	 * @generated
	 */
	EList getServiceProxies();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link sculptorguimetamodel.ViewParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getView_Parameters()
	 * @model type="sculptorguimetamodel.ViewParameter" containment="true"
	 * @generated
	 */
	EList getParameters();

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
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getView_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.View#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Name</em>' attribute.
	 * @see #setExtendsName(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getView_ExtendsName()
	 * @model
	 * @generated
	 */
	String getExtendsName();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.View#getExtendsName <em>Extends Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Name</em>' attribute.
	 * @see #getExtendsName()
	 * @generated
	 */
	void setExtendsName(String value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(View)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getView_Extends()
	 * @model
	 * @generated
	 */
	View getExtends();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.View#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(View value);

} // View
