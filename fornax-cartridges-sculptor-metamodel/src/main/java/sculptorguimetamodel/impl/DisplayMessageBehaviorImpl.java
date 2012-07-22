/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptorguimetamodel.DisplayMessageBehavior;
import sculptorguimetamodel.SculptorguimetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Message Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.DisplayMessageBehaviorImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.DisplayMessageBehaviorImpl#isCancelable <em>Cancelable</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.DisplayMessageBehaviorImpl#getMessageId <em>Message Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisplayMessageBehaviorImpl extends UiBehaviorImpl implements DisplayMessageBehavior {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCancelable() <em>Cancelable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCELABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCancelable() <em>Cancelable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelable()
	 * @generated
	 * @ordered
	 */
	protected boolean cancelable = CANCELABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageId() <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageId()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageId() <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageId()
	 * @generated
	 * @ordered
	 */
	protected String messageId = MESSAGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayMessageBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.DISPLAY_MESSAGE_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCancelable() {
		return cancelable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelable(boolean newCancelable) {
		boolean oldCancelable = cancelable;
		cancelable = newCancelable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__CANCELABLE, oldCancelable, cancelable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageId(String newMessageId) {
		String oldMessageId = messageId;
		messageId = newMessageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__MESSAGE_ID, oldMessageId, messageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__MESSAGE:
				return getMessage();
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__CANCELABLE:
				return isCancelable() ? Boolean.TRUE : Boolean.FALSE;
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__MESSAGE_ID:
				return getMessageId();
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
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__MESSAGE:
				setMessage((String)newValue);
				return;
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__CANCELABLE:
				setCancelable(((Boolean)newValue).booleanValue());
				return;
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__MESSAGE_ID:
				setMessageId((String)newValue);
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
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__CANCELABLE:
				setCancelable(CANCELABLE_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__MESSAGE_ID:
				setMessageId(MESSAGE_ID_EDEFAULT);
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
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__CANCELABLE:
				return cancelable != CANCELABLE_EDEFAULT;
			case SculptorguimetamodelPackage.DISPLAY_MESSAGE_BEHAVIOR__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageId != null : !MESSAGE_ID_EDEFAULT.equals(messageId);
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
		result.append(" (message: ");
		result.append(message);
		result.append(", cancelable: ");
		result.append(cancelable);
		result.append(", messageId: ");
		result.append(messageId);
		result.append(')');
		return result.toString();
	}

} //DisplayMessageBehaviorImpl
