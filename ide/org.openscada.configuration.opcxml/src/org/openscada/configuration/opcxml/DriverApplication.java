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
package org.openscada.configuration.opcxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.scada.configuration.world.Driver;

import org.eclipse.scada.configuration.world.osgi.EquinoxApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The world model driver application.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.DriverApplication#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opcxml.OpcxmlPackage#getDriverApplication()
 * @model
 * @generated
 */
public interface DriverApplication extends Driver, EquinoxApplication
{
    /**
     * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configuration.opcxml.HiveDevice}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Devices</em>' containment reference list.
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getDriverApplication_Devices()
     * @model containment="true"
     * @generated
     */
    EList<HiveDevice> getDevices();

} // DriverApplication
