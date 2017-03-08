/**
 */
package org.openscada.configuration.snmp.tests;

import junit.textui.TestRunner;

import org.openscada.configuration.snmp.SnmpFactory;
import org.openscada.configuration.snmp.StaticMibName;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Static Mib Name</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticMibNameTest extends MibsTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(StaticMibNameTest.class);
    }

    /**
     * Constructs a new Static Mib Name test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticMibNameTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Static Mib Name test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected StaticMibName getFixture()
    {
        return (StaticMibName)fixture;
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
        setFixture(SnmpFactory.eINSTANCE.createStaticMibName());
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

} //StaticMibNameTest
