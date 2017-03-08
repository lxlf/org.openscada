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
import org.openscada.configuration.opcxml.ReadRequestPoller;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Request Poller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.impl.ReadRequestPollerImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.ReadRequestPollerImpl#getMaxAge <em>Max Age</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadRequestPollerImpl extends MinimalEObjectImpl.Container implements ReadRequestPoller
{
    /**
     * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
    protected static final int PERIOD_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
    protected int period = PERIOD_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxAge() <em>Max Age</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAge()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_AGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxAge() <em>Max Age</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAge()
     * @generated
     * @ordered
     */
    protected Integer maxAge = MAX_AGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReadRequestPollerImpl()
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
        return OpcxmlPackage.Literals.READ_REQUEST_POLLER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPeriod()
    {
        return period;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPeriod(int newPeriod)
    {
        int oldPeriod = period;
        period = newPeriod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.READ_REQUEST_POLLER__PERIOD, oldPeriod, period));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getMaxAge()
    {
        return maxAge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxAge(Integer newMaxAge)
    {
        Integer oldMaxAge = maxAge;
        maxAge = newMaxAge;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.READ_REQUEST_POLLER__MAX_AGE, oldMaxAge, maxAge));
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
            case OpcxmlPackage.READ_REQUEST_POLLER__PERIOD:
                return getPeriod();
            case OpcxmlPackage.READ_REQUEST_POLLER__MAX_AGE:
                return getMaxAge();
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
            case OpcxmlPackage.READ_REQUEST_POLLER__PERIOD:
                setPeriod((Integer)newValue);
                return;
            case OpcxmlPackage.READ_REQUEST_POLLER__MAX_AGE:
                setMaxAge((Integer)newValue);
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
            case OpcxmlPackage.READ_REQUEST_POLLER__PERIOD:
                setPeriod(PERIOD_EDEFAULT);
                return;
            case OpcxmlPackage.READ_REQUEST_POLLER__MAX_AGE:
                setMaxAge(MAX_AGE_EDEFAULT);
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
            case OpcxmlPackage.READ_REQUEST_POLLER__PERIOD:
                return period != PERIOD_EDEFAULT;
            case OpcxmlPackage.READ_REQUEST_POLLER__MAX_AGE:
                return MAX_AGE_EDEFAULT == null ? maxAge != null : !MAX_AGE_EDEFAULT.equals(maxAge);
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
        result.append(" (period: "); //$NON-NLS-1$
        result.append(period);
        result.append(", maxAge: "); //$NON-NLS-1$
        result.append(maxAge);
        result.append(')');
        return result.toString();
    }

} //ReadRequestPollerImpl
