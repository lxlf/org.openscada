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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.ConnectionSettings#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.ConnectionSettings#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.ConnectionSettings#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.ConnectionSettings#getPoller <em>Poller</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.ConnectionSettings#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opcxml.OpcxmlPackage#getConnectionSettings()
 * @model
 * @generated
 */
public interface ConnectionSettings extends EObject
{
    /**
     * Returns the value of the '<em><b>Service Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Name</em>' attribute.
     * @see #setServiceName(String)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getConnectionSettings_ServiceName()
     * @model required="true"
     * @generated
     */
    String getServiceName();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.ConnectionSettings#getServiceName <em>Service Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Name</em>' attribute.
     * @see #getServiceName()
     * @generated
     */
    void setServiceName(String value);

    /**
     * Returns the value of the '<em><b>Port Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port Name</em>' attribute.
     * @see #setPortName(String)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getConnectionSettings_PortName()
     * @model
     * @generated
     */
    String getPortName();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.ConnectionSettings#getPortName <em>Port Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port Name</em>' attribute.
     * @see #getPortName()
     * @generated
     */
    void setPortName(String value);

    /**
     * Returns the value of the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timeout</em>' attribute.
     * @see #setTimeout(Integer)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getConnectionSettings_Timeout()
     * @model
     * @generated
     */
    Integer getTimeout();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.ConnectionSettings#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timeout</em>' attribute.
     * @see #getTimeout()
     * @generated
     */
    void setTimeout(Integer value);

    /**
     * Returns the value of the '<em><b>Poller</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Poller</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Poller</em>' containment reference.
     * @see #setPoller(Poller)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getConnectionSettings_Poller()
     * @model containment="true" required="true"
     * @generated
     */
    Poller getPoller();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.ConnectionSettings#getPoller <em>Poller</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Poller</em>' containment reference.
     * @see #getPoller()
     * @generated
     */
    void setPoller(Poller value);

    /**
     * Returns the value of the '<em><b>Types</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configuration.opcxml.ItemType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Types</em>' containment reference list.
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getConnectionSettings_Types()
     * @model containment="true"
     * @generated
     */
    EList<ItemType> getTypes();

} // ConnectionSettings
