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
package org.openscada.configuration.opcxml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openscada.configuration.opcxml.OpcxmlPackage;
import org.openscada.configuration.opcxml.Subscription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.impl.SubscriptionImpl#getWaitTime <em>Wait Time</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.SubscriptionImpl#getSamplingRate <em>Sampling Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionImpl extends MinimalEObjectImpl.Container implements Subscription
{
    /**
     * The default value of the '{@link #getWaitTime() <em>Wait Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWaitTime()
     * @generated
     * @ordered
     */
    protected static final Integer WAIT_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWaitTime() <em>Wait Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWaitTime()
     * @generated
     * @ordered
     */
    protected Integer waitTime = WAIT_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSamplingRate()
     * @generated
     * @ordered
     */
    protected static final Integer SAMPLING_RATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSamplingRate()
     * @generated
     * @ordered
     */
    protected Integer samplingRate = SAMPLING_RATE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubscriptionImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return OpcxmlPackage.Literals.SUBSCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getWaitTime()
    {
        return waitTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWaitTime(Integer newWaitTime)
    {
        Integer oldWaitTime = waitTime;
        waitTime = newWaitTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.SUBSCRIPTION__WAIT_TIME, oldWaitTime, waitTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getSamplingRate()
    {
        return samplingRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSamplingRate(Integer newSamplingRate)
    {
        Integer oldSamplingRate = samplingRate;
        samplingRate = newSamplingRate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.SUBSCRIPTION__SAMPLING_RATE, oldSamplingRate, samplingRate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case OpcxmlPackage.SUBSCRIPTION__WAIT_TIME:
                return getWaitTime();
            case OpcxmlPackage.SUBSCRIPTION__SAMPLING_RATE:
                return getSamplingRate();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case OpcxmlPackage.SUBSCRIPTION__WAIT_TIME:
                setWaitTime((Integer)newValue);
                return;
            case OpcxmlPackage.SUBSCRIPTION__SAMPLING_RATE:
                setSamplingRate((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID)
    {
        switch (featureID)
        {
            case OpcxmlPackage.SUBSCRIPTION__WAIT_TIME:
                setWaitTime(WAIT_TIME_EDEFAULT);
                return;
            case OpcxmlPackage.SUBSCRIPTION__SAMPLING_RATE:
                setSamplingRate(SAMPLING_RATE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID)
    {
        switch (featureID)
        {
            case OpcxmlPackage.SUBSCRIPTION__WAIT_TIME:
                return WAIT_TIME_EDEFAULT == null ? waitTime != null : !WAIT_TIME_EDEFAULT.equals(waitTime);
            case OpcxmlPackage.SUBSCRIPTION__SAMPLING_RATE:
                return SAMPLING_RATE_EDEFAULT == null ? samplingRate != null : !SAMPLING_RATE_EDEFAULT.equals(samplingRate);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (waitTime: "); //$NON-NLS-1$
        result.append(waitTime);
        result.append(", samplingRate: "); //$NON-NLS-1$
        result.append(samplingRate);
        result.append(')');
        return result.toString();
    }

} //SubscriptionImpl
