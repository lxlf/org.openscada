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

import org.eclipse.scada.configuration.infrastructure.impl.DeviceImpl;

import org.openscada.configuration.opcxml.ConnectionSettings;
import org.openscada.configuration.opcxml.OpcXmlDevice;
import org.openscada.configuration.opcxml.OpcxmlPackage;
import org.openscada.configuration.opcxml.WsdlSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opc Xml Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.impl.OpcXmlDeviceImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.OpcXmlDeviceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.OpcXmlDeviceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.OpcXmlDeviceImpl#getWsdlSource <em>Wsdl Source</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.OpcXmlDeviceImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.OpcXmlDeviceImpl#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcXmlDeviceImpl extends DeviceImpl implements OpcXmlDevice
{
    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected static final String PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected String path = PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected static final Integer PORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected Integer port = PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtocol()
     * @generated
     * @ordered
     */
    protected static final String PROTOCOL_EDEFAULT = "http";

    /**
     * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtocol()
     * @generated
     * @ordered
     */
    protected String protocol = PROTOCOL_EDEFAULT;

    /**
     * The cached value of the '{@link #getWsdlSource() <em>Wsdl Source</em>}' reference.
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
     * The default value of the '{@link #getCredentials() <em>Credentials</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCredentials()
     * @generated
     * @ordered
     */
    protected static final String CREDENTIALS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCredentials()
     * @generated
     * @ordered
     */
    protected String credentials = CREDENTIALS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcXmlDeviceImpl()
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
        return OpcxmlPackage.Literals.OPC_XML_DEVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPath()
    {
        return path;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPath(String newPath)
    {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.OPC_XML_DEVICE__PATH, oldPath, path));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getPort()
    {
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPort(Integer newPort)
    {
        Integer oldPort = port;
        port = newPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.OPC_XML_DEVICE__PORT, oldPort, port));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProtocol()
    {
        return protocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProtocol(String newProtocol)
    {
        String oldProtocol = protocol;
        protocol = newProtocol;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.OPC_XML_DEVICE__PROTOCOL, oldProtocol, protocol));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WsdlSource getWsdlSource()
    {
        if (wsdlSource != null && wsdlSource.eIsProxy())
        {
            InternalEObject oldWsdlSource = (InternalEObject)wsdlSource;
            wsdlSource = (WsdlSource)eResolveProxy(oldWsdlSource);
            if (wsdlSource != oldWsdlSource)
            {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpcxmlPackage.OPC_XML_DEVICE__WSDL_SOURCE, oldWsdlSource, wsdlSource));
            }
        }
        return wsdlSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WsdlSource basicGetWsdlSource()
    {
        return wsdlSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWsdlSource(WsdlSource newWsdlSource)
    {
        WsdlSource oldWsdlSource = wsdlSource;
        wsdlSource = newWsdlSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.OPC_XML_DEVICE__WSDL_SOURCE, oldWsdlSource, wsdlSource));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpcxmlPackage.OPC_XML_DEVICE__SETTINGS, oldSettings, newSettings);
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
                msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpcxmlPackage.OPC_XML_DEVICE__SETTINGS, null, msgs);
            if (newSettings != null)
                msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpcxmlPackage.OPC_XML_DEVICE__SETTINGS, null, msgs);
            msgs = basicSetSettings(newSettings, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.OPC_XML_DEVICE__SETTINGS, newSettings, newSettings));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCredentials()
    {
        return credentials;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCredentials(String newCredentials)
    {
        String oldCredentials = credentials;
        credentials = newCredentials;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.OPC_XML_DEVICE__CREDENTIALS, oldCredentials, credentials));
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
            case OpcxmlPackage.OPC_XML_DEVICE__SETTINGS:
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
            case OpcxmlPackage.OPC_XML_DEVICE__PATH:
                return getPath();
            case OpcxmlPackage.OPC_XML_DEVICE__PORT:
                return getPort();
            case OpcxmlPackage.OPC_XML_DEVICE__PROTOCOL:
                return getProtocol();
            case OpcxmlPackage.OPC_XML_DEVICE__WSDL_SOURCE:
                if (resolve) return getWsdlSource();
                return basicGetWsdlSource();
            case OpcxmlPackage.OPC_XML_DEVICE__SETTINGS:
                return getSettings();
            case OpcxmlPackage.OPC_XML_DEVICE__CREDENTIALS:
                return getCredentials();
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
            case OpcxmlPackage.OPC_XML_DEVICE__PATH:
                setPath((String)newValue);
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__PORT:
                setPort((Integer)newValue);
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__PROTOCOL:
                setProtocol((String)newValue);
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__WSDL_SOURCE:
                setWsdlSource((WsdlSource)newValue);
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__SETTINGS:
                setSettings((ConnectionSettings)newValue);
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__CREDENTIALS:
                setCredentials((String)newValue);
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
            case OpcxmlPackage.OPC_XML_DEVICE__PATH:
                setPath(PATH_EDEFAULT);
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__PORT:
                setPort(PORT_EDEFAULT);
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__PROTOCOL:
                setProtocol(PROTOCOL_EDEFAULT);
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__WSDL_SOURCE:
                setWsdlSource((WsdlSource)null);
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__SETTINGS:
                setSettings((ConnectionSettings)null);
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__CREDENTIALS:
                setCredentials(CREDENTIALS_EDEFAULT);
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
            case OpcxmlPackage.OPC_XML_DEVICE__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
            case OpcxmlPackage.OPC_XML_DEVICE__PORT:
                return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
            case OpcxmlPackage.OPC_XML_DEVICE__PROTOCOL:
                return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
            case OpcxmlPackage.OPC_XML_DEVICE__WSDL_SOURCE:
                return wsdlSource != null;
            case OpcxmlPackage.OPC_XML_DEVICE__SETTINGS:
                return settings != null;
            case OpcxmlPackage.OPC_XML_DEVICE__CREDENTIALS:
                return CREDENTIALS_EDEFAULT == null ? credentials != null : !CREDENTIALS_EDEFAULT.equals(credentials);
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
        result.append(" (path: "); //$NON-NLS-1$
        result.append(path);
        result.append(", port: "); //$NON-NLS-1$
        result.append(port);
        result.append(", protocol: "); //$NON-NLS-1$
        result.append(protocol);
        result.append(", credentials: "); //$NON-NLS-1$
        result.append(credentials);
        result.append(')');
        return result.toString();
    }

} //OpcXmlDeviceImpl
