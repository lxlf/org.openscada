/**
 */
package org.openscada.configuration.snmp.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.openscada.configuration.snmp.SnmpPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SnmpXMLProcessor extends XMLProcessor
{

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpXMLProcessor()
    {
        super((EPackage.Registry.INSTANCE));
        SnmpPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the SnmpResourceFactoryImpl factory.
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
            registrations.put(XML_EXTENSION, new SnmpResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new SnmpResourceFactoryImpl());
        }
        return registrations;
    }

} //SnmpXMLProcessor
