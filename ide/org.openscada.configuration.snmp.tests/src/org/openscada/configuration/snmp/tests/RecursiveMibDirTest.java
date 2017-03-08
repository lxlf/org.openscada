/**
 */
package org.openscada.configuration.snmp.tests;

import junit.textui.TestRunner;

import org.openscada.configuration.snmp.RecursiveMibDir;
import org.openscada.configuration.snmp.SnmpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Recursive Mib Dir</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecursiveMibDirTest extends MibsTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(RecursiveMibDirTest.class);
    }

    /**
     * Constructs a new Recursive Mib Dir test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecursiveMibDirTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Recursive Mib Dir test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected RecursiveMibDir getFixture()
    {
        return (RecursiveMibDir)fixture;
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
        setFixture(SnmpFactory.eINSTANCE.createRecursiveMibDir());
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

} //RecursiveMibDirTest
