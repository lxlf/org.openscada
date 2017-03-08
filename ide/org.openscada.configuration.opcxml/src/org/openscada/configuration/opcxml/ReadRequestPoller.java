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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Request Poller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.ReadRequestPoller#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.ReadRequestPoller#getMaxAge <em>Max Age</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opcxml.OpcxmlPackage#getReadRequestPoller()
 * @model
 * @generated
 */
public interface ReadRequestPoller extends Poller
{
    /**
     * Returns the value of the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Period</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Period</em>' attribute.
     * @see #setPeriod(int)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getReadRequestPoller_Period()
     * @model required="true"
     * @generated
     */
    int getPeriod();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.ReadRequestPoller#getPeriod <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Period</em>' attribute.
     * @see #getPeriod()
     * @generated
     */
    void setPeriod(int value);

    /**
     * Returns the value of the '<em><b>Max Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Age</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Age</em>' attribute.
     * @see #setMaxAge(Integer)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getReadRequestPoller_MaxAge()
     * @model
     * @generated
     */
    Integer getMaxAge();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.ReadRequestPoller#getMaxAge <em>Max Age</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Age</em>' attribute.
     * @see #getMaxAge()
     * @generated
     */
    void setMaxAge(Integer value);

} // ReadRequestPoller
