/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sculptorguimetamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SculptorguimetamodelFactoryImpl extends EFactoryImpl implements SculptorguimetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SculptorguimetamodelFactory init() {
		try {
			SculptorguimetamodelFactory theSculptorguimetamodelFactory = (SculptorguimetamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fornax-platform.org/sculptorgui"); 
			if (theSculptorguimetamodelFactory != null) {
				return theSculptorguimetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SculptorguimetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptorguimetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SculptorguimetamodelPackage.GUI_APPLICATION: return createGuiApplication();
			case SculptorguimetamodelPackage.GUI_MODULE: return createGuiModule();
			case SculptorguimetamodelPackage.USER_TASK: return createUserTask();
			case SculptorguimetamodelPackage.CREATE_TASK: return createCreateTask();
			case SculptorguimetamodelPackage.UPDATE_TASK: return createUpdateTask();
			case SculptorguimetamodelPackage.VIEW_TASK: return createViewTask();
			case SculptorguimetamodelPackage.LIST_TASK: return createListTask();
			case SculptorguimetamodelPackage.DELETE_TASK: return createDeleteTask();
			case SculptorguimetamodelPackage.SUB_TASK_TRANSITION: return createSubTaskTransition();
			case SculptorguimetamodelPackage.VIEW_DATA_PROPERTY: return createViewDataProperty();
			case SculptorguimetamodelPackage.TMP_REFERENCE_HOLDER: return createTmpReferenceHolder();
			case SculptorguimetamodelPackage.TMP_SUB_TASK_TRANSITION_HOLDER: return createTmpSubTaskTransitionHolder();
			case SculptorguimetamodelPackage.REFERENCE_TARGET: return createReferenceTarget();
			case SculptorguimetamodelPackage.REFERENCE_VIEW_PROPERTY: return createReferenceViewProperty();
			case SculptorguimetamodelPackage.ATTRIBUTE_VIEW_PROPERTY: return createAttributeViewProperty();
			case SculptorguimetamodelPackage.BASIC_TYPE_VIEW_PROPERTY: return createBasicTypeViewProperty();
			case SculptorguimetamodelPackage.ENUM_VIEW_PROPERTY: return createEnumViewProperty();
			case SculptorguimetamodelPackage.BASIC_TYPE_ENUM_VIEW_PROPERTY: return createBasicTypeEnumViewProperty();
			case SculptorguimetamodelPackage.USER_TASK_GROUP: return createUserTaskGroup();
			case SculptorguimetamodelPackage.DERIVED_REFERENCE_VIEW_PROPERTY: return createDerivedReferenceViewProperty();
			case SculptorguimetamodelPackage.ADD_TASK: return createAddTask();
			case SculptorguimetamodelPackage.VIEW: return createView();
			case SculptorguimetamodelPackage.WIDGET: return createWidget();
			case SculptorguimetamodelPackage.INPUT_TEXT_WIDGET: return createInputTextWidget();
			case SculptorguimetamodelPackage.INFORMATIONAL_TEXT_WIDGET: return createInformationalTextWidget();
			case SculptorguimetamodelPackage.BUTTON_WIDGET: return createButtonWidget();
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET: return createPropertyReferringWidget();
			case SculptorguimetamodelPackage.TABLE_WIDGET: return createTableWidget();
			case SculptorguimetamodelPackage.GUI_EVENT: return createGuiEvent();
			case SculptorguimetamodelPackage.TABLE_COLUMN: return createTableColumn();
			case SculptorguimetamodelPackage.TEXT_AREA_WIDGET: return createTextAreaWidget();
			case SculptorguimetamodelPackage.AUTOCOMPLETE_WIDGET: return createAutocompleteWidget();
			case SculptorguimetamodelPackage.RADIO_BUTTONS_WIDGET: return createRadioButtonsWidget();
			case SculptorguimetamodelPackage.RICH_TEXT_AREA_WIDGET: return createRichTextAreaWidget();
			case SculptorguimetamodelPackage.INPUT_DATE_WIDGET: return createInputDateWidget();
			case SculptorguimetamodelPackage.NUMBER_SPINNER_WIDGET: return createNumberSpinnerWidget();
			case SculptorguimetamodelPackage.SERVICE_PROXY: return createServiceProxy();
			case SculptorguimetamodelPackage.SERVICE_PROXY_OPERATION: return createServiceProxyOperation();
			case SculptorguimetamodelPackage.GUI_COMMAND: return createGuiCommand();
			case SculptorguimetamodelPackage.VIEW_PARAMETER: return createViewParameter();
			case SculptorguimetamodelPackage.LINK_WIDGET: return createLinkWidget();
			case SculptorguimetamodelPackage.WIDGETS_CONTAINER: return createWidgetsContainer();
			case SculptorguimetamodelPackage.PANEL_WIDGET: return createPanelWidget();
			case SculptorguimetamodelPackage.UI_BEHAVIOR: return createUiBehavior();
			case SculptorguimetamodelPackage.POPULATE_PANEL_BEHAVIOR: return createPopulatePanelBehavior();
			case SculptorguimetamodelPackage.NAVIGATE_TO_VIEW_BEHAVIOR: return createNavigateToViewBehavior();
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING: return createBehaviorBinding();
			case SculptorguimetamodelPackage.ON_CLICK_BINDING: return createOnClickBinding();
			case SculptorguimetamodelPackage.ON_HOVER_BINDING: return createOnHoverBinding();
			case SculptorguimetamodelPackage.UI_CONDITION: return createUiCondition();
			case SculptorguimetamodelPackage.GUI_DTO: return createGuiDto();
			case SculptorguimetamodelPackage.GUI_ENUM: return createGuiEnum();
			case SculptorguimetamodelPackage.STUB_MODULE: return createStubModule();
			case SculptorguimetamodelPackage.LIST_BOX_WIDGET: return createListBoxWidget();
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER: return createBehaviorContainer();
			case SculptorguimetamodelPackage.CUSTOM_WIDGET: return createCustomWidget();
			case SculptorguimetamodelPackage.UPDATE_TABLE_BEHAVIOR: return createUpdateTableBehavior();
			case SculptorguimetamodelPackage.CONFIRM_MESSAGE_BEHAVIOR: return createConfirmMessageBehavior();
			case SculptorguimetamodelPackage.CUSTOM_BEHAVIOR: return createCustomBehavior();
			case SculptorguimetamodelPackage.CUSTOM_CONDITION: return createCustomCondition();
			case SculptorguimetamodelPackage.COMPOSITE_BEHAVIOR: return createCompositeBehavior();
			case SculptorguimetamodelPackage.ON_SELECT_ITEM_BINDING: return createOnSelectItemBinding();
			case SculptorguimetamodelPackage.WIDGET_TABLE_COLUMN: return createWidgetTableColumn();
			case SculptorguimetamodelPackage.SIMPLE_TABLE_COLUMN: return createSimpleTableColumn();
			case SculptorguimetamodelPackage.SET_DIRTY_FLAG_BEHAVIOR: return createSetDirtyFlagBehavior();
			case SculptorguimetamodelPackage.WARN_IF_DIRTY_BEHAVIOR: return createWarnIfDirtyBehavior();
			case SculptorguimetamodelPackage.POPULATE_LIST_BOX_BEHAVIOR: return createPopulateListBoxBehavior();
			case SculptorguimetamodelPackage.MARK_DIRTY_BEHAVIOR: return createMarkDirtyBehavior();
			case SculptorguimetamodelPackage.MARK_CLEAN_BEHAVIOR: return createMarkCleanBehavior();
			case SculptorguimetamodelPackage.GO_BACK_BEHAVIOR: return createGoBackBehavior();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiApplication createGuiApplication() {
		GuiApplicationImpl guiApplication = new GuiApplicationImpl();
		return guiApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiModule createGuiModule() {
		GuiModuleImpl guiModule = new GuiModuleImpl();
		return guiModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTask createCreateTask() {
		CreateTaskImpl createTask = new CreateTaskImpl();
		return createTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateTask createUpdateTask() {
		UpdateTaskImpl updateTask = new UpdateTaskImpl();
		return updateTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewTask createViewTask() {
		ViewTaskImpl viewTask = new ViewTaskImpl();
		return viewTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListTask createListTask() {
		ListTaskImpl listTask = new ListTaskImpl();
		return listTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteTask createDeleteTask() {
		DeleteTaskImpl deleteTask = new DeleteTaskImpl();
		return deleteTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubTaskTransition createSubTaskTransition() {
		SubTaskTransitionImpl subTaskTransition = new SubTaskTransitionImpl();
		return subTaskTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewDataProperty createViewDataProperty() {
		ViewDataPropertyImpl viewDataProperty = new ViewDataPropertyImpl();
		return viewDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmpReferenceHolder createTmpReferenceHolder() {
		TmpReferenceHolderImpl tmpReferenceHolder = new TmpReferenceHolderImpl();
		return tmpReferenceHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmpSubTaskTransitionHolder createTmpSubTaskTransitionHolder() {
		TmpSubTaskTransitionHolderImpl tmpSubTaskTransitionHolder = new TmpSubTaskTransitionHolderImpl();
		return tmpSubTaskTransitionHolder;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReferenceTarget createReferenceTarget() {
		ReferenceTargetImpl referenceTarget = new ReferenceTargetImpl();
		return referenceTarget;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReferenceViewProperty createReferenceViewProperty() {
		ReferenceViewPropertyImpl referenceViewProperty = new ReferenceViewPropertyImpl();
		return referenceViewProperty;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AttributeViewProperty createAttributeViewProperty() {
		AttributeViewPropertyImpl attributeViewProperty = new AttributeViewPropertyImpl();
		return attributeViewProperty;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BasicTypeViewProperty createBasicTypeViewProperty() {
		BasicTypeViewPropertyImpl basicTypeViewProperty = new BasicTypeViewPropertyImpl();
		return basicTypeViewProperty;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EnumViewProperty createEnumViewProperty() {
		EnumViewPropertyImpl enumViewProperty = new EnumViewPropertyImpl();
		return enumViewProperty;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicTypeEnumViewProperty createBasicTypeEnumViewProperty() {
		BasicTypeEnumViewPropertyImpl basicTypeEnumViewProperty = new BasicTypeEnumViewPropertyImpl();
		return basicTypeEnumViewProperty;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTaskGroup createUserTaskGroup() {
		UserTaskGroupImpl userTaskGroup = new UserTaskGroupImpl();
		return userTaskGroup;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedReferenceViewProperty createDerivedReferenceViewProperty() {
		DerivedReferenceViewPropertyImpl derivedReferenceViewProperty = new DerivedReferenceViewPropertyImpl();
		return derivedReferenceViewProperty;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AddTask createAddTask() {
		AddTaskImpl addTask = new AddTaskImpl();
		return addTask;
	}

                /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputTextWidget createInputTextWidget() {
		InputTextWidgetImpl inputTextWidget = new InputTextWidgetImpl();
		return inputTextWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationalTextWidget createInformationalTextWidget() {
		InformationalTextWidgetImpl informationalTextWidget = new InformationalTextWidgetImpl();
		return informationalTextWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonWidget createButtonWidget() {
		ButtonWidgetImpl buttonWidget = new ButtonWidgetImpl();
		return buttonWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyReferringWidget createPropertyReferringWidget() {
		PropertyReferringWidgetImpl propertyReferringWidget = new PropertyReferringWidgetImpl();
		return propertyReferringWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableWidget createTableWidget() {
		TableWidgetImpl tableWidget = new TableWidgetImpl();
		return tableWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiEvent createGuiEvent() {
		GuiEventImpl guiEvent = new GuiEventImpl();
		return guiEvent;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumn createTableColumn() {
		TableColumnImpl tableColumn = new TableColumnImpl();
		return tableColumn;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAreaWidget createTextAreaWidget() {
		TextAreaWidgetImpl textAreaWidget = new TextAreaWidgetImpl();
		return textAreaWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutocompleteWidget createAutocompleteWidget() {
		AutocompleteWidgetImpl autocompleteWidget = new AutocompleteWidgetImpl();
		return autocompleteWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButtonsWidget createRadioButtonsWidget() {
		RadioButtonsWidgetImpl radioButtonsWidget = new RadioButtonsWidgetImpl();
		return radioButtonsWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichTextAreaWidget createRichTextAreaWidget() {
		RichTextAreaWidgetImpl richTextAreaWidget = new RichTextAreaWidgetImpl();
		return richTextAreaWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDateWidget createInputDateWidget() {
		InputDateWidgetImpl inputDateWidget = new InputDateWidgetImpl();
		return inputDateWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberSpinnerWidget createNumberSpinnerWidget() {
		NumberSpinnerWidgetImpl numberSpinnerWidget = new NumberSpinnerWidgetImpl();
		return numberSpinnerWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProxy createServiceProxy() {
		ServiceProxyImpl serviceProxy = new ServiceProxyImpl();
		return serviceProxy;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProxyOperation createServiceProxyOperation() {
		ServiceProxyOperationImpl serviceProxyOperation = new ServiceProxyOperationImpl();
		return serviceProxyOperation;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiCommand createGuiCommand() {
		GuiCommandImpl guiCommand = new GuiCommandImpl();
		return guiCommand;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewParameter createViewParameter() {
		ViewParameterImpl viewParameter = new ViewParameterImpl();
		return viewParameter;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkWidget createLinkWidget() {
		LinkWidgetImpl linkWidget = new LinkWidgetImpl();
		return linkWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetsContainer createWidgetsContainer() {
		WidgetsContainerImpl widgetsContainer = new WidgetsContainerImpl();
		return widgetsContainer;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelWidget createPanelWidget() {
		PanelWidgetImpl panelWidget = new PanelWidgetImpl();
		return panelWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBehavior createUiBehavior() {
		UiBehaviorImpl uiBehavior = new UiBehaviorImpl();
		return uiBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulatePanelBehavior createPopulatePanelBehavior() {
		PopulatePanelBehaviorImpl populatePanelBehavior = new PopulatePanelBehaviorImpl();
		return populatePanelBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigateToViewBehavior createNavigateToViewBehavior() {
		NavigateToViewBehaviorImpl navigateToViewBehavior = new NavigateToViewBehaviorImpl();
		return navigateToViewBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorBinding createBehaviorBinding() {
		BehaviorBindingImpl behaviorBinding = new BehaviorBindingImpl();
		return behaviorBinding;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnClickBinding createOnClickBinding() {
		OnClickBindingImpl onClickBinding = new OnClickBindingImpl();
		return onClickBinding;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnHoverBinding createOnHoverBinding() {
		OnHoverBindingImpl onHoverBinding = new OnHoverBindingImpl();
		return onHoverBinding;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCondition createUiCondition() {
		UiConditionImpl uiCondition = new UiConditionImpl();
		return uiCondition;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiDto createGuiDto() {
		GuiDtoImpl guiDto = new GuiDtoImpl();
		return guiDto;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiEnum createGuiEnum() {
		GuiEnumImpl guiEnum = new GuiEnumImpl();
		return guiEnum;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StubModule createStubModule() {
		StubModuleImpl stubModule = new StubModuleImpl();
		return stubModule;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListBoxWidget createListBoxWidget() {
		ListBoxWidgetImpl listBoxWidget = new ListBoxWidgetImpl();
		return listBoxWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorContainer createBehaviorContainer() {
		BehaviorContainerImpl behaviorContainer = new BehaviorContainerImpl();
		return behaviorContainer;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomWidget createCustomWidget() {
		CustomWidgetImpl customWidget = new CustomWidgetImpl();
		return customWidget;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateTableBehavior createUpdateTableBehavior() {
		UpdateTableBehaviorImpl updateTableBehavior = new UpdateTableBehaviorImpl();
		return updateTableBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmMessageBehavior createConfirmMessageBehavior() {
		ConfirmMessageBehaviorImpl confirmMessageBehavior = new ConfirmMessageBehaviorImpl();
		return confirmMessageBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomBehavior createCustomBehavior() {
		CustomBehaviorImpl customBehavior = new CustomBehaviorImpl();
		return customBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomCondition createCustomCondition() {
		CustomConditionImpl customCondition = new CustomConditionImpl();
		return customCondition;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeBehavior createCompositeBehavior() {
		CompositeBehaviorImpl compositeBehavior = new CompositeBehaviorImpl();
		return compositeBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSelectItemBinding createOnSelectItemBinding() {
		OnSelectItemBindingImpl onSelectItemBinding = new OnSelectItemBindingImpl();
		return onSelectItemBinding;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetTableColumn createWidgetTableColumn() {
		WidgetTableColumnImpl widgetTableColumn = new WidgetTableColumnImpl();
		return widgetTableColumn;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTableColumn createSimpleTableColumn() {
		SimpleTableColumnImpl simpleTableColumn = new SimpleTableColumnImpl();
		return simpleTableColumn;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetDirtyFlagBehavior createSetDirtyFlagBehavior() {
		SetDirtyFlagBehaviorImpl setDirtyFlagBehavior = new SetDirtyFlagBehaviorImpl();
		return setDirtyFlagBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarnIfDirtyBehavior createWarnIfDirtyBehavior() {
		WarnIfDirtyBehaviorImpl warnIfDirtyBehavior = new WarnIfDirtyBehaviorImpl();
		return warnIfDirtyBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulateListBoxBehavior createPopulateListBoxBehavior() {
		PopulateListBoxBehaviorImpl populateListBoxBehavior = new PopulateListBoxBehaviorImpl();
		return populateListBoxBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkDirtyBehavior createMarkDirtyBehavior() {
		MarkDirtyBehaviorImpl markDirtyBehavior = new MarkDirtyBehaviorImpl();
		return markDirtyBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkCleanBehavior createMarkCleanBehavior() {
		MarkCleanBehaviorImpl markCleanBehavior = new MarkCleanBehaviorImpl();
		return markCleanBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoBackBehavior createGoBackBehavior() {
		GoBackBehaviorImpl goBackBehavior = new GoBackBehaviorImpl();
		return goBackBehavior;
	}

																/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptorguimetamodelPackage getSculptorguimetamodelPackage() {
		return (SculptorguimetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SculptorguimetamodelPackage getPackage() {
		return SculptorguimetamodelPackage.eINSTANCE;
	}

} //SculptorguimetamodelFactoryImpl
