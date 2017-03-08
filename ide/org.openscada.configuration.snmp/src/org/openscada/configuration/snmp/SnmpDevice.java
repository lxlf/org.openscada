/**
 */
package org.openscada.configuration.snmp;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link org.openscada.configuration.snmp.SnmpDevice#getCommunity <em>Community</em>}</li>
 *   <li>{@link org.openscada.configuration.snmp.SnmpDevice#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openscada.configuration.snmp.SnmpDevice#getMibs <em>Mibs</em>}</li>
 *   <li>{@link org.openscada.configuration.snmp.SnmpDevice#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.openscada.configuration.snmp.SnmpDevice#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.snmp.SnmpPackage#getSnmpDevice()
 * @model
 * @generated
 */
public interface SnmpDevice extends Device
{

    /**
     * Returns the value of the '<em><b>Community</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Community</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Community</em>' attribute.
     * @see #setCommunity(String)
     * @see org.openscada.configuration.snmp.SnmpPackage#getSnmpDevice_Community()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * @generated
     */
    String getCommunity();

    /**
     * Sets the value of the '{@link org.openscada.configuration.snmp.SnmpDevice#getCommunity <em>Community</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Community</em>' attribute.
     * @see #getCommunity()
     * @generated
     */
    void setCommunity(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * The literals are from the enumeration {@link org.openscada.configuration.snmp.SnmpVersion}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see org.openscada.configuration.snmp.SnmpVersion
     * @see #setVersion(SnmpVersion)
     * @see org.openscada.configuration.snmp.SnmpPackage#getSnmpDevice_Version()
     * @model required="true"
     * @generated
     */
    SnmpVersion getVersion();

    /**
     * Sets the value of the '{@link org.openscada.configuration.snmp.SnmpDevice#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see org.openscada.configuration.snmp.SnmpVersion
     * @see #getVersion()
     * @generated
     */
    void setVersion(SnmpVersion value);

    /**
     * Returns the value of the '<em><b>Mibs</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configuration.snmp.MibsType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mibs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mibs</em>' containment reference list.
     * @see org.openscada.configuration.snmp.SnmpPackage#getSnmpDevice_Mibs()
     * @model containment="true" required="true"
     * @generated
     */
    EList<MibsType> getMibs();

    /**
     * Returns the value of the '<em><b>Protocol</b></em>' attribute.
     * The default value is <code>"udp"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Protocol</em>' attribute.
     * @see #setProtocol(String)
     * @see org.openscada.configuration.snmp.SnmpPackage#getSnmpDevice_Protocol()
     * @model default="udp" dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * @generated
     */
    String getProtocol();

    /**
     * Sets the value of the '{@link org.openscada.configuration.snmp.SnmpDevice#getProtocol <em>Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Protocol</em>' attribute.
     * @see #getProtocol()
     * @generated
     */
    void setProtocol(String value);

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * The default value is <code>"161"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(int)
     * @see org.openscada.configuration.snmp.SnmpPackage#getSnmpDevice_Port()
     * @model default="161" required="true"
     * @generated
     */
    int getPort();

    /**
     * Sets the value of the '{@link org.openscada.configuration.snmp.SnmpDevice#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(int value);
} // SnmpDevice
