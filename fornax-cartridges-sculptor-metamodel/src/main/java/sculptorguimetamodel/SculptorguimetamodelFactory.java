/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sculptorguimetamodel.SculptorguimetamodelPackage
 * @generated
 */
public interface SculptorguimetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SculptorguimetamodelFactory eINSTANCE = sculptorguimetamodel.impl.SculptorguimetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gui Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Application</em>'.
	 * @generated
	 */
	GuiApplication createGuiApplication();

	/**
	 * Returns a new object of class '<em>Gui Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Module</em>'.
	 * @generated
	 */
	GuiModule createGuiModule();

	/**
	 * Returns a new object of class '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task</em>'.
	 * @generated
	 */
	UserTask createUserTask();

	/**
	 * Returns a new object of class '<em>Create Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Task</em>'.
	 * @generated
	 */
	CreateTask createCreateTask();

	/**
	 * Returns a new object of class '<em>Update Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Task</em>'.
	 * @generated
	 */
	UpdateTask createUpdateTask();

	/**
	 * Returns a new object of class '<em>View Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Task</em>'.
	 * @generated
	 */
	ViewTask createViewTask();

	/**
	 * Returns a new object of class '<em>List Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Task</em>'.
	 * @generated
	 */
	ListTask createListTask();

	/**
	 * Returns a new object of class '<em>Delete Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Task</em>'.
	 * @generated
	 */
	DeleteTask createDeleteTask();

	/**
	 * Returns a new object of class '<em>Sub Task Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Task Transition</em>'.
	 * @generated
	 */
	SubTaskTransition createSubTaskTransition();

	/**
	 * Returns a new object of class '<em>View Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Data Property</em>'.
	 * @generated
	 */
	ViewDataProperty createViewDataProperty();

	/**
	 * Returns a new object of class '<em>Tmp Reference Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tmp Reference Holder</em>'.
	 * @generated
	 */
	TmpReferenceHolder createTmpReferenceHolder();

	/**
	 * Returns a new object of class '<em>Tmp Sub Task Transition Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tmp Sub Task Transition Holder</em>'.
	 * @generated
	 */
	TmpSubTaskTransitionHolder createTmpSubTaskTransitionHolder();

	/**
	 * Returns a new object of class '<em>Reference Target</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Target</em>'.
	 * @generated
	 */
    ReferenceTarget createReferenceTarget();

    /**
	 * Returns a new object of class '<em>Reference View Property</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference View Property</em>'.
	 * @generated
	 */
    ReferenceViewProperty createReferenceViewProperty();

    /**
	 * Returns a new object of class '<em>Attribute View Property</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute View Property</em>'.
	 * @generated
	 */
    AttributeViewProperty createAttributeViewProperty();

    /**
	 * Returns a new object of class '<em>Basic Type View Property</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Type View Property</em>'.
	 * @generated
	 */
    BasicTypeViewProperty createBasicTypeViewProperty();

    /**
	 * Returns a new object of class '<em>Enum View Property</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum View Property</em>'.
	 * @generated
	 */
    EnumViewProperty createEnumViewProperty();

    /**
	 * Returns a new object of class '<em>Basic Type Enum View Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Type Enum View Property</em>'.
	 * @generated
	 */
	BasicTypeEnumViewProperty createBasicTypeEnumViewProperty();

				/**
	 * Returns a new object of class '<em>User Task Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task Group</em>'.
	 * @generated
	 */
	UserTaskGroup createUserTaskGroup();

				/**
	 * Returns a new object of class '<em>Derived Reference View Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Reference View Property</em>'.
	 * @generated
	 */
	DerivedReferenceViewProperty createDerivedReferenceViewProperty();

				/**
	 * Returns a new object of class '<em>Add Task</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Task</em>'.
	 * @generated
	 */
    AddTask createAddTask();

                /**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

																/**
	 * Returns a new object of class '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget</em>'.
	 * @generated
	 */
	Widget createWidget();

																/**
	 * Returns a new object of class '<em>Input Text Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Text Widget</em>'.
	 * @generated
	 */
	InputTextWidget createInputTextWidget();

																/**
	 * Returns a new object of class '<em>Informational Text Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Informational Text Widget</em>'.
	 * @generated
	 */
	InformationalTextWidget createInformationalTextWidget();

																/**
	 * Returns a new object of class '<em>Button Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Widget</em>'.
	 * @generated
	 */
	ButtonWidget createButtonWidget();

																/**
	 * Returns a new object of class '<em>View Attribute Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Attribute Reference</em>'.
	 * @generated
	 */
	ViewAttributeReference createViewAttributeReference();

																/**
	 * Returns a new object of class '<em>Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Reference</em>'.
	 * @generated
	 */
	PropertyReference createPropertyReference();

																/**
	 * Returns a new object of class '<em>Property Referring Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Referring Widget</em>'.
	 * @generated
	 */
	PropertyReferringWidget createPropertyReferringWidget();

																/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SculptorguimetamodelPackage getSculptorguimetamodelPackage();

} //SculptorguimetamodelFactory
