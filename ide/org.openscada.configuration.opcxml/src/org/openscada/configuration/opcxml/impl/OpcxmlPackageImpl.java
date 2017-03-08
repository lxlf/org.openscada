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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.world.WorldPackage;
import org.eclipse.scada.configuration.world.osgi.OsgiPackage;
import org.openscada.configuration.opcxml.ConnectionSettings;
import org.openscada.configuration.opcxml.DriverApplication;
import org.openscada.configuration.opcxml.FileSystemSource;
import org.openscada.configuration.opcxml.HiveDevice;
import org.openscada.configuration.opcxml.ItemType;
import org.openscada.configuration.opcxml.OpcType;
import org.openscada.configuration.opcxml.OpcXmlDevice;
import org.openscada.configuration.opcxml.OpcXmlDriver;
import org.openscada.configuration.opcxml.OpcxmlFactory;
import org.openscada.configuration.opcxml.OpcxmlPackage;
import org.openscada.configuration.opcxml.Poller;
import org.openscada.configuration.opcxml.ReadRequestPoller;
import org.openscada.configuration.opcxml.Subscription;
import org.openscada.configuration.opcxml.UrlWsdlSource;
import org.openscada.configuration.opcxml.WsdlSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcxmlPackageImpl extends EPackageImpl implements OpcxmlPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass opcXmlDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass opcXmlDriverEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass driverApplicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hiveDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass wsdlSourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass urlWsdlSourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileSystemSourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectionSettingsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pollerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subscriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass readRequestPollerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass itemTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum opcTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
     * package
     * package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory
     * method {@link #init init()}, which also performs initialization of the
     * package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private OpcxmlPackageImpl ()
    {
        super(eNS_URI, OpcxmlFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model,
     * and for any others upon which it depends.
     * <p>
     * This method is used to initialize {@link OpcxmlPackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead,
     * they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static OpcxmlPackage init ()
    {
        if (isInited) return (OpcxmlPackage)EPackage.Registry.INSTANCE.getEPackage(OpcxmlPackage.eNS_URI);

        // Obtain or create and register package
        OpcxmlPackageImpl theOpcxmlPackage = (OpcxmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpcxmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpcxmlPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        InfrastructurePackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theOpcxmlPackage.createPackageContents();

        // Initialize created meta-data
        theOpcxmlPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theOpcxmlPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(OpcxmlPackage.eNS_URI, theOpcxmlPackage);
        return theOpcxmlPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getOpcXmlDevice ()
    {
        return opcXmlDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcXmlDevice_Path()
    {
        return (EAttribute)opcXmlDeviceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcXmlDevice_Port()
    {
        return (EAttribute)opcXmlDeviceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcXmlDevice_Protocol()
    {
        return (EAttribute)opcXmlDeviceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOpcXmlDevice_WsdlSource()
    {
        return (EReference)opcXmlDeviceEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOpcXmlDevice_Settings()
    {
        return (EReference)opcXmlDeviceEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcXmlDevice_Credentials()
    {
        return (EAttribute)opcXmlDeviceEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getOpcXmlDriver ()
    {
        return opcXmlDriverEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getOpcXmlDriver_Devices ()
    {
        return (EReference)opcXmlDriverEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDriverApplication ()
    {
        return driverApplicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDriverApplication_Devices ()
    {
        return (EReference)driverApplicationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHiveDevice()
    {
        return hiveDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHiveDevice_Id()
    {
        return (EAttribute)hiveDeviceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHiveDevice_ServerUrl()
    {
        return (EAttribute)hiveDeviceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHiveDevice_WsdlSource()
    {
        return (EReference)hiveDeviceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHiveDevice_Settings()
    {
        return (EReference)hiveDeviceEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWsdlSource()
    {
        return wsdlSourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUrlWsdlSource()
    {
        return urlWsdlSourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUrlWsdlSource_Url()
    {
        return (EAttribute)urlWsdlSourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileSystemSource()
    {
        return fileSystemSourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileSystemSource_LocalWsdlUrl()
    {
        return (EAttribute)fileSystemSourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileSystemSource_OriginalBase()
    {
        return (EAttribute)fileSystemSourceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectionSettings()
    {
        return connectionSettingsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectionSettings_ServiceName()
    {
        return (EAttribute)connectionSettingsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectionSettings_PortName()
    {
        return (EAttribute)connectionSettingsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPoller()
    {
        return pollerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubscription()
    {
        return subscriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubscription_WaitTime()
    {
        return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubscription_SamplingRate()
    {
        return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReadRequestPoller()
    {
        return readRequestPollerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReadRequestPoller_Period()
    {
        return (EAttribute)readRequestPollerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReadRequestPoller_MaxAge()
    {
        return (EAttribute)readRequestPollerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getItemType()
    {
        return itemTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItemType_Pattern()
    {
        return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItemType_Type()
    {
        return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOpcType()
    {
        return opcTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectionSettings_Timeout()
    {
        return (EAttribute)connectionSettingsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectionSettings_Poller()
    {
        return (EReference)connectionSettingsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectionSettings_Types()
    {
        return (EReference)connectionSettingsEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OpcxmlFactory getOpcxmlFactory ()
    {
        return (OpcxmlFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents ()
    {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        opcXmlDeviceEClass = createEClass(OPC_XML_DEVICE);
        createEAttribute(opcXmlDeviceEClass, OPC_XML_DEVICE__PATH);
        createEAttribute(opcXmlDeviceEClass, OPC_XML_DEVICE__PORT);
        createEAttribute(opcXmlDeviceEClass, OPC_XML_DEVICE__PROTOCOL);
        createEReference(opcXmlDeviceEClass, OPC_XML_DEVICE__WSDL_SOURCE);
        createEReference(opcXmlDeviceEClass, OPC_XML_DEVICE__SETTINGS);
        createEAttribute(opcXmlDeviceEClass, OPC_XML_DEVICE__CREDENTIALS);

        opcXmlDriverEClass = createEClass(OPC_XML_DRIVER);
        createEReference(opcXmlDriverEClass, OPC_XML_DRIVER__DEVICES);

        driverApplicationEClass = createEClass(DRIVER_APPLICATION);
        createEReference(driverApplicationEClass, DRIVER_APPLICATION__DEVICES);

        hiveDeviceEClass = createEClass(HIVE_DEVICE);
        createEAttribute(hiveDeviceEClass, HIVE_DEVICE__ID);
        createEAttribute(hiveDeviceEClass, HIVE_DEVICE__SERVER_URL);
        createEReference(hiveDeviceEClass, HIVE_DEVICE__WSDL_SOURCE);
        createEReference(hiveDeviceEClass, HIVE_DEVICE__SETTINGS);

        wsdlSourceEClass = createEClass(WSDL_SOURCE);

        urlWsdlSourceEClass = createEClass(URL_WSDL_SOURCE);
        createEAttribute(urlWsdlSourceEClass, URL_WSDL_SOURCE__URL);

        fileSystemSourceEClass = createEClass(FILE_SYSTEM_SOURCE);
        createEAttribute(fileSystemSourceEClass, FILE_SYSTEM_SOURCE__LOCAL_WSDL_URL);
        createEAttribute(fileSystemSourceEClass, FILE_SYSTEM_SOURCE__ORIGINAL_BASE);

        connectionSettingsEClass = createEClass(CONNECTION_SETTINGS);
        createEAttribute(connectionSettingsEClass, CONNECTION_SETTINGS__SERVICE_NAME);
        createEAttribute(connectionSettingsEClass, CONNECTION_SETTINGS__PORT_NAME);
        createEAttribute(connectionSettingsEClass, CONNECTION_SETTINGS__TIMEOUT);
        createEReference(connectionSettingsEClass, CONNECTION_SETTINGS__POLLER);
        createEReference(connectionSettingsEClass, CONNECTION_SETTINGS__TYPES);

        pollerEClass = createEClass(POLLER);

        subscriptionEClass = createEClass(SUBSCRIPTION);
        createEAttribute(subscriptionEClass, SUBSCRIPTION__WAIT_TIME);
        createEAttribute(subscriptionEClass, SUBSCRIPTION__SAMPLING_RATE);

        readRequestPollerEClass = createEClass(READ_REQUEST_POLLER);
        createEAttribute(readRequestPollerEClass, READ_REQUEST_POLLER__PERIOD);
        createEAttribute(readRequestPollerEClass, READ_REQUEST_POLLER__MAX_AGE);

        itemTypeEClass = createEClass(ITEM_TYPE);
        createEAttribute(itemTypeEClass, ITEM_TYPE__PATTERN);
        createEAttribute(itemTypeEClass, ITEM_TYPE__TYPE);

        // Create enums
        opcTypeEEnum = createEEnum(OPC_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents ()
    {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
        WorldPackage theWorldPackage = (WorldPackage)EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI);
        OsgiPackage theOsgiPackage = (OsgiPackage)EPackage.Registry.INSTANCE.getEPackage(OsgiPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        opcXmlDeviceEClass.getESuperTypes().add(theInfrastructurePackage.getDevice());
        opcXmlDriverEClass.getESuperTypes().add(theInfrastructurePackage.getAbstractEquinoxDriver());
        driverApplicationEClass.getESuperTypes().add(theWorldPackage.getDriver());
        driverApplicationEClass.getESuperTypes().add(theOsgiPackage.getEquinoxApplication());
        wsdlSourceEClass.getESuperTypes().add(theWorldPackage.getSettings());
        urlWsdlSourceEClass.getESuperTypes().add(this.getWsdlSource());
        fileSystemSourceEClass.getESuperTypes().add(this.getWsdlSource());
        subscriptionEClass.getESuperTypes().add(this.getPoller());
        readRequestPollerEClass.getESuperTypes().add(this.getPoller());

        // Initialize classes, features, and operations; add parameters
        initEClass(opcXmlDeviceEClass, OpcXmlDevice.class, "OpcXmlDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(getOpcXmlDevice_Path(), theEcorePackage.getEString(), "path", null, 0, 1, OpcXmlDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(getOpcXmlDevice_Port(), theEcorePackage.getEIntegerObject(), "port", null, 0, 1, OpcXmlDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(getOpcXmlDevice_Protocol(), theEcorePackage.getEString(), "protocol", "http", 0, 1, OpcXmlDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
        initEReference(getOpcXmlDevice_WsdlSource(), this.getWsdlSource(), null, "wsdlSource", null, 0, 1, OpcXmlDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(getOpcXmlDevice_Settings(), this.getConnectionSettings(), null, "settings", null, 1, 1, OpcXmlDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(getOpcXmlDevice_Credentials(), theEcorePackage.getEString(), "credentials", null, 0, 1, OpcXmlDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(opcXmlDriverEClass, OpcXmlDriver.class, "OpcXmlDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEReference(getOpcXmlDriver_Devices(), this.getOpcXmlDevice(), null, "devices", null, 0, -1, OpcXmlDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(driverApplicationEClass, DriverApplication.class, "DriverApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEReference(getDriverApplication_Devices(), this.getHiveDevice(), null, "devices", null, 0, -1, DriverApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(hiveDeviceEClass, HiveDevice.class, "HiveDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(getHiveDevice_Id(), theEcorePackage.getEString(), "id", null, 1, 1, HiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(getHiveDevice_ServerUrl(), theEcorePackage.getEString(), "serverUrl", null, 1, 1, HiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(getHiveDevice_WsdlSource(), this.getWsdlSource(), null, "wsdlSource", null, 0, 1, HiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(getHiveDevice_Settings(), this.getConnectionSettings(), null, "settings", null, 1, 1, HiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(wsdlSourceEClass, WsdlSource.class, "WsdlSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

        initEClass(urlWsdlSourceEClass, UrlWsdlSource.class, "UrlWsdlSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(getUrlWsdlSource_Url(), theXMLTypePackage.getString(), "url", null, 1, 1, UrlWsdlSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(fileSystemSourceEClass, FileSystemSource.class, "FileSystemSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(getFileSystemSource_LocalWsdlUrl(), theEcorePackage.getEString(), "localWsdlUrl", null, 1, 1, FileSystemSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(getFileSystemSource_OriginalBase(), theEcorePackage.getEResource(), "originalBase", null, 0, 1, FileSystemSource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(connectionSettingsEClass, ConnectionSettings.class, "ConnectionSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(getConnectionSettings_ServiceName(), theEcorePackage.getEString(), "serviceName", null, 1, 1, ConnectionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(getConnectionSettings_PortName(), theEcorePackage.getEString(), "portName", null, 0, 1, ConnectionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(getConnectionSettings_Timeout(), theEcorePackage.getEIntegerObject(), "timeout", null, 0, 1, ConnectionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(getConnectionSettings_Poller(), this.getPoller(), null, "poller", null, 1, 1, ConnectionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(getConnectionSettings_Types(), this.getItemType(), null, "types", null, 0, -1, ConnectionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(pollerEClass, Poller.class, "Poller", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

        initEClass(subscriptionEClass, Subscription.class, "Subscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(getSubscription_WaitTime(), theEcorePackage.getEIntegerObject(), "waitTime", null, 0, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(getSubscription_SamplingRate(), theEcorePackage.getEIntegerObject(), "samplingRate", null, 0, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(readRequestPollerEClass, ReadRequestPoller.class, "ReadRequestPoller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(getReadRequestPoller_Period(), theEcorePackage.getEInt(), "period", null, 1, 1, ReadRequestPoller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(getReadRequestPoller_MaxAge(), theEcorePackage.getEIntegerObject(), "maxAge", null, 0, 1, ReadRequestPoller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(getItemType_Pattern(), theWorldPackage.getPattern(), "pattern", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(getItemType_Type(), this.getOpcType(), "type", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        // Initialize enums and add enum literals
        initEEnum(opcTypeEEnum, OpcType.class, "OpcType"); //$NON-NLS-1$
        addEEnumLiteral(opcTypeEEnum, OpcType.STRING);
        addEEnumLiteral(opcTypeEEnum, OpcType.BOOLEAN);
        addEEnumLiteral(opcTypeEEnum, OpcType.FLOAT);
        addEEnumLiteral(opcTypeEEnum, OpcType.DOUBLE);
        addEEnumLiteral(opcTypeEEnum, OpcType.DECIMAL);
        addEEnumLiteral(opcTypeEEnum, OpcType.LONG);
        addEEnumLiteral(opcTypeEEnum, OpcType.INT);
        addEEnumLiteral(opcTypeEEnum, OpcType.SHORT);
        addEEnumLiteral(opcTypeEEnum, OpcType.BYTE);
        addEEnumLiteral(opcTypeEEnum, OpcType.UNSIGNED_LONG);
        addEEnumLiteral(opcTypeEEnum, OpcType.UNSIGNED_INT);
        addEEnumLiteral(opcTypeEEnum, OpcType.UNSIGNED_SHORT);
        addEEnumLiteral(opcTypeEEnum, OpcType.UNSIGNED_BYTE);
        addEEnumLiteral(opcTypeEEnum, OpcType.BASE64_BINARY);
        addEEnumLiteral(opcTypeEEnum, OpcType.DATE_TIME);
        addEEnumLiteral(opcTypeEEnum, OpcType.TIME);
        addEEnumLiteral(opcTypeEEnum, OpcType.DATE);
        addEEnumLiteral(opcTypeEEnum, OpcType.DURATION);
        addEEnumLiteral(opcTypeEEnum, OpcType.QNAME);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_ANY_TYPE);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_STRING);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_BOOLEAN);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_FLOAT);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_DOUBLE);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_DECIMAL);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_LONG);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_INT);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_SHORT);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_BYTE);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_UNSIGNED_LONG);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_UNSIGNED_INT);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_UNSIGNED_SHORT);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_UNSIGNED_BYTE);
        addEEnumLiteral(opcTypeEEnum, OpcType.ARRAY_OF_DATE_TIME);

        // Create resource
        createResource(eNS_URI);
    }

} //OpcxmlPackageImpl
