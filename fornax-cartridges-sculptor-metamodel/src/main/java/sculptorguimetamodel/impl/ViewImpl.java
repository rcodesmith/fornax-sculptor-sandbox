/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.ServiceProxy;
import sculptorguimetamodel.View;

import sculptorguimetamodel.ViewParameter;
import sculptorguimetamodel.Widget;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Service;
import sculptormetamodel.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.ViewImpl#getModule <em>Module</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.ViewImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.ViewImpl#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.ViewImpl#getServiceProxies <em>Service Proxies</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.ViewImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends NamedElementImpl implements View {
	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList widgets;
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
	 * The cached value of the '{@link #getServiceProxies() <em>Service Proxies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProxies()
	 * @generated
	 * @ordered
	 */
	protected EList serviceProxies;
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiModule getModule() {
		if (eContainerFeatureID() != SculptorguimetamodelPackage.VIEW__MODULE) return null;
		return (GuiModule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(GuiModule newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, SculptorguimetamodelPackage.VIEW__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(GuiModule newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != SculptorguimetamodelPackage.VIEW__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, SculptorguimetamodelPackage.GUI_MODULE__VIEWS, GuiModule.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.VIEW__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentWithInverseEList(Widget.class, this, SculptorguimetamodelPackage.VIEW__WIDGETS, SculptorguimetamodelPackage.WIDGET__VIEW);
		}
		return widgets;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.VIEW__FOR, oldFor, for_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.VIEW__FOR, oldFor, for_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServiceProxies() {
		if (serviceProxies == null) {
			serviceProxies = new EObjectResolvingEList(ServiceProxy.class, this, SculptorguimetamodelPackage.VIEW__SERVICE_PROXIES);
		}
		return serviceProxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList(ViewParameter.class, this, SculptorguimetamodelPackage.VIEW__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.VIEW__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((GuiModule)otherEnd, msgs);
			case SculptorguimetamodelPackage.VIEW__WIDGETS:
				return ((InternalEList)getWidgets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.VIEW__MODULE:
				return basicSetModule(null, msgs);
			case SculptorguimetamodelPackage.VIEW__WIDGETS:
				return ((InternalEList)getWidgets()).basicRemove(otherEnd, msgs);
			case SculptorguimetamodelPackage.VIEW__PARAMETERS:
				return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SculptorguimetamodelPackage.VIEW__MODULE:
				return eInternalContainer().eInverseRemove(this, SculptorguimetamodelPackage.GUI_MODULE__VIEWS, GuiModule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.VIEW__MODULE:
				return getModule();
			case SculptorguimetamodelPackage.VIEW__WIDGETS:
				return getWidgets();
			case SculptorguimetamodelPackage.VIEW__FOR:
				if (resolve) return getFor();
				return basicGetFor();
			case SculptorguimetamodelPackage.VIEW__SERVICE_PROXIES:
				return getServiceProxies();
			case SculptorguimetamodelPackage.VIEW__PARAMETERS:
				return getParameters();
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
			case SculptorguimetamodelPackage.VIEW__MODULE:
				setModule((GuiModule)newValue);
				return;
			case SculptorguimetamodelPackage.VIEW__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection)newValue);
				return;
			case SculptorguimetamodelPackage.VIEW__FOR:
				setFor((DomainObject)newValue);
				return;
			case SculptorguimetamodelPackage.VIEW__SERVICE_PROXIES:
				getServiceProxies().clear();
				getServiceProxies().addAll((Collection)newValue);
				return;
			case SculptorguimetamodelPackage.VIEW__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
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
			case SculptorguimetamodelPackage.VIEW__MODULE:
				setModule((GuiModule)null);
				return;
			case SculptorguimetamodelPackage.VIEW__WIDGETS:
				getWidgets().clear();
				return;
			case SculptorguimetamodelPackage.VIEW__FOR:
				setFor((DomainObject)null);
				return;
			case SculptorguimetamodelPackage.VIEW__SERVICE_PROXIES:
				getServiceProxies().clear();
				return;
			case SculptorguimetamodelPackage.VIEW__PARAMETERS:
				getParameters().clear();
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
			case SculptorguimetamodelPackage.VIEW__MODULE:
				return getModule() != null;
			case SculptorguimetamodelPackage.VIEW__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case SculptorguimetamodelPackage.VIEW__FOR:
				return for_ != null;
			case SculptorguimetamodelPackage.VIEW__SERVICE_PROXIES:
				return serviceProxies != null && !serviceProxies.isEmpty();
			case SculptorguimetamodelPackage.VIEW__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewImpl
