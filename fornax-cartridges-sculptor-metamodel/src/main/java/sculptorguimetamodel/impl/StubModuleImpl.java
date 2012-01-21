/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.StubModule;

import sculptormetamodel.Module;

import sculptormetamodel.impl.ModuleImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stub Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.StubModuleImpl#getStubFor <em>Stub For</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.StubModuleImpl#getGuiModule <em>Gui Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StubModuleImpl extends ModuleImpl implements StubModule {
	/**
	 * The cached value of the '{@link #getStubFor() <em>Stub For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubFor()
	 * @generated
	 * @ordered
	 */
	protected Module stubFor;

	/**
	 * The cached value of the '{@link #getGuiModule() <em>Gui Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuiModule()
	 * @generated
	 * @ordered
	 */
	protected GuiModule guiModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StubModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.STUB_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getStubFor() {
		if (stubFor != null && stubFor.eIsProxy()) {
			InternalEObject oldStubFor = (InternalEObject)stubFor;
			stubFor = (Module)eResolveProxy(oldStubFor);
			if (stubFor != oldStubFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.STUB_MODULE__STUB_FOR, oldStubFor, stubFor));
			}
		}
		return stubFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetStubFor() {
		return stubFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStubFor(Module newStubFor) {
		Module oldStubFor = stubFor;
		stubFor = newStubFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.STUB_MODULE__STUB_FOR, oldStubFor, stubFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiModule getGuiModule() {
		if (guiModule != null && guiModule.eIsProxy()) {
			InternalEObject oldGuiModule = (InternalEObject)guiModule;
			guiModule = (GuiModule)eResolveProxy(oldGuiModule);
			if (guiModule != oldGuiModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.STUB_MODULE__GUI_MODULE, oldGuiModule, guiModule));
			}
		}
		return guiModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiModule basicGetGuiModule() {
		return guiModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuiModule(GuiModule newGuiModule) {
		GuiModule oldGuiModule = guiModule;
		guiModule = newGuiModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.STUB_MODULE__GUI_MODULE, oldGuiModule, guiModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.STUB_MODULE__STUB_FOR:
				if (resolve) return getStubFor();
				return basicGetStubFor();
			case SculptorguimetamodelPackage.STUB_MODULE__GUI_MODULE:
				if (resolve) return getGuiModule();
				return basicGetGuiModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SculptorguimetamodelPackage.STUB_MODULE__STUB_FOR:
				setStubFor((Module)newValue);
				return;
			case SculptorguimetamodelPackage.STUB_MODULE__GUI_MODULE:
				setGuiModule((GuiModule)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SculptorguimetamodelPackage.STUB_MODULE__STUB_FOR:
				setStubFor((Module)null);
				return;
			case SculptorguimetamodelPackage.STUB_MODULE__GUI_MODULE:
				setGuiModule((GuiModule)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SculptorguimetamodelPackage.STUB_MODULE__STUB_FOR:
				return stubFor != null;
			case SculptorguimetamodelPackage.STUB_MODULE__GUI_MODULE:
				return guiModule != null;
		}
		return super.eIsSet(featureID);
	}

} //StubModuleImpl
