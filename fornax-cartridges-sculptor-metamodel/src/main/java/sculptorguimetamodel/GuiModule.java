/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.common.util.EList;

import sculptormetamodel.Module;
import sculptormetamodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptorguimetamodel.GuiModule#getUserTasks <em>User Tasks</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiModule#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiModule#getApplication <em>Application</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiModule#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiModule#getViews <em>Views</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiModule#getEvents <em>Events</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiModule#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiModule#getCommands <em>Commands</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiModule#getStubModule <em>Stub Module</em>}</li>
 *   <li>{@link sculptorguimetamodel.GuiModule#getGuiDtoOptions <em>Gui Dto Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule()
 * @model
 * @generated
 */
public interface GuiModule extends NamedElement, BehaviorContainer {
	/**
	 * Returns the value of the '<em><b>User Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link sculptorguimetamodel.UserTask}.
	 * It is bidirectional and its opposite is '{@link sculptorguimetamodel.UserTask#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Tasks</em>' containment reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule_UserTasks()
	 * @see sculptorguimetamodel.UserTask#getModule
	 * @model type="sculptorguimetamodel.UserTask" opposite="module" containment="true" required="true"
	 * @generated
	 */
	EList getUserTasks();

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.GuiModule#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sculptorguimetamodel.GuiApplication#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(GuiApplication)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule_Application()
	 * @see sculptorguimetamodel.GuiApplication#getModules
	 * @model opposite="modules" transient="false"
	 * @generated
	 */
	GuiApplication getApplication();

	/**
	 * Sets the value of the '{@link sculptorguimetamodel.GuiModule#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(GuiApplication value);

    /**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>For</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(Module)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule_For()
	 * @model
	 * @generated
	 */
    Module getFor();

    /**
	 * Sets the value of the '{@link sculptorguimetamodel.GuiModule#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
    void setFor(Module value);

				/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link sculptorguimetamodel.View}.
	 * It is bidirectional and its opposite is '{@link sculptorguimetamodel.View#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule_Views()
	 * @see sculptorguimetamodel.View#getModule
	 * @model type="sculptorguimetamodel.View" opposite="module" containment="true"
	 * @generated
	 */
	EList getViews();

				/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link sculptorguimetamodel.GuiEvent}.
	 * It is bidirectional and its opposite is '{@link sculptorguimetamodel.GuiEvent#getGuiModule <em>Gui Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule_Events()
	 * @see sculptorguimetamodel.GuiEvent#getGuiModule
	 * @model type="sculptorguimetamodel.GuiEvent" opposite="guiModule" containment="true"
	 * @generated
	 */
	EList getEvents();

				/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference list.
	 * The list contents are of type {@link sculptormetamodel.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule_ServiceDependencies()
	 * @model type="sculptormetamodel.Service"
	 * @generated
	 */
	EList getServiceDependencies();

				/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link sculptorguimetamodel.GuiCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule_Commands()
	 * @model type="sculptorguimetamodel.GuiCommand" containment="true"
	 * @generated
	 */
	EList getCommands();

				/**
	 * Returns the value of the '<em><b>Stub Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stub Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stub Module</em>' reference.
	 * @see #setStubModule(StubModule)
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule_StubModule()
	 * @model
	 * @generated
	 */
	StubModule getStubModule();

				/**
	 * Sets the value of the '{@link sculptorguimetamodel.GuiModule#getStubModule <em>Stub Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stub Module</em>' reference.
	 * @see #getStubModule()
	 * @generated
	 */
	void setStubModule(StubModule value);

				/**
	 * Returns the value of the '<em><b>Gui Dto Options</b></em>' containment reference list.
	 * The list contents are of type {@link sculptorguimetamodel.GuiDtoOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gui Dto Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gui Dto Options</em>' containment reference list.
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#getGuiModule_GuiDtoOptions()
	 * @model type="sculptorguimetamodel.GuiDtoOptions" containment="true"
	 * @generated
	 */
	EList getGuiDtoOptions();

} // GuiModule
