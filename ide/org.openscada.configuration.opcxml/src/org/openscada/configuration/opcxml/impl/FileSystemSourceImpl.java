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

import org.eclipse.emf.ecore.resource.Resource;
import org.openscada.configuration.opcxml.FileSystemSource;
import org.openscada.configuration.opcxml.OpcxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File System Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.impl.FileSystemSourceImpl#getLocalWsdlUrl <em>Local Wsdl Url</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.FileSystemSourceImpl#getOriginalBase <em>Original Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileSystemSourceImpl extends MinimalEObjectImpl.Container implements FileSystemSource
{
    /**
     * The default value of the '{@link #getLocalWsdlUrl() <em>Local Wsdl Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalWsdlUrl()
     * @generated
     * @ordered
     */
    protected static final String LOCAL_WSDL_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalWsdlUrl() <em>Local Wsdl Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalWsdlUrl()
     * @generated
     * @ordered
     */
    protected String localWsdlUrl = LOCAL_WSDL_URL_EDEFAULT;

    /**
     * The default value of the '{@link #getOriginalBase() <em>Original Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalBase()
     * @generated
     * @ordered
     */
    protected static final Resource ORIGINAL_BASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOriginalBase() <em>Original Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalBase()
     * @generated
     * @ordered
     */
    protected Resource originalBase = ORIGINAL_BASE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FileSystemSourceImpl()
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
        return OpcxmlPackage.Literals.FILE_SYSTEM_SOURCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocalWsdlUrl()
    {
        return localWsdlUrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalWsdlUrl(String newLocalWsdlUrl)
    {
        String oldLocalWsdlUrl = localWsdlUrl;
        localWsdlUrl = newLocalWsdlUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.FILE_SYSTEM_SOURCE__LOCAL_WSDL_URL, oldLocalWsdlUrl, localWsdlUrl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Resource getOriginalBase()
    {
        return originalBase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOriginalBase(Resource newOriginalBase)
    {
        Resource oldOriginalBase = originalBase;
        originalBase = newOriginalBase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.FILE_SYSTEM_SOURCE__ORIGINAL_BASE, oldOriginalBase, originalBase));
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
            case OpcxmlPackage.FILE_SYSTEM_SOURCE__LOCAL_WSDL_URL:
                return getLocalWsdlUrl();
            case OpcxmlPackage.FILE_SYSTEM_SOURCE__ORIGINAL_BASE:
                return getOriginalBase();
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
            case OpcxmlPackage.FILE_SYSTEM_SOURCE__LOCAL_WSDL_URL:
                setLocalWsdlUrl((String)newValue);
                return;
            case OpcxmlPackage.FILE_SYSTEM_SOURCE__ORIGINAL_BASE:
                setOriginalBase((Resource)newValue);
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
            case OpcxmlPackage.FILE_SYSTEM_SOURCE__LOCAL_WSDL_URL:
                setLocalWsdlUrl(LOCAL_WSDL_URL_EDEFAULT);
                return;
            case OpcxmlPackage.FILE_SYSTEM_SOURCE__ORIGINAL_BASE:
                setOriginalBase(ORIGINAL_BASE_EDEFAULT);
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
            case OpcxmlPackage.FILE_SYSTEM_SOURCE__LOCAL_WSDL_URL:
                return LOCAL_WSDL_URL_EDEFAULT == null ? localWsdlUrl != null : !LOCAL_WSDL_URL_EDEFAULT.equals(localWsdlUrl);
            case OpcxmlPackage.FILE_SYSTEM_SOURCE__ORIGINAL_BASE:
                return ORIGINAL_BASE_EDEFAULT == null ? originalBase != null : !ORIGINAL_BASE_EDEFAULT.equals(originalBase);
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
        result.append(" (localWsdlUrl: "); //$NON-NLS-1$
        result.append(localWsdlUrl);
        result.append(", originalBase: "); //$NON-NLS-1$
        result.append(originalBase);
        result.append(')');
        return result.toString();
    }

} //FileSystemSourceImpl
