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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.configuration.opcxml.ConnectionSettings;
import org.openscada.configuration.opcxml.ItemType;
import org.openscada.configuration.opcxml.OpcxmlPackage;
import org.openscada.configuration.opcxml.Poller;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.impl.ConnectionSettingsImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.ConnectionSettingsImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.ConnectionSettingsImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.ConnectionSettingsImpl#getPoller <em>Poller</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.ConnectionSettingsImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionSettingsImpl extends MinimalEObjectImpl.Container implements ConnectionSettings
{
    /**
     * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceName()
     * @generated
     * @ordered
     */
    protected static final String SERVICE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceName()
     * @generated
     * @ordered
     */
    protected String serviceName = SERVICE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPortName()
     * @generated
     * @ordered
     */
    protected static final String PORT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPortName()
     * @generated
     * @ordered
     */
    protected String portName = PORT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected static final Integer TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected Integer timeout = TIMEOUT_EDEFAULT;

    /**
     * The cached value of the '{@link #getPoller() <em>Poller</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPoller()
     * @generated
     * @ordered
     */
    protected Poller poller;

    /**
     * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypes()
     * @generated
     * @ordered
     */
    protected EList<ItemType> types;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectionSettingsImpl()
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
        return OpcxmlPackage.Literals.CONNECTION_SETTINGS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getServiceName()
    {
        return serviceName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServiceName(String newServiceName)
    {
        String oldServiceName = serviceName;
        serviceName = newServiceName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.CONNECTION_SETTINGS__SERVICE_NAME, oldServiceName, serviceName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPortName()
    {
        return portName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPortName(String newPortName)
    {
        String oldPortName = portName;
        portName = newPortName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.CONNECTION_SETTINGS__PORT_NAME, oldPortName, portName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case OpcxmlPackage.CONNECTION_SETTINGS__POLLER:
                return basicSetPoller(null, msgs);
            case OpcxmlPackage.CONNECTION_SETTINGS__TYPES:
                return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getTimeout()
    {
        return timeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeout(Integer newTimeout)
    {
        Integer oldTimeout = timeout;
        timeout = newTimeout;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.CONNECTION_SETTINGS__TIMEOUT, oldTimeout, timeout));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Poller getPoller()
    {
        return poller;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPoller(Poller newPoller, NotificationChain msgs)
    {
        Poller oldPoller = poller;
        poller = newPoller;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpcxmlPackage.CONNECTION_SETTINGS__POLLER, oldPoller, newPoller);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPoller(Poller newPoller)
    {
        if (newPoller != poller)
        {
            NotificationChain msgs = null;
            if (poller != null)
                msgs = ((InternalEObject)poller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpcxmlPackage.CONNECTION_SETTINGS__POLLER, null, msgs);
            if (newPoller != null)
                msgs = ((InternalEObject)newPoller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpcxmlPackage.CONNECTION_SETTINGS__POLLER, null, msgs);
            msgs = basicSetPoller(newPoller, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.CONNECTION_SETTINGS__POLLER, newPoller, newPoller));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ItemType> getTypes()
    {
        if (types == null)
        {
            types = new EObjectContainmentEList<ItemType>(ItemType.class, this, OpcxmlPackage.CONNECTION_SETTINGS__TYPES);
        }
        return types;
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
            case OpcxmlPackage.CONNECTION_SETTINGS__SERVICE_NAME:
                return getServiceName();
            case OpcxmlPackage.CONNECTION_SETTINGS__PORT_NAME:
                return getPortName();
            case OpcxmlPackage.CONNECTION_SETTINGS__TIMEOUT:
                return getTimeout();
            case OpcxmlPackage.CONNECTION_SETTINGS__POLLER:
                return getPoller();
            case OpcxmlPackage.CONNECTION_SETTINGS__TYPES:
                return getTypes();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case OpcxmlPackage.CONNECTION_SETTINGS__SERVICE_NAME:
                setServiceName((String)newValue);
                return;
            case OpcxmlPackage.CONNECTION_SETTINGS__PORT_NAME:
                setPortName((String)newValue);
                return;
            case OpcxmlPackage.CONNECTION_SETTINGS__TIMEOUT:
                setTimeout((Integer)newValue);
                return;
            case OpcxmlPackage.CONNECTION_SETTINGS__POLLER:
                setPoller((Poller)newValue);
                return;
            case OpcxmlPackage.CONNECTION_SETTINGS__TYPES:
                getTypes().clear();
                getTypes().addAll((Collection<? extends ItemType>)newValue);
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
            case OpcxmlPackage.CONNECTION_SETTINGS__SERVICE_NAME:
                setServiceName(SERVICE_NAME_EDEFAULT);
                return;
            case OpcxmlPackage.CONNECTION_SETTINGS__PORT_NAME:
                setPortName(PORT_NAME_EDEFAULT);
                return;
            case OpcxmlPackage.CONNECTION_SETTINGS__TIMEOUT:
                setTimeout(TIMEOUT_EDEFAULT);
                return;
            case OpcxmlPackage.CONNECTION_SETTINGS__POLLER:
                setPoller((Poller)null);
                return;
            case OpcxmlPackage.CONNECTION_SETTINGS__TYPES:
                getTypes().clear();
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
            case OpcxmlPackage.CONNECTION_SETTINGS__SERVICE_NAME:
                return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
            case OpcxmlPackage.CONNECTION_SETTINGS__PORT_NAME:
                return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
            case OpcxmlPackage.CONNECTION_SETTINGS__TIMEOUT:
                return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
            case OpcxmlPackage.CONNECTION_SETTINGS__POLLER:
                return poller != null;
            case OpcxmlPackage.CONNECTION_SETTINGS__TYPES:
                return types != null && !types.isEmpty();
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
        result.append(" (serviceName: "); //$NON-NLS-1$
        result.append(serviceName);
        result.append(", portName: "); //$NON-NLS-1$
        result.append(portName);
        result.append(", timeout: "); //$NON-NLS-1$
        result.append(timeout);
        result.append(')');
        return result.toString();
    }

} //ConnectionSettingsImpl
