/**
 */
package org.openscada.configuration.opc.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.openscada.configuration.opc.OpcPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcXMLProcessor extends XMLProcessor
{

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcXMLProcessor()
    {
        super((EPackage.Registry.INSTANCE));
        OpcPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the OpcResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations()
    {
        if (registrations == null)
        {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new OpcResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new OpcResourceFactoryImpl());
        }
        return registrations;
    }

} //OpcXMLProcessor
