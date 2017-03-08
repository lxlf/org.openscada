/**
 */
package org.openscada.configuration.snmp;

import org.eclipse.scada.configuration.world.CommonDriver;
import org.openscada.da.snmp.configuration.ConfigurationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.snmp.SnmpDriver#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.snmp.SnmpPackage#getSnmpDriver()
 * @model
 * @generated
 */
public interface SnmpDriver extends CommonDriver
{

    /**
     * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configuration</em>' containment reference.
     * @see #setConfiguration(ConfigurationType)
     * @see org.openscada.configuration.snmp.SnmpPackage#getSnmpDriver_Configuration()
     * @model containment="true"
     * @generated
     */
    ConfigurationType getConfiguration();

    /**
     * Sets the value of the '{@link org.openscada.configuration.snmp.SnmpDriver#getConfiguration <em>Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Configuration</em>' containment reference.
     * @see #getConfiguration()
     * @generated
     */
    void setConfiguration(ConfigurationType value);
} // SnmpDriver
