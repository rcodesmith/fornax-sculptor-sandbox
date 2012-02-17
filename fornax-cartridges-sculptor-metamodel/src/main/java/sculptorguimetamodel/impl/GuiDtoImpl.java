/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import sculptorguimetamodel.GuiDto;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.SculptorguimetamodelPackage;

import sculptormetamodel.DomainObject;

import sculptormetamodel.impl.DomainObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui Dto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.GuiDtoImpl#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.GuiDtoImpl#getGuiModule <em>Gui Module</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.GuiDtoImpl#isImmutable <em>Immutable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuiDtoImpl extends DomainObjectImpl implements GuiDto {
	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected DomainObject for_;

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
	 * The default value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMMUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmutable()
	 * @generated
	 * @ordered
	 */
	protected boolean immutable = IMMUTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiDtoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.GUI_DTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject getFor() {
		if (for_ != null && for_.eIsProxy()) {
			InternalEObject oldFor = (InternalEObject)for_;
			for_ = (DomainObject)eResolveProxy(oldFor);
			if (for_ != oldFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.GUI_DTO__FOR, oldFor, for_));
			}
		}
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(DomainObject newFor) {
		DomainObject oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.GUI_DTO__FOR, oldFor, for_));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.GUI_DTO__GUI_MODULE, oldGuiModule, guiModule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.GUI_DTO__GUI_MODULE, oldGuiModule, guiModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImmutable() {
		return immutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmutable(boolean newImmutable) {
		boolean oldImmutable = immutable;
		immutable = newImmutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.GUI_DTO__IMMUTABLE, oldImmutable, immutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.GUI_DTO__FOR:
				if (resolve) return getFor();
				return basicGetFor();
			case SculptorguimetamodelPackage.GUI_DTO__GUI_MODULE:
				if (resolve) return getGuiModule();
				return basicGetGuiModule();
			case SculptorguimetamodelPackage.GUI_DTO__IMMUTABLE:
				return isImmutable() ? Boolean.TRUE : Boolean.FALSE;
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
			case SculptorguimetamodelPackage.GUI_DTO__FOR:
				setFor((DomainObject)newValue);
				return;
			case SculptorguimetamodelPackage.GUI_DTO__GUI_MODULE:
				setGuiModule((GuiModule)newValue);
				return;
			case SculptorguimetamodelPackage.GUI_DTO__IMMUTABLE:
				setImmutable(((Boolean)newValue).booleanValue());
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
			case SculptorguimetamodelPackage.GUI_DTO__FOR:
				setFor((DomainObject)null);
				return;
			case SculptorguimetamodelPackage.GUI_DTO__GUI_MODULE:
				setGuiModule((GuiModule)null);
				return;
			case SculptorguimetamodelPackage.GUI_DTO__IMMUTABLE:
				setImmutable(IMMUTABLE_EDEFAULT);
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
			case SculptorguimetamodelPackage.GUI_DTO__FOR:
				return for_ != null;
			case SculptorguimetamodelPackage.GUI_DTO__GUI_MODULE:
				return guiModule != null;
			case SculptorguimetamodelPackage.GUI_DTO__IMMUTABLE:
				return immutable != IMMUTABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (immutable: ");
		result.append(immutable);
		result.append(')');
		return result.toString();
	}

} //GuiDtoImpl
