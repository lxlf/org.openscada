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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openscada.configuration.opcxml.ConnectionSettings;
import org.openscada.configuration.opcxml.HiveDevice;
import org.openscada.configuration.opcxml.OpcxmlPackage;
import org.openscada.configuration.opcxml.WsdlSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hive Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.impl.HiveDeviceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.HiveDeviceImpl#getServerUrl <em>Server Url</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.HiveDeviceImpl#getWsdlSource <em>Wsdl Source</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.HiveDeviceImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HiveDeviceImpl extends MinimalEObjectImpl.Container implements HiveDevice
{
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;
    /**
     * The default value of the '{@link #getServerUrl() <em>Server Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServerUrl()
     * @generated
     * @ordered
     */
    protected static final String SERVER_URL_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getServerUrl() <em>Server Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServerUrl()
     * @generated
     * @ordered
     */
    protected String serverUrl = SERVER_URL_EDEFAULT;
    /**
     * The cached value of the '{@link #getWsdlSource() <em>Wsdl Source</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWsdlSource()
     * @generated
     * @ordered
     */
    protected WsdlSource wsdlSource;

    /**
     * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSettings()
     * @generated
     * @ordered
     */
    protected ConnectionSettings settings;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HiveDeviceImpl()
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
        return OpcxmlPackage.Literals.HIVE_DEVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId()
    {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId)
    {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.HIVE_DEVICE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getServerUrl()
    {
        return serverUrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServerUrl(String newServerUrl)
    {
        String oldServerUrl = serverUrl;
        serverUrl = newServerUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.HIVE_DEVICE__SERVER_URL, oldServerUrl, serverUrl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WsdlSource getWsdlSource()
    {
        return wsdlSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWsdlSource(WsdlSource newWsdlSource, NotificationChain msgs)
    {
        WsdlSource oldWsdlSource = wsdlSource;
        wsdlSource = newWsdlSource;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpcxmlPackage.HIVE_DEVICE__WSDL_SOURCE, oldWsdlSource, newWsdlSource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWsdlSource(WsdlSource newWsdlSource)
    {
        if (newWsdlSource != wsdlSource)
        {
            NotificationChain msgs = null;
            if (wsdlSource != null)
                msgs = ((InternalEObject)wsdlSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpcxmlPackage.HIVE_DEVICE__WSDL_SOURCE, null, msgs);
            if (newWsdlSource != null)
                msgs = ((InternalEObject)newWsdlSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpcxmlPackage.HIVE_DEVICE__WSDL_SOURCE, null, msgs);
            msgs = basicSetWsdlSource(newWsdlSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.HIVE_DEVICE__WSDL_SOURCE, newWsdlSource, newWsdlSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionSettings getSettings()
    {
        return settings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSettings(ConnectionSettings newSettings, NotificationChain msgs)
    {
        ConnectionSettings oldSettings = settings;
        settings = newSettings;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpcxmlPackage.HIVE_DEVICE__SETTINGS, oldSettings, newSettings);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSettings(ConnectionSettings newSettings)
    {
        if (newSettings != settings)
        {
            NotificationChain msgs = null;
            if (settings != null)
                msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpcxmlPackage.HIVE_DEVICE__SETTINGS, null, msgs);
            if (newSettings != null)
                msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpcxmlPackage.HIVE_DEVICE__SETTINGS, null, msgs);
            msgs = basicSetSettings(newSettings, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.HIVE_DEVICE__SETTINGS, newSettings, newSettings));
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
            case OpcxmlPackage.HIVE_DEVICE__WSDL_SOURCE:
                return basicSetWsdlSource(null, msgs);
            case OpcxmlPackage.HIVE_DEVICE__SETTINGS:
                return basicSetSettings(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            case OpcxmlPackage.HIVE_DEVICE__ID:
                return getId();
            case OpcxmlPackage.HIVE_DEVICE__SERVER_URL:
                return getServerUrl();
            case OpcxmlPackage.HIVE_DEVICE__WSDL_SOURCE:
                return getWsdlSource();
            case OpcxmlPackage.HIVE_DEVICE__SETTINGS:
                return getSettings();
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
            case OpcxmlPackage.HIVE_DEVICE__ID:
                setId((String)newValue);
                return;
            case OpcxmlPackage.HIVE_DEVICE__SERVER_URL:
                setServerUrl((String)newValue);
                return;
            case OpcxmlPackage.HIVE_DEVICE__WSDL_SOURCE:
                setWsdlSource((WsdlSource)newValue);
                return;
            case OpcxmlPackage.HIVE_DEVICE__SETTINGS:
                setSettings((ConnectionSettings)newValue);
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
            case OpcxmlPackage.HIVE_DEVICE__ID:
                setId(ID_EDEFAULT);
                return;
            case OpcxmlPackage.HIVE_DEVICE__SERVER_URL:
                setServerUrl(SERVER_URL_EDEFAULT);
                return;
            case OpcxmlPackage.HIVE_DEVICE__WSDL_SOURCE:
                setWsdlSource((WsdlSource)null);
                return;
            case OpcxmlPackage.HIVE_DEVICE__SETTINGS:
                setSettings((ConnectionSettings)null);
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
            case OpcxmlPackage.HIVE_DEVICE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case OpcxmlPackage.HIVE_DEVICE__SERVER_URL:
                return SERVER_URL_EDEFAULT == null ? serverUrl != null : !SERVER_URL_EDEFAULT.equals(serverUrl);
            case OpcxmlPackage.HIVE_DEVICE__WSDL_SOURCE:
                return wsdlSource != null;
            case OpcxmlPackage.HIVE_DEVICE__SETTINGS:
                return settings != null;
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
        result.append(" (id: "); //$NON-NLS-1$
        result.append(id);
        result.append(", serverUrl: "); //$NON-NLS-1$
        result.append(serverUrl);
        result.append(')');
        return result.toString();
    }

} //HiveDeviceImpl
