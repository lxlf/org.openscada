/**
 */
package org.openscada.configuration.opc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.openscada.configuration.opc.OpcFactory
 * @model kind="package"
 * @generated
 */
public interface OpcPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "opc";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configuration/OPC";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "opc";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    OpcPackage eINSTANCE = org.openscada.configuration.opc.impl.OpcPackageImpl.init();

    /**
     * The meta object id for the '{@link org.openscada.configuration.opc.impl.OpcDriverImpl <em>Driver</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opc.impl.OpcDriverImpl
     * @see org.openscada.configuration.opc.impl.OpcPackageImpl#getOpcDriver()
     * @generated
     */
    int OPC_DRIVER = 0;

    /**
     * The feature id for the '<em><b>Short Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DRIVER__SHORT_DESCRIPTION = WorldPackage.COMMON_DRIVER__SHORT_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DRIVER__NAME = WorldPackage.COMMON_DRIVER__NAME;

    /**
     * The feature id for the '<em><b>Password</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DRIVER__PASSWORD = WorldPackage.COMMON_DRIVER__PASSWORD;

    /**
     * The feature id for the '<em><b>Endpoints</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DRIVER__ENDPOINTS = WorldPackage.COMMON_DRIVER__ENDPOINTS;

    /**
     * The feature id for the '<em><b>Root</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DRIVER__ROOT = WorldPackage.COMMON_DRIVER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Socket Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DRIVER__SOCKET_TIMEOUT = WorldPackage.COMMON_DRIVER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Driver</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DRIVER_FEATURE_COUNT = WorldPackage.COMMON_DRIVER_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Endpoints</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DRIVER___GET_ENDPOINTS = WorldPackage.COMMON_DRIVER___GET_ENDPOINTS;

    /**
     * The number of operations of the '<em>Driver</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DRIVER_OPERATION_COUNT = WorldPackage.COMMON_DRIVER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.opc.impl.OpcDeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.opc.impl.OpcDeviceImpl
     * @see org.openscada.configuration.opc.impl.OpcPackageImpl#getOpcDevice()
     * @generated
     */
    int OPC_DEVICE = 1;

    /**
     * The feature id for the '<em><b>Short Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE__SHORT_DESCRIPTION = InfrastructurePackage.DEVICE__SHORT_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE__NAME = InfrastructurePackage.DEVICE__NAME;

    /**
     * The feature id for the '<em><b>Node</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE__NODE = InfrastructurePackage.DEVICE__NODE;

    /**
     * The feature id for the '<em><b>Class Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE__CLASS_ID = InfrastructurePackage.DEVICE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Prog Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE__PROG_ID = InfrastructurePackage.DEVICE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE__USER = InfrastructurePackage.DEVICE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE__PASSWORD = InfrastructurePackage.DEVICE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE__DOMAIN = InfrastructurePackage.DEVICE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE__RECONNECT_DELAY = InfrastructurePackage.DEVICE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Poll Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE__POLL_RATE = InfrastructurePackage.DEVICE_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE_FEATURE_COUNT = InfrastructurePackage.DEVICE_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPC_DEVICE_OPERATION_COUNT = InfrastructurePackage.DEVICE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opc.OpcDriver <em>Driver</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Driver</em>'.
     * @see org.openscada.configuration.opc.OpcDriver
     * @generated
     */
    EClass getOpcDriver();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.configuration.opc.OpcDriver#getRoot <em>Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root</em>'.
     * @see org.openscada.configuration.opc.OpcDriver#getRoot()
     * @see #getOpcDriver()
     * @generated
     */
    EReference getOpcDriver_Root();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opc.OpcDriver#getSocketTimeout <em>Socket Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Socket Timeout</em>'.
     * @see org.openscada.configuration.opc.OpcDriver#getSocketTimeout()
     * @see #getOpcDriver()
     * @generated
     */
    EAttribute getOpcDriver_SocketTimeout();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.opc.OpcDevice <em>Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Device</em>'.
     * @see org.openscada.configuration.opc.OpcDevice
     * @generated
     */
    EClass getOpcDevice();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opc.OpcDevice#getClassId <em>Class Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class Id</em>'.
     * @see org.openscada.configuration.opc.OpcDevice#getClassId()
     * @see #getOpcDevice()
     * @generated
     */
    EAttribute getOpcDevice_ClassId();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opc.OpcDevice#getProgId <em>Prog Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prog Id</em>'.
     * @see org.openscada.configuration.opc.OpcDevice#getProgId()
     * @see #getOpcDevice()
     * @generated
     */
    EAttribute getOpcDevice_ProgId();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opc.OpcDevice#getUser <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User</em>'.
     * @see org.openscada.configuration.opc.OpcDevice#getUser()
     * @see #getOpcDevice()
     * @generated
     */
    EAttribute getOpcDevice_User();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opc.OpcDevice#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.openscada.configuration.opc.OpcDevice#getPassword()
     * @see #getOpcDevice()
     * @generated
     */
    EAttribute getOpcDevice_Password();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opc.OpcDevice#getDomain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Domain</em>'.
     * @see org.openscada.configuration.opc.OpcDevice#getDomain()
     * @see #getOpcDevice()
     * @generated
     */
    EAttribute getOpcDevice_Domain();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opc.OpcDevice#getReconnectDelay <em>Reconnect Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reconnect Delay</em>'.
     * @see org.openscada.configuration.opc.OpcDevice#getReconnectDelay()
     * @see #getOpcDevice()
     * @generated
     */
    EAttribute getOpcDevice_ReconnectDelay();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.opc.OpcDevice#getPollRate <em>Poll Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Poll Rate</em>'.
     * @see org.openscada.configuration.opc.OpcDevice#getPollRate()
     * @see #getOpcDevice()
     * @generated
     */
    EAttribute getOpcDevice_PollRate();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    OpcFactory getOpcFactory();

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
         * The meta object literal for the '{@link org.openscada.configuration.opc.impl.OpcDriverImpl <em>Driver</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opc.impl.OpcDriverImpl
         * @see org.openscada.configuration.opc.impl.OpcPackageImpl#getOpcDriver()
         * @generated
         */
        EClass OPC_DRIVER = eINSTANCE.getOpcDriver();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPC_DRIVER__ROOT = eINSTANCE.getOpcDriver_Root();

        /**
         * The meta object literal for the '<em><b>Socket Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_DRIVER__SOCKET_TIMEOUT = eINSTANCE.getOpcDriver_SocketTimeout();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.opc.impl.OpcDeviceImpl <em>Device</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.opc.impl.OpcDeviceImpl
         * @see org.openscada.configuration.opc.impl.OpcPackageImpl#getOpcDevice()
         * @generated
         */
        EClass OPC_DEVICE = eINSTANCE.getOpcDevice();

        /**
         * The meta object literal for the '<em><b>Class Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_DEVICE__CLASS_ID = eINSTANCE.getOpcDevice_ClassId();

        /**
         * The meta object literal for the '<em><b>Prog Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_DEVICE__PROG_ID = eINSTANCE.getOpcDevice_ProgId();

        /**
         * The meta object literal for the '<em><b>User</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_DEVICE__USER = eINSTANCE.getOpcDevice_User();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_DEVICE__PASSWORD = eINSTANCE.getOpcDevice_Password();

        /**
         * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_DEVICE__DOMAIN = eINSTANCE.getOpcDevice_Domain();

        /**
         * The meta object literal for the '<em><b>Reconnect Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_DEVICE__RECONNECT_DELAY = eINSTANCE.getOpcDevice_ReconnectDelay();

        /**
         * The meta object literal for the '<em><b>Poll Rate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPC_DEVICE__POLL_RATE = eINSTANCE.getOpcDevice_PollRate();

    }

} //OpcPackage
