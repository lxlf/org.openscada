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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.world.WorldPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.opcxml.OpcxmlFactory
 * @model kind="package"
 * @generated
 */
public interface OpcxmlPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "opcxml"; //$NON-NLS-1$

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configuration/OPCXML"; //$NON-NLS-1$

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "opcxml"; //$NON-NLS-1$

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    OpcxmlPackage eINSTANCE = org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl.init();

    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.impl.OpcXmlDeviceImpl <em>Opc Xml Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.impl.OpcXmlDeviceImpl
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getOpcXmlDevice()
     * @generated
     */
    int OPC_XML_DEVICE = 0;

    /**
     * The feature id for the '<em><b>Short Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE__SHORT_DESCRIPTION = InfrastructurePackage.DEVICE__SHORT_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE__NAME = InfrastructurePackage.DEVICE__NAME;

    /**
     * The feature id for the '<em><b>Node</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE__NODE = InfrastructurePackage.DEVICE__NODE;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE__PATH = InfrastructurePackage.DEVICE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE__PORT = InfrastructurePackage.DEVICE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE__PROTOCOL = InfrastructurePackage.DEVICE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Wsdl Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE__WSDL_SOURCE = InfrastructurePackage.DEVICE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Settings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE__SETTINGS = InfrastructurePackage.DEVICE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Credentials</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE__CREDENTIALS = InfrastructurePackage.DEVICE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Opc Xml Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE_FEATURE_COUNT = InfrastructurePackage.DEVICE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Opc Xml Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DEVICE_OPERATION_COUNT = InfrastructurePackage.DEVICE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.impl.OpcXmlDriverImpl <em>Opc Xml Driver</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.impl.OpcXmlDriverImpl
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getOpcXmlDriver()
     * @generated
     */
    int OPC_XML_DRIVER = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__NAME = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER__NAME;

    /**
     * The feature id for the '<em><b>Node</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__NODE = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER__NODE;

    /**
     * The feature id for the '<em><b>Protocol Type Tag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__PROTOCOL_TYPE_TAG = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER__PROTOCOL_TYPE_TAG;

    /**
     * The feature id for the '<em><b>Instance Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__INSTANCE_NUMBER = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER__INSTANCE_NUMBER;

    /**
     * The feature id for the '<em><b>User Service</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__USER_SERVICE = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER__USER_SERVICE;

    /**
     * The feature id for the '<em><b>Security Configuration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__SECURITY_CONFIGURATION = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER__SECURITY_CONFIGURATION;

    /**
     * The feature id for the '<em><b>Modules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__MODULES = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER__MODULES;

    /**
     * The feature id for the '<em><b>Configuration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__CONFIGURATION = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER__CONFIGURATION;

    /**
     * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__CONFIGURATIONS = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER__CONFIGURATIONS;

    /**
     * The feature id for the '<em><b>Access Credentials</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__ACCESS_CREDENTIALS = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER__ACCESS_CREDENTIALS;

    /**
     * The feature id for the '<em><b>Devices</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER__DEVICES = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Opc Xml Driver</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER_FEATURE_COUNT = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Opc Xml Driver</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_XML_DRIVER_OPERATION_COUNT = InfrastructurePackage.ABSTRACT_EQUINOX_DRIVER_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.impl.DriverApplicationImpl <em>Driver Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.impl.DriverApplicationImpl
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getDriverApplication()
     * @generated
     */
    int DRIVER_APPLICATION = 2;

    /**
     * The feature id for the '<em><b>Short Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION__SHORT_DESCRIPTION = WorldPackage.DRIVER__SHORT_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION__NAME = WorldPackage.DRIVER__NAME;

    /**
     * The feature id for the '<em><b>Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION__CONNECTIONS = WorldPackage.DRIVER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Exporter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION__EXPORTER = WorldPackage.DRIVER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Customization Profile</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION__CUSTOMIZATION_PROFILE = WorldPackage.DRIVER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Security Configuration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION__SECURITY_CONFIGURATION = WorldPackage.DRIVER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Modules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION__MODULES = WorldPackage.DRIVER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Devices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION__DEVICES = WorldPackage.DRIVER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Driver Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION_FEATURE_COUNT = WorldPackage.DRIVER_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Get Endpoints</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION___GET_ENDPOINTS = WorldPackage.DRIVER___GET_ENDPOINTS;

    /**
     * The operation id for the '<em>Get Profile</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION___GET_PROFILE = WorldPackage.DRIVER_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Driver Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRIVER_APPLICATION_OPERATION_COUNT = WorldPackage.DRIVER_OPERATION_COUNT + 1;


    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.impl.HiveDeviceImpl <em>Hive Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.impl.HiveDeviceImpl
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getHiveDevice()
     * @generated
     */
    int HIVE_DEVICE = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIVE_DEVICE__ID = 0;

    /**
     * The feature id for the '<em><b>Server Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIVE_DEVICE__SERVER_URL = 1;

    /**
     * The feature id for the '<em><b>Wsdl Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIVE_DEVICE__WSDL_SOURCE = 2;

    /**
     * The feature id for the '<em><b>Settings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIVE_DEVICE__SETTINGS = 3;

    /**
     * The number of structural features of the '<em>Hive Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIVE_DEVICE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Hive Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIVE_DEVICE_OPERATION_COUNT = 0;


    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.WsdlSource <em>Wsdl Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.WsdlSource
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getWsdlSource()
     * @generated
     */
    int WSDL_SOURCE = 4;

    /**
     * The number of structural features of the '<em>Wsdl Source</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SOURCE_FEATURE_COUNT = WorldPackage.SETTINGS_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Wsdl Source</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SOURCE_OPERATION_COUNT = WorldPackage.SETTINGS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.impl.UrlWsdlSourceImpl <em>Url Wsdl Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.impl.UrlWsdlSourceImpl
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getUrlWsdlSource()
     * @generated
     */
    int URL_WSDL_SOURCE = 5;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_WSDL_SOURCE__URL = WSDL_SOURCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Url Wsdl Source</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_WSDL_SOURCE_FEATURE_COUNT = WSDL_SOURCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Url Wsdl Source</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_WSDL_SOURCE_OPERATION_COUNT = WSDL_SOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.impl.FileSystemSourceImpl <em>File System Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.impl.FileSystemSourceImpl
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getFileSystemSource()
     * @generated
     */
    int FILE_SYSTEM_SOURCE = 6;

    /**
     * The feature id for the '<em><b>Local Wsdl Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SYSTEM_SOURCE__LOCAL_WSDL_URL = WSDL_SOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Original Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SYSTEM_SOURCE__ORIGINAL_BASE = WSDL_SOURCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>File System Source</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SYSTEM_SOURCE_FEATURE_COUNT = WSDL_SOURCE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>File System Source</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SYSTEM_SOURCE_OPERATION_COUNT = WSDL_SOURCE_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.impl.ConnectionSettingsImpl <em>Connection Settings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.impl.ConnectionSettingsImpl
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getConnectionSettings()
     * @generated
     */
    int CONNECTION_SETTINGS = 7;

    /**
     * The feature id for the '<em><b>Service Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SETTINGS__SERVICE_NAME = 0;

    /**
     * The feature id for the '<em><b>Port Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SETTINGS__PORT_NAME = 1;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SETTINGS__TIMEOUT = 2;

    /**
     * The feature id for the '<em><b>Poller</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SETTINGS__POLLER = 3;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SETTINGS__TYPES = 4;

    /**
     * The number of structural features of the '<em>Connection Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SETTINGS_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Connection Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SETTINGS_OPERATION_COUNT = 0;


    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.Poller <em>Poller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.Poller
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getPoller()
     * @generated
     */
    int POLLER = 8;

    /**
     * The number of structural features of the '<em>Poller</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLLER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Poller</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLLER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.impl.SubscriptionImpl <em>Subscription</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.impl.SubscriptionImpl
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getSubscription()
     * @generated
     */
    int SUBSCRIPTION = 9;

    /**
     * The feature id for the '<em><b>Wait Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIPTION__WAIT_TIME = POLLER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sampling Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIPTION__SAMPLING_RATE = POLLER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Subscription</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIPTION_FEATURE_COUNT = POLLER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Subscription</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIPTION_OPERATION_COUNT = POLLER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.impl.ReadRequestPollerImpl <em>Read Request Poller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.impl.ReadRequestPollerImpl
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getReadRequestPoller()
     * @generated
     */
    int READ_REQUEST_POLLER = 10;

    /**
     * The feature id for the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_REQUEST_POLLER__PERIOD = POLLER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_REQUEST_POLLER__MAX_AGE = POLLER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Read Request Poller</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_REQUEST_POLLER_FEATURE_COUNT = POLLER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Read Request Poller</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_REQUEST_POLLER_OPERATION_COUNT = POLLER_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.impl.ItemTypeImpl <em>Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.impl.ItemTypeImpl
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getItemType()
     * @generated
     */
    int ITEM_TYPE = 11;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE__PATTERN = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE__TYPE = 1;

    /**
     * The number of structural features of the '<em>Item Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Item Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.opcxml.OpcType <em>Opc Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opcxml.OpcType
     * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getOpcType()
     * @generated
     */
    int OPC_TYPE = 12;


    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.OpcXmlDevice <em>Opc Xml Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Opc Xml Device</em>'.
     * @see org.openscada.configuration.opcxml.OpcXmlDevice
     * @generated
     */
    EClass getOpcXmlDevice();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.openscada.configuration.opcxml.OpcXmlDevice#getPath()
     * @see #getOpcXmlDevice()
     * @generated
     */
    EAttribute getOpcXmlDevice_Path();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.openscada.configuration.opcxml.OpcXmlDevice#getPort()
     * @see #getOpcXmlDevice()
     * @generated
     */
    EAttribute getOpcXmlDevice_Port();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getProtocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Protocol</em>'.
     * @see org.openscada.configuration.opcxml.OpcXmlDevice#getProtocol()
     * @see #getOpcXmlDevice()
     * @generated
     */
    EAttribute getOpcXmlDevice_Protocol();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getWsdlSource <em>Wsdl Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Wsdl Source</em>'.
     * @see org.openscada.configuration.opcxml.OpcXmlDevice#getWsdlSource()
     * @see #getOpcXmlDevice()
     * @generated
     */
    EReference getOpcXmlDevice_WsdlSource();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getSettings <em>Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Settings</em>'.
     * @see org.openscada.configuration.opcxml.OpcXmlDevice#getSettings()
     * @see #getOpcXmlDevice()
     * @generated
     */
    EReference getOpcXmlDevice_Settings();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.OpcXmlDevice#getCredentials <em>Credentials</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Credentials</em>'.
     * @see org.openscada.configuration.opcxml.OpcXmlDevice#getCredentials()
     * @see #getOpcXmlDevice()
     * @generated
     */
    EAttribute getOpcXmlDevice_Credentials();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.OpcXmlDriver <em>Opc Xml Driver</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Opc Xml Driver</em>'.
     * @see org.openscada.configuration.opcxml.OpcXmlDriver
     * @generated
     */
    EClass getOpcXmlDriver();

    /**
     * Returns the meta object for the reference list '{@link org.openscada.configuration.opcxml.OpcXmlDriver#getDevices <em>Devices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Devices</em>'.
     * @see org.openscada.configuration.opcxml.OpcXmlDriver#getDevices()
     * @see #getOpcXmlDriver()
     * @generated
     */
    EReference getOpcXmlDriver_Devices();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.DriverApplication <em>Driver Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Driver Application</em>'.
     * @see org.openscada.configuration.opcxml.DriverApplication
     * @generated
     */
    EClass getDriverApplication();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configuration.opcxml.DriverApplication#getDevices <em>Devices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Devices</em>'.
     * @see org.openscada.configuration.opcxml.DriverApplication#getDevices()
     * @see #getDriverApplication()
     * @generated
     */
    EReference getDriverApplication_Devices();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.HiveDevice <em>Hive Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hive Device</em>'.
     * @see org.openscada.configuration.opcxml.HiveDevice
     * @generated
     */
    EClass getHiveDevice();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.HiveDevice#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.openscada.configuration.opcxml.HiveDevice#getId()
     * @see #getHiveDevice()
     * @generated
     */
    EAttribute getHiveDevice_Id();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.HiveDevice#getServerUrl <em>Server Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Server Url</em>'.
     * @see org.openscada.configuration.opcxml.HiveDevice#getServerUrl()
     * @see #getHiveDevice()
     * @generated
     */
    EAttribute getHiveDevice_ServerUrl();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.configuration.opcxml.HiveDevice#getWsdlSource <em>Wsdl Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Wsdl Source</em>'.
     * @see org.openscada.configuration.opcxml.HiveDevice#getWsdlSource()
     * @see #getHiveDevice()
     * @generated
     */
    EReference getHiveDevice_WsdlSource();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.configuration.opcxml.HiveDevice#getSettings <em>Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Settings</em>'.
     * @see org.openscada.configuration.opcxml.HiveDevice#getSettings()
     * @see #getHiveDevice()
     * @generated
     */
    EReference getHiveDevice_Settings();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.WsdlSource <em>Wsdl Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wsdl Source</em>'.
     * @see org.openscada.configuration.opcxml.WsdlSource
     * @generated
     */
    EClass getWsdlSource();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.UrlWsdlSource <em>Url Wsdl Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Url Wsdl Source</em>'.
     * @see org.openscada.configuration.opcxml.UrlWsdlSource
     * @generated
     */
    EClass getUrlWsdlSource();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.UrlWsdlSource#getUrl <em>Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Url</em>'.
     * @see org.openscada.configuration.opcxml.UrlWsdlSource#getUrl()
     * @see #getUrlWsdlSource()
     * @generated
     */
    EAttribute getUrlWsdlSource_Url();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.FileSystemSource <em>File System Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File System Source</em>'.
     * @see org.openscada.configuration.opcxml.FileSystemSource
     * @generated
     */
    EClass getFileSystemSource();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.FileSystemSource#getLocalWsdlUrl <em>Local Wsdl Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Wsdl Url</em>'.
     * @see org.openscada.configuration.opcxml.FileSystemSource#getLocalWsdlUrl()
     * @see #getFileSystemSource()
     * @generated
     */
    EAttribute getFileSystemSource_LocalWsdlUrl();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.FileSystemSource#getOriginalBase <em>Original Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Original Base</em>'.
     * @see org.openscada.configuration.opcxml.FileSystemSource#getOriginalBase()
     * @see #getFileSystemSource()
     * @generated
     */
    EAttribute getFileSystemSource_OriginalBase();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.ConnectionSettings <em>Connection Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Settings</em>'.
     * @see org.openscada.configuration.opcxml.ConnectionSettings
     * @generated
     */
    EClass getConnectionSettings();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.ConnectionSettings#getServiceName <em>Service Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Name</em>'.
     * @see org.openscada.configuration.opcxml.ConnectionSettings#getServiceName()
     * @see #getConnectionSettings()
     * @generated
     */
    EAttribute getConnectionSettings_ServiceName();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.ConnectionSettings#getPortName <em>Port Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port Name</em>'.
     * @see org.openscada.configuration.opcxml.ConnectionSettings#getPortName()
     * @see #getConnectionSettings()
     * @generated
     */
    EAttribute getConnectionSettings_PortName();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.Poller <em>Poller</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Poller</em>'.
     * @see org.openscada.configuration.opcxml.Poller
     * @generated
     */
    EClass getPoller();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.Subscription <em>Subscription</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Subscription</em>'.
     * @see org.openscada.configuration.opcxml.Subscription
     * @generated
     */
    EClass getSubscription();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.Subscription#getWaitTime <em>Wait Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wait Time</em>'.
     * @see org.openscada.configuration.opcxml.Subscription#getWaitTime()
     * @see #getSubscription()
     * @generated
     */
    EAttribute getSubscription_WaitTime();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.Subscription#getSamplingRate <em>Sampling Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sampling Rate</em>'.
     * @see org.openscada.configuration.opcxml.Subscription#getSamplingRate()
     * @see #getSubscription()
     * @generated
     */
    EAttribute getSubscription_SamplingRate();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.ReadRequestPoller <em>Read Request Poller</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Read Request Poller</em>'.
     * @see org.openscada.configuration.opcxml.ReadRequestPoller
     * @generated
     */
    EClass getReadRequestPoller();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.ReadRequestPoller#getPeriod <em>Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Period</em>'.
     * @see org.openscada.configuration.opcxml.ReadRequestPoller#getPeriod()
     * @see #getReadRequestPoller()
     * @generated
     */
    EAttribute getReadRequestPoller_Period();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.ReadRequestPoller#getMaxAge <em>Max Age</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Age</em>'.
     * @see org.openscada.configuration.opcxml.ReadRequestPoller#getMaxAge()
     * @see #getReadRequestPoller()
     * @generated
     */
    EAttribute getReadRequestPoller_MaxAge();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opcxml.ItemType <em>Item Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Type</em>'.
     * @see org.openscada.configuration.opcxml.ItemType
     * @generated
     */
    EClass getItemType();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.ItemType#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern</em>'.
     * @see org.openscada.configuration.opcxml.ItemType#getPattern()
     * @see #getItemType()
     * @generated
     */
    EAttribute getItemType_Pattern();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.ItemType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.openscada.configuration.opcxml.ItemType#getType()
     * @see #getItemType()
     * @generated
     */
    EAttribute getItemType_Type();

    /**
     * Returns the meta object for enum '{@link org.openscada.configuration.opcxml.OpcType <em>Opc Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Opc Type</em>'.
     * @see org.openscada.configuration.opcxml.OpcType
     * @generated
     */
    EEnum getOpcType();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opcxml.ConnectionSettings#getTimeout <em>Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timeout</em>'.
     * @see org.openscada.configuration.opcxml.ConnectionSettings#getTimeout()
     * @see #getConnectionSettings()
     * @generated
     */
    EAttribute getConnectionSettings_Timeout();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.configuration.opcxml.ConnectionSettings#getPoller <em>Poller</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Poller</em>'.
     * @see org.openscada.configuration.opcxml.ConnectionSettings#getPoller()
     * @see #getConnectionSettings()
     * @generated
     */
    EReference getConnectionSettings_Poller();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configuration.opcxml.ConnectionSettings#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see org.openscada.configuration.opcxml.ConnectionSettings#getTypes()
     * @see #getConnectionSettings()
     * @generated
     */
    EReference getConnectionSettings_Types();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    OpcxmlFactory getOpcxmlFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.impl.OpcXmlDeviceImpl <em>Opc Xml Device</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.impl.OpcXmlDeviceImpl
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getOpcXmlDevice()
         * @generated
         */
        EClass OPC_XML_DEVICE = eINSTANCE.getOpcXmlDevice();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_XML_DEVICE__PATH = eINSTANCE.getOpcXmlDevice_Path();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_XML_DEVICE__PORT = eINSTANCE.getOpcXmlDevice_Port();

        /**
         * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_XML_DEVICE__PROTOCOL = eINSTANCE.getOpcXmlDevice_Protocol();

        /**
         * The meta object literal for the '<em><b>Wsdl Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPC_XML_DEVICE__WSDL_SOURCE = eINSTANCE.getOpcXmlDevice_WsdlSource();

        /**
         * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPC_XML_DEVICE__SETTINGS = eINSTANCE.getOpcXmlDevice_Settings();

        /**
         * The meta object literal for the '<em><b>Credentials</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_XML_DEVICE__CREDENTIALS = eINSTANCE.getOpcXmlDevice_Credentials();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.impl.OpcXmlDriverImpl <em>Opc Xml Driver</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.impl.OpcXmlDriverImpl
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getOpcXmlDriver()
         * @generated
         */
        EClass OPC_XML_DRIVER = eINSTANCE.getOpcXmlDriver();

        /**
         * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPC_XML_DRIVER__DEVICES = eINSTANCE.getOpcXmlDriver_Devices();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.impl.DriverApplicationImpl <em>Driver Application</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.impl.DriverApplicationImpl
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getDriverApplication()
         * @generated
         */
        EClass DRIVER_APPLICATION = eINSTANCE.getDriverApplication();

        /**
         * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DRIVER_APPLICATION__DEVICES = eINSTANCE.getDriverApplication_Devices();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.impl.HiveDeviceImpl <em>Hive Device</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.impl.HiveDeviceImpl
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getHiveDevice()
         * @generated
         */
        EClass HIVE_DEVICE = eINSTANCE.getHiveDevice();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HIVE_DEVICE__ID = eINSTANCE.getHiveDevice_Id();

        /**
         * The meta object literal for the '<em><b>Server Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HIVE_DEVICE__SERVER_URL = eINSTANCE.getHiveDevice_ServerUrl();

        /**
         * The meta object literal for the '<em><b>Wsdl Source</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIVE_DEVICE__WSDL_SOURCE = eINSTANCE.getHiveDevice_WsdlSource();

        /**
         * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIVE_DEVICE__SETTINGS = eINSTANCE.getHiveDevice_Settings();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.WsdlSource <em>Wsdl Source</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.WsdlSource
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getWsdlSource()
         * @generated
         */
        EClass WSDL_SOURCE = eINSTANCE.getWsdlSource();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.impl.UrlWsdlSourceImpl <em>Url Wsdl Source</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.impl.UrlWsdlSourceImpl
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getUrlWsdlSource()
         * @generated
         */
        EClass URL_WSDL_SOURCE = eINSTANCE.getUrlWsdlSource();

        /**
         * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute URL_WSDL_SOURCE__URL = eINSTANCE.getUrlWsdlSource_Url();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.impl.FileSystemSourceImpl <em>File System Source</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.impl.FileSystemSourceImpl
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getFileSystemSource()
         * @generated
         */
        EClass FILE_SYSTEM_SOURCE = eINSTANCE.getFileSystemSource();

        /**
         * The meta object literal for the '<em><b>Local Wsdl Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_SYSTEM_SOURCE__LOCAL_WSDL_URL = eINSTANCE.getFileSystemSource_LocalWsdlUrl();

        /**
         * The meta object literal for the '<em><b>Original Base</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_SYSTEM_SOURCE__ORIGINAL_BASE = eINSTANCE.getFileSystemSource_OriginalBase();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.impl.ConnectionSettingsImpl <em>Connection Settings</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.impl.ConnectionSettingsImpl
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getConnectionSettings()
         * @generated
         */
        EClass CONNECTION_SETTINGS = eINSTANCE.getConnectionSettings();

        /**
         * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_SETTINGS__SERVICE_NAME = eINSTANCE.getConnectionSettings_ServiceName();

        /**
         * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_SETTINGS__PORT_NAME = eINSTANCE.getConnectionSettings_PortName();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.Poller <em>Poller</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.Poller
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getPoller()
         * @generated
         */
        EClass POLLER = eINSTANCE.getPoller();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.impl.SubscriptionImpl <em>Subscription</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.impl.SubscriptionImpl
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getSubscription()
         * @generated
         */
        EClass SUBSCRIPTION = eINSTANCE.getSubscription();

        /**
         * The meta object literal for the '<em><b>Wait Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUBSCRIPTION__WAIT_TIME = eINSTANCE.getSubscription_WaitTime();

        /**
         * The meta object literal for the '<em><b>Sampling Rate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUBSCRIPTION__SAMPLING_RATE = eINSTANCE.getSubscription_SamplingRate();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.impl.ReadRequestPollerImpl <em>Read Request Poller</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.impl.ReadRequestPollerImpl
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getReadRequestPoller()
         * @generated
         */
        EClass READ_REQUEST_POLLER = eINSTANCE.getReadRequestPoller();

        /**
         * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute READ_REQUEST_POLLER__PERIOD = eINSTANCE.getReadRequestPoller_Period();

        /**
         * The meta object literal for the '<em><b>Max Age</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute READ_REQUEST_POLLER__MAX_AGE = eINSTANCE.getReadRequestPoller_MaxAge();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.impl.ItemTypeImpl <em>Item Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.impl.ItemTypeImpl
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getItemType()
         * @generated
         */
        EClass ITEM_TYPE = eINSTANCE.getItemType();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_TYPE__PATTERN = eINSTANCE.getItemType_Pattern();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_TYPE__TYPE = eINSTANCE.getItemType_Type();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opcxml.OpcType <em>Opc Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opcxml.OpcType
         * @see org.openscada.configuration.opcxml.impl.OpcxmlPackageImpl#getOpcType()
         * @generated
         */
        EEnum OPC_TYPE = eINSTANCE.getOpcType();

        /**
         * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_SETTINGS__TIMEOUT = eINSTANCE.getConnectionSettings_Timeout();

        /**
         * The meta object literal for the '<em><b>Poller</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTION_SETTINGS__POLLER = eINSTANCE.getConnectionSettings_Poller();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTION_SETTINGS__TYPES = eINSTANCE.getConnectionSettings_Types();

    }

} //OpcxmlPackage
