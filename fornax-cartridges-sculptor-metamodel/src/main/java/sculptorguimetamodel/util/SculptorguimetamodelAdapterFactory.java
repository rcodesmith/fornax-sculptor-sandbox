/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sculptorguimetamodel.SculptorguimetamodelPackage
 * @generated
 */
public class SculptorguimetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SculptorguimetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptorguimetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SculptorguimetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SculptorguimetamodelSwitch modelSwitch =
		new SculptorguimetamodelSwitch() {
			public Object caseGuiApplication(GuiApplication object) {
				return createGuiApplicationAdapter();
			}
			public Object caseGuiModule(GuiModule object) {
				return createGuiModuleAdapter();
			}
			public Object caseUserTask(UserTask object) {
				return createUserTaskAdapter();
			}
			public Object caseCreateTask(CreateTask object) {
				return createCreateTaskAdapter();
			}
			public Object caseUpdateTask(UpdateTask object) {
				return createUpdateTaskAdapter();
			}
			public Object caseViewTask(ViewTask object) {
				return createViewTaskAdapter();
			}
			public Object caseListTask(ListTask object) {
				return createListTaskAdapter();
			}
			public Object caseDeleteTask(DeleteTask object) {
				return createDeleteTaskAdapter();
			}
			public Object caseSubTaskTransition(SubTaskTransition object) {
				return createSubTaskTransitionAdapter();
			}
			public Object caseViewDataProperty(ViewDataProperty object) {
				return createViewDataPropertyAdapter();
			}
			public Object caseTmpReferenceHolder(TmpReferenceHolder object) {
				return createTmpReferenceHolderAdapter();
			}
			public Object caseTmpSubTaskTransitionHolder(TmpSubTaskTransitionHolder object) {
				return createTmpSubTaskTransitionHolderAdapter();
			}
			public Object caseReferenceTarget(ReferenceTarget object) {
				return createReferenceTargetAdapter();
			}
			public Object caseReferenceViewProperty(ReferenceViewProperty object) {
				return createReferenceViewPropertyAdapter();
			}
			public Object caseAttributeViewProperty(AttributeViewProperty object) {
				return createAttributeViewPropertyAdapter();
			}
			public Object caseBasicTypeViewProperty(BasicTypeViewProperty object) {
				return createBasicTypeViewPropertyAdapter();
			}
			public Object caseEnumViewProperty(EnumViewProperty object) {
				return createEnumViewPropertyAdapter();
			}
			public Object caseBasicTypeEnumViewProperty(BasicTypeEnumViewProperty object) {
				return createBasicTypeEnumViewPropertyAdapter();
			}
			public Object caseUserTaskGroup(UserTaskGroup object) {
				return createUserTaskGroupAdapter();
			}
			public Object caseDerivedReferenceViewProperty(DerivedReferenceViewProperty object) {
				return createDerivedReferenceViewPropertyAdapter();
			}
			public Object caseAddTask(AddTask object) {
				return createAddTaskAdapter();
			}
			public Object caseView(View object) {
				return createViewAdapter();
			}
			public Object caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			public Object caseInputTextWidget(InputTextWidget object) {
				return createInputTextWidgetAdapter();
			}
			public Object caseInformationalTextWidget(InformationalTextWidget object) {
				return createInformationalTextWidgetAdapter();
			}
			public Object caseButtonWidget(ButtonWidget object) {
				return createButtonWidgetAdapter();
			}
			public Object casePropertyReferringWidget(PropertyReferringWidget object) {
				return createPropertyReferringWidgetAdapter();
			}
			public Object caseTableWidget(TableWidget object) {
				return createTableWidgetAdapter();
			}
			public Object caseGuiEvent(GuiEvent object) {
				return createGuiEventAdapter();
			}
			public Object caseTableColumn(TableColumn object) {
				return createTableColumnAdapter();
			}
			public Object caseTextAreaWidget(TextAreaWidget object) {
				return createTextAreaWidgetAdapter();
			}
			public Object caseAutocompleteWidget(AutocompleteWidget object) {
				return createAutocompleteWidgetAdapter();
			}
			public Object caseRadioButtonsWidget(RadioButtonsWidget object) {
				return createRadioButtonsWidgetAdapter();
			}
			public Object caseRichTextAreaWidget(RichTextAreaWidget object) {
				return createRichTextAreaWidgetAdapter();
			}
			public Object caseInputDateWidget(InputDateWidget object) {
				return createInputDateWidgetAdapter();
			}
			public Object caseNumberSpinnerWidget(NumberSpinnerWidget object) {
				return createNumberSpinnerWidgetAdapter();
			}
			public Object caseServiceProxy(ServiceProxy object) {
				return createServiceProxyAdapter();
			}
			public Object caseServiceProxyOperation(ServiceProxyOperation object) {
				return createServiceProxyOperationAdapter();
			}
			public Object caseGuiCommand(GuiCommand object) {
				return createGuiCommandAdapter();
			}
			public Object caseViewParameter(ViewParameter object) {
				return createViewParameterAdapter();
			}
			public Object caseLinkWidget(LinkWidget object) {
				return createLinkWidgetAdapter();
			}
			public Object caseWidgetsContainer(WidgetsContainer object) {
				return createWidgetsContainerAdapter();
			}
			public Object casePanelWidget(PanelWidget object) {
				return createPanelWidgetAdapter();
			}
			public Object caseUiBehavior(UiBehavior object) {
				return createUiBehaviorAdapter();
			}
			public Object casePopulatePanelBehavior(PopulatePanelBehavior object) {
				return createPopulatePanelBehaviorAdapter();
			}
			public Object caseNavigateToViewBehavior(NavigateToViewBehavior object) {
				return createNavigateToViewBehaviorAdapter();
			}
			public Object caseBehaviorBinding(BehaviorBinding object) {
				return createBehaviorBindingAdapter();
			}
			public Object caseOnClickBinding(OnClickBinding object) {
				return createOnClickBindingAdapter();
			}
			public Object caseOnHoverBinding(OnHoverBinding object) {
				return createOnHoverBindingAdapter();
			}
			public Object caseUiCondition(UiCondition object) {
				return createUiConditionAdapter();
			}
			public Object caseGuiDto(GuiDto object) {
				return createGuiDtoAdapter();
			}
			public Object caseGuiEnum(GuiEnum object) {
				return createGuiEnumAdapter();
			}
			public Object caseStubModule(StubModule object) {
				return createStubModuleAdapter();
			}
			public Object caseListBoxWidget(ListBoxWidget object) {
				return createListBoxWidgetAdapter();
			}
			public Object caseBehaviorContainer(BehaviorContainer object) {
				return createBehaviorContainerAdapter();
			}
			public Object caseCustomWidget(CustomWidget object) {
				return createCustomWidgetAdapter();
			}
			public Object caseUpdateTableBehavior(UpdateTableBehavior object) {
				return createUpdateTableBehaviorAdapter();
			}
			public Object caseConfirmMessageBehavior(ConfirmMessageBehavior object) {
				return createConfirmMessageBehaviorAdapter();
			}
			public Object caseCustomBehavior(CustomBehavior object) {
				return createCustomBehaviorAdapter();
			}
			public Object caseCustomCondition(CustomCondition object) {
				return createCustomConditionAdapter();
			}
			public Object caseCompositeBehavior(CompositeBehavior object) {
				return createCompositeBehaviorAdapter();
			}
			public Object caseOnSelectItemBinding(OnSelectItemBinding object) {
				return createOnSelectItemBindingAdapter();
			}
			public Object caseWidgetTableColumn(WidgetTableColumn object) {
				return createWidgetTableColumnAdapter();
			}
			public Object caseSimpleTableColumn(SimpleTableColumn object) {
				return createSimpleTableColumnAdapter();
			}
			public Object caseSetDirtyFlagBehavior(SetDirtyFlagBehavior object) {
				return createSetDirtyFlagBehaviorAdapter();
			}
			public Object caseWarnIfDirtyBehavior(WarnIfDirtyBehavior object) {
				return createWarnIfDirtyBehaviorAdapter();
			}
			public Object casePopulateListBoxBehavior(PopulateListBoxBehavior object) {
				return createPopulateListBoxBehaviorAdapter();
			}
			public Object caseMarkDirtyBehavior(MarkDirtyBehavior object) {
				return createMarkDirtyBehaviorAdapter();
			}
			public Object caseMarkCleanBehavior(MarkCleanBehavior object) {
				return createMarkCleanBehaviorAdapter();
			}
			public Object caseGoBackBehavior(GoBackBehavior object) {
				return createGoBackBehaviorAdapter();
			}
			public Object caseUpdateAttributeBehavior(UpdateAttributeBehavior object) {
				return createUpdateAttributeBehaviorAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object caseDomainObject(DomainObject object) {
				return createDomainObjectAdapter();
			}
			public Object caseService(Service object) {
				return createServiceAdapter();
			}
			public Object caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			public Object caseDomainObjectTypedElement(DomainObjectTypedElement object) {
				return createDomainObjectTypedElementAdapter();
			}
			public Object caseOperation(Operation object) {
				return createOperationAdapter();
			}
			public Object caseServiceOperation(ServiceOperation object) {
				return createServiceOperationAdapter();
			}
			public Object caseEnum(sculptormetamodel.Enum object) {
				return createEnumAdapter();
			}
			public Object caseModule(Module object) {
				return createModuleAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.GuiApplication <em>Gui Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.GuiApplication
	 * @generated
	 */
	public Adapter createGuiApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.GuiModule <em>Gui Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.GuiModule
	 * @generated
	 */
	public Adapter createGuiModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.CreateTask <em>Create Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.CreateTask
	 * @generated
	 */
	public Adapter createCreateTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.UpdateTask <em>Update Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.UpdateTask
	 * @generated
	 */
	public Adapter createUpdateTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ViewTask <em>View Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ViewTask
	 * @generated
	 */
	public Adapter createViewTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ListTask <em>List Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ListTask
	 * @generated
	 */
	public Adapter createListTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.DeleteTask <em>Delete Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.DeleteTask
	 * @generated
	 */
	public Adapter createDeleteTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.SubTaskTransition <em>Sub Task Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.SubTaskTransition
	 * @generated
	 */
	public Adapter createSubTaskTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ViewDataProperty <em>View Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ViewDataProperty
	 * @generated
	 */
	public Adapter createViewDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.TmpReferenceHolder <em>Tmp Reference Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.TmpReferenceHolder
	 * @generated
	 */
	public Adapter createTmpReferenceHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.TmpSubTaskTransitionHolder <em>Tmp Sub Task Transition Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.TmpSubTaskTransitionHolder
	 * @generated
	 */
	public Adapter createTmpSubTaskTransitionHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ReferenceTarget <em>Reference Target</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ReferenceTarget
	 * @generated
	 */
    public Adapter createReferenceTargetAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ReferenceViewProperty <em>Reference View Property</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ReferenceViewProperty
	 * @generated
	 */
    public Adapter createReferenceViewPropertyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.AttributeViewProperty <em>Attribute View Property</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.AttributeViewProperty
	 * @generated
	 */
    public Adapter createAttributeViewPropertyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.BasicTypeViewProperty <em>Basic Type View Property</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.BasicTypeViewProperty
	 * @generated
	 */
    public Adapter createBasicTypeViewPropertyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.EnumViewProperty <em>Enum View Property</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.EnumViewProperty
	 * @generated
	 */
    public Adapter createEnumViewPropertyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.BasicTypeEnumViewProperty <em>Basic Type Enum View Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.BasicTypeEnumViewProperty
	 * @generated
	 */
	public Adapter createBasicTypeEnumViewPropertyAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.UserTaskGroup <em>User Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.UserTaskGroup
	 * @generated
	 */
	public Adapter createUserTaskGroupAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.DerivedReferenceViewProperty <em>Derived Reference View Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.DerivedReferenceViewProperty
	 * @generated
	 */
	public Adapter createDerivedReferenceViewPropertyAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.AddTask <em>Add Task</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.AddTask
	 * @generated
	 */
    public Adapter createAddTaskAdapter() {
		return null;
	}

                /**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.InputTextWidget <em>Input Text Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.InputTextWidget
	 * @generated
	 */
	public Adapter createInputTextWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.InformationalTextWidget <em>Informational Text Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.InformationalTextWidget
	 * @generated
	 */
	public Adapter createInformationalTextWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ButtonWidget <em>Button Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ButtonWidget
	 * @generated
	 */
	public Adapter createButtonWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.PropertyReferringWidget <em>Property Referring Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.PropertyReferringWidget
	 * @generated
	 */
	public Adapter createPropertyReferringWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.TableWidget <em>Table Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.TableWidget
	 * @generated
	 */
	public Adapter createTableWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.GuiEvent <em>Gui Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.GuiEvent
	 * @generated
	 */
	public Adapter createGuiEventAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.TableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.TableColumn
	 * @generated
	 */
	public Adapter createTableColumnAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.TextAreaWidget <em>Text Area Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.TextAreaWidget
	 * @generated
	 */
	public Adapter createTextAreaWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.AutocompleteWidget <em>Autocomplete Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.AutocompleteWidget
	 * @generated
	 */
	public Adapter createAutocompleteWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.RadioButtonsWidget <em>Radio Buttons Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.RadioButtonsWidget
	 * @generated
	 */
	public Adapter createRadioButtonsWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.RichTextAreaWidget <em>Rich Text Area Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.RichTextAreaWidget
	 * @generated
	 */
	public Adapter createRichTextAreaWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.InputDateWidget <em>Input Date Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.InputDateWidget
	 * @generated
	 */
	public Adapter createInputDateWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.NumberSpinnerWidget <em>Number Spinner Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.NumberSpinnerWidget
	 * @generated
	 */
	public Adapter createNumberSpinnerWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ServiceProxy <em>Service Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ServiceProxy
	 * @generated
	 */
	public Adapter createServiceProxyAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ServiceProxyOperation <em>Service Proxy Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ServiceProxyOperation
	 * @generated
	 */
	public Adapter createServiceProxyOperationAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.GuiCommand <em>Gui Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.GuiCommand
	 * @generated
	 */
	public Adapter createGuiCommandAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ViewParameter <em>View Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ViewParameter
	 * @generated
	 */
	public Adapter createViewParameterAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.LinkWidget <em>Link Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.LinkWidget
	 * @generated
	 */
	public Adapter createLinkWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.WidgetsContainer <em>Widgets Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.WidgetsContainer
	 * @generated
	 */
	public Adapter createWidgetsContainerAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.PanelWidget <em>Panel Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.PanelWidget
	 * @generated
	 */
	public Adapter createPanelWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.UiBehavior <em>Ui Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.UiBehavior
	 * @generated
	 */
	public Adapter createUiBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.PopulatePanelBehavior <em>Populate Panel Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.PopulatePanelBehavior
	 * @generated
	 */
	public Adapter createPopulatePanelBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.NavigateToViewBehavior <em>Navigate To View Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.NavigateToViewBehavior
	 * @generated
	 */
	public Adapter createNavigateToViewBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.BehaviorBinding <em>Behavior Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.BehaviorBinding
	 * @generated
	 */
	public Adapter createBehaviorBindingAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.OnClickBinding <em>On Click Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.OnClickBinding
	 * @generated
	 */
	public Adapter createOnClickBindingAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.OnHoverBinding <em>On Hover Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.OnHoverBinding
	 * @generated
	 */
	public Adapter createOnHoverBindingAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.UiCondition <em>Ui Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.UiCondition
	 * @generated
	 */
	public Adapter createUiConditionAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.GuiDto <em>Gui Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.GuiDto
	 * @generated
	 */
	public Adapter createGuiDtoAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.GuiEnum <em>Gui Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.GuiEnum
	 * @generated
	 */
	public Adapter createGuiEnumAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.StubModule <em>Stub Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.StubModule
	 * @generated
	 */
	public Adapter createStubModuleAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ListBoxWidget <em>List Box Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ListBoxWidget
	 * @generated
	 */
	public Adapter createListBoxWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.BehaviorContainer <em>Behavior Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.BehaviorContainer
	 * @generated
	 */
	public Adapter createBehaviorContainerAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.CustomWidget <em>Custom Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.CustomWidget
	 * @generated
	 */
	public Adapter createCustomWidgetAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.UpdateTableBehavior <em>Update Table Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.UpdateTableBehavior
	 * @generated
	 */
	public Adapter createUpdateTableBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.ConfirmMessageBehavior <em>Confirm Message Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.ConfirmMessageBehavior
	 * @generated
	 */
	public Adapter createConfirmMessageBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.CustomBehavior <em>Custom Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.CustomBehavior
	 * @generated
	 */
	public Adapter createCustomBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.CustomCondition <em>Custom Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.CustomCondition
	 * @generated
	 */
	public Adapter createCustomConditionAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.CompositeBehavior <em>Composite Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.CompositeBehavior
	 * @generated
	 */
	public Adapter createCompositeBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.OnSelectItemBinding <em>On Select Item Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.OnSelectItemBinding
	 * @generated
	 */
	public Adapter createOnSelectItemBindingAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.WidgetTableColumn <em>Widget Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.WidgetTableColumn
	 * @generated
	 */
	public Adapter createWidgetTableColumnAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.SimpleTableColumn <em>Simple Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.SimpleTableColumn
	 * @generated
	 */
	public Adapter createSimpleTableColumnAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.SetDirtyFlagBehavior <em>Set Dirty Flag Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.SetDirtyFlagBehavior
	 * @generated
	 */
	public Adapter createSetDirtyFlagBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.WarnIfDirtyBehavior <em>Warn If Dirty Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.WarnIfDirtyBehavior
	 * @generated
	 */
	public Adapter createWarnIfDirtyBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.PopulateListBoxBehavior <em>Populate List Box Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.PopulateListBoxBehavior
	 * @generated
	 */
	public Adapter createPopulateListBoxBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.MarkDirtyBehavior <em>Mark Dirty Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.MarkDirtyBehavior
	 * @generated
	 */
	public Adapter createMarkDirtyBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.MarkCleanBehavior <em>Mark Clean Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.MarkCleanBehavior
	 * @generated
	 */
	public Adapter createMarkCleanBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.GoBackBehavior <em>Go Back Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.GoBackBehavior
	 * @generated
	 */
	public Adapter createGoBackBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptorguimetamodel.UpdateAttributeBehavior <em>Update Attribute Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptorguimetamodel.UpdateAttributeBehavior
	 * @generated
	 */
	public Adapter createUpdateAttributeBehaviorAdapter() {
		return null;
	}

																/**
	 * Creates a new adapter for an object of class '{@link sculptormetamodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptormetamodel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptormetamodel.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptormetamodel.DomainObject
	 * @generated
	 */
	public Adapter createDomainObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptormetamodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptormetamodel.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptormetamodel.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptormetamodel.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptormetamodel.DomainObjectTypedElement <em>Domain Object Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptormetamodel.DomainObjectTypedElement
	 * @generated
	 */
	public Adapter createDomainObjectTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptormetamodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptormetamodel.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptormetamodel.ServiceOperation <em>Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptormetamodel.ServiceOperation
	 * @generated
	 */
	public Adapter createServiceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptormetamodel.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptormetamodel.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptormetamodel.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptormetamodel.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SculptorguimetamodelAdapterFactory
