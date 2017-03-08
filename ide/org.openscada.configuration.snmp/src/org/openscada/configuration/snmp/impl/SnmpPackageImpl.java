/**
 */
package org.openscada.configuration.snmp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.world.WorldPackage;
import org.openscada.configuration.snmp.MibDir;
import org.openscada.configuration.snmp.MibsType;
import org.openscada.configuration.snmp.RecursiveMibDir;
import org.openscada.configuration.snmp.SnmpDevice;
import org.openscada.configuration.snmp.SnmpDriver;
import org.openscada.configuration.snmp.SnmpFactory;
import org.openscada.configuration.snmp.SnmpPackage;
import org.openscada.configuration.snmp.SnmpVersion;
import org.openscada.configuration.snmp.StaticMibName;
import org.openscada.da.snmp.configuration.ConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SnmpPackageImpl extends EPackageImpl implements SnmpPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass snmpDriverEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass snmpDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mibsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass staticMibNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mibDirEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass recursiveMibDirEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum snmpVersionEEnum = null;

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
     * @see org.openscada.configuration.snmp.SnmpPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SnmpPackageImpl()
    {
        super(eNS_URI, SnmpFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SnmpPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SnmpPackage init()
    {
        if (isInited) return (SnmpPackage)EPackage.Registry.INSTANCE.getEPackage(SnmpPackage.eNS_URI);

        // Obtain or create and register package
        SnmpPackageImpl theSnmpPackage = (SnmpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SnmpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SnmpPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        InfrastructurePackage.eINSTANCE.eClass();
        ConfigurationPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSnmpPackage.createPackageContents();

        // Initialize created meta-data
        theSnmpPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSnmpPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SnmpPackage.eNS_URI, theSnmpPackage);
        return theSnmpPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSnmpDriver()
    {
        return snmpDriverEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSnmpDriver_Configuration()
    {
        return (EReference)snmpDriverEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSnmpDevice()
    {
        return snmpDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSnmpDevice_Community()
    {
        return (EAttribute)snmpDeviceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSnmpDevice_Version()
    {
        return (EAttribute)snmpDeviceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSnmpDevice_Mibs()
    {
        return (EReference)snmpDeviceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSnmpDevice_Protocol()
    {
        return (EAttribute)snmpDeviceEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSnmpDevice_Port()
    {
        return (EAttribute)snmpDeviceEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMibsType()
    {
        return mibsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMibsType_Path()
    {
        return (EAttribute)mibsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStaticMibName()
    {
        return staticMibNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMibDir()
    {
        return mibDirEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRecursiveMibDir()
    {
        return recursiveMibDirEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSnmpVersion()
    {
        return snmpVersionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpFactory getSnmpFactory()
    {
        return (SnmpFactory)getEFactoryInstance();
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
        snmpDriverEClass = createEClass(SNMP_DRIVER);
        createEReference(snmpDriverEClass, SNMP_DRIVER__CONFIGURATION);

        snmpDeviceEClass = createEClass(SNMP_DEVICE);
        createEAttribute(snmpDeviceEClass, SNMP_DEVICE__COMMUNITY);
        createEAttribute(snmpDeviceEClass, SNMP_DEVICE__VERSION);
        createEReference(snmpDeviceEClass, SNMP_DEVICE__MIBS);
        createEAttribute(snmpDeviceEClass, SNMP_DEVICE__PROTOCOL);
        createEAttribute(snmpDeviceEClass, SNMP_DEVICE__PORT);

        mibsTypeEClass = createEClass(MIBS_TYPE);
        createEAttribute(mibsTypeEClass, MIBS_TYPE__PATH);

        staticMibNameEClass = createEClass(STATIC_MIB_NAME);

        mibDirEClass = createEClass(MIB_DIR);

        recursiveMibDirEClass = createEClass(RECURSIVE_MIB_DIR);

        // Create enums
        snmpVersionEEnum = createEEnum(SNMP_VERSION);
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
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        snmpDriverEClass.getESuperTypes().add(theWorldPackage.getCommonDriver());
        snmpDeviceEClass.getESuperTypes().add(theInfrastructurePackage.getDevice());
        staticMibNameEClass.getESuperTypes().add(this.getMibsType());
        mibDirEClass.getESuperTypes().add(this.getMibsType());
        recursiveMibDirEClass.getESuperTypes().add(this.getMibsType());

        // Initialize classes, features, and operations; add parameters
        initEClass(snmpDriverEClass, SnmpDriver.class, "SnmpDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSnmpDriver_Configuration(), theConfigurationPackage.getConfigurationType(), null, "configuration", null, 0, 1, SnmpDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(snmpDeviceEClass, SnmpDevice.class, "SnmpDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSnmpDevice_Community(), theXMLTypePackage.getNMTOKEN(), "community", null, 1, 1, SnmpDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSnmpDevice_Version(), this.getSnmpVersion(), "version", null, 1, 1, SnmpDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSnmpDevice_Mibs(), this.getMibsType(), null, "mibs", null, 1, -1, SnmpDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSnmpDevice_Protocol(), theXMLTypePackage.getNMTOKEN(), "protocol", "udp", 1, 1, SnmpDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSnmpDevice_Port(), ecorePackage.getEInt(), "port", "161", 1, 1, SnmpDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mibsTypeEClass, MibsType.class, "MibsType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMibsType_Path(), ecorePackage.getEString(), "path", null, 1, 1, MibsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(staticMibNameEClass, StaticMibName.class, "StaticMibName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(mibDirEClass, MibDir.class, "MibDir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(recursiveMibDirEClass, RecursiveMibDir.class, "RecursiveMibDir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(snmpVersionEEnum, SnmpVersion.class, "SnmpVersion");
        addEEnumLiteral(snmpVersionEEnum, SnmpVersion.V1);
        addEEnumLiteral(snmpVersionEEnum, SnmpVersion.V2);
        addEEnumLiteral(snmpVersionEEnum, SnmpVersion.V3);

        // Create resource
        createResource(eNS_URI);
    }

} //SnmpPackageImpl
