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

import org.eclipse.emf.ecore.resource.Resource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File System Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This source resolves the URL during configuration time and includes the resource into the deployment package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opcxml.FileSystemSource#getLocalWsdlUrl <em>Local Wsdl Url</em>}</li>
 *   <li>{@link org.openscada.configuration.opcxml.FileSystemSource#getOriginalBase <em>Original Base</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.opcxml.OpcxmlPackage#getFileSystemSource()
 * @model
 * @generated
 */
public interface FileSystemSource extends WsdlSource
{
    /**
     * Returns the value of the '<em><b>Local Wsdl Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Wsdl Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Wsdl Url</em>' attribute.
     * @see #setLocalWsdlUrl(String)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getFileSystemSource_LocalWsdlUrl()
     * @model required="true"
     * @generated
     */
    String getLocalWsdlUrl();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.FileSystemSource#getLocalWsdlUrl <em>Local Wsdl Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Wsdl Url</em>' attribute.
     * @see #getLocalWsdlUrl()
     * @generated
     */
    void setLocalWsdlUrl(String value);

    /**
     * Returns the value of the '<em><b>Original Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Original Base</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Original Base</em>' attribute.
     * @see #setOriginalBase(Resource)
     * @see org.openscada.configuration.opcxml.OpcxmlPackage#getFileSystemSource_OriginalBase()
     * @model transient="true"
     * @generated
     */
    Resource getOriginalBase();

    /**
     * Sets the value of the '{@link org.openscada.configuration.opcxml.FileSystemSource#getOriginalBase <em>Original Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Original Base</em>' attribute.
     * @see #getOriginalBase()
     * @generated
     */
    void setOriginalBase(Resource value);

} // FileSystemSource
