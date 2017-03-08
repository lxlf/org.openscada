/**
 * Copyright (c) 2015 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.openscada.configuration.opcxml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.configuration.opcxml.OpcXmlDevice;
import org.openscada.configuration.opcxml.OpcxmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Opc Xml Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcXmlDeviceTest extends TestCase
{

    /**
     * The fixture for this Opc Xml Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcXmlDevice fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(OpcXmlDeviceTest.class);
    }

    /**
     * Constructs a new Opc Xml Device test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcXmlDeviceTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Opc Xml Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(OpcXmlDevice fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Opc Xml Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcXmlDevice getFixture()
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
        setFixture(OpcxmlFactory.eINSTANCE.createOpcXmlDevice());
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

} //OpcXmlDeviceTest
