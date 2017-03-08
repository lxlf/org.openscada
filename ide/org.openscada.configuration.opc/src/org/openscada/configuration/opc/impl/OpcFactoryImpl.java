/**
 */
package org.openscada.configuration.opc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openscada.configuration.opc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcFactoryImpl extends EFactoryImpl implements OpcFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OpcFactory init()
    {
        try
        {
            OpcFactory theOpcFactory = (OpcFactory)EPackage.Registry.INSTANCE.getEFactory(OpcPackage.eNS_URI);
            if (theOpcFactory != null)
            {
                return theOpcFactory;
            }
        }
        catch (Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new OpcFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcFactoryImpl()
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
            case OpcPackage.OPC_DRIVER: return createOpcDriver();
            case OpcPackage.OPC_DEVICE: return createOpcDevice();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcDriver createOpcDriver()
    {
        OpcDriverImpl opcDriver = new OpcDriverImpl();
        return opcDriver;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcDevice createOpcDevice()
    {
        OpcDeviceImpl opcDevice = new OpcDeviceImpl();
        return opcDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcPackage getOpcPackage()
    {
        return (OpcPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static OpcPackage getPackage()
    {
        return OpcPackage.eINSTANCE;
    }

} //OpcFactoryImpl
