/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptormetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sculptormetamodel.DomainObjectTypedElement#getDomainObjectType <em>Domain Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sculptormetamodel.SculptormetamodelPackage#getDomainObjectTypedElement()
 * @model
 * @generated
 */
public interface DomainObjectTypedElement extends TypedElement {
    /**
     * Returns the value of the '<em><b>Domain Object Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Object Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Domain Object Type</em>' reference.
     * @see #setDomainObjectType(DomainObject)
     * @see sculptormetamodel.SculptormetamodelPackage#getDomainObjectTypedElement_DomainObjectType()
     * @model
     * @generated
     */
	DomainObject getDomainObjectType();

    /**
     * Sets the value of the '{@link sculptormetamodel.DomainObjectTypedElement#getDomainObjectType <em>Domain Object Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Domain Object Type</em>' reference.
     * @see #getDomainObjectType()
     * @generated
     */
	void setDomainObjectType(DomainObject value);

} // DomainObjectTypedElement