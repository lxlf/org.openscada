/**
 */
package org.openscada.configuration.snmp.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Snmp</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class SnmpAllTests extends TestSuite
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
        TestSuite suite = new SnmpAllTests("Snmp Tests");
        suite.addTest(SnmpTests.suite());
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpAllTests(String name)
    {
        super(name);
    }

} //SnmpAllTests
