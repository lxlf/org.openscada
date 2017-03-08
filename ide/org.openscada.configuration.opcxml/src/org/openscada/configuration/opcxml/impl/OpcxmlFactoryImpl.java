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
package org.openscada.configuration.opcxml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.configuration.opcxml.*;
import org.openscada.configuration.opcxml.DriverApplication;
import org.openscada.configuration.opcxml.HiveDevice;
import org.openscada.configuration.opcxml.OpcXmlDevice;
import org.openscada.configuration.opcxml.OpcXmlDriver;
import org.openscada.configuration.opcxml.OpcxmlFactory;
import org.openscada.configuration.opcxml.OpcxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcxmlFactoryImpl extends EFactoryImpl implements OpcxmlFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OpcxmlFactory init ()
    {
        try
        {
            OpcxmlFactory theOpcxmlFactory = (OpcxmlFactory)EPackage.Registry.INSTANCE.getEFactory(OpcxmlPackage.eNS_URI);
            if (theOpcxmlFactory != null)
            {
                return theOpcxmlFactory;
            }
        }
        catch (Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new OpcxmlFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcxmlFactoryImpl ()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create ( EClass eClass  )
    {
        switch (eClass.getClassifierID())
        {
            case OpcxmlPackage.OPC_XML_DEVICE: return createOpcXmlDevice();
            case OpcxmlPackage.OPC_XML_DRIVER: return createOpcXmlDriver();
            case OpcxmlPackage.DRIVER_APPLICATION: return createDriverApplication();
            case OpcxmlPackage.HIVE_DEVICE: return createHiveDevice();
            case OpcxmlPackage.URL_WSDL_SOURCE: return createUrlWsdlSource();
            case OpcxmlPackage.FILE_SYSTEM_SOURCE: return createFileSystemSource();
            case OpcxmlPackage.CONNECTION_SETTINGS: return createConnectionSettings();
            case OpcxmlPackage.SUBSCRIPTION: return createSubscription();
            case OpcxmlPackage.READ_REQUEST_POLLER: return createReadRequestPoller();
            case OpcxmlPackage.ITEM_TYPE: return createItemType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue)
    {
        switch (eDataType.getClassifierID())
        {
            case OpcxmlPackage.OPC_TYPE:
                return createOpcTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue)
    {
        switch (eDataType.getClassifierID())
        {
            case OpcxmlPackage.OPC_TYPE:
                return convertOpcTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OpcXmlDevice createOpcXmlDevice ()
    {
        OpcXmlDeviceImpl opcXmlDevice = new OpcXmlDeviceImpl();
        return opcXmlDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public OpcXmlDriver createOpcXmlDriver ()
    {
        final OpcXmlDriverImpl opcXmlDriver = new OpcXmlDriverImpl ();
        opcXmlDriver.setInstanceNumber ( 15 );
        opcXmlDriver.setName ( "opcxmlda" ); //$NON-NLS-1$
        return opcXmlDriver;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DriverApplication createDriverApplication ()
    {
        DriverApplicationImpl driverApplication = new DriverApplicationImpl();
        return driverApplication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HiveDevice createHiveDevice ()
    {
        HiveDeviceImpl hiveDevice = new HiveDeviceImpl();
        return hiveDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UrlWsdlSource createUrlWsdlSource()
    {
        UrlWsdlSourceImpl urlWsdlSource = new UrlWsdlSourceImpl();
        return urlWsdlSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileSystemSource createFileSystemSource()
    {
        FileSystemSourceImpl fileSystemSource = new FileSystemSourceImpl();
        return fileSystemSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionSettings createConnectionSettings()
    {
        ConnectionSettingsImpl connectionSettings = new ConnectionSettingsImpl();
        return connectionSettings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Subscription createSubscription()
    {
        SubscriptionImpl subscription = new SubscriptionImpl();
        return subscription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadRequestPoller createReadRequestPoller()
    {
        ReadRequestPollerImpl readRequestPoller = new ReadRequestPollerImpl();
        return readRequestPoller;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemType createItemType()
    {
        ItemTypeImpl itemType = new ItemTypeImpl();
        return itemType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcType createOpcTypeFromString(EDataType eDataType, String initialValue)
    {
        OpcType result = OpcType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOpcTypeToString(EDataType eDataType, Object instanceValue)
    {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OpcxmlPackage getOpcxmlPackage ()
    {
        return (OpcxmlPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static OpcxmlPackage getPackage ()
    {
        return OpcxmlPackage.eINSTANCE;
    }

} //OpcxmlFactoryImpl
