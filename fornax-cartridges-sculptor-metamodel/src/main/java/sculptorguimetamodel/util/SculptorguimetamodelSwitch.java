/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import sculptorguimetamodel.*;

import sculptormetamodel.DomainObject;
import sculptormetamodel.DomainObjectTypedElement;
import sculptormetamodel.Module;
import sculptormetamodel.NamedElement;
import sculptormetamodel.Operation;
import sculptormetamodel.Service;
import sculptormetamodel.ServiceOperation;
import sculptormetamodel.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sculptorguimetamodel.SculptorguimetamodelPackage
 * @generated
 */
public class SculptorguimetamodelSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SculptorguimetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptorguimetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = SculptorguimetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SculptorguimetamodelPackage.GUI_APPLICATION: {
				GuiApplication guiApplication = (GuiApplication)theEObject;
				Object result = caseGuiApplication(guiApplication);
				if (result == null) result = caseNamedElement(guiApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.GUI_MODULE: {
				GuiModule guiModule = (GuiModule)theEObject;
				Object result = caseGuiModule(guiModule);
				if (result == null) result = caseNamedElement(guiModule);
				if (result == null) result = caseBehaviorContainer(guiModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.USER_TASK: {
				UserTask userTask = (UserTask)theEObject;
				Object result = caseUserTask(userTask);
				if (result == null) result = caseNamedElement(userTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.CREATE_TASK: {
				CreateTask createTask = (CreateTask)theEObject;
				Object result = caseCreateTask(createTask);
				if (result == null) result = caseUserTask(createTask);
				if (result == null) result = caseNamedElement(createTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.UPDATE_TASK: {
				UpdateTask updateTask = (UpdateTask)theEObject;
				Object result = caseUpdateTask(updateTask);
				if (result == null) result = caseUserTask(updateTask);
				if (result == null) result = caseNamedElement(updateTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.VIEW_TASK: {
				ViewTask viewTask = (ViewTask)theEObject;
				Object result = caseViewTask(viewTask);
				if (result == null) result = caseUserTask(viewTask);
				if (result == null) result = caseNamedElement(viewTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.LIST_TASK: {
				ListTask listTask = (ListTask)theEObject;
				Object result = caseListTask(listTask);
				if (result == null) result = caseUserTask(listTask);
				if (result == null) result = caseNamedElement(listTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.DELETE_TASK: {
				DeleteTask deleteTask = (DeleteTask)theEObject;
				Object result = caseDeleteTask(deleteTask);
				if (result == null) result = caseUserTask(deleteTask);
				if (result == null) result = caseNamedElement(deleteTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.SUB_TASK_TRANSITION: {
				SubTaskTransition subTaskTransition = (SubTaskTransition)theEObject;
				Object result = caseSubTaskTransition(subTaskTransition);
				if (result == null) result = caseNamedElement(subTaskTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.VIEW_DATA_PROPERTY: {
				ViewDataProperty viewDataProperty = (ViewDataProperty)theEObject;
				Object result = caseViewDataProperty(viewDataProperty);
				if (result == null) result = caseNamedElement(viewDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.TMP_REFERENCE_HOLDER: {
				TmpReferenceHolder tmpReferenceHolder = (TmpReferenceHolder)theEObject;
				Object result = caseTmpReferenceHolder(tmpReferenceHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.TMP_SUB_TASK_TRANSITION_HOLDER: {
				TmpSubTaskTransitionHolder tmpSubTaskTransitionHolder = (TmpSubTaskTransitionHolder)theEObject;
				Object result = caseTmpSubTaskTransitionHolder(tmpSubTaskTransitionHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.REFERENCE_TARGET: {
				ReferenceTarget referenceTarget = (ReferenceTarget)theEObject;
				Object result = caseReferenceTarget(referenceTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.REFERENCE_VIEW_PROPERTY: {
				ReferenceViewProperty referenceViewProperty = (ReferenceViewProperty)theEObject;
				Object result = caseReferenceViewProperty(referenceViewProperty);
				if (result == null) result = caseViewDataProperty(referenceViewProperty);
				if (result == null) result = caseNamedElement(referenceViewProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.ATTRIBUTE_VIEW_PROPERTY: {
				AttributeViewProperty attributeViewProperty = (AttributeViewProperty)theEObject;
				Object result = caseAttributeViewProperty(attributeViewProperty);
				if (result == null) result = caseViewDataProperty(attributeViewProperty);
				if (result == null) result = caseNamedElement(attributeViewProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.BASIC_TYPE_VIEW_PROPERTY: {
				BasicTypeViewProperty basicTypeViewProperty = (BasicTypeViewProperty)theEObject;
				Object result = caseBasicTypeViewProperty(basicTypeViewProperty);
				if (result == null) result = caseViewDataProperty(basicTypeViewProperty);
				if (result == null) result = caseNamedElement(basicTypeViewProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.ENUM_VIEW_PROPERTY: {
				EnumViewProperty enumViewProperty = (EnumViewProperty)theEObject;
				Object result = caseEnumViewProperty(enumViewProperty);
				if (result == null) result = caseViewDataProperty(enumViewProperty);
				if (result == null) result = caseNamedElement(enumViewProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.BASIC_TYPE_ENUM_VIEW_PROPERTY: {
				BasicTypeEnumViewProperty basicTypeEnumViewProperty = (BasicTypeEnumViewProperty)theEObject;
				Object result = caseBasicTypeEnumViewProperty(basicTypeEnumViewProperty);
				if (result == null) result = caseEnumViewProperty(basicTypeEnumViewProperty);
				if (result == null) result = caseViewDataProperty(basicTypeEnumViewProperty);
				if (result == null) result = caseNamedElement(basicTypeEnumViewProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.USER_TASK_GROUP: {
				UserTaskGroup userTaskGroup = (UserTaskGroup)theEObject;
				Object result = caseUserTaskGroup(userTaskGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.DERIVED_REFERENCE_VIEW_PROPERTY: {
				DerivedReferenceViewProperty derivedReferenceViewProperty = (DerivedReferenceViewProperty)theEObject;
				Object result = caseDerivedReferenceViewProperty(derivedReferenceViewProperty);
				if (result == null) result = caseReferenceViewProperty(derivedReferenceViewProperty);
				if (result == null) result = caseViewDataProperty(derivedReferenceViewProperty);
				if (result == null) result = caseNamedElement(derivedReferenceViewProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.ADD_TASK: {
				AddTask addTask = (AddTask)theEObject;
				Object result = caseAddTask(addTask);
				if (result == null) result = caseUserTask(addTask);
				if (result == null) result = caseNamedElement(addTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.VIEW: {
				View view = (View)theEObject;
				Object result = caseView(view);
				if (result == null) result = caseWidgetsContainer(view);
				if (result == null) result = caseNamedElement(view);
				if (result == null) result = caseBehaviorContainer(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				Object result = caseWidget(widget);
				if (result == null) result = caseNamedElement(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.INPUT_TEXT_WIDGET: {
				InputTextWidget inputTextWidget = (InputTextWidget)theEObject;
				Object result = caseInputTextWidget(inputTextWidget);
				if (result == null) result = casePropertyReferringWidget(inputTextWidget);
				if (result == null) result = caseWidget(inputTextWidget);
				if (result == null) result = caseNamedElement(inputTextWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.INFORMATIONAL_TEXT_WIDGET: {
				InformationalTextWidget informationalTextWidget = (InformationalTextWidget)theEObject;
				Object result = caseInformationalTextWidget(informationalTextWidget);
				if (result == null) result = casePropertyReferringWidget(informationalTextWidget);
				if (result == null) result = caseWidget(informationalTextWidget);
				if (result == null) result = caseNamedElement(informationalTextWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.BUTTON_WIDGET: {
				ButtonWidget buttonWidget = (ButtonWidget)theEObject;
				Object result = caseButtonWidget(buttonWidget);
				if (result == null) result = caseWidget(buttonWidget);
				if (result == null) result = caseNamedElement(buttonWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET: {
				PropertyReferringWidget propertyReferringWidget = (PropertyReferringWidget)theEObject;
				Object result = casePropertyReferringWidget(propertyReferringWidget);
				if (result == null) result = caseWidget(propertyReferringWidget);
				if (result == null) result = caseNamedElement(propertyReferringWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.TABLE_WIDGET: {
				TableWidget tableWidget = (TableWidget)theEObject;
				Object result = caseTableWidget(tableWidget);
				if (result == null) result = casePropertyReferringWidget(tableWidget);
				if (result == null) result = caseWidget(tableWidget);
				if (result == null) result = caseNamedElement(tableWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.GUI_EVENT: {
				GuiEvent guiEvent = (GuiEvent)theEObject;
				Object result = caseGuiEvent(guiEvent);
				if (result == null) result = caseDomainObject(guiEvent);
				if (result == null) result = caseNamedElement(guiEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.TABLE_COLUMN: {
				TableColumn tableColumn = (TableColumn)theEObject;
				Object result = caseTableColumn(tableColumn);
				if (result == null) result = casePropertyReferringWidget(tableColumn);
				if (result == null) result = caseWidget(tableColumn);
				if (result == null) result = caseNamedElement(tableColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.TEXT_AREA_WIDGET: {
				TextAreaWidget textAreaWidget = (TextAreaWidget)theEObject;
				Object result = caseTextAreaWidget(textAreaWidget);
				if (result == null) result = casePropertyReferringWidget(textAreaWidget);
				if (result == null) result = caseWidget(textAreaWidget);
				if (result == null) result = caseNamedElement(textAreaWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.AUTOCOMPLETE_WIDGET: {
				AutocompleteWidget autocompleteWidget = (AutocompleteWidget)theEObject;
				Object result = caseAutocompleteWidget(autocompleteWidget);
				if (result == null) result = casePropertyReferringWidget(autocompleteWidget);
				if (result == null) result = caseWidget(autocompleteWidget);
				if (result == null) result = caseNamedElement(autocompleteWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.RADIO_BUTTONS_WIDGET: {
				RadioButtonsWidget radioButtonsWidget = (RadioButtonsWidget)theEObject;
				Object result = caseRadioButtonsWidget(radioButtonsWidget);
				if (result == null) result = casePropertyReferringWidget(radioButtonsWidget);
				if (result == null) result = caseWidget(radioButtonsWidget);
				if (result == null) result = caseNamedElement(radioButtonsWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.RICH_TEXT_AREA_WIDGET: {
				RichTextAreaWidget richTextAreaWidget = (RichTextAreaWidget)theEObject;
				Object result = caseRichTextAreaWidget(richTextAreaWidget);
				if (result == null) result = casePropertyReferringWidget(richTextAreaWidget);
				if (result == null) result = caseWidget(richTextAreaWidget);
				if (result == null) result = caseNamedElement(richTextAreaWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.INPUT_DATE_WIDGET: {
				InputDateWidget inputDateWidget = (InputDateWidget)theEObject;
				Object result = caseInputDateWidget(inputDateWidget);
				if (result == null) result = casePropertyReferringWidget(inputDateWidget);
				if (result == null) result = caseWidget(inputDateWidget);
				if (result == null) result = caseNamedElement(inputDateWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.NUMBER_SPINNER_WIDGET: {
				NumberSpinnerWidget numberSpinnerWidget = (NumberSpinnerWidget)theEObject;
				Object result = caseNumberSpinnerWidget(numberSpinnerWidget);
				if (result == null) result = casePropertyReferringWidget(numberSpinnerWidget);
				if (result == null) result = caseWidget(numberSpinnerWidget);
				if (result == null) result = caseNamedElement(numberSpinnerWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.SERVICE_PROXY: {
				ServiceProxy serviceProxy = (ServiceProxy)theEObject;
				Object result = caseServiceProxy(serviceProxy);
				if (result == null) result = caseService(serviceProxy);
				if (result == null) result = caseNamedElement(serviceProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.SERVICE_PROXY_OPERATION: {
				ServiceProxyOperation serviceProxyOperation = (ServiceProxyOperation)theEObject;
				Object result = caseServiceProxyOperation(serviceProxyOperation);
				if (result == null) result = caseServiceOperation(serviceProxyOperation);
				if (result == null) result = caseOperation(serviceProxyOperation);
				if (result == null) result = caseDomainObjectTypedElement(serviceProxyOperation);
				if (result == null) result = caseTypedElement(serviceProxyOperation);
				if (result == null) result = caseNamedElement(serviceProxyOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.GUI_COMMAND: {
				GuiCommand guiCommand = (GuiCommand)theEObject;
				Object result = caseGuiCommand(guiCommand);
				if (result == null) result = caseGuiDto(guiCommand);
				if (result == null) result = caseDomainObject(guiCommand);
				if (result == null) result = caseNamedElement(guiCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.VIEW_PARAMETER: {
				ViewParameter viewParameter = (ViewParameter)theEObject;
				Object result = caseViewParameter(viewParameter);
				if (result == null) result = caseTypedElement(viewParameter);
				if (result == null) result = caseNamedElement(viewParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.LINK_WIDGET: {
				LinkWidget linkWidget = (LinkWidget)theEObject;
				Object result = caseLinkWidget(linkWidget);
				if (result == null) result = caseWidget(linkWidget);
				if (result == null) result = caseNamedElement(linkWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.WIDGETS_CONTAINER: {
				WidgetsContainer widgetsContainer = (WidgetsContainer)theEObject;
				Object result = caseWidgetsContainer(widgetsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.PANEL_WIDGET: {
				PanelWidget panelWidget = (PanelWidget)theEObject;
				Object result = casePanelWidget(panelWidget);
				if (result == null) result = caseWidget(panelWidget);
				if (result == null) result = caseWidgetsContainer(panelWidget);
				if (result == null) result = caseNamedElement(panelWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.UI_BEHAVIOR: {
				UiBehavior uiBehavior = (UiBehavior)theEObject;
				Object result = caseUiBehavior(uiBehavior);
				if (result == null) result = caseNamedElement(uiBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.POPULATE_PANEL_BEHAVIOR: {
				PopulatePanelBehavior populatePanelBehavior = (PopulatePanelBehavior)theEObject;
				Object result = casePopulatePanelBehavior(populatePanelBehavior);
				if (result == null) result = caseUiBehavior(populatePanelBehavior);
				if (result == null) result = caseNamedElement(populatePanelBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.NAVIGATE_TO_VIEW_BEHAVIOR: {
				NavigateToViewBehavior navigateToViewBehavior = (NavigateToViewBehavior)theEObject;
				Object result = caseNavigateToViewBehavior(navigateToViewBehavior);
				if (result == null) result = caseUiBehavior(navigateToViewBehavior);
				if (result == null) result = caseNamedElement(navigateToViewBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.BEHAVIOR_BINDING: {
				BehaviorBinding behaviorBinding = (BehaviorBinding)theEObject;
				Object result = caseBehaviorBinding(behaviorBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.ON_CLICK_BINDING: {
				OnClickBinding onClickBinding = (OnClickBinding)theEObject;
				Object result = caseOnClickBinding(onClickBinding);
				if (result == null) result = caseBehaviorBinding(onClickBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.ON_HOVER_BINDING: {
				OnHoverBinding onHoverBinding = (OnHoverBinding)theEObject;
				Object result = caseOnHoverBinding(onHoverBinding);
				if (result == null) result = caseBehaviorBinding(onHoverBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.UI_CONDITION: {
				UiCondition uiCondition = (UiCondition)theEObject;
				Object result = caseUiCondition(uiCondition);
				if (result == null) result = caseNamedElement(uiCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.GUI_DTO: {
				GuiDto guiDto = (GuiDto)theEObject;
				Object result = caseGuiDto(guiDto);
				if (result == null) result = caseDomainObject(guiDto);
				if (result == null) result = caseNamedElement(guiDto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.GUI_ENUM: {
				GuiEnum guiEnum = (GuiEnum)theEObject;
				Object result = caseGuiEnum(guiEnum);
				if (result == null) result = caseEnum(guiEnum);
				if (result == null) result = caseGuiDto(guiEnum);
				if (result == null) result = caseDomainObject(guiEnum);
				if (result == null) result = caseNamedElement(guiEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.STUB_MODULE: {
				StubModule stubModule = (StubModule)theEObject;
				Object result = caseStubModule(stubModule);
				if (result == null) result = caseModule(stubModule);
				if (result == null) result = caseNamedElement(stubModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.LIST_BOX_WIDGET: {
				ListBoxWidget listBoxWidget = (ListBoxWidget)theEObject;
				Object result = caseListBoxWidget(listBoxWidget);
				if (result == null) result = casePropertyReferringWidget(listBoxWidget);
				if (result == null) result = caseWidget(listBoxWidget);
				if (result == null) result = caseNamedElement(listBoxWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.BEHAVIOR_CONTAINER: {
				BehaviorContainer behaviorContainer = (BehaviorContainer)theEObject;
				Object result = caseBehaviorContainer(behaviorContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.CUSTOM_WIDGET: {
				CustomWidget customWidget = (CustomWidget)theEObject;
				Object result = caseCustomWidget(customWidget);
				if (result == null) result = casePropertyReferringWidget(customWidget);
				if (result == null) result = caseWidget(customWidget);
				if (result == null) result = caseNamedElement(customWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.UPDATE_TABLE_BEHAVIOR: {
				UpdateTableBehavior updateTableBehavior = (UpdateTableBehavior)theEObject;
				Object result = caseUpdateTableBehavior(updateTableBehavior);
				if (result == null) result = caseUiBehavior(updateTableBehavior);
				if (result == null) result = caseNamedElement(updateTableBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.CONFIRM_MESSAGE_BEHAVIOR: {
				ConfirmMessageBehavior confirmMessageBehavior = (ConfirmMessageBehavior)theEObject;
				Object result = caseConfirmMessageBehavior(confirmMessageBehavior);
				if (result == null) result = caseUiBehavior(confirmMessageBehavior);
				if (result == null) result = caseNamedElement(confirmMessageBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptorguimetamodelPackage.CUSTOM_BEHAVIOR: {
				CustomBehavior customBehavior = (CustomBehavior)theEObject;
				Object result = caseCustomBehavior(customBehavior);
				if (result == null) result = caseUiBehavior(customBehavior);
				if (result == null) result = caseNamedElement(customBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuiApplication(GuiApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuiModule(GuiModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUserTask(UserTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreateTask(CreateTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdateTask(UpdateTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewTask(ViewTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseListTask(ListTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeleteTask(DeleteTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Task Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Task Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubTaskTransition(SubTaskTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewDataProperty(ViewDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tmp Reference Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tmp Reference Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTmpReferenceHolder(TmpReferenceHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tmp Sub Task Transition Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tmp Sub Task Transition Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTmpSubTaskTransitionHolder(TmpSubTaskTransitionHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Target</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public Object caseReferenceTarget(ReferenceTarget object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Reference View Property</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference View Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public Object caseReferenceViewProperty(ReferenceViewProperty object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute View Property</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute View Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public Object caseAttributeViewProperty(AttributeViewProperty object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Type View Property</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Type View Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public Object caseBasicTypeViewProperty(BasicTypeViewProperty object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Enum View Property</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum View Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public Object caseEnumViewProperty(EnumViewProperty object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Type Enum View Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Type Enum View Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasicTypeEnumViewProperty(BasicTypeEnumViewProperty object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUserTaskGroup(UserTaskGroup object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Reference View Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Reference View Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDerivedReferenceViewProperty(DerivedReferenceViewProperty object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Task</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public Object caseAddTask(AddTask object) {
		return null;
	}

                /**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseView(View object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWidget(Widget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Text Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Text Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputTextWidget(InputTextWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Informational Text Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informational Text Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInformationalTextWidget(InformationalTextWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseButtonWidget(ButtonWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Referring Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Referring Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropertyReferringWidget(PropertyReferringWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTableWidget(TableWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuiEvent(GuiEvent object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTableColumn(TableColumn object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTextAreaWidget(TextAreaWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Autocomplete Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autocomplete Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAutocompleteWidget(AutocompleteWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Buttons Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Buttons Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRadioButtonsWidget(RadioButtonsWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich Text Area Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich Text Area Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRichTextAreaWidget(RichTextAreaWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Date Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Date Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputDateWidget(InputDateWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Spinner Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Spinner Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNumberSpinnerWidget(NumberSpinnerWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceProxy(ServiceProxy object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Proxy Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Proxy Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceProxyOperation(ServiceProxyOperation object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuiCommand(GuiCommand object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>View Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewParameter(ViewParameter object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkWidget(LinkWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Widgets Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widgets Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWidgetsContainer(WidgetsContainer object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePanelWidget(PanelWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUiBehavior(UiBehavior object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Populate Panel Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Populate Panel Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePopulatePanelBehavior(PopulatePanelBehavior object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigate To View Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigate To View Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNavigateToViewBehavior(NavigateToViewBehavior object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBehaviorBinding(BehaviorBinding object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>On Click Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Click Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnClickBinding(OnClickBinding object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>On Hover Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Hover Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnHoverBinding(OnHoverBinding object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUiCondition(UiCondition object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuiDto(GuiDto object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuiEnum(GuiEnum object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Stub Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stub Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStubModule(StubModule object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>List Box Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Box Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseListBoxWidget(ListBoxWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBehaviorContainer(BehaviorContainer object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomWidget(CustomWidget object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Table Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Table Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdateTableBehavior(UpdateTableBehavior object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Message Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Message Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfirmMessageBehavior(ConfirmMessageBehavior object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomBehavior(CustomBehavior object) {
		return null;
	}

																/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDomainObject(DomainObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Object Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Object Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDomainObjectTypedElement(DomainObjectTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceOperation(ServiceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnum(sculptormetamodel.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //SculptorguimetamodelSwitch
