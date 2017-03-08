/**
 */
package org.openscada.configuration.opc.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.configuration.opc.OpcDriver;
import org.openscada.configuration.opc.OpcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcDriverTest extends TestCase
{

    /**
     * The fixture for this Driver test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcDriver fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(OpcDriverTest.class);
    }

    /**
     * Constructs a new Driver test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcDriverTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Driver test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(OpcDriver fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Driver test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcDriver getFixture()
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
        setFixture(OpcFactory.eINSTANCE.createOpcDriver());
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

} //OpcDriverTest
