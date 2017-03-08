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
package org.openscada.configuration.opcxml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.scada.configuration.infrastructure.AbstractEquinoxDriver;
import org.eclipse.scada.configuration.infrastructure.Device;
import org.eclipse.scada.configuration.infrastructure.Driver;
import org.eclipse.scada.configuration.infrastructure.EquinoxBase;

import org.eclipse.scada.configuration.infrastructure.NamedApplication;
import org.eclipse.scada.configuration.world.Application;
import org.eclipse.scada.configuration.world.Documentable;
import org.eclipse.scada.configuration.world.NamedDocumentable;

import org.eclipse.scada.configuration.world.Settings;
import org.eclipse.scada.configuration.world.osgi.EquinoxApplication;
import org.openscada.configuration.opcxml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.opcxml.OpcxmlPackage
 * @generated
 */
public class OpcxmlSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static OpcxmlPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcxmlSwitch()
    {
        if (modelPackage == null)
        {
            modelPackage = OpcxmlPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage)
    {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject)
    {
        switch (classifierID)
        {
            case OpcxmlPackage.OPC_XML_DEVICE:
            {
                OpcXmlDevice opcXmlDevice = (OpcXmlDevice)theEObject;
                T result = caseOpcXmlDevice(opcXmlDevice);
                if (result == null) result = caseDevice(opcXmlDevice);
                if (result == null) result = caseNamedDocumentable(opcXmlDevice);
                if (result == null) result = caseDocumentable(opcXmlDevice);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.OPC_XML_DRIVER:
            {
                OpcXmlDriver opcXmlDriver = (OpcXmlDriver)theEObject;
                T result = caseOpcXmlDriver(opcXmlDriver);
                if (result == null) result = caseAbstractEquinoxDriver(opcXmlDriver);
                if (result == null) result = caseDriver(opcXmlDriver);
                if (result == null) result = caseEquinoxBase(opcXmlDriver);
                if (result == null) result = caseNamedApplication(opcXmlDriver);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.DRIVER_APPLICATION:
            {
                DriverApplication driverApplication = (DriverApplication)theEObject;
                T result = caseDriverApplication(driverApplication);
                if (result == null) result = caseWorld_Driver(driverApplication);
                if (result == null) result = caseEquinoxApplication(driverApplication);
                if (result == null) result = caseApplication(driverApplication);
                if (result == null) result = caseNamedDocumentable(driverApplication);
                if (result == null) result = caseDocumentable(driverApplication);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.HIVE_DEVICE:
            {
                HiveDevice hiveDevice = (HiveDevice)theEObject;
                T result = caseHiveDevice(hiveDevice);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.WSDL_SOURCE:
            {
                WsdlSource wsdlSource = (WsdlSource)theEObject;
                T result = caseWsdlSource(wsdlSource);
                if (result == null) result = caseSettings(wsdlSource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.URL_WSDL_SOURCE:
            {
                UrlWsdlSource urlWsdlSource = (UrlWsdlSource)theEObject;
                T result = caseUrlWsdlSource(urlWsdlSource);
                if (result == null) result = caseWsdlSource(urlWsdlSource);
                if (result == null) result = caseSettings(urlWsdlSource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.FILE_SYSTEM_SOURCE:
            {
                FileSystemSource fileSystemSource = (FileSystemSource)theEObject;
                T result = caseFileSystemSource(fileSystemSource);
                if (result == null) result = caseWsdlSource(fileSystemSource);
                if (result == null) result = caseSettings(fileSystemSource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.CONNECTION_SETTINGS:
            {
                ConnectionSettings connectionSettings = (ConnectionSettings)theEObject;
                T result = caseConnectionSettings(connectionSettings);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.POLLER:
            {
                Poller poller = (Poller)theEObject;
                T result = casePoller(poller);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.SUBSCRIPTION:
            {
                Subscription subscription = (Subscription)theEObject;
                T result = caseSubscription(subscription);
                if (result == null) result = casePoller(subscription);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.READ_REQUEST_POLLER:
            {
                ReadRequestPoller readRequestPoller = (ReadRequestPoller)theEObject;
                T result = caseReadRequestPoller(readRequestPoller);
                if (result == null) result = casePoller(readRequestPoller);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OpcxmlPackage.ITEM_TYPE:
            {
                ItemType itemType = (ItemType)theEObject;
                T result = caseItemType(itemType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Opc Xml Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Opc Xml Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOpcXmlDevice(OpcXmlDevice object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Opc Xml Driver</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Opc Xml Driver</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOpcXmlDriver(OpcXmlDriver object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Driver Application</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Driver Application</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDriverApplication(DriverApplication object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hive Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hive Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHiveDevice(HiveDevice object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wsdl Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wsdl Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWsdlSource(WsdlSource object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Url Wsdl Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Url Wsdl Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUrlWsdlSource(UrlWsdlSource object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File System Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File System Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileSystemSource(FileSystemSource object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connection Settings</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectionSettings(ConnectionSettings object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Poller</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Poller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePoller(Poller object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subscription</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subscription</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubscription(Subscription object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Read Request Poller</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Read Request Poller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReadRequestPoller(ReadRequestPoller object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseItemType(ItemType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Documentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Documentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentable(Documentable object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Documentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Documentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedDocumentable(NamedDocumentable object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDevice(Device object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Application</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Application</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedApplication(NamedApplication object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Driver</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Driver</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDriver(Driver object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equinox Base</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equinox Base</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquinoxBase(EquinoxBase object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Equinox Driver</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Equinox Driver</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractEquinoxDriver(AbstractEquinoxDriver object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Application</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplication(Application object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Driver</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Driver</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWorld_Driver(org.eclipse.scada.configuration.world.Driver object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equinox Application</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equinox Application</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquinoxApplication(EquinoxApplication object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Settings</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSettings(Settings object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object)
    {
        return null;
    }

} //OpcxmlSwitch
