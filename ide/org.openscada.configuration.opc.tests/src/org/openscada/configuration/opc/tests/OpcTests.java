/**
 */
package org.openscada.configuration.opc.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>opc</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcTests extends TestSuite
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
        TestSuite suite = new OpcTests("opc Tests");
        suite.addTestSuite(OpcDriverTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcTests(String name)
    {
        super(name);
    }

} //OpcTests
