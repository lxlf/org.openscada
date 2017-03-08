/**
 */
package org.openscada.configuration.opc.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Opc</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcAllTests extends TestSuite
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Test suite()
    {
        TestSuite suite = new OpcAllTests("Opc Tests");
        suite.addTest(OpcTests.suite());
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcAllTests(String name)
    {
        super(name);
    }

} //OpcAllTests
