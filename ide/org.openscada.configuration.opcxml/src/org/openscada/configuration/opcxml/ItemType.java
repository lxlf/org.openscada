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

import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.ItemType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.ItemType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opcxml.OpcxmlPackage#getItemType()
 * @model
 * @generated
 */
public interface ItemType extends EObject
{
    /**
     * Returns the value of the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pattern</em>' attribute.
     * @see #setPattern(Pattern)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getItemType_Pattern()
     * @model dataType="org.eclipse.scada.configuration.world.Pattern"
     * @generated
     */
    Pattern getPattern();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.ItemType#getPattern <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pattern</em>' attribute.
     * @see #getPattern()
     * @generated
     */
    void setPattern(Pattern value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.openscada.configuration.opcxml.OpcType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.openscada.configuration.opcxml.OpcType
     * @see #setType(OpcType)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getItemType_Type()
     * @model
     * @generated
     */
    OpcType getType();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.ItemType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.openscada.configuration.opcxml.OpcType
     * @see #getType()
     * @generated
     */
    void setType(OpcType value);

} // ItemType
