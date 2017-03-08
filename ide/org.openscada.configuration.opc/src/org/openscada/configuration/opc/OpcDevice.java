/**
 */
package org.openscada.configuration.opc;

import org.eclipse.scada.configuration.infrastructure.Device;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opc.OpcDevice#getClassId <em>Class Id</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.OpcDevice#getProgId <em>Prog Id</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.OpcDevice#getUser <em>User</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.OpcDevice#getPassword <em>Password</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.OpcDevice#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.OpcDevice#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.OpcDevice#getPollRate <em>Poll Rate</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opc.OpcPackage#getOpcDevice()
 * @model
 * @generated
 */
public interface OpcDevice extends Device
{
    /**
     * Returns the value of the '<em><b>Class Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Class Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Class Id</em>' attribute.
     * @see #setClassId(String)
     * @see org.openscada.configuration.opc.OpcPackage#getOpcDevice_ClassId()
     * @model
     * @generated
     */
    String getClassId();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opc.OpcDevice#getClassId <em>Class Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class Id</em>' attribute.
     * @see #getClassId()
     * @generated
     */
    void setClassId(String value);

    /**
     * Returns the value of the '<em><b>Prog Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prog Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prog Id</em>' attribute.
     * @see #setProgId(String)
     * @see org.openscada.configuration.opc.OpcPackage#getOpcDevice_ProgId()
     * @model
     * @generated
     */
    String getProgId();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opc.OpcDevice#getProgId <em>Prog Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prog Id</em>' attribute.
     * @see #getProgId()
     * @generated
     */
    void setProgId(String value);

    /**
     * Returns the value of the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User</em>' attribute.
     * @see #setUser(String)
     * @see org.openscada.configuration.opc.OpcPackage#getOpcDevice_User()
     * @model required="true"
     * @generated
     */
    String getUser();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opc.OpcDevice#getUser <em>User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User</em>' attribute.
     * @see #getUser()
     * @generated
     */
    void setUser(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see org.openscada.configuration.opc.OpcPackage#getOpcDevice_Password()
     * @model required="true"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opc.OpcDevice#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Domain</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Domain</em>' attribute.
     * @see #setDomain(String)
     * @see org.openscada.configuration.opc.OpcPackage#getOpcDevice_Domain()
     * @model required="true"
     * @generated
     */
    String getDomain();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opc.OpcDevice#getDomain <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Domain</em>' attribute.
     * @see #getDomain()
     * @generated
     */
    void setDomain(String value);

    /**
     * Returns the value of the '<em><b>Reconnect Delay</b></em>' attribute.
     * The default value is <code>"10000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reconnect Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reconnect Delay</em>' attribute.
     * @see #setReconnectDelay(int)
     * @see org.openscada.configuration.opc.OpcPackage#getOpcDevice_ReconnectDelay()
     * @model default="10000" required="true"
     * @generated
     */
    int getReconnectDelay();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opc.OpcDevice#getReconnectDelay <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reconnect Delay</em>' attribute.
     * @see #getReconnectDelay()
     * @generated
     */
    void setReconnectDelay(int value);

    /**
     * Returns the value of the '<em><b>Poll Rate</b></em>' attribute.
     * The default value is <code>"250"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Poll Rate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Poll Rate</em>' attribute.
     * @see #setPollRate(int)
     * @see org.openscada.configuration.opc.OpcPackage#getOpcDevice_PollRate()
     * @model default="250" required="true"
     * @generated
     */
    int getPollRate();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opc.OpcDevice#getPollRate <em>Poll Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Poll Rate</em>' attribute.
     * @see #getPollRate()
     * @generated
     */
    void setPollRate(int value);

} // OpcDevice
