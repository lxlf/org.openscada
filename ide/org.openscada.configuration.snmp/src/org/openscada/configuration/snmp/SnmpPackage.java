/**
 */
package org.openscada.configuration.snmp;

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
 * @see org.openscada.configuration.snmp.SnmpFactory
 * @model kind="package"
 * @generated
 */
public interface SnmpPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "snmp";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configuration/SNMP";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "snmp";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SnmpPackage eINSTANCE = org.openscada.configuration.snmp.impl.SnmpPackageImpl.init();

    /**
     * The meta object id for the '{@link org.openscada.configuration.snmp.impl.SnmpDriverImpl <em>Driver</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.snmp.impl.SnmpDriverImpl
     * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getSnmpDriver()
     * @generated
     */
    int SNMP_DRIVER = 0;

    /**
     * The feature id for the '<em><b>Short Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DRIVER__SHORT_DESCRIPTION = WorldPackage.COMMON_DRIVER__SHORT_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DRIVER__NAME = WorldPackage.COMMON_DRIVER__NAME;

    /**
     * The feature id for the '<em><b>Password</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DRIVER__PASSWORD = WorldPackage.COMMON_DRIVER__PASSWORD;

    /**
     * The feature id for the '<em><b>Endpoints</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DRIVER__ENDPOINTS = WorldPackage.COMMON_DRIVER__ENDPOINTS;

    /**
     * The feature id for the '<em><b>Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DRIVER__CONFIGURATION = WorldPackage.COMMON_DRIVER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Driver</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DRIVER_FEATURE_COUNT = WorldPackage.COMMON_DRIVER_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Endpoints</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DRIVER___GET_ENDPOINTS = WorldPackage.COMMON_DRIVER___GET_ENDPOINTS;

    /**
     * The number of operations of the '<em>Driver</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DRIVER_OPERATION_COUNT = WorldPackage.COMMON_DRIVER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.snmp.impl.SnmpDeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.snmp.impl.SnmpDeviceImpl
     * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getSnmpDevice()
     * @generated
     */
    int SNMP_DEVICE = 1;

    /**
     * The feature id for the '<em><b>Short Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DEVICE__SHORT_DESCRIPTION = InfrastructurePackage.DEVICE__SHORT_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DEVICE__NAME = InfrastructurePackage.DEVICE__NAME;

    /**
     * The feature id for the '<em><b>Node</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DEVICE__NODE = InfrastructurePackage.DEVICE__NODE;

    /**
     * The feature id for the '<em><b>Community</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DEVICE__COMMUNITY = InfrastructurePackage.DEVICE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DEVICE__VERSION = InfrastructurePackage.DEVICE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Mibs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DEVICE__MIBS = InfrastructurePackage.DEVICE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DEVICE__PROTOCOL = InfrastructurePackage.DEVICE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DEVICE__PORT = InfrastructurePackage.DEVICE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DEVICE_FEATURE_COUNT = InfrastructurePackage.DEVICE_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SNMP_DEVICE_OPERATION_COUNT = InfrastructurePackage.DEVICE_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link org.openscada.configuration.snmp.impl.MibsTypeImpl <em>Mibs Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.snmp.impl.MibsTypeImpl
     * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getMibsType()
     * @generated
     */
    int MIBS_TYPE = 2;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIBS_TYPE__PATH = 0;

    /**
     * The number of structural features of the '<em>Mibs Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIBS_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Mibs Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIBS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.snmp.impl.StaticMibNameImpl <em>Static Mib Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.snmp.impl.StaticMibNameImpl
     * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getStaticMibName()
     * @generated
     */
    int STATIC_MIB_NAME = 3;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MIB_NAME__PATH = MIBS_TYPE__PATH;

    /**
     * The number of structural features of the '<em>Static Mib Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MIB_NAME_FEATURE_COUNT = MIBS_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Static Mib Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MIB_NAME_OPERATION_COUNT = MIBS_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.snmp.impl.MibDirImpl <em>Mib Dir</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.snmp.impl.MibDirImpl
     * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getMibDir()
     * @generated
     */
    int MIB_DIR = 4;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIB_DIR__PATH = MIBS_TYPE__PATH;

    /**
     * The number of structural features of the '<em>Mib Dir</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIB_DIR_FEATURE_COUNT = MIBS_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Mib Dir</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIB_DIR_OPERATION_COUNT = MIBS_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.snmp.impl.RecursiveMibDirImpl <em>Recursive Mib Dir</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.snmp.impl.RecursiveMibDirImpl
     * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getRecursiveMibDir()
     * @generated
     */
    int RECURSIVE_MIB_DIR = 5;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_MIB_DIR__PATH = MIBS_TYPE__PATH;

    /**
     * The number of structural features of the '<em>Recursive Mib Dir</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_MIB_DIR_FEATURE_COUNT = MIBS_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Recursive Mib Dir</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_MIB_DIR_OPERATION_COUNT = MIBS_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.snmp.SnmpVersion <em>Version</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.snmp.SnmpVersion
     * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getSnmpVersion()
     * @generated
     */
    int SNMP_VERSION = 6;


    /**
     * Returns the meta object for class '{@link org.openscada.configuration.snmp.SnmpDriver <em>Driver</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Driver</em>'.
     * @see org.openscada.configuration.snmp.SnmpDriver
     * @generated
     */
    EClass getSnmpDriver();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.configuration.snmp.SnmpDriver#getConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Configuration</em>'.
     * @see org.openscada.configuration.snmp.SnmpDriver#getConfiguration()
     * @see #getSnmpDriver()
     * @generated
     */
    EReference getSnmpDriver_Configuration();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.snmp.SnmpDevice <em>Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Device</em>'.
     * @see org.openscada.configuration.snmp.SnmpDevice
     * @generated
     */
    EClass getSnmpDevice();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.snmp.SnmpDevice#getCommunity <em>Community</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Community</em>'.
     * @see org.openscada.configuration.snmp.SnmpDevice#getCommunity()
     * @see #getSnmpDevice()
     * @generated
     */
    EAttribute getSnmpDevice_Community();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.snmp.SnmpDevice#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.openscada.configuration.snmp.SnmpDevice#getVersion()
     * @see #getSnmpDevice()
     * @generated
     */
    EAttribute getSnmpDevice_Version();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configuration.snmp.SnmpDevice#getMibs <em>Mibs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mibs</em>'.
     * @see org.openscada.configuration.snmp.SnmpDevice#getMibs()
     * @see #getSnmpDevice()
     * @generated
     */
    EReference getSnmpDevice_Mibs();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.snmp.SnmpDevice#getProtocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Protocol</em>'.
     * @see org.openscada.configuration.snmp.SnmpDevice#getProtocol()
     * @see #getSnmpDevice()
     * @generated
     */
    EAttribute getSnmpDevice_Protocol();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.snmp.SnmpDevice#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.openscada.configuration.snmp.SnmpDevice#getPort()
     * @see #getSnmpDevice()
     * @generated
     */
    EAttribute getSnmpDevice_Port();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.snmp.MibsType <em>Mibs Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mibs Type</em>'.
     * @see org.openscada.configuration.snmp.MibsType
     * @generated
     */
    EClass getMibsType();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.snmp.MibsType#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.openscada.configuration.snmp.MibsType#getPath()
     * @see #getMibsType()
     * @generated
     */
    EAttribute getMibsType_Path();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.snmp.StaticMibName <em>Static Mib Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Mib Name</em>'.
     * @see org.openscada.configuration.snmp.StaticMibName
     * @generated
     */
    EClass getStaticMibName();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.snmp.MibDir <em>Mib Dir</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mib Dir</em>'.
     * @see org.openscada.configuration.snmp.MibDir
     * @generated
     */
    EClass getMibDir();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.snmp.RecursiveMibDir <em>Recursive Mib Dir</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Recursive Mib Dir</em>'.
     * @see org.openscada.configuration.snmp.RecursiveMibDir
     * @generated
     */
    EClass getRecursiveMibDir();

    /**
     * Returns the meta object for enum '{@link org.openscada.configuration.snmp.SnmpVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Version</em>'.
     * @see org.openscada.configuration.snmp.SnmpVersion
     * @generated
     */
    EEnum getSnmpVersion();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SnmpFactory getSnmpFactory();

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
         * The meta object literal for the '{@link org.openscada.configuration.snmp.impl.SnmpDriverImpl <em>Driver</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.snmp.impl.SnmpDriverImpl
         * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getSnmpDriver()
         * @generated
         */
        EClass SNMP_DRIVER = eINSTANCE.getSnmpDriver();

        /**
         * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SNMP_DRIVER__CONFIGURATION = eINSTANCE.getSnmpDriver_Configuration();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.snmp.impl.SnmpDeviceImpl <em>Device</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.snmp.impl.SnmpDeviceImpl
         * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getSnmpDevice()
         * @generated
         */
        EClass SNMP_DEVICE = eINSTANCE.getSnmpDevice();

        /**
         * The meta object literal for the '<em><b>Community</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SNMP_DEVICE__COMMUNITY = eINSTANCE.getSnmpDevice_Community();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SNMP_DEVICE__VERSION = eINSTANCE.getSnmpDevice_Version();

        /**
         * The meta object literal for the '<em><b>Mibs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SNMP_DEVICE__MIBS = eINSTANCE.getSnmpDevice_Mibs();

        /**
         * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SNMP_DEVICE__PROTOCOL = eINSTANCE.getSnmpDevice_Protocol();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SNMP_DEVICE__PORT = eINSTANCE.getSnmpDevice_Port();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.snmp.impl.MibsTypeImpl <em>Mibs Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.snmp.impl.MibsTypeImpl
         * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getMibsType()
         * @generated
         */
        EClass MIBS_TYPE = eINSTANCE.getMibsType();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MIBS_TYPE__PATH = eINSTANCE.getMibsType_Path();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.snmp.impl.StaticMibNameImpl <em>Static Mib Name</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.snmp.impl.StaticMibNameImpl
         * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getStaticMibName()
         * @generated
         */
        EClass STATIC_MIB_NAME = eINSTANCE.getStaticMibName();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.snmp.impl.MibDirImpl <em>Mib Dir</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.snmp.impl.MibDirImpl
         * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getMibDir()
         * @generated
         */
        EClass MIB_DIR = eINSTANCE.getMibDir();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.snmp.impl.RecursiveMibDirImpl <em>Recursive Mib Dir</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.snmp.impl.RecursiveMibDirImpl
         * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getRecursiveMibDir()
         * @generated
         */
        EClass RECURSIVE_MIB_DIR = eINSTANCE.getRecursiveMibDir();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.snmp.SnmpVersion <em>Version</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.snmp.SnmpVersion
         * @see org.openscada.configuration.snmp.impl.SnmpPackageImpl#getSnmpVersion()
         * @generated
         */
        EEnum SNMP_VERSION = eINSTANCE.getSnmpVersion();

    }

} //SnmpPackage
