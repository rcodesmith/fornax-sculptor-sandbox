/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sculptorguimetamodel.AddTask;
import sculptorguimetamodel.AttributeViewProperty;
import sculptorguimetamodel.AutocompleteWidget;
import sculptorguimetamodel.BasicTypeEnumViewProperty;
import sculptorguimetamodel.BasicTypeViewProperty;
import sculptorguimetamodel.BehaviorBinding;
import sculptorguimetamodel.BehaviorContainer;
import sculptorguimetamodel.ButtonWidget;
import sculptorguimetamodel.ClearWidgetsBehavior;
import sculptorguimetamodel.CompositeBehavior;
import sculptorguimetamodel.CreateTask;
import sculptorguimetamodel.CustomBehavior;
import sculptorguimetamodel.CustomCondition;
import sculptorguimetamodel.CustomWidget;
import sculptorguimetamodel.DeleteTask;
import sculptorguimetamodel.DerivedReferenceViewProperty;
import sculptorguimetamodel.DisplayMessageBehavior;
import sculptorguimetamodel.EnumViewProperty;
import sculptorguimetamodel.GoBackBehavior;
import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiCommand;
import sculptorguimetamodel.GuiDto;
import sculptorguimetamodel.GuiDtoOptions;
import sculptorguimetamodel.GuiEnum;
import sculptorguimetamodel.GuiEvent;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.HasDirtyValueCondition;
import sculptorguimetamodel.InformationalTextWidget;
import sculptorguimetamodel.InputDateWidget;
import sculptorguimetamodel.InputTextWidget;
import sculptorguimetamodel.LinkWidget;
import sculptorguimetamodel.ListBoxWidget;
import sculptorguimetamodel.ListTask;
import sculptorguimetamodel.MarkCleanBehavior;
import sculptorguimetamodel.MarkDirtyBehavior;
import sculptorguimetamodel.NavigateToViewBehavior;
import sculptorguimetamodel.NumberSpinnerWidget;
import sculptorguimetamodel.OnClickBinding;
import sculptorguimetamodel.OnHoverBinding;
import sculptorguimetamodel.OnSelectItemBinding;
import sculptorguimetamodel.PanelWidget;
import sculptorguimetamodel.PopulateListBoxBehavior;
import sculptorguimetamodel.PopulatePanelBehavior;
import sculptorguimetamodel.PopupPanelBehavior;
import sculptorguimetamodel.PropertyPathElement;
import sculptorguimetamodel.PropertyReferringWidget;
import sculptorguimetamodel.RadioButtonsWidget;
import sculptorguimetamodel.ReferenceTarget;
import sculptorguimetamodel.ReferenceViewProperty;
import sculptorguimetamodel.RichTextAreaWidget;
import sculptorguimetamodel.SculptorguimetamodelFactory;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.ServiceProxy;
import sculptorguimetamodel.ServiceProxyOperation;
import sculptorguimetamodel.SetDirtyFlagBehavior;
import sculptorguimetamodel.SimpleTableColumn;
import sculptorguimetamodel.StubModule;
import sculptorguimetamodel.SubTaskTransition;
import sculptorguimetamodel.TableColumn;
import sculptorguimetamodel.TableWidget;
import sculptorguimetamodel.TextAreaWidget;
import sculptorguimetamodel.TmpReferenceHolder;
import sculptorguimetamodel.TmpSubTaskTransitionHolder;
import sculptorguimetamodel.UiBehavior;
import sculptorguimetamodel.UiCondition;
import sculptorguimetamodel.UpdateAttributeBehavior;
import sculptorguimetamodel.UpdateHistoryBehavior;
import sculptorguimetamodel.UpdateTableBehavior;
import sculptorguimetamodel.UpdateTask;
import sculptorguimetamodel.UserTask;
import sculptorguimetamodel.UserTaskGroup;
import sculptorguimetamodel.View;
import sculptorguimetamodel.ViewDataProperty;
import sculptorguimetamodel.ViewParameter;
import sculptorguimetamodel.ViewTask;
import sculptorguimetamodel.WarnIfDirtyBehavior;
import sculptorguimetamodel.Widget;
import sculptorguimetamodel.WidgetTableColumn;
import sculptorguimetamodel.WidgetsContainer;

import sculptormetamodel.SculptormetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SculptorguimetamodelPackageImpl extends EPackageImpl implements SculptorguimetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTaskTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewDataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmpReferenceHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmpSubTaskTransitionHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceViewPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeViewPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicTypeViewPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumViewPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicTypeEnumViewPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedReferenceViewPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputTextWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationalTextWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyReferringWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAreaWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autocompleteWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonsWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richTextAreaWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDateWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberSpinnerWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProxyOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populatePanelBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigateToViewBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onClickBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onHoverBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiDtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stubModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listBoxWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTableBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayMessageBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onSelectItemBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetTableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setDirtyFlagBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warnIfDirtyBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populateListBoxBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markDirtyBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markCleanBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goBackBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateAttributeBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasDirtyValueConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popupPanelBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiDtoOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateHistoryBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearWidgetsBehaviorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sculptorguimetamodel.SculptorguimetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SculptorguimetamodelPackageImpl() {
		super(eNS_URI, SculptorguimetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SculptorguimetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SculptorguimetamodelPackage init() {
		if (isInited) return (SculptorguimetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(SculptorguimetamodelPackage.eNS_URI);

		// Obtain or create and register package
		SculptorguimetamodelPackageImpl theSculptorguimetamodelPackage = (SculptorguimetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SculptorguimetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SculptorguimetamodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SculptormetamodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSculptorguimetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theSculptorguimetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSculptorguimetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SculptorguimetamodelPackage.eNS_URI, theSculptorguimetamodelPackage);
		return theSculptorguimetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiApplication() {
		return guiApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiApplication_GuiForApplication() {
		return (EReference)guiApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiApplication_Modules() {
		return (EReference)guiApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiApplication_BasePackage() {
		return (EAttribute)guiApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiModule() {
		return guiModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiModule_UserTasks() {
		return (EReference)guiModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiModule_BasePackage() {
		return (EAttribute)guiModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiModule_Application() {
		return (EReference)guiModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiModule_For() {
		return (EReference)guiModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiModule_Views() {
		return (EReference)guiModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiModule_Events() {
		return (EReference)guiModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiModule_ServiceDependencies() {
		return (EReference)guiModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiModule_Commands() {
		return (EReference)guiModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiModule_StubModule() {
		return (EReference)guiModuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiModule_GuiDtoOptions() {
		return (EReference)guiModuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTask() {
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_SubTaskTransitions() {
		return (EReference)userTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_For() {
		return (EReference)userTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserTask_Abstract() {
		return (EAttribute)userTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_Module() {
		return (EReference)userTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserTask_TaskType() {
		return (EAttribute)userTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_ViewProperties() {
		return (EReference)userTaskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserTask_ConversationRoot() {
		return (EAttribute)userTaskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserTask_GapClass() {
		return (EAttribute)userTaskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTask() {
		return createTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateTask_CreateDOWith() {
		return (EReference)createTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateTask_PopulateDOWith() {
		return (EReference)createTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateTask() {
		return updateTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateTask_FindDOWith() {
		return (EReference)updateTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateTask_UpdateDOWith() {
		return (EReference)updateTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateTask_PopulateDOWith() {
		return (EReference)updateTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewTask() {
		return viewTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewTask_FindDOWith() {
		return (EReference)viewTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListTask() {
		return listTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListTask_SearchDOWith() {
		return (EReference)listTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteTask() {
		return deleteTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteTask_FindDOWith() {
		return (EReference)deleteTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteTask_DeleteDOWith() {
		return (EReference)deleteTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTaskTransition() {
		return subTaskTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubTaskTransition_To() {
		return (EReference)subTaskTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubTaskTransition_ForReference() {
		return (EReference)subTaskTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubTaskTransition_From() {
		return (EReference)subTaskTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewDataProperty() {
		return viewDataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewDataProperty_UserTask() {
		return (EReference)viewDataPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewDataProperty_MessageKey() {
		return (EAttribute)viewDataPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTmpReferenceHolder() {
		return tmpReferenceHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTmpReferenceHolder_Reference() {
		return (EReference)tmpReferenceHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTmpReferenceHolder_SubTaskTransitionHolders() {
		return (EReference)tmpReferenceHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTmpSubTaskTransitionHolder() {
		return tmpSubTaskTransitionHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTmpSubTaskTransitionHolder_ToTaskType() {
		return (EAttribute)tmpSubTaskTransitionHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTmpSubTaskTransitionHolder_To() {
		return (EReference)tmpSubTaskTransitionHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTmpSubTaskTransitionHolder_ReferenceHoler() {
		return (EReference)tmpSubTaskTransitionHolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceTarget() {
		return referenceTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceTarget_Reference() {
		return (EReference)referenceTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceTarget_Target() {
		return (EReference)referenceTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceViewProperty() {
		return referenceViewPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceViewProperty_RelatedTransitions() {
		return (EReference)referenceViewPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceViewProperty_Reference() {
		return (EReference)referenceViewPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceViewProperty_Target() {
		return (EReference)referenceViewPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceViewProperty_Base() {
		return (EAttribute)referenceViewPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceViewProperty_PreviewProperties() {
		return (EReference)referenceViewPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeViewProperty() {
		return attributeViewPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeViewProperty_Attribute() {
		return (EReference)attributeViewPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicTypeViewProperty() {
		return basicTypeViewPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicTypeViewProperty_Reference() {
		return (EReference)basicTypeViewPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicTypeViewProperty_Attribute() {
		return (EReference)basicTypeViewPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumViewProperty() {
		return enumViewPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumViewProperty_Reference() {
		return (EReference)enumViewPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicTypeEnumViewProperty() {
		return basicTypeEnumViewPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicTypeEnumViewProperty_BasicTypeReference() {
		return (EReference)basicTypeEnumViewPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTaskGroup() {
		return userTaskGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTaskGroup_UserTasks() {
		return (EReference)userTaskGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTaskGroup_For() {
		return (EReference)userTaskGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTaskGroup_Module() {
		return (EReference)userTaskGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedReferenceViewProperty() {
		return derivedReferenceViewPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedReferenceViewProperty_DerivedFrom() {
		return (EReference)derivedReferenceViewPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddTask() {
		return addTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddTask_FindDOWith() {
		return (EReference)addTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Module() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_For() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_ServiceProxies() {
		return (EReference)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Parameters() {
		return (EReference)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Label() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_ExtendsName() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Extends() {
		return (EReference)viewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Popup() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_View() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Label() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_BehaviorBindings() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Enabled() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_WidgetType() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Visible() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputTextWidget() {
		return inputTextWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationalTextWidget() {
		return informationalTextWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonWidget() {
		return buttonWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonWidget_Image() {
		return (EAttribute)buttonWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyReferringWidget() {
		return propertyReferringWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyReferringWidget_ForOp() {
		return (EReference)propertyReferringWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyReferringWidget_For() {
		return (EReference)propertyReferringWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyReferringWidget_PropertyPath() {
		return (EAttribute)propertyReferringWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyReferringWidget_ForProperty() {
		return (EReference)propertyReferringWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableWidget() {
		return tableWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableWidget_Columns() {
		return (EReference)tableWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableWidget_Paging() {
		return (EAttribute)tableWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableWidget_Size() {
		return (EAttribute)tableWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiEvent() {
		return guiEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiEvent_GuiModule() {
		return (EReference)guiEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableColumn() {
		return tableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_ColumnType() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_Filterable() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_Sortable() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_Editable() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextAreaWidget() {
		return textAreaWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutocompleteWidget() {
		return autocompleteWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioButtonsWidget() {
		return radioButtonsWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichTextAreaWidget() {
		return richTextAreaWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDateWidget() {
		return inputDateWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberSpinnerWidget() {
		return numberSpinnerWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProxy() {
		return serviceProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProxy_For() {
		return (EReference)serviceProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProxy_GuiModule() {
		return (EReference)serviceProxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProxyOperation() {
		return serviceProxyOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProxyOperation_For() {
		return (EReference)serviceProxyOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiCommand() {
		return guiCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewParameter() {
		return viewParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewParameter_Nullable() {
		return (EAttribute)viewParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkWidget() {
		return linkWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkWidget_ToView() {
		return (EReference)linkWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkWidget_ToDestination() {
		return (EAttribute)linkWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetsContainer() {
		return widgetsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetsContainer_Widgets() {
		return (EReference)widgetsContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanelWidget() {
		return panelWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanelWidget_Disclosure() {
		return (EAttribute)panelWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBehavior() {
		return uiBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBehavior_Bindings() {
		return (EReference)uiBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulatePanelBehavior() {
		return populatePanelBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulatePanelBehavior_Panel() {
		return (EReference)populatePanelBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigateToViewBehavior() {
		return navigateToViewBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigateToViewBehavior_View() {
		return (EReference)navigateToViewBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorBinding() {
		return behaviorBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorBinding_Behaviors() {
		return (EReference)behaviorBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorBinding_Widget() {
		return (EReference)behaviorBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorBinding_BindingTypeName() {
		return (EAttribute)behaviorBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnClickBinding() {
		return onClickBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnHoverBinding() {
		return onHoverBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiCondition() {
		return uiConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiDto() {
		return guiDtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiDto_For() {
		return (EReference)guiDtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiDto_GuiModule() {
		return (EReference)guiDtoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiDto_Immutable() {
		return (EAttribute)guiDtoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiEnum() {
		return guiEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStubModule() {
		return stubModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStubModule_StubFor() {
		return (EReference)stubModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStubModule_GuiModule() {
		return (EReference)stubModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListBoxWidget() {
		return listBoxWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListBoxWidget_ForEnum() {
		return (EReference)listBoxWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorContainer() {
		return behaviorContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorContainer_Conditions() {
		return (EReference)behaviorContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorContainer_Behaviors() {
		return (EReference)behaviorContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomWidget() {
		return customWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateTableBehavior() {
		return updateTableBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateTableBehavior_Table() {
		return (EReference)updateTableBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayMessageBehavior() {
		return displayMessageBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayMessageBehavior_Message() {
		return (EAttribute)displayMessageBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayMessageBehavior_Cancelable() {
		return (EAttribute)displayMessageBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayMessageBehavior_MessageId() {
		return (EAttribute)displayMessageBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomBehavior() {
		return customBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomCondition() {
		return customConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeBehavior() {
		return compositeBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeBehavior_Behaviors() {
		return (EReference)compositeBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnSelectItemBinding() {
		return onSelectItemBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetTableColumn() {
		return widgetTableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetTableColumn_Widget() {
		return (EReference)widgetTableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTableColumn() {
		return simpleTableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetDirtyFlagBehavior() {
		return setDirtyFlagBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetDirtyFlagBehavior_MarkSpecificObj() {
		return (EAttribute)setDirtyFlagBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarnIfDirtyBehavior() {
		return warnIfDirtyBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulateListBoxBehavior() {
		return populateListBoxBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulateListBoxBehavior_Widget() {
		return (EReference)populateListBoxBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkDirtyBehavior() {
		return markDirtyBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkCleanBehavior() {
		return markCleanBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoBackBehavior() {
		return goBackBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAttributeBehavior() {
		return updateAttributeBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateAttributeBehavior_PropertyPath() {
		return (EAttribute)updateAttributeBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAttributeBehavior_TargetClass() {
		return (EReference)updateAttributeBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasDirtyValueCondition() {
		return hasDirtyValueConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasDirtyValueCondition_Dirty() {
		return (EAttribute)hasDirtyValueConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopupPanelBehavior() {
		return popupPanelBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopupPanelBehavior_View() {
		return (EReference)popupPanelBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopupPanelBehavior_PanelName() {
		return (EAttribute)popupPanelBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiDtoOptions() {
		return guiDtoOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiDtoOptions_Skip() {
		return (EAttribute)guiDtoOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyPathElement() {
		return propertyPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyPathElement_RemainingPath() {
		return (EReference)propertyPathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyPathElement_ForAttribute() {
		return (EReference)propertyPathElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyPathElement_ForReference() {
		return (EReference)propertyPathElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateHistoryBehavior() {
		return updateHistoryBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearWidgetsBehavior() {
		return clearWidgetsBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearWidgetsBehavior_Widgets() {
		return (EReference)clearWidgetsBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptorguimetamodelFactory getSculptorguimetamodelFactory() {
		return (SculptorguimetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		guiApplicationEClass = createEClass(GUI_APPLICATION);
		createEReference(guiApplicationEClass, GUI_APPLICATION__GUI_FOR_APPLICATION);
		createEReference(guiApplicationEClass, GUI_APPLICATION__MODULES);
		createEAttribute(guiApplicationEClass, GUI_APPLICATION__BASE_PACKAGE);

		guiModuleEClass = createEClass(GUI_MODULE);
		createEReference(guiModuleEClass, GUI_MODULE__USER_TASKS);
		createEAttribute(guiModuleEClass, GUI_MODULE__BASE_PACKAGE);
		createEReference(guiModuleEClass, GUI_MODULE__APPLICATION);
		createEReference(guiModuleEClass, GUI_MODULE__FOR);
		createEReference(guiModuleEClass, GUI_MODULE__VIEWS);
		createEReference(guiModuleEClass, GUI_MODULE__EVENTS);
		createEReference(guiModuleEClass, GUI_MODULE__SERVICE_DEPENDENCIES);
		createEReference(guiModuleEClass, GUI_MODULE__COMMANDS);
		createEReference(guiModuleEClass, GUI_MODULE__STUB_MODULE);
		createEReference(guiModuleEClass, GUI_MODULE__GUI_DTO_OPTIONS);

		userTaskEClass = createEClass(USER_TASK);
		createEReference(userTaskEClass, USER_TASK__SUB_TASK_TRANSITIONS);
		createEReference(userTaskEClass, USER_TASK__FOR);
		createEAttribute(userTaskEClass, USER_TASK__ABSTRACT);
		createEReference(userTaskEClass, USER_TASK__MODULE);
		createEAttribute(userTaskEClass, USER_TASK__TASK_TYPE);
		createEReference(userTaskEClass, USER_TASK__VIEW_PROPERTIES);
		createEAttribute(userTaskEClass, USER_TASK__CONVERSATION_ROOT);
		createEAttribute(userTaskEClass, USER_TASK__GAP_CLASS);

		createTaskEClass = createEClass(CREATE_TASK);
		createEReference(createTaskEClass, CREATE_TASK__CREATE_DO_WITH);
		createEReference(createTaskEClass, CREATE_TASK__POPULATE_DO_WITH);

		updateTaskEClass = createEClass(UPDATE_TASK);
		createEReference(updateTaskEClass, UPDATE_TASK__FIND_DO_WITH);
		createEReference(updateTaskEClass, UPDATE_TASK__UPDATE_DO_WITH);
		createEReference(updateTaskEClass, UPDATE_TASK__POPULATE_DO_WITH);

		viewTaskEClass = createEClass(VIEW_TASK);
		createEReference(viewTaskEClass, VIEW_TASK__FIND_DO_WITH);

		listTaskEClass = createEClass(LIST_TASK);
		createEReference(listTaskEClass, LIST_TASK__SEARCH_DO_WITH);

		deleteTaskEClass = createEClass(DELETE_TASK);
		createEReference(deleteTaskEClass, DELETE_TASK__FIND_DO_WITH);
		createEReference(deleteTaskEClass, DELETE_TASK__DELETE_DO_WITH);

		subTaskTransitionEClass = createEClass(SUB_TASK_TRANSITION);
		createEReference(subTaskTransitionEClass, SUB_TASK_TRANSITION__TO);
		createEReference(subTaskTransitionEClass, SUB_TASK_TRANSITION__FOR_REFERENCE);
		createEReference(subTaskTransitionEClass, SUB_TASK_TRANSITION__FROM);

		viewDataPropertyEClass = createEClass(VIEW_DATA_PROPERTY);
		createEReference(viewDataPropertyEClass, VIEW_DATA_PROPERTY__USER_TASK);
		createEAttribute(viewDataPropertyEClass, VIEW_DATA_PROPERTY__MESSAGE_KEY);

		tmpReferenceHolderEClass = createEClass(TMP_REFERENCE_HOLDER);
		createEReference(tmpReferenceHolderEClass, TMP_REFERENCE_HOLDER__REFERENCE);
		createEReference(tmpReferenceHolderEClass, TMP_REFERENCE_HOLDER__SUB_TASK_TRANSITION_HOLDERS);

		tmpSubTaskTransitionHolderEClass = createEClass(TMP_SUB_TASK_TRANSITION_HOLDER);
		createEAttribute(tmpSubTaskTransitionHolderEClass, TMP_SUB_TASK_TRANSITION_HOLDER__TO_TASK_TYPE);
		createEReference(tmpSubTaskTransitionHolderEClass, TMP_SUB_TASK_TRANSITION_HOLDER__TO);
		createEReference(tmpSubTaskTransitionHolderEClass, TMP_SUB_TASK_TRANSITION_HOLDER__REFERENCE_HOLER);

		referenceTargetEClass = createEClass(REFERENCE_TARGET);
		createEReference(referenceTargetEClass, REFERENCE_TARGET__REFERENCE);
		createEReference(referenceTargetEClass, REFERENCE_TARGET__TARGET);

		referenceViewPropertyEClass = createEClass(REFERENCE_VIEW_PROPERTY);
		createEReference(referenceViewPropertyEClass, REFERENCE_VIEW_PROPERTY__RELATED_TRANSITIONS);
		createEReference(referenceViewPropertyEClass, REFERENCE_VIEW_PROPERTY__REFERENCE);
		createEReference(referenceViewPropertyEClass, REFERENCE_VIEW_PROPERTY__TARGET);
		createEAttribute(referenceViewPropertyEClass, REFERENCE_VIEW_PROPERTY__BASE);
		createEReference(referenceViewPropertyEClass, REFERENCE_VIEW_PROPERTY__PREVIEW_PROPERTIES);

		attributeViewPropertyEClass = createEClass(ATTRIBUTE_VIEW_PROPERTY);
		createEReference(attributeViewPropertyEClass, ATTRIBUTE_VIEW_PROPERTY__ATTRIBUTE);

		basicTypeViewPropertyEClass = createEClass(BASIC_TYPE_VIEW_PROPERTY);
		createEReference(basicTypeViewPropertyEClass, BASIC_TYPE_VIEW_PROPERTY__REFERENCE);
		createEReference(basicTypeViewPropertyEClass, BASIC_TYPE_VIEW_PROPERTY__ATTRIBUTE);

		enumViewPropertyEClass = createEClass(ENUM_VIEW_PROPERTY);
		createEReference(enumViewPropertyEClass, ENUM_VIEW_PROPERTY__REFERENCE);

		basicTypeEnumViewPropertyEClass = createEClass(BASIC_TYPE_ENUM_VIEW_PROPERTY);
		createEReference(basicTypeEnumViewPropertyEClass, BASIC_TYPE_ENUM_VIEW_PROPERTY__BASIC_TYPE_REFERENCE);

		userTaskGroupEClass = createEClass(USER_TASK_GROUP);
		createEReference(userTaskGroupEClass, USER_TASK_GROUP__USER_TASKS);
		createEReference(userTaskGroupEClass, USER_TASK_GROUP__FOR);
		createEReference(userTaskGroupEClass, USER_TASK_GROUP__MODULE);

		derivedReferenceViewPropertyEClass = createEClass(DERIVED_REFERENCE_VIEW_PROPERTY);
		createEReference(derivedReferenceViewPropertyEClass, DERIVED_REFERENCE_VIEW_PROPERTY__DERIVED_FROM);

		addTaskEClass = createEClass(ADD_TASK);
		createEReference(addTaskEClass, ADD_TASK__FIND_DO_WITH);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__MODULE);
		createEReference(viewEClass, VIEW__FOR);
		createEReference(viewEClass, VIEW__SERVICE_PROXIES);
		createEReference(viewEClass, VIEW__PARAMETERS);
		createEAttribute(viewEClass, VIEW__LABEL);
		createEAttribute(viewEClass, VIEW__EXTENDS_NAME);
		createEReference(viewEClass, VIEW__EXTENDS);
		createEAttribute(viewEClass, VIEW__POPUP);

		widgetEClass = createEClass(WIDGET);
		createEReference(widgetEClass, WIDGET__VIEW);
		createEAttribute(widgetEClass, WIDGET__LABEL);
		createEReference(widgetEClass, WIDGET__BEHAVIOR_BINDINGS);
		createEReference(widgetEClass, WIDGET__ENABLED);
		createEAttribute(widgetEClass, WIDGET__WIDGET_TYPE);
		createEReference(widgetEClass, WIDGET__VISIBLE);

		inputTextWidgetEClass = createEClass(INPUT_TEXT_WIDGET);

		informationalTextWidgetEClass = createEClass(INFORMATIONAL_TEXT_WIDGET);

		buttonWidgetEClass = createEClass(BUTTON_WIDGET);
		createEAttribute(buttonWidgetEClass, BUTTON_WIDGET__IMAGE);

		propertyReferringWidgetEClass = createEClass(PROPERTY_REFERRING_WIDGET);
		createEReference(propertyReferringWidgetEClass, PROPERTY_REFERRING_WIDGET__FOR_OP);
		createEReference(propertyReferringWidgetEClass, PROPERTY_REFERRING_WIDGET__FOR);
		createEAttribute(propertyReferringWidgetEClass, PROPERTY_REFERRING_WIDGET__PROPERTY_PATH);
		createEReference(propertyReferringWidgetEClass, PROPERTY_REFERRING_WIDGET__FOR_PROPERTY);

		tableWidgetEClass = createEClass(TABLE_WIDGET);
		createEReference(tableWidgetEClass, TABLE_WIDGET__COLUMNS);
		createEAttribute(tableWidgetEClass, TABLE_WIDGET__PAGING);
		createEAttribute(tableWidgetEClass, TABLE_WIDGET__SIZE);

		guiEventEClass = createEClass(GUI_EVENT);
		createEReference(guiEventEClass, GUI_EVENT__GUI_MODULE);

		tableColumnEClass = createEClass(TABLE_COLUMN);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__COLUMN_TYPE);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__FILTERABLE);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__SORTABLE);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__EDITABLE);

		textAreaWidgetEClass = createEClass(TEXT_AREA_WIDGET);

		autocompleteWidgetEClass = createEClass(AUTOCOMPLETE_WIDGET);

		radioButtonsWidgetEClass = createEClass(RADIO_BUTTONS_WIDGET);

		richTextAreaWidgetEClass = createEClass(RICH_TEXT_AREA_WIDGET);

		inputDateWidgetEClass = createEClass(INPUT_DATE_WIDGET);

		numberSpinnerWidgetEClass = createEClass(NUMBER_SPINNER_WIDGET);

		serviceProxyEClass = createEClass(SERVICE_PROXY);
		createEReference(serviceProxyEClass, SERVICE_PROXY__FOR);
		createEReference(serviceProxyEClass, SERVICE_PROXY__GUI_MODULE);

		serviceProxyOperationEClass = createEClass(SERVICE_PROXY_OPERATION);
		createEReference(serviceProxyOperationEClass, SERVICE_PROXY_OPERATION__FOR);

		guiCommandEClass = createEClass(GUI_COMMAND);

		viewParameterEClass = createEClass(VIEW_PARAMETER);
		createEAttribute(viewParameterEClass, VIEW_PARAMETER__NULLABLE);

		linkWidgetEClass = createEClass(LINK_WIDGET);
		createEReference(linkWidgetEClass, LINK_WIDGET__TO_VIEW);
		createEAttribute(linkWidgetEClass, LINK_WIDGET__TO_DESTINATION);

		widgetsContainerEClass = createEClass(WIDGETS_CONTAINER);
		createEReference(widgetsContainerEClass, WIDGETS_CONTAINER__WIDGETS);

		panelWidgetEClass = createEClass(PANEL_WIDGET);
		createEAttribute(panelWidgetEClass, PANEL_WIDGET__DISCLOSURE);

		uiBehaviorEClass = createEClass(UI_BEHAVIOR);
		createEReference(uiBehaviorEClass, UI_BEHAVIOR__BINDINGS);

		populatePanelBehaviorEClass = createEClass(POPULATE_PANEL_BEHAVIOR);
		createEReference(populatePanelBehaviorEClass, POPULATE_PANEL_BEHAVIOR__PANEL);

		navigateToViewBehaviorEClass = createEClass(NAVIGATE_TO_VIEW_BEHAVIOR);
		createEReference(navigateToViewBehaviorEClass, NAVIGATE_TO_VIEW_BEHAVIOR__VIEW);

		behaviorBindingEClass = createEClass(BEHAVIOR_BINDING);
		createEReference(behaviorBindingEClass, BEHAVIOR_BINDING__BEHAVIORS);
		createEReference(behaviorBindingEClass, BEHAVIOR_BINDING__WIDGET);
		createEAttribute(behaviorBindingEClass, BEHAVIOR_BINDING__BINDING_TYPE_NAME);

		onClickBindingEClass = createEClass(ON_CLICK_BINDING);

		onHoverBindingEClass = createEClass(ON_HOVER_BINDING);

		uiConditionEClass = createEClass(UI_CONDITION);

		guiDtoEClass = createEClass(GUI_DTO);
		createEReference(guiDtoEClass, GUI_DTO__FOR);
		createEReference(guiDtoEClass, GUI_DTO__GUI_MODULE);
		createEAttribute(guiDtoEClass, GUI_DTO__IMMUTABLE);

		guiEnumEClass = createEClass(GUI_ENUM);

		stubModuleEClass = createEClass(STUB_MODULE);
		createEReference(stubModuleEClass, STUB_MODULE__STUB_FOR);
		createEReference(stubModuleEClass, STUB_MODULE__GUI_MODULE);

		listBoxWidgetEClass = createEClass(LIST_BOX_WIDGET);
		createEReference(listBoxWidgetEClass, LIST_BOX_WIDGET__FOR_ENUM);

		behaviorContainerEClass = createEClass(BEHAVIOR_CONTAINER);
		createEReference(behaviorContainerEClass, BEHAVIOR_CONTAINER__CONDITIONS);
		createEReference(behaviorContainerEClass, BEHAVIOR_CONTAINER__BEHAVIORS);

		customWidgetEClass = createEClass(CUSTOM_WIDGET);

		updateTableBehaviorEClass = createEClass(UPDATE_TABLE_BEHAVIOR);
		createEReference(updateTableBehaviorEClass, UPDATE_TABLE_BEHAVIOR__TABLE);

		displayMessageBehaviorEClass = createEClass(DISPLAY_MESSAGE_BEHAVIOR);
		createEAttribute(displayMessageBehaviorEClass, DISPLAY_MESSAGE_BEHAVIOR__MESSAGE);
		createEAttribute(displayMessageBehaviorEClass, DISPLAY_MESSAGE_BEHAVIOR__CANCELABLE);
		createEAttribute(displayMessageBehaviorEClass, DISPLAY_MESSAGE_BEHAVIOR__MESSAGE_ID);

		customBehaviorEClass = createEClass(CUSTOM_BEHAVIOR);

		customConditionEClass = createEClass(CUSTOM_CONDITION);

		compositeBehaviorEClass = createEClass(COMPOSITE_BEHAVIOR);
		createEReference(compositeBehaviorEClass, COMPOSITE_BEHAVIOR__BEHAVIORS);

		onSelectItemBindingEClass = createEClass(ON_SELECT_ITEM_BINDING);

		widgetTableColumnEClass = createEClass(WIDGET_TABLE_COLUMN);
		createEReference(widgetTableColumnEClass, WIDGET_TABLE_COLUMN__WIDGET);

		simpleTableColumnEClass = createEClass(SIMPLE_TABLE_COLUMN);

		setDirtyFlagBehaviorEClass = createEClass(SET_DIRTY_FLAG_BEHAVIOR);
		createEAttribute(setDirtyFlagBehaviorEClass, SET_DIRTY_FLAG_BEHAVIOR__MARK_SPECIFIC_OBJ);

		warnIfDirtyBehaviorEClass = createEClass(WARN_IF_DIRTY_BEHAVIOR);

		populateListBoxBehaviorEClass = createEClass(POPULATE_LIST_BOX_BEHAVIOR);
		createEReference(populateListBoxBehaviorEClass, POPULATE_LIST_BOX_BEHAVIOR__WIDGET);

		markDirtyBehaviorEClass = createEClass(MARK_DIRTY_BEHAVIOR);

		markCleanBehaviorEClass = createEClass(MARK_CLEAN_BEHAVIOR);

		goBackBehaviorEClass = createEClass(GO_BACK_BEHAVIOR);

		updateAttributeBehaviorEClass = createEClass(UPDATE_ATTRIBUTE_BEHAVIOR);
		createEAttribute(updateAttributeBehaviorEClass, UPDATE_ATTRIBUTE_BEHAVIOR__PROPERTY_PATH);
		createEReference(updateAttributeBehaviorEClass, UPDATE_ATTRIBUTE_BEHAVIOR__TARGET_CLASS);

		hasDirtyValueConditionEClass = createEClass(HAS_DIRTY_VALUE_CONDITION);
		createEAttribute(hasDirtyValueConditionEClass, HAS_DIRTY_VALUE_CONDITION__DIRTY);

		popupPanelBehaviorEClass = createEClass(POPUP_PANEL_BEHAVIOR);
		createEReference(popupPanelBehaviorEClass, POPUP_PANEL_BEHAVIOR__VIEW);
		createEAttribute(popupPanelBehaviorEClass, POPUP_PANEL_BEHAVIOR__PANEL_NAME);

		guiDtoOptionsEClass = createEClass(GUI_DTO_OPTIONS);
		createEAttribute(guiDtoOptionsEClass, GUI_DTO_OPTIONS__SKIP);

		propertyPathElementEClass = createEClass(PROPERTY_PATH_ELEMENT);
		createEReference(propertyPathElementEClass, PROPERTY_PATH_ELEMENT__REMAINING_PATH);
		createEReference(propertyPathElementEClass, PROPERTY_PATH_ELEMENT__FOR_ATTRIBUTE);
		createEReference(propertyPathElementEClass, PROPERTY_PATH_ELEMENT__FOR_REFERENCE);

		updateHistoryBehaviorEClass = createEClass(UPDATE_HISTORY_BEHAVIOR);

		clearWidgetsBehaviorEClass = createEClass(CLEAR_WIDGETS_BEHAVIOR);
		createEReference(clearWidgetsBehaviorEClass, CLEAR_WIDGETS_BEHAVIOR__WIDGETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SculptormetamodelPackage theSculptormetamodelPackage = (SculptormetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(SculptormetamodelPackage.eNS_URI);

		// Add supertypes to classes
		guiApplicationEClass.getESuperTypes().add(theSculptormetamodelPackage.getNamedElement());
		guiModuleEClass.getESuperTypes().add(theSculptormetamodelPackage.getNamedElement());
		guiModuleEClass.getESuperTypes().add(this.getBehaviorContainer());
		userTaskEClass.getESuperTypes().add(theSculptormetamodelPackage.getNamedElement());
		createTaskEClass.getESuperTypes().add(this.getUserTask());
		updateTaskEClass.getESuperTypes().add(this.getUserTask());
		viewTaskEClass.getESuperTypes().add(this.getUserTask());
		listTaskEClass.getESuperTypes().add(this.getUserTask());
		deleteTaskEClass.getESuperTypes().add(this.getUserTask());
		subTaskTransitionEClass.getESuperTypes().add(theSculptormetamodelPackage.getNamedElement());
		viewDataPropertyEClass.getESuperTypes().add(theSculptormetamodelPackage.getNamedElement());
		referenceViewPropertyEClass.getESuperTypes().add(this.getViewDataProperty());
		attributeViewPropertyEClass.getESuperTypes().add(this.getViewDataProperty());
		basicTypeViewPropertyEClass.getESuperTypes().add(this.getViewDataProperty());
		enumViewPropertyEClass.getESuperTypes().add(this.getViewDataProperty());
		basicTypeEnumViewPropertyEClass.getESuperTypes().add(this.getEnumViewProperty());
		derivedReferenceViewPropertyEClass.getESuperTypes().add(this.getReferenceViewProperty());
		addTaskEClass.getESuperTypes().add(this.getUserTask());
		viewEClass.getESuperTypes().add(this.getWidgetsContainer());
		viewEClass.getESuperTypes().add(theSculptormetamodelPackage.getNamedElement());
		viewEClass.getESuperTypes().add(this.getBehaviorContainer());
		widgetEClass.getESuperTypes().add(theSculptormetamodelPackage.getNamedElement());
		inputTextWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		informationalTextWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		buttonWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		propertyReferringWidgetEClass.getESuperTypes().add(this.getWidget());
		tableWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		guiEventEClass.getESuperTypes().add(theSculptormetamodelPackage.getDomainObject());
		tableColumnEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		textAreaWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		autocompleteWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		radioButtonsWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		richTextAreaWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		inputDateWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		numberSpinnerWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		serviceProxyEClass.getESuperTypes().add(theSculptormetamodelPackage.getService());
		serviceProxyOperationEClass.getESuperTypes().add(theSculptormetamodelPackage.getServiceOperation());
		guiCommandEClass.getESuperTypes().add(this.getGuiDto());
		viewParameterEClass.getESuperTypes().add(theSculptormetamodelPackage.getTypedElement());
		linkWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		panelWidgetEClass.getESuperTypes().add(this.getWidgetsContainer());
		panelWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		uiBehaviorEClass.getESuperTypes().add(theSculptormetamodelPackage.getNamedElement());
		populatePanelBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		navigateToViewBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		onClickBindingEClass.getESuperTypes().add(this.getBehaviorBinding());
		onHoverBindingEClass.getESuperTypes().add(this.getBehaviorBinding());
		uiConditionEClass.getESuperTypes().add(theSculptormetamodelPackage.getNamedElement());
		guiDtoEClass.getESuperTypes().add(theSculptormetamodelPackage.getDomainObject());
		guiEnumEClass.getESuperTypes().add(theSculptormetamodelPackage.getEnum());
		guiEnumEClass.getESuperTypes().add(this.getGuiDto());
		stubModuleEClass.getESuperTypes().add(theSculptormetamodelPackage.getModule());
		listBoxWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		customWidgetEClass.getESuperTypes().add(this.getPropertyReferringWidget());
		updateTableBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		displayMessageBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		customBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		customConditionEClass.getESuperTypes().add(this.getUiCondition());
		compositeBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		onSelectItemBindingEClass.getESuperTypes().add(this.getBehaviorBinding());
		widgetTableColumnEClass.getESuperTypes().add(this.getTableColumn());
		simpleTableColumnEClass.getESuperTypes().add(this.getTableColumn());
		setDirtyFlagBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		warnIfDirtyBehaviorEClass.getESuperTypes().add(this.getDisplayMessageBehavior());
		populateListBoxBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		markDirtyBehaviorEClass.getESuperTypes().add(this.getSetDirtyFlagBehavior());
		markCleanBehaviorEClass.getESuperTypes().add(this.getSetDirtyFlagBehavior());
		goBackBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		updateAttributeBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		hasDirtyValueConditionEClass.getESuperTypes().add(this.getUiCondition());
		popupPanelBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		guiDtoOptionsEClass.getESuperTypes().add(theSculptormetamodelPackage.getNamedElement());
		updateHistoryBehaviorEClass.getESuperTypes().add(this.getUiBehavior());
		clearWidgetsBehaviorEClass.getESuperTypes().add(this.getUiBehavior());

		// Initialize classes and features; add operations and parameters
		initEClass(guiApplicationEClass, GuiApplication.class, "GuiApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiApplication_GuiForApplication(), theSculptormetamodelPackage.getApplication(), null, "guiForApplication", null, 1, 1, GuiApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiApplication_Modules(), this.getGuiModule(), this.getGuiModule_Application(), "modules", null, 1, -1, GuiApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiApplication_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, GuiApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiModuleEClass, GuiModule.class, "GuiModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiModule_UserTasks(), this.getUserTask(), this.getUserTask_Module(), "userTasks", null, 1, -1, GuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiModule_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, GuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiModule_Application(), this.getGuiApplication(), this.getGuiApplication_Modules(), "application", null, 0, 1, GuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiModule_For(), theSculptormetamodelPackage.getModule(), null, "for", null, 0, 1, GuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiModule_Views(), this.getView(), this.getView_Module(), "views", null, 0, -1, GuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiModule_Events(), this.getGuiEvent(), this.getGuiEvent_GuiModule(), "events", null, 0, -1, GuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiModule_ServiceDependencies(), theSculptormetamodelPackage.getService(), null, "serviceDependencies", null, 0, -1, GuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiModule_Commands(), this.getGuiCommand(), null, "commands", null, 0, -1, GuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiModule_StubModule(), this.getStubModule(), null, "stubModule", null, 0, 1, GuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiModule_GuiDtoOptions(), this.getGuiDtoOptions(), null, "guiDtoOptions", null, 0, -1, GuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTaskEClass, UserTask.class, "UserTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserTask_SubTaskTransitions(), this.getSubTaskTransition(), null, "subTaskTransitions", null, 0, -1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTask_For(), theSculptormetamodelPackage.getDomainObject(), null, "for", null, 1, 1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserTask_Abstract(), ecorePackage.getEBooleanObject(), "abstract", null, 0, 1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTask_Module(), this.getGuiModule(), this.getGuiModule_UserTasks(), "module", null, 0, 1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserTask_TaskType(), ecorePackage.getEString(), "taskType", null, 0, 1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTask_ViewProperties(), this.getViewDataProperty(), this.getViewDataProperty_UserTask(), "viewProperties", null, 0, -1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserTask_ConversationRoot(), ecorePackage.getEBoolean(), "conversationRoot", null, 0, 1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserTask_GapClass(), ecorePackage.getEBoolean(), "gapClass", null, 0, 1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createTaskEClass, CreateTask.class, "CreateTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateTask_CreateDOWith(), theSculptormetamodelPackage.getServiceOperation(), null, "createDOWith", null, 0, 1, CreateTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateTask_PopulateDOWith(), theSculptormetamodelPackage.getServiceOperation(), null, "populateDOWith", null, 0, 1, CreateTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateTaskEClass, UpdateTask.class, "UpdateTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateTask_FindDOWith(), theSculptormetamodelPackage.getServiceOperation(), null, "findDOWith", null, 0, 1, UpdateTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateTask_UpdateDOWith(), theSculptormetamodelPackage.getServiceOperation(), null, "updateDOWith", null, 0, 1, UpdateTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateTask_PopulateDOWith(), theSculptormetamodelPackage.getServiceOperation(), null, "populateDOWith", null, 0, 1, UpdateTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewTaskEClass, ViewTask.class, "ViewTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewTask_FindDOWith(), theSculptormetamodelPackage.getServiceOperation(), null, "findDOWith", null, 0, 1, ViewTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listTaskEClass, ListTask.class, "ListTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListTask_SearchDOWith(), theSculptormetamodelPackage.getServiceOperation(), null, "searchDOWith", null, 0, 1, ListTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteTaskEClass, DeleteTask.class, "DeleteTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeleteTask_FindDOWith(), theSculptormetamodelPackage.getServiceOperation(), null, "findDOWith", null, 0, 1, DeleteTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeleteTask_DeleteDOWith(), theSculptormetamodelPackage.getServiceOperation(), null, "deleteDOWith", null, 0, 1, DeleteTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subTaskTransitionEClass, SubTaskTransition.class, "SubTaskTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubTaskTransition_To(), this.getUserTask(), null, "to", null, 0, 1, SubTaskTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubTaskTransition_ForReference(), theSculptormetamodelPackage.getReference(), null, "forReference", null, 1, 1, SubTaskTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubTaskTransition_From(), this.getUserTask(), null, "from", null, 0, 1, SubTaskTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewDataPropertyEClass, ViewDataProperty.class, "ViewDataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewDataProperty_UserTask(), this.getUserTask(), this.getUserTask_ViewProperties(), "userTask", null, 0, 1, ViewDataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewDataProperty_MessageKey(), ecorePackage.getEString(), "messageKey", null, 0, 1, ViewDataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmpReferenceHolderEClass, TmpReferenceHolder.class, "TmpReferenceHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTmpReferenceHolder_Reference(), theSculptormetamodelPackage.getReference(), null, "reference", null, 0, 1, TmpReferenceHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTmpReferenceHolder_SubTaskTransitionHolders(), this.getTmpSubTaskTransitionHolder(), this.getTmpSubTaskTransitionHolder_ReferenceHoler(), "subTaskTransitionHolders", null, 0, -1, TmpReferenceHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmpSubTaskTransitionHolderEClass, TmpSubTaskTransitionHolder.class, "TmpSubTaskTransitionHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTmpSubTaskTransitionHolder_ToTaskType(), ecorePackage.getEString(), "toTaskType", null, 0, 1, TmpSubTaskTransitionHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTmpSubTaskTransitionHolder_To(), theSculptormetamodelPackage.getDomainObject(), null, "to", null, 0, 1, TmpSubTaskTransitionHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTmpSubTaskTransitionHolder_ReferenceHoler(), this.getTmpReferenceHolder(), this.getTmpReferenceHolder_SubTaskTransitionHolders(), "referenceHoler", null, 1, 1, TmpSubTaskTransitionHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTargetEClass, ReferenceTarget.class, "ReferenceTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceTarget_Reference(), theSculptormetamodelPackage.getReference(), null, "reference", null, 0, 1, ReferenceTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceTarget_Target(), theSculptormetamodelPackage.getDomainObject(), null, "target", null, 0, 1, ReferenceTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceViewPropertyEClass, ReferenceViewProperty.class, "ReferenceViewProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceViewProperty_RelatedTransitions(), this.getSubTaskTransition(), null, "relatedTransitions", null, 0, -1, ReferenceViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceViewProperty_Reference(), theSculptormetamodelPackage.getReference(), null, "reference", null, 0, 1, ReferenceViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceViewProperty_Target(), theSculptormetamodelPackage.getDomainObject(), null, "target", null, 0, 1, ReferenceViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceViewProperty_Base(), ecorePackage.getEBoolean(), "base", null, 0, 1, ReferenceViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceViewProperty_PreviewProperties(), this.getViewDataProperty(), null, "previewProperties", null, 0, -1, ReferenceViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeViewPropertyEClass, AttributeViewProperty.class, "AttributeViewProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeViewProperty_Attribute(), theSculptormetamodelPackage.getAttribute(), null, "attribute", null, 0, 1, AttributeViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicTypeViewPropertyEClass, BasicTypeViewProperty.class, "BasicTypeViewProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicTypeViewProperty_Reference(), theSculptormetamodelPackage.getReference(), null, "reference", null, 0, 1, BasicTypeViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicTypeViewProperty_Attribute(), theSculptormetamodelPackage.getAttribute(), null, "attribute", null, 0, 1, BasicTypeViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumViewPropertyEClass, EnumViewProperty.class, "EnumViewProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumViewProperty_Reference(), theSculptormetamodelPackage.getReference(), null, "reference", null, 0, 1, EnumViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicTypeEnumViewPropertyEClass, BasicTypeEnumViewProperty.class, "BasicTypeEnumViewProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicTypeEnumViewProperty_BasicTypeReference(), theSculptormetamodelPackage.getReference(), null, "basicTypeReference", null, 0, 1, BasicTypeEnumViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTaskGroupEClass, UserTaskGroup.class, "UserTaskGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserTaskGroup_UserTasks(), this.getUserTask(), null, "userTasks", null, 0, -1, UserTaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTaskGroup_For(), theSculptormetamodelPackage.getDomainObject(), null, "for", null, 0, 1, UserTaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTaskGroup_Module(), this.getGuiModule(), null, "module", null, 0, 1, UserTaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedReferenceViewPropertyEClass, DerivedReferenceViewProperty.class, "DerivedReferenceViewProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedReferenceViewProperty_DerivedFrom(), this.getReferenceViewProperty(), null, "derivedFrom", null, 1, 1, DerivedReferenceViewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addTaskEClass, AddTask.class, "AddTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddTask_FindDOWith(), theSculptormetamodelPackage.getServiceOperation(), null, "findDOWith", null, 0, 1, AddTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_Module(), this.getGuiModule(), this.getGuiModule_Views(), "module", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_For(), theSculptormetamodelPackage.getDomainObject(), null, "for", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_ServiceProxies(), this.getServiceProxy(), null, "serviceProxies", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Parameters(), this.getViewParameter(), null, "parameters", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Label(), ecorePackage.getEString(), "label", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_ExtendsName(), ecorePackage.getEString(), "extendsName", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Extends(), this.getView(), null, "extends", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Popup(), ecorePackage.getEBoolean(), "popup", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidget_View(), this.getView(), null, "view", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Label(), ecorePackage.getEString(), "label", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_BehaviorBindings(), this.getBehaviorBinding(), this.getBehaviorBinding_Widget(), "behaviorBindings", null, 1, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Enabled(), this.getUiCondition(), null, "enabled", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_WidgetType(), ecorePackage.getEString(), "widgetType", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Visible(), this.getUiCondition(), null, "visible", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputTextWidgetEClass, InputTextWidget.class, "InputTextWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationalTextWidgetEClass, InformationalTextWidget.class, "InformationalTextWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonWidgetEClass, ButtonWidget.class, "ButtonWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonWidget_Image(), ecorePackage.getEString(), "image", null, 0, 1, ButtonWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyReferringWidgetEClass, PropertyReferringWidget.class, "PropertyReferringWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyReferringWidget_ForOp(), theSculptormetamodelPackage.getDomainObjectOperation(), null, "forOp", null, 0, 1, PropertyReferringWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyReferringWidget_For(), theSculptormetamodelPackage.getDomainObject(), null, "for", null, 0, 1, PropertyReferringWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyReferringWidget_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, PropertyReferringWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyReferringWidget_ForProperty(), this.getPropertyPathElement(), null, "forProperty", null, 0, 1, PropertyReferringWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableWidgetEClass, TableWidget.class, "TableWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableWidget_Columns(), this.getTableColumn(), null, "columns", null, 0, -1, TableWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableWidget_Paging(), ecorePackage.getEBoolean(), "paging", null, 0, 1, TableWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableWidget_Size(), ecorePackage.getEInt(), "size", null, 0, 1, TableWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiEventEClass, GuiEvent.class, "GuiEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiEvent_GuiModule(), this.getGuiModule(), this.getGuiModule_Events(), "guiModule", null, 1, 1, GuiEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableColumnEClass, TableColumn.class, "TableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableColumn_ColumnType(), ecorePackage.getEString(), "columnType", null, 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumn_Filterable(), ecorePackage.getEBoolean(), "filterable", null, 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumn_Sortable(), ecorePackage.getEBoolean(), "sortable", null, 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumn_Editable(), ecorePackage.getEBoolean(), "editable", null, 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textAreaWidgetEClass, TextAreaWidget.class, "TextAreaWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(autocompleteWidgetEClass, AutocompleteWidget.class, "AutocompleteWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioButtonsWidgetEClass, RadioButtonsWidget.class, "RadioButtonsWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richTextAreaWidgetEClass, RichTextAreaWidget.class, "RichTextAreaWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputDateWidgetEClass, InputDateWidget.class, "InputDateWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberSpinnerWidgetEClass, NumberSpinnerWidget.class, "NumberSpinnerWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceProxyEClass, ServiceProxy.class, "ServiceProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceProxy_For(), theSculptormetamodelPackage.getService(), null, "for", null, 1, 1, ServiceProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProxy_GuiModule(), this.getGuiModule(), null, "guiModule", null, 0, 1, ServiceProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceProxyOperationEClass, ServiceProxyOperation.class, "ServiceProxyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceProxyOperation_For(), theSculptormetamodelPackage.getServiceOperation(), null, "for", null, 1, 1, ServiceProxyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiCommandEClass, GuiCommand.class, "GuiCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewParameterEClass, ViewParameter.class, "ViewParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewParameter_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, ViewParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkWidgetEClass, LinkWidget.class, "LinkWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkWidget_ToView(), this.getView(), null, "toView", null, 0, 1, LinkWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkWidget_ToDestination(), ecorePackage.getEString(), "toDestination", null, 0, 1, LinkWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetsContainerEClass, WidgetsContainer.class, "WidgetsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetsContainer_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, WidgetsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelWidgetEClass, PanelWidget.class, "PanelWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanelWidget_Disclosure(), ecorePackage.getEBoolean(), "disclosure", null, 0, 1, PanelWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBehaviorEClass, UiBehavior.class, "UiBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBehavior_Bindings(), this.getBehaviorBinding(), this.getBehaviorBinding_Behaviors(), "bindings", null, 0, -1, UiBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(populatePanelBehaviorEClass, PopulatePanelBehavior.class, "PopulatePanelBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPopulatePanelBehavior_Panel(), this.getPanelWidget(), null, "panel", null, 1, 1, PopulatePanelBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigateToViewBehaviorEClass, NavigateToViewBehavior.class, "NavigateToViewBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigateToViewBehavior_View(), this.getView(), null, "view", null, 1, 1, NavigateToViewBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorBindingEClass, BehaviorBinding.class, "BehaviorBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorBinding_Behaviors(), this.getUiBehavior(), this.getUiBehavior_Bindings(), "behaviors", null, 1, -1, BehaviorBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorBinding_Widget(), this.getWidget(), this.getWidget_BehaviorBindings(), "widget", null, 1, 1, BehaviorBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorBinding_BindingTypeName(), ecorePackage.getEString(), "bindingTypeName", null, 0, 1, BehaviorBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onClickBindingEClass, OnClickBinding.class, "OnClickBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onHoverBindingEClass, OnHoverBinding.class, "OnHoverBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiConditionEClass, UiCondition.class, "UiCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guiDtoEClass, GuiDto.class, "GuiDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiDto_For(), theSculptormetamodelPackage.getDomainObject(), null, "for", null, 0, 1, GuiDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiDto_GuiModule(), this.getGuiModule(), null, "guiModule", null, 0, 1, GuiDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiDto_Immutable(), ecorePackage.getEBoolean(), "immutable", null, 0, 1, GuiDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiEnumEClass, GuiEnum.class, "GuiEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stubModuleEClass, StubModule.class, "StubModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStubModule_StubFor(), theSculptormetamodelPackage.getModule(), null, "stubFor", null, 0, 1, StubModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStubModule_GuiModule(), this.getGuiModule(), null, "guiModule", null, 1, 1, StubModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listBoxWidgetEClass, ListBoxWidget.class, "ListBoxWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListBoxWidget_ForEnum(), theSculptormetamodelPackage.getEnum(), null, "forEnum", null, 1, 1, ListBoxWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorContainerEClass, BehaviorContainer.class, "BehaviorContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorContainer_Conditions(), this.getUiCondition(), null, "conditions", null, 0, -1, BehaviorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorContainer_Behaviors(), this.getUiBehavior(), null, "behaviors", null, 0, -1, BehaviorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customWidgetEClass, CustomWidget.class, "CustomWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateTableBehaviorEClass, UpdateTableBehavior.class, "UpdateTableBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateTableBehavior_Table(), this.getTableWidget(), null, "table", null, 1, 1, UpdateTableBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayMessageBehaviorEClass, DisplayMessageBehavior.class, "DisplayMessageBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplayMessageBehavior_Message(), ecorePackage.getEString(), "message", null, 0, 1, DisplayMessageBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplayMessageBehavior_Cancelable(), ecorePackage.getEBoolean(), "cancelable", null, 0, 1, DisplayMessageBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplayMessageBehavior_MessageId(), ecorePackage.getEString(), "messageId", null, 0, 1, DisplayMessageBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customBehaviorEClass, CustomBehavior.class, "CustomBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customConditionEClass, CustomCondition.class, "CustomCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeBehaviorEClass, CompositeBehavior.class, "CompositeBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeBehavior_Behaviors(), this.getUiBehavior(), null, "behaviors", null, 0, -1, CompositeBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onSelectItemBindingEClass, OnSelectItemBinding.class, "OnSelectItemBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(widgetTableColumnEClass, WidgetTableColumn.class, "WidgetTableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetTableColumn_Widget(), this.getWidget(), null, "widget", null, 1, 1, WidgetTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTableColumnEClass, SimpleTableColumn.class, "SimpleTableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setDirtyFlagBehaviorEClass, SetDirtyFlagBehavior.class, "SetDirtyFlagBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetDirtyFlagBehavior_MarkSpecificObj(), ecorePackage.getEBoolean(), "markSpecificObj", null, 0, 1, SetDirtyFlagBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(warnIfDirtyBehaviorEClass, WarnIfDirtyBehavior.class, "WarnIfDirtyBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(populateListBoxBehaviorEClass, PopulateListBoxBehavior.class, "PopulateListBoxBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPopulateListBoxBehavior_Widget(), this.getListBoxWidget(), null, "widget", null, 1, 1, PopulateListBoxBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markDirtyBehaviorEClass, MarkDirtyBehavior.class, "MarkDirtyBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(markCleanBehaviorEClass, MarkCleanBehavior.class, "MarkCleanBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goBackBehaviorEClass, GoBackBehavior.class, "GoBackBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateAttributeBehaviorEClass, UpdateAttributeBehavior.class, "UpdateAttributeBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateAttributeBehavior_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, UpdateAttributeBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateAttributeBehavior_TargetClass(), theSculptormetamodelPackage.getDomainObject(), null, "targetClass", null, 0, 1, UpdateAttributeBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasDirtyValueConditionEClass, HasDirtyValueCondition.class, "HasDirtyValueCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasDirtyValueCondition_Dirty(), ecorePackage.getEBoolean(), "dirty", null, 0, 1, HasDirtyValueCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(popupPanelBehaviorEClass, PopupPanelBehavior.class, "PopupPanelBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPopupPanelBehavior_View(), this.getView(), null, "view", null, 0, 1, PopupPanelBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopupPanelBehavior_PanelName(), ecorePackage.getEString(), "panelName", null, 0, 1, PopupPanelBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiDtoOptionsEClass, GuiDtoOptions.class, "GuiDtoOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiDtoOptions_Skip(), ecorePackage.getEBoolean(), "skip", null, 0, 1, GuiDtoOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyPathElementEClass, PropertyPathElement.class, "PropertyPathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyPathElement_RemainingPath(), this.getPropertyPathElement(), null, "remainingPath", null, 0, 1, PropertyPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyPathElement_ForAttribute(), theSculptormetamodelPackage.getAttribute(), null, "forAttribute", null, 0, 1, PropertyPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyPathElement_ForReference(), theSculptormetamodelPackage.getReference(), null, "forReference", null, 0, 1, PropertyPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateHistoryBehaviorEClass, UpdateHistoryBehavior.class, "UpdateHistoryBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clearWidgetsBehaviorEClass, ClearWidgetsBehavior.class, "ClearWidgetsBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearWidgetsBehavior_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, ClearWidgetsBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SculptorguimetamodelPackageImpl
