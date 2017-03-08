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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.opcxml.OpcxmlPackage
 * @generated
 */
public interface OpcxmlFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    OpcxmlFactory eINSTANCE = org.openscada.configuration.opcxml.impl.OpcxmlFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Opc Xml Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Opc Xml Device</em>'.
     * @generated
     */
    OpcXmlDevice createOpcXmlDevice();

    /**
     * Returns a new object of class '<em>Opc Xml Driver</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Opc Xml Driver</em>'.
     * @generated
     */
    OpcXmlDriver createOpcXmlDriver();

    /**
     * Returns a new object of class '<em>Driver Application</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Driver Application</em>'.
     * @generated
     */
    DriverApplication createDriverApplication();

    /**
     * Returns a new object of class '<em>Hive Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hive Device</em>'.
     * @generated
     */
    HiveDevice createHiveDevice();

    /**
     * Returns a new object of class '<em>Url Wsdl Source</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Url Wsdl Source</em>'.
     * @generated
     */
    UrlWsdlSource createUrlWsdlSource();

    /**
     * Returns a new object of class '<em>File System Source</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File System Source</em>'.
     * @generated
     */
    FileSystemSource createFileSystemSource();

    /**
     * Returns a new object of class '<em>Connection Settings</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connection Settings</em>'.
     * @generated
     */
    ConnectionSettings createConnectionSettings();

    /**
     * Returns a new object of class '<em>Subscription</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Subscription</em>'.
     * @generated
     */
    Subscription createSubscription();

    /**
     * Returns a new object of class '<em>Read Request Poller</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Request Poller</em>'.
     * @generated
     */
    ReadRequestPoller createReadRequestPoller();

    /**
     * Returns a new object of class '<em>Item Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Item Type</em>'.
     * @generated
     */
    ItemType createItemType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    OpcxmlPackage getOpcxmlPackage();

} //OpcxmlFactory
