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

import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openscada.configuration.opcxml.ItemType;
import org.openscada.configuration.opcxml.OpcType;
import org.openscada.configuration.opcxml.OpcxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.impl.ItemTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.impl.ItemTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemTypeImpl extends MinimalEObjectImpl.Container implements ItemType
{
    /**
     * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
    protected static final Pattern PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
    protected Pattern pattern = PATTERN_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final OpcType TYPE_EDEFAULT = OpcType.STRING;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected OpcType type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ItemTypeImpl()
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
        return OpcxmlPackage.Literals.ITEM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pattern getPattern()
    {
        return pattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPattern(Pattern newPattern)
    {
        Pattern oldPattern = pattern;
        pattern = newPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.ITEM_TYPE__PATTERN, oldPattern, pattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcType getType()
    {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(OpcType newType)
    {
        OpcType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcxmlPackage.ITEM_TYPE__TYPE, oldType, type));
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
            case OpcxmlPackage.ITEM_TYPE__PATTERN:
                return getPattern();
            case OpcxmlPackage.ITEM_TYPE__TYPE:
                return getType();
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
            case OpcxmlPackage.ITEM_TYPE__PATTERN:
                setPattern((Pattern)newValue);
                return;
            case OpcxmlPackage.ITEM_TYPE__TYPE:
                setType((OpcType)newValue);
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
            case OpcxmlPackage.ITEM_TYPE__PATTERN:
                setPattern(PATTERN_EDEFAULT);
                return;
            case OpcxmlPackage.ITEM_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
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
            case OpcxmlPackage.ITEM_TYPE__PATTERN:
                return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
            case OpcxmlPackage.ITEM_TYPE__TYPE:
                return type != TYPE_EDEFAULT;
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
        result.append(" (pattern: "); //$NON-NLS-1$
        result.append(pattern);
        result.append(", type: "); //$NON-NLS-1$
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //ItemTypeImpl
