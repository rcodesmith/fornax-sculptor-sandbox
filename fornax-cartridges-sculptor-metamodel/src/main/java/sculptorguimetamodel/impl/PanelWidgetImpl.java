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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import sculptorguimetamodel.BehaviorBinding;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sculptorguimetamodel.PanelWidget;
import sculptorguimetamodel.PropertyReferringWidget;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.UiCondition;
import sculptorguimetamodel.View;
import sculptorguimetamodel.Widget;
import sculptormetamodel.Attribute;
import sculptorguimetamodel.WidgetsContainer;
import sculptormetamodel.DomainObject;
import sculptormetamodel.DomainObjectOperation;
import sculptormetamodel.NamedElement;
import sculptormetamodel.Reference;
import sculptormetamodel.SculptormetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Panel Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getView <em>View</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getBehaviorBindings <em>Behavior Bindings</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getWidgetType <em>Widget Type</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getForAttribute <em>For Attribute</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getForReference <em>For Reference</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getForOp <em>For Op</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.PanelWidgetImpl#getPropertyPath <em>Property Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PanelWidgetImpl extends WidgetsContainerImpl implements PanelWidget {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoc() <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected String doc = DOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected static final String HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected String hint = HINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected View view;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehaviorBindings() <em>Behavior Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorBindings()
	 * @generated
	 * @ordered
	 */
	protected EList behaviorBindings;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected UiCondition enabled;

	/**
	 * The default value of the '{@link #getWidgetType() <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDGET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidgetType() <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected String widgetType = WIDGET_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected UiCondition visible;

	/**
	 * The cached value of the '{@link #getForAttribute() <em>For Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute forAttribute;

	/**
	 * The cached value of the '{@link #getForReference() <em>For Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForReference()
	 * @generated
	 * @ordered
	 */
	protected Reference forReference;

	/**
	 * The cached value of the '{@link #getForOp() <em>For Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForOp()
	 * @generated
	 * @ordered
	 */
	protected DomainObjectOperation forOp;

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
	 * The default value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String propertyPath = PROPERTY_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PanelWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.PANEL_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoc() {
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoc(String newDoc) {
		String oldDoc = doc;
		doc = newDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__DOC, oldDoc, doc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHint(String newHint) {
		String oldHint = hint;
		hint = newHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getView() {
		if (view != null && view.eIsProxy()) {
			InternalEObject oldView = (InternalEObject)view;
			view = (View)eResolveProxy(oldView);
			if (view != oldView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PANEL_WIDGET__VIEW, oldView, view));
			}
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(View newView) {
		View oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBehaviorBindings() {
		if (behaviorBindings == null) {
			behaviorBindings = new EObjectResolvingEList(BehaviorBinding.class, this, SculptorguimetamodelPackage.PANEL_WIDGET__BEHAVIOR_BINDINGS);
		}
		return behaviorBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCondition getEnabled() {
		if (enabled != null && enabled.eIsProxy()) {
			InternalEObject oldEnabled = (InternalEObject)enabled;
			enabled = (UiCondition)eResolveProxy(oldEnabled);
			if (enabled != oldEnabled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PANEL_WIDGET__ENABLED, oldEnabled, enabled));
			}
		}
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCondition basicGetEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(UiCondition newEnabled) {
		UiCondition oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidgetType() {
		return widgetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidgetType(String newWidgetType) {
		String oldWidgetType = widgetType;
		widgetType = newWidgetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__WIDGET_TYPE, oldWidgetType, widgetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCondition getVisible() {
		if (visible != null && visible.eIsProxy()) {
			InternalEObject oldVisible = (InternalEObject)visible;
			visible = (UiCondition)eResolveProxy(oldVisible);
			if (visible != oldVisible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PANEL_WIDGET__VISIBLE, oldVisible, visible));
			}
		}
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCondition basicGetVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(UiCondition newVisible) {
		UiCondition oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getForAttribute() {
		if (forAttribute != null && forAttribute.eIsProxy()) {
			InternalEObject oldForAttribute = (InternalEObject)forAttribute;
			forAttribute = (Attribute)eResolveProxy(oldForAttribute);
			if (forAttribute != oldForAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PANEL_WIDGET__FOR_ATTRIBUTE, oldForAttribute, forAttribute));
			}
		}
		return forAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetForAttribute() {
		return forAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForAttribute(Attribute newForAttribute) {
		Attribute oldForAttribute = forAttribute;
		forAttribute = newForAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__FOR_ATTRIBUTE, oldForAttribute, forAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getForReference() {
		if (forReference != null && forReference.eIsProxy()) {
			InternalEObject oldForReference = (InternalEObject)forReference;
			forReference = (Reference)eResolveProxy(oldForReference);
			if (forReference != oldForReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PANEL_WIDGET__FOR_REFERENCE, oldForReference, forReference));
			}
		}
		return forReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetForReference() {
		return forReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForReference(Reference newForReference) {
		Reference oldForReference = forReference;
		forReference = newForReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__FOR_REFERENCE, oldForReference, forReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectOperation getForOp() {
		if (forOp != null && forOp.eIsProxy()) {
			InternalEObject oldForOp = (InternalEObject)forOp;
			forOp = (DomainObjectOperation)eResolveProxy(oldForOp);
			if (forOp != oldForOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PANEL_WIDGET__FOR_OP, oldForOp, forOp));
			}
		}
		return forOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectOperation basicGetForOp() {
		return forOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForOp(DomainObjectOperation newForOp) {
		DomainObjectOperation oldForOp = forOp;
		forOp = newForOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__FOR_OP, oldForOp, forOp));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.PANEL_WIDGET__FOR, oldFor, for_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__FOR, oldFor, for_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyPath() {
		return propertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyPath(String newPropertyPath) {
		String oldPropertyPath = propertyPath;
		propertyPath = newPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.PANEL_WIDGET__PROPERTY_PATH, oldPropertyPath, propertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.PANEL_WIDGET__NAME:
				return getName();
			case SculptorguimetamodelPackage.PANEL_WIDGET__DOC:
				return getDoc();
			case SculptorguimetamodelPackage.PANEL_WIDGET__HINT:
				return getHint();
			case SculptorguimetamodelPackage.PANEL_WIDGET__VIEW:
				if (resolve) return getView();
				return basicGetView();
			case SculptorguimetamodelPackage.PANEL_WIDGET__LABEL:
				return getLabel();
			case SculptorguimetamodelPackage.PANEL_WIDGET__BEHAVIOR_BINDINGS:
				return getBehaviorBindings();
			case SculptorguimetamodelPackage.PANEL_WIDGET__ENABLED:
				if (resolve) return getEnabled();
				return basicGetEnabled();
			case SculptorguimetamodelPackage.PANEL_WIDGET__WIDGET_TYPE:
				return getWidgetType();
			case SculptorguimetamodelPackage.PANEL_WIDGET__VISIBLE:
				if (resolve) return getVisible();
				return basicGetVisible();
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_ATTRIBUTE:
				if (resolve) return getForAttribute();
				return basicGetForAttribute();
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_REFERENCE:
				if (resolve) return getForReference();
				return basicGetForReference();
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_OP:
				if (resolve) return getForOp();
				return basicGetForOp();
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR:
				if (resolve) return getFor();
				return basicGetFor();
			case SculptorguimetamodelPackage.PANEL_WIDGET__PROPERTY_PATH:
				return getPropertyPath();
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
			case SculptorguimetamodelPackage.PANEL_WIDGET__NAME:
				setName((String)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__DOC:
				setDoc((String)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__HINT:
				setHint((String)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__VIEW:
				setView((View)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__LABEL:
				setLabel((String)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__BEHAVIOR_BINDINGS:
				getBehaviorBindings().clear();
				getBehaviorBindings().addAll((Collection)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__ENABLED:
				setEnabled((UiCondition)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__WIDGET_TYPE:
				setWidgetType((String)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__VISIBLE:
				setVisible((UiCondition)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_ATTRIBUTE:
				setForAttribute((Attribute)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_REFERENCE:
				setForReference((Reference)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_OP:
				setForOp((DomainObjectOperation)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR:
				setFor((DomainObject)newValue);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__PROPERTY_PATH:
				setPropertyPath((String)newValue);
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
			case SculptorguimetamodelPackage.PANEL_WIDGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__HINT:
				setHint(HINT_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__VIEW:
				setView((View)null);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__BEHAVIOR_BINDINGS:
				getBehaviorBindings().clear();
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__ENABLED:
				setEnabled((UiCondition)null);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__WIDGET_TYPE:
				setWidgetType(WIDGET_TYPE_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__VISIBLE:
				setVisible((UiCondition)null);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_ATTRIBUTE:
				setForAttribute((Attribute)null);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_REFERENCE:
				setForReference((Reference)null);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_OP:
				setForOp((DomainObjectOperation)null);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR:
				setFor((DomainObject)null);
				return;
			case SculptorguimetamodelPackage.PANEL_WIDGET__PROPERTY_PATH:
				setPropertyPath(PROPERTY_PATH_EDEFAULT);
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
			case SculptorguimetamodelPackage.PANEL_WIDGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SculptorguimetamodelPackage.PANEL_WIDGET__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case SculptorguimetamodelPackage.PANEL_WIDGET__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
			case SculptorguimetamodelPackage.PANEL_WIDGET__VIEW:
				return view != null;
			case SculptorguimetamodelPackage.PANEL_WIDGET__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SculptorguimetamodelPackage.PANEL_WIDGET__BEHAVIOR_BINDINGS:
				return behaviorBindings != null && !behaviorBindings.isEmpty();
			case SculptorguimetamodelPackage.PANEL_WIDGET__ENABLED:
				return enabled != null;
			case SculptorguimetamodelPackage.PANEL_WIDGET__WIDGET_TYPE:
				return WIDGET_TYPE_EDEFAULT == null ? widgetType != null : !WIDGET_TYPE_EDEFAULT.equals(widgetType);
			case SculptorguimetamodelPackage.PANEL_WIDGET__VISIBLE:
				return visible != null;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_ATTRIBUTE:
				return forAttribute != null;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_REFERENCE:
				return forReference != null;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_OP:
				return forOp != null;
			case SculptorguimetamodelPackage.PANEL_WIDGET__FOR:
				return for_ != null;
			case SculptorguimetamodelPackage.PANEL_WIDGET__PROPERTY_PATH:
				return PROPERTY_PATH_EDEFAULT == null ? propertyPath != null : !PROPERTY_PATH_EDEFAULT.equals(propertyPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case SculptorguimetamodelPackage.PANEL_WIDGET__NAME: return SculptormetamodelPackage.NAMED_ELEMENT__NAME;
				case SculptorguimetamodelPackage.PANEL_WIDGET__DOC: return SculptormetamodelPackage.NAMED_ELEMENT__DOC;
				case SculptorguimetamodelPackage.PANEL_WIDGET__HINT: return SculptormetamodelPackage.NAMED_ELEMENT__HINT;
				default: return -1;
			}
		}
		if (baseClass == Widget.class) {
			switch (derivedFeatureID) {
				case SculptorguimetamodelPackage.PANEL_WIDGET__VIEW: return SculptorguimetamodelPackage.WIDGET__VIEW;
				case SculptorguimetamodelPackage.PANEL_WIDGET__LABEL: return SculptorguimetamodelPackage.WIDGET__LABEL;
				case SculptorguimetamodelPackage.PANEL_WIDGET__BEHAVIOR_BINDINGS: return SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS;
				case SculptorguimetamodelPackage.PANEL_WIDGET__ENABLED: return SculptorguimetamodelPackage.WIDGET__ENABLED;
				case SculptorguimetamodelPackage.PANEL_WIDGET__WIDGET_TYPE: return SculptorguimetamodelPackage.WIDGET__WIDGET_TYPE;
				case SculptorguimetamodelPackage.PANEL_WIDGET__VISIBLE: return SculptorguimetamodelPackage.WIDGET__VISIBLE;
				default: return -1;
			}
		}
		if (baseClass == PropertyReferringWidget.class) {
			switch (derivedFeatureID) {
				case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_ATTRIBUTE: return SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_ATTRIBUTE;
				case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_REFERENCE: return SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_REFERENCE;
				case SculptorguimetamodelPackage.PANEL_WIDGET__FOR_OP: return SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP;
				case SculptorguimetamodelPackage.PANEL_WIDGET__FOR: return SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR;
				case SculptorguimetamodelPackage.PANEL_WIDGET__PROPERTY_PATH: return SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case SculptormetamodelPackage.NAMED_ELEMENT__NAME: return SculptorguimetamodelPackage.PANEL_WIDGET__NAME;
				case SculptormetamodelPackage.NAMED_ELEMENT__DOC: return SculptorguimetamodelPackage.PANEL_WIDGET__DOC;
				case SculptormetamodelPackage.NAMED_ELEMENT__HINT: return SculptorguimetamodelPackage.PANEL_WIDGET__HINT;
				default: return -1;
			}
		}
		if (baseClass == Widget.class) {
			switch (baseFeatureID) {
				case SculptorguimetamodelPackage.WIDGET__VIEW: return SculptorguimetamodelPackage.PANEL_WIDGET__VIEW;
				case SculptorguimetamodelPackage.WIDGET__LABEL: return SculptorguimetamodelPackage.PANEL_WIDGET__LABEL;
				case SculptorguimetamodelPackage.WIDGET__BEHAVIOR_BINDINGS: return SculptorguimetamodelPackage.PANEL_WIDGET__BEHAVIOR_BINDINGS;
				case SculptorguimetamodelPackage.WIDGET__ENABLED: return SculptorguimetamodelPackage.PANEL_WIDGET__ENABLED;
				case SculptorguimetamodelPackage.WIDGET__WIDGET_TYPE: return SculptorguimetamodelPackage.PANEL_WIDGET__WIDGET_TYPE;
				case SculptorguimetamodelPackage.WIDGET__VISIBLE: return SculptorguimetamodelPackage.PANEL_WIDGET__VISIBLE;
				default: return -1;
			}
		}
		if (baseClass == PropertyReferringWidget.class) {
			switch (baseFeatureID) {
				case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_ATTRIBUTE: return SculptorguimetamodelPackage.PANEL_WIDGET__FOR_ATTRIBUTE;
				case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_REFERENCE: return SculptorguimetamodelPackage.PANEL_WIDGET__FOR_REFERENCE;
				case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR_OP: return SculptorguimetamodelPackage.PANEL_WIDGET__FOR_OP;
				case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__FOR: return SculptorguimetamodelPackage.PANEL_WIDGET__FOR;
				case SculptorguimetamodelPackage.PROPERTY_REFERRING_WIDGET__PROPERTY_PATH: return SculptorguimetamodelPackage.PANEL_WIDGET__PROPERTY_PATH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", doc: ");
		result.append(doc);
		result.append(", hint: ");
		result.append(hint);
		result.append(", label: ");
		result.append(label);
		result.append(", widgetType: ");
		result.append(widgetType);
		result.append(", propertyPath: ");
		result.append(propertyPath);
		result.append(')');
		return result.toString();
	}

} //PanelWidgetImpl
