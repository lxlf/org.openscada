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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.opcxml.OpcxmlPackage
 * @generated
 */
public class OpcxmlAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static OpcxmlPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcxmlAdapterFactory()
    {
        if (modelPackage == null)
        {
            modelPackage = OpcxmlPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object)
    {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcxmlSwitch<Adapter> modelSwitch =
        new OpcxmlSwitch<Adapter>()
        {
            @Override
            public Adapter caseOpcXmlDevice(OpcXmlDevice object)
            {
                return createOpcXmlDeviceAdapter();
            }
            @Override
            public Adapter caseOpcXmlDriver(OpcXmlDriver object)
            {
                return createOpcXmlDriverAdapter();
            }
            @Override
            public Adapter caseDriverApplication(DriverApplication object)
            {
                return createDriverApplicationAdapter();
            }
            @Override
            public Adapter caseHiveDevice(HiveDevice object)
            {
                return createHiveDeviceAdapter();
            }
            @Override
            public Adapter caseWsdlSource(WsdlSource object)
            {
                return createWsdlSourceAdapter();
            }
            @Override
            public Adapter caseUrlWsdlSource(UrlWsdlSource object)
            {
                return createUrlWsdlSourceAdapter();
            }
            @Override
            public Adapter caseFileSystemSource(FileSystemSource object)
            {
                return createFileSystemSourceAdapter();
            }
            @Override
            public Adapter caseConnectionSettings(ConnectionSettings object)
            {
                return createConnectionSettingsAdapter();
            }
            @Override
            public Adapter casePoller(Poller object)
            {
                return createPollerAdapter();
            }
            @Override
            public Adapter caseSubscription(Subscription object)
            {
                return createSubscriptionAdapter();
            }
            @Override
            public Adapter caseReadRequestPoller(ReadRequestPoller object)
            {
                return createReadRequestPollerAdapter();
            }
            @Override
            public Adapter caseItemType(ItemType object)
            {
                return createItemTypeAdapter();
            }
            @Override
            public Adapter caseDocumentable(Documentable object)
            {
                return createDocumentableAdapter();
            }
            @Override
            public Adapter caseNamedDocumentable(NamedDocumentable object)
            {
                return createNamedDocumentableAdapter();
            }
            @Override
            public Adapter caseDevice(Device object)
            {
                return createDeviceAdapter();
            }
            @Override
            public Adapter caseNamedApplication(NamedApplication object)
            {
                return createNamedApplicationAdapter();
            }
            @Override
            public Adapter caseDriver(Driver object)
            {
                return createDriverAdapter();
            }
            @Override
            public Adapter caseEquinoxBase(EquinoxBase object)
            {
                return createEquinoxBaseAdapter();
            }
            @Override
            public Adapter caseAbstractEquinoxDriver(AbstractEquinoxDriver object)
            {
                return createAbstractEquinoxDriverAdapter();
            }
            @Override
            public Adapter caseApplication(Application object)
            {
                return createApplicationAdapter();
            }
            @Override
            public Adapter caseWorld_Driver(org.eclipse.scada.configuration.world.Driver object)
            {
                return createWorld_DriverAdapter();
            }
            @Override
            public Adapter caseEquinoxApplication(EquinoxApplication object)
            {
                return createEquinoxApplicationAdapter();
            }
            @Override
            public Adapter caseSettings(Settings object)
            {
                return createSettingsAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object)
            {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target)
    {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.OpcXmlDevice <em>Opc Xml Device</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.OpcXmlDevice
     * @generated
     */
    public Adapter createOpcXmlDeviceAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.OpcXmlDriver <em>Opc Xml Driver</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.OpcXmlDriver
     * @generated
     */
    public Adapter createOpcXmlDriverAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.DriverApplication <em>Driver Application</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.DriverApplication
     * @generated
     */
    public Adapter createDriverApplicationAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.HiveDevice <em>Hive Device</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.HiveDevice
     * @generated
     */
    public Adapter createHiveDeviceAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.WsdlSource <em>Wsdl Source</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.WsdlSource
     * @generated
     */
    public Adapter createWsdlSourceAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.UrlWsdlSource <em>Url Wsdl Source</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.UrlWsdlSource
     * @generated
     */
    public Adapter createUrlWsdlSourceAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.FileSystemSource <em>File System Source</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.FileSystemSource
     * @generated
     */
    public Adapter createFileSystemSourceAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.ConnectionSettings <em>Connection Settings</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.ConnectionSettings
     * @generated
     */
    public Adapter createConnectionSettingsAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.Poller <em>Poller</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.Poller
     * @generated
     */
    public Adapter createPollerAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.Subscription <em>Subscription</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.Subscription
     * @generated
     */
    public Adapter createSubscriptionAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.ReadRequestPoller <em>Read Request Poller</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.ReadRequestPoller
     * @generated
     */
    public Adapter createReadRequestPollerAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.opcxml.ItemType <em>Item Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.opcxml.ItemType
     * @generated
     */
    public Adapter createItemTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.world.Documentable <em>Documentable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.world.Documentable
     * @generated
     */
    public Adapter createDocumentableAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.world.NamedDocumentable <em>Named Documentable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.world.NamedDocumentable
     * @generated
     */
    public Adapter createNamedDocumentableAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.infrastructure.Device <em>Device</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.infrastructure.Device
     * @generated
     */
    public Adapter createDeviceAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.infrastructure.NamedApplication <em>Named Application</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.infrastructure.NamedApplication
     * @generated
     */
    public Adapter createNamedApplicationAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.infrastructure.Driver <em>Driver</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.infrastructure.Driver
     * @generated
     */
    public Adapter createDriverAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.infrastructure.EquinoxBase <em>Equinox Base</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.infrastructure.EquinoxBase
     * @generated
     */
    public Adapter createEquinoxBaseAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.infrastructure.AbstractEquinoxDriver <em>Abstract Equinox Driver</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.infrastructure.AbstractEquinoxDriver
     * @generated
     */
    public Adapter createAbstractEquinoxDriverAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.world.Application <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.world.Application
     * @generated
     */
    public Adapter createApplicationAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.world.Driver <em>Driver</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.world.Driver
     * @generated
     */
    public Adapter createWorld_DriverAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.world.osgi.EquinoxApplication <em>Equinox Application</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.world.osgi.EquinoxApplication
     * @generated
     */
    public Adapter createEquinoxApplicationAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.scada.configuration.world.Settings <em>Settings</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.scada.configuration.world.Settings
     * @generated
     */
    public Adapter createSettingsAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter()
    {
        return null;
    }

} //OpcxmlAdapterFactory
