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
	 * Returns a new object of class '<em>Property Referring Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Referring Widget</em>'.
	 * @generated
	 */
	PropertyReferringWidget createPropertyReferringWidget();

																/**
	 * Returns a new object of class '<em>Table Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Widget</em>'.
	 * @generated
	 */
	TableWidget createTableWidget();

																/**
	 * Returns a new object of class '<em>Gui Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Event</em>'.
	 * @generated
	 */
	GuiEvent createGuiEvent();

																/**
	 * Returns a new object of class '<em>Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Column</em>'.
	 * @generated
	 */
	TableColumn createTableColumn();

																/**
	 * Returns a new object of class '<em>Text Area Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Area Widget</em>'.
	 * @generated
	 */
	TextAreaWidget createTextAreaWidget();

																/**
	 * Returns a new object of class '<em>Autocomplete Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autocomplete Widget</em>'.
	 * @generated
	 */
	AutocompleteWidget createAutocompleteWidget();

																/**
	 * Returns a new object of class '<em>Radio Buttons Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Buttons Widget</em>'.
	 * @generated
	 */
	RadioButtonsWidget createRadioButtonsWidget();

																/**
	 * Returns a new object of class '<em>Rich Text Area Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich Text Area Widget</em>'.
	 * @generated
	 */
	RichTextAreaWidget createRichTextAreaWidget();

																/**
	 * Returns a new object of class '<em>Input Date Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Date Widget</em>'.
	 * @generated
	 */
	InputDateWidget createInputDateWidget();

																/**
	 * Returns a new object of class '<em>Number Spinner Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Spinner Widget</em>'.
	 * @generated
	 */
	NumberSpinnerWidget createNumberSpinnerWidget();

																/**
	 * Returns a new object of class '<em>Service Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Proxy</em>'.
	 * @generated
	 */
	ServiceProxy createServiceProxy();

																/**
	 * Returns a new object of class '<em>Service Proxy Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Proxy Operation</em>'.
	 * @generated
	 */
	ServiceProxyOperation createServiceProxyOperation();

																/**
	 * Returns a new object of class '<em>Gui Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Command</em>'.
	 * @generated
	 */
	GuiCommand createGuiCommand();

																/**
	 * Returns a new object of class '<em>View Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Parameter</em>'.
	 * @generated
	 */
	ViewParameter createViewParameter();

																/**
	 * Returns a new object of class '<em>Link Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Widget</em>'.
	 * @generated
	 */
	LinkWidget createLinkWidget();

																/**
	 * Returns a new object of class '<em>Widgets Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widgets Container</em>'.
	 * @generated
	 */
	WidgetsContainer createWidgetsContainer();

																/**
	 * Returns a new object of class '<em>Panel Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Panel Widget</em>'.
	 * @generated
	 */
	PanelWidget createPanelWidget();

																/**
	 * Returns a new object of class '<em>Ui Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Behavior</em>'.
	 * @generated
	 */
	UiBehavior createUiBehavior();

																/**
	 * Returns a new object of class '<em>Populate Panel Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Populate Panel Behavior</em>'.
	 * @generated
	 */
	PopulatePanelBehavior createPopulatePanelBehavior();

																/**
	 * Returns a new object of class '<em>Navigate To View Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigate To View Behavior</em>'.
	 * @generated
	 */
	NavigateToViewBehavior createNavigateToViewBehavior();

																/**
	 * Returns a new object of class '<em>Behavior Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Binding</em>'.
	 * @generated
	 */
	BehaviorBinding createBehaviorBinding();

																/**
	 * Returns a new object of class '<em>On Click Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Click Binding</em>'.
	 * @generated
	 */
	OnClickBinding createOnClickBinding();

																/**
	 * Returns a new object of class '<em>On Hover Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Hover Binding</em>'.
	 * @generated
	 */
	OnHoverBinding createOnHoverBinding();

																/**
	 * Returns a new object of class '<em>Ui Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Condition</em>'.
	 * @generated
	 */
	UiCondition createUiCondition();

																/**
	 * Returns a new object of class '<em>Gui Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Dto</em>'.
	 * @generated
	 */
	GuiDto createGuiDto();

																/**
	 * Returns a new object of class '<em>Gui Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Enum</em>'.
	 * @generated
	 */
	GuiEnum createGuiEnum();

																/**
	 * Returns a new object of class '<em>Stub Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stub Module</em>'.
	 * @generated
	 */
	StubModule createStubModule();

																/**
	 * Returns a new object of class '<em>List Box Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Box Widget</em>'.
	 * @generated
	 */
	ListBoxWidget createListBoxWidget();

																/**
	 * Returns a new object of class '<em>Behavior Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Container</em>'.
	 * @generated
	 */
	BehaviorContainer createBehaviorContainer();

																/**
	 * Returns a new object of class '<em>Custom Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Widget</em>'.
	 * @generated
	 */
	CustomWidget createCustomWidget();

																/**
	 * Returns a new object of class '<em>Update Table Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Table Behavior</em>'.
	 * @generated
	 */
	UpdateTableBehavior createUpdateTableBehavior();

																/**
	 * Returns a new object of class '<em>Confirm Message Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confirm Message Behavior</em>'.
	 * @generated
	 */
	ConfirmMessageBehavior createConfirmMessageBehavior();

																/**
	 * Returns a new object of class '<em>Custom Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Behavior</em>'.
	 * @generated
	 */
	CustomBehavior createCustomBehavior();

																/**
	 * Returns a new object of class '<em>Custom Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Condition</em>'.
	 * @generated
	 */
	CustomCondition createCustomCondition();

																/**
	 * Returns a new object of class '<em>Composite Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Behavior</em>'.
	 * @generated
	 */
	CompositeBehavior createCompositeBehavior();

																/**
	 * Returns a new object of class '<em>On Select Item Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Select Item Binding</em>'.
	 * @generated
	 */
	OnSelectItemBinding createOnSelectItemBinding();

																/**
	 * Returns a new object of class '<em>Widget Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Table Column</em>'.
	 * @generated
	 */
	WidgetTableColumn createWidgetTableColumn();

																/**
	 * Returns a new object of class '<em>Simple Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Table Column</em>'.
	 * @generated
	 */
	SimpleTableColumn createSimpleTableColumn();

																/**
	 * Returns a new object of class '<em>Set Dirty Flag Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Dirty Flag Behavior</em>'.
	 * @generated
	 */
	SetDirtyFlagBehavior createSetDirtyFlagBehavior();

																/**
	 * Returns a new object of class '<em>Warn If Dirty Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warn If Dirty Behavior</em>'.
	 * @generated
	 */
	WarnIfDirtyBehavior createWarnIfDirtyBehavior();

																/**
	 * Returns a new object of class '<em>Populate List Box Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Populate List Box Behavior</em>'.
	 * @generated
	 */
	PopulateListBoxBehavior createPopulateListBoxBehavior();

																/**
	 * Returns a new object of class '<em>Mark Dirty Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark Dirty Behavior</em>'.
	 * @generated
	 */
	MarkDirtyBehavior createMarkDirtyBehavior();

																/**
	 * Returns a new object of class '<em>Mark Clean Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark Clean Behavior</em>'.
	 * @generated
	 */
	MarkCleanBehavior createMarkCleanBehavior();

																/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SculptorguimetamodelPackage getSculptorguimetamodelPackage();

} //SculptorguimetamodelFactory
