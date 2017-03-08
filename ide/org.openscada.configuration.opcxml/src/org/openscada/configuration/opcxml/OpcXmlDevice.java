/**
 * Copyright (c) 2015 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.openscada.configuration.opcxml;

import org.eclipse.scada.configuration.infrastructure.Device;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opc Xml Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.OpcXmlDevice#getPath <em>Path</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.OpcXmlDevice#getPort <em>Port</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.OpcXmlDevice#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.OpcXmlDevice#getWsdlSource <em>Wsdl Source</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.OpcXmlDevice#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.OpcXmlDevice#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opcxml.OpcxmlPackage#getOpcXmlDevice()
 * @model
 * @generated
 */
public interface OpcXmlDevice extends Device
{
    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getOpcXmlDevice_Path()
     * @model
     * @generated
     */
    String getPath();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath(String value);

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(Integer)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getOpcXmlDevice_Port()
     * @model
     * @generated
     */
    Integer getPort();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(Integer value);

    /**
     * Returns the value of the '<em><b>Protocol</b></em>' attribute.
     * The default value is <code>"http"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Protocol</em>' attribute.
     * @see #setProtocol(String)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getOpcXmlDevice_Protocol()
     * @model default="http"
     * @generated
     */
    String getProtocol();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getProtocol <em>Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Protocol</em>' attribute.
     * @see #getProtocol()
     * @generated
     */
    void setProtocol(String value);

    /**
     * Returns the value of the '<em><b>Wsdl Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wsdl Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wsdl Source</em>' reference.
     * @see #setWsdlSource(WsdlSource)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getOpcXmlDevice_WsdlSource()
     * @model
     * @generated
     */
    WsdlSource getWsdlSource();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getWsdlSource <em>Wsdl Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wsdl Source</em>' reference.
     * @see #getWsdlSource()
     * @generated
     */
    void setWsdlSource(WsdlSource value);

    /**
     * Returns the value of the '<em><b>Settings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Settings</em>' containment reference.
     * @see #setSettings(ConnectionSettings)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getOpcXmlDevice_Settings()
     * @model containment="true" required="true"
     * @generated
     */
    ConnectionSettings getSettings();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getSettings <em>Settings</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Settings</em>' containment reference.
     * @see #getSettings()
     * @generated
     */
    void setSettings(ConnectionSettings value);

    /**
     * Returns the value of the '<em><b>Credentials</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Credentials</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Credentials</em>' attribute.
     * @see #setCredentials(String)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getOpcXmlDevice_Credentials()
     * @model
     * @generated
     */
    String getCredentials();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getCredentials <em>Credentials</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Credentials</em>' attribute.
     * @see #getCredentials()
     * @generated
     */
    void setCredentials(String value);

} // OpcXmlDevice
