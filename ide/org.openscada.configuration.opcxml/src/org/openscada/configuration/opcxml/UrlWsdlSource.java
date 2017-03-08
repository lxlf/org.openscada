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
 * A representation of the model object '<em><b>Url Wsdl Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.UrlWsdlSource#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opcxml.OpcxmlPackage#getUrlWsdlSource()
 * @model
 * @generated
 */
public interface UrlWsdlSource extends WsdlSource
{
    /**
     * Returns the value of the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Url</em>' attribute.
     * @see #setUrl(String)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getUrlWsdlSource_Url()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     * @generated
     */
    String getUrl();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.UrlWsdlSource#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(String value);

} // UrlWsdlSource
