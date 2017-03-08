/**
 */
package org.openscada.configuration.snmp.tests;

import junit.textui.TestRunner;

import org.openscada.configuration.snmp.MibDir;
import org.openscada.configuration.snmp.SnmpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mib Dir</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MibDirTest extends MibsTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(MibDirTest.class);
    }

    /**
     * Constructs a new Mib Dir test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MibDirTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Mib Dir test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected MibDir getFixture()
    {
        return (MibDir)fixture;
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
        setFixture(SnmpFactory.eINSTANCE.createMibDir());
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

} //MibDirTest
