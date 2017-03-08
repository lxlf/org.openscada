/**
 */
package org.openscada.configuration.opc.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.configuration.opc.OpcDevice;
import org.openscada.configuration.opc.OpcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcDeviceTest extends TestCase
{

    /**
     * The fixture for this Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcDevice fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(OpcDeviceTest.class);
    }

    /**
     * Constructs a new Device test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcDeviceTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(OpcDevice fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcDevice getFixture()
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
        setFixture(OpcFactory.eINSTANCE.createOpcDevice());
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

} //OpcDeviceTest
