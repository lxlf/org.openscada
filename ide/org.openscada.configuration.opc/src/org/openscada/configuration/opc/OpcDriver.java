/**
 */
package org.openscada.configuration.opc;

import org.eclipse.scada.configuration.world.CommonDriver;

import org.openscada.da.opc.configuration.RootType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opc.OpcDriver#getRoot <em>Root</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.OpcDriver#getSocketTimeout <em>Socket Timeout</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opc.OpcPackage#getOpcDriver()
 * @model
 * @generated
 */
public interface OpcDriver extends CommonDriver
{
    /**
     * Returns the value of the '<em><b>Root</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root</em>' containment reference.
     * @see #setRoot(RootType)
     * @see org.openscada.configuration.opc.OpcPackage#getOpcDriver_Root()
     * @model containment="true"
     * @generated
     */
    RootType getRoot();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opc.OpcDriver#getRoot <em>Root</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root</em>' containment reference.
     * @see #getRoot()
     * @generated
     */
    void setRoot(RootType value);

    /**
     * Returns the value of the '<em><b>Socket Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Socket Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Socket Timeout</em>' attribute.
     * @see #setSocketTimeout(Integer)
     * @see org.openscada.configuration.opc.OpcPackage#getOpcDriver_SocketTimeout()
     * @model
     * @generated
     */
    Integer getSocketTimeout();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opc.OpcDriver#getSocketTimeout <em>Socket Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Socket Timeout</em>' attribute.
     * @see #getSocketTimeout()
     * @generated
     */
    void setSocketTimeout(Integer value);

} // OpcDriver
