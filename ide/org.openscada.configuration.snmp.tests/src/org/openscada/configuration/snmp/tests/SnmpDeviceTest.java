/**
 */
package org.openscada.configuration.snmp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.configuration.snmp.SnmpDevice;
import org.openscada.configuration.snmp.SnmpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SnmpDeviceTest extends TestCase
{

    /**
     * The fixture for this Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SnmpDevice fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(SnmpDeviceTest.class);
    }

    /**
     * Constructs a new Device test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpDeviceTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(SnmpDevice fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SnmpDevice getFixture()
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
        setFixture(SnmpFactory.eINSTANCE.createSnmpDevice());
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

} //SnmpDeviceTest
