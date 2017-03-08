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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.scada.configuration.infrastructure.impl.AbstractEquinoxDriverImpl;

import org.openscada.configuration.opcxml.OpcXmlDevice;
import org.openscada.configuration.opcxml.OpcXmlDriver;
import org.openscada.configuration.opcxml.OpcxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opc Xml Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.impl.OpcXmlDriverImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcXmlDriverImpl extends AbstractEquinoxDriverImpl implements OpcXmlDriver
{
    /**
     * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDevices()
     * @generated
     * @ordered
     */
    protected EList<OpcXmlDevice> devices;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcXmlDriverImpl()
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
        return OpcxmlPackage.Literals.OPC_XML_DRIVER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OpcXmlDevice> getDevices()
    {
        if (devices == null)
        {
            devices = new EObjectResolvingEList<OpcXmlDevice>(OpcXmlDevice.class, this, OpcxmlPackage.OPC_XML_DRIVER__DEVICES);
        }
        return devices;
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
            case OpcxmlPackage.OPC_XML_DRIVER__DEVICES:
                return getDevices();
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
            case OpcxmlPackage.OPC_XML_DRIVER__DEVICES:
                getDevices().clear();
                getDevices().addAll((Collection<? extends OpcXmlDevice>)newValue);
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
            case OpcxmlPackage.OPC_XML_DRIVER__DEVICES:
                getDevices().clear();
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
            case OpcxmlPackage.OPC_XML_DRIVER__DEVICES:
                return devices != null && !devices.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //OpcXmlDriverImpl
