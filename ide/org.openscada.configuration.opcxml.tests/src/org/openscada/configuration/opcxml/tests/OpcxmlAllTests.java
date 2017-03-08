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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Opcxml</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcxmlAllTests extends TestSuite
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
        TestSuite suite = new OpcxmlAllTests("Opcxml Tests"); //$NON-NLS-1$
        suite.addTest(OpcxmlTests.suite());
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcxmlAllTests(String name)
    {
        super(name);
    }

} //OpcxmlAllTests
