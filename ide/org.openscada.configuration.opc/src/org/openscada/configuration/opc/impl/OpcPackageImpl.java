/**
 */
package org.openscada.configuration.opc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.item.ItemPackage;
import org.eclipse.scada.configuration.world.WorldPackage;
import org.openscada.configuration.opc.OpcDevice;
import org.openscada.configuration.opc.OpcDriver;
import org.openscada.configuration.opc.OpcFactory;
import org.openscada.configuration.opc.OpcPackage;
import org.openscada.da.opc.configuration.ConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcPackageImpl extends EPackageImpl implements OpcPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass opcDriverEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass opcDeviceEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.openscada.configuration.opc.OpcPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private OpcPackageImpl()
    {
        super(eNS_URI, OpcFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link OpcPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static OpcPackage init()
    {
        if (isInited) return (OpcPackage)EPackage.Registry.INSTANCE.getEPackage(OpcPackage.eNS_URI);

        // Obtain or create and register package
        OpcPackageImpl theOpcPackage = (OpcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpcPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        InfrastructurePackage.eINSTANCE.eClass();
        ItemPackage.eINSTANCE.eClass();
        ConfigurationPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theOpcPackage.createPackageContents();

        // Initialize created meta-data
        theOpcPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theOpcPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(OpcPackage.eNS_URI, theOpcPackage);
        return theOpcPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpcDriver()
    {
        return opcDriverEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOpcDriver_Root()
    {
        return (EReference)opcDriverEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcDriver_SocketTimeout()
    {
        return (EAttribute)opcDriverEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpcDevice()
    {
        return opcDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcDevice_ClassId()
    {
        return (EAttribute)opcDeviceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcDevice_ProgId()
    {
        return (EAttribute)opcDeviceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcDevice_User()
    {
        return (EAttribute)opcDeviceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcDevice_Password()
    {
        return (EAttribute)opcDeviceEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcDevice_Domain()
    {
        return (EAttribute)opcDeviceEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcDevice_ReconnectDelay()
    {
        return (EAttribute)opcDeviceEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpcDevice_PollRate()
    {
        return (EAttribute)opcDeviceEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcFactory getOpcFactory()
    {
        return (OpcFactory)getEFactoryInstance();
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
    public void createPackageContents()
    {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        opcDriverEClass = createEClass(OPC_DRIVER);
        createEReference(opcDriverEClass, OPC_DRIVER__ROOT);
        createEAttribute(opcDriverEClass, OPC_DRIVER__SOCKET_TIMEOUT);

        opcDeviceEClass = createEClass(OPC_DEVICE);
        createEAttribute(opcDeviceEClass, OPC_DEVICE__CLASS_ID);
        createEAttribute(opcDeviceEClass, OPC_DEVICE__PROG_ID);
        createEAttribute(opcDeviceEClass, OPC_DEVICE__USER);
        createEAttribute(opcDeviceEClass, OPC_DEVICE__PASSWORD);
        createEAttribute(opcDeviceEClass, OPC_DEVICE__DOMAIN);
        createEAttribute(opcDeviceEClass, OPC_DEVICE__RECONNECT_DELAY);
        createEAttribute(opcDeviceEClass, OPC_DEVICE__POLL_RATE);
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
    public void initializePackageContents()
    {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        WorldPackage theWorldPackage = (WorldPackage)EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI);
        ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);
        InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        opcDriverEClass.getESuperTypes().add(theWorldPackage.getCommonDriver());
        opcDeviceEClass.getESuperTypes().add(theInfrastructurePackage.getDevice());

        // Initialize classes, features, and operations; add parameters
        initEClass(opcDriverEClass, OpcDriver.class, "OpcDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOpcDriver_Root(), theConfigurationPackage.getRootType(), null, "root", null, 0, 1, OpcDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOpcDriver_SocketTimeout(), ecorePackage.getEIntegerObject(), "socketTimeout", null, 0, 1, OpcDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(opcDeviceEClass, OpcDevice.class, "OpcDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOpcDevice_ClassId(), ecorePackage.getEString(), "classId", null, 0, 1, OpcDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOpcDevice_ProgId(), ecorePackage.getEString(), "progId", null, 0, 1, OpcDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOpcDevice_User(), ecorePackage.getEString(), "user", null, 1, 1, OpcDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOpcDevice_Password(), ecorePackage.getEString(), "password", null, 1, 1, OpcDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOpcDevice_Domain(), ecorePackage.getEString(), "domain", null, 1, 1, OpcDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOpcDevice_ReconnectDelay(), ecorePackage.getEInt(), "reconnectDelay", "10000", 1, 1, OpcDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOpcDevice_PollRate(), ecorePackage.getEInt(), "pollRate", "250", 1, 1, OpcDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //OpcPackageImpl
