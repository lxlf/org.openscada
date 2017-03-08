/**
 */
package org.openscada.configuration.snmp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.configuration.snmp.SnmpDriver;
import org.openscada.configuration.snmp.SnmpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SnmpDriverTest extends TestCase
{

    /**
     * The fixture for this Driver test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SnmpDriver fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(SnmpDriverTest.class);
    }

    /**
     * Constructs a new Driver test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpDriverTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Driver test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(SnmpDriver fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Driver test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SnmpDriver getFixture()
    {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception
    {
        setFixture(SnmpFactory.eINSTANCE.createSnmpDriver());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception
    {
        setFixture(null);
    }

} //SnmpDriverTest
