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
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.Subscription#getWaitTime <em>Wait Time</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.Subscription#getSamplingRate <em>Sampling Rate</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opcxml.OpcxmlPackage#getSubscription()
 * @model
 * @generated
 */
public interface Subscription extends Poller
{
    /**
     * Returns the value of the '<em><b>Wait Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wait Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wait Time</em>' attribute.
     * @see #setWaitTime(Integer)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getSubscription_WaitTime()
     * @model
     * @generated
     */
    Integer getWaitTime();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.Subscription#getWaitTime <em>Wait Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wait Time</em>' attribute.
     * @see #getWaitTime()
     * @generated
     */
    void setWaitTime(Integer value);

    /**
     * Returns the value of the '<em><b>Sampling Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sampling Rate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sampling Rate</em>' attribute.
     * @see #setSamplingRate(Integer)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getSubscription_SamplingRate()
     * @model
     * @generated
     */
    Integer getSamplingRate();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.Subscription#getSamplingRate <em>Sampling Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sampling Rate</em>' attribute.
     * @see #getSamplingRate()
     * @generated
     */
    void setSamplingRate(Integer value);

} // Subscription
