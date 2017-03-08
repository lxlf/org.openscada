/**
 */
package org.openscada.configuration.snmp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openscada.configuration.snmp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SnmpFactoryImpl extends EFactoryImpl implements SnmpFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SnmpFactory init()
    {
        try
        {
            SnmpFactory theSnmpFactory = (SnmpFactory)EPackage.Registry.INSTANCE.getEFactory(SnmpPackage.eNS_URI);
            if (theSnmpFactory != null)
            {
                return theSnmpFactory;
            }
        }
        catch (Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SnmpFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpFactoryImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass)
    {
        switch (eClass.getClassifierID())
        {
            case SnmpPackage.SNMP_DRIVER: return createSnmpDriver();
            case SnmpPackage.SNMP_DEVICE: return createSnmpDevice();
            case SnmpPackage.STATIC_MIB_NAME: return createStaticMibName();
            case SnmpPackage.MIB_DIR: return createMibDir();
            case SnmpPackage.RECURSIVE_MIB_DIR: return createRecursiveMibDir();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
            case SnmpPackage.SNMP_VERSION:
                return createSnmpVersionFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
            case SnmpPackage.SNMP_VERSION:
                return convertSnmpVersionToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpDriver createSnmpDriver()
    {
        SnmpDriverImpl snmpDriver = new SnmpDriverImpl();
        return snmpDriver;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpDevice createSnmpDevice()
    {
        SnmpDeviceImpl snmpDevice = new SnmpDeviceImpl();
        return snmpDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticMibName createStaticMibName()
    {
        StaticMibNameImpl staticMibName = new StaticMibNameImpl();
        return staticMibName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MibDir createMibDir()
    {
        MibDirImpl mibDir = new MibDirImpl();
        return mibDir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecursiveMibDir createRecursiveMibDir()
    {
        RecursiveMibDirImpl recursiveMibDir = new RecursiveMibDirImpl();
        return recursiveMibDir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpVersion createSnmpVersionFromString(EDataType eDataType, String initialValue)
    {
        SnmpVersion result = SnmpVersion.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSnmpVersionToString(EDataType eDataType, Object instanceValue)
    {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpPackage getSnmpPackage()
    {
        return (SnmpPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SnmpPackage getPackage()
    {
        return SnmpPackage.eINSTANCE;
    }

} //SnmpFactoryImpl
