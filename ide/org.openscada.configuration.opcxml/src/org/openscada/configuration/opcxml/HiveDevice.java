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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hive Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.HiveDevice#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.HiveDevice#getServerUrl <em>Server Url</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.HiveDevice#getWsdlSource <em>Wsdl Source</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.HiveDevice#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opcxml.OpcxmlPackage#getHiveDevice()
 * @model
 * @generated
 */
public interface HiveDevice extends EObject
{

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getHiveDevice_Id()
     * @model required="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.HiveDevice#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Server Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Server Url</em>' attribute.
     * @see #setServerUrl(String)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getHiveDevice_ServerUrl()
     * @model required="true"
     * @generated
     */
    String getServerUrl();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.HiveDevice#getServerUrl <em>Server Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Server Url</em>' attribute.
     * @see #getServerUrl()
     * @generated
     */
    void setServerUrl(String value);

    /**
     * Returns the value of the '<em><b>Wsdl Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wsdl Source</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wsdl Source</em>' containment reference.
     * @see #setWsdlSource(WsdlSource)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getHiveDevice_WsdlSource()
     * @model containment="true"
     * @generated
     */
    WsdlSource getWsdlSource();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.HiveDevice#getWsdlSource <em>Wsdl Source</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wsdl Source</em>' containment reference.
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
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getHiveDevice_Settings()
     * @model containment="true" required="true"
     * @generated
     */
    ConnectionSettings getSettings();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.HiveDevice#getSettings <em>Settings</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Settings</em>' containment reference.
     * @see #getSettings()
     * @generated
     */
    void setSettings(ConnectionSettings value);
} // HiveDevice
