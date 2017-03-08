/**
 */
package org.openscada.configuration.snmp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.snmp.SnmpPackage
 * @generated
 */
public interface SnmpFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SnmpFactory eINSTANCE = org.openscada.configuration.snmp.impl.SnmpFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Driver</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Driver</em>'.
     * @generated
     */
    SnmpDriver createSnmpDriver();

    /**
     * Returns a new object of class '<em>Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Device</em>'.
     * @generated
     */
    SnmpDevice createSnmpDevice();

    /**
     * Returns a new object of class '<em>Static Mib Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Static Mib Name</em>'.
     * @generated
     */
    StaticMibName createStaticMibName();

    /**
     * Returns a new object of class '<em>Mib Dir</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mib Dir</em>'.
     * @generated
     */
    MibDir createMibDir();

    /**
     * Returns a new object of class '<em>Recursive Mib Dir</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Recursive Mib Dir</em>'.
     * @generated
     */
    RecursiveMibDir createRecursiveMibDir();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SnmpPackage getSnmpPackage();

} //SnmpFactory
