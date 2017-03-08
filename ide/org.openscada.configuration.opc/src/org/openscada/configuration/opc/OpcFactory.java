/**
 */
package org.openscada.configuration.opc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.opc.OpcPackage
 * @generated
 */
public interface OpcFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    OpcFactory eINSTANCE = org.openscada.configuration.opc.impl.OpcFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Driver</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Driver</em>'.
     * @generated
     */
    OpcDriver createOpcDriver();

    /**
     * Returns a new object of class '<em>Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Device</em>'.
     * @generated
     */
    OpcDevice createOpcDevice();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    OpcPackage getOpcPackage();

} //OpcFactory
