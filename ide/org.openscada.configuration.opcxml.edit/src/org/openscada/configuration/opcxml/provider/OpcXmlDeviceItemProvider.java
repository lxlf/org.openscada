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
package org.openscada.configuration.opcxml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.scada.configuration.infrastructure.provider.DeviceItemProvider;

import org.openscada.configuration.opcxml.OpcXmlDevice;
import org.openscada.configuration.opcxml.OpcxmlFactory;
import org.openscada.configuration.opcxml.OpcxmlPackage;

/**
 * This is the item provider adapter for a {@link org.openscada.configuration.opcxml.OpcXmlDevice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcXmlDeviceItemProvider extends DeviceItemProvider
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcXmlDeviceItemProvider(AdapterFactory adapterFactory)
    {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
    {
        if (itemPropertyDescriptors == null)
        {
            super.getPropertyDescriptors(object);

            addPathPropertyDescriptor(object);
            addPortPropertyDescriptor(object);
            addProtocolPropertyDescriptor(object);
            addWsdlSourcePropertyDescriptor(object);
            addSettingsPropertyDescriptor(object);
            addCredentialsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPathPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcXmlDevice_path_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcXmlDevice_path_feature", "_UI_OpcXmlDevice_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.OPC_XML_DEVICE__PATH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 getString("_UI_connectionPropertyCategory"), //$NON-NLS-1$
                 null));
    }

    /**
     * This adds a property descriptor for the Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPortPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcXmlDevice_port_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcXmlDevice_port_feature", "_UI_OpcXmlDevice_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.OPC_XML_DEVICE__PORT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 getString("_UI_connectionPropertyCategory"), //$NON-NLS-1$
                 null));
    }

    /**
     * This adds a property descriptor for the Protocol feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProtocolPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcXmlDevice_protocol_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcXmlDevice_protocol_feature", "_UI_OpcXmlDevice_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.OPC_XML_DEVICE__PROTOCOL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 getString("_UI_connectionPropertyCategory"), //$NON-NLS-1$
                 null));
    }

    /**
     * This adds a property descriptor for the Wsdl Source feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWsdlSourcePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcXmlDevice_wsdlSource_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcXmlDevice_wsdlSource_feature", "_UI_OpcXmlDevice_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.OPC_XML_DEVICE__WSDL_SOURCE,
                 true,
                 false,
                 true,
                 null,
                 getString("_UI_connectionPropertyCategory"), //$NON-NLS-1$
                 null));
    }

    /**
     * This adds a property descriptor for the Settings feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSettingsPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcXmlDevice_settings_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcXmlDevice_settings_feature", "_UI_OpcXmlDevice_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.OPC_XML_DEVICE__SETTINGS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Credentials feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCredentialsPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcXmlDevice_credentials_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcXmlDevice_credentials_feature", "_UI_OpcXmlDevice_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.OPC_XML_DEVICE__CREDENTIALS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
    {
        if (childrenFeatures == null)
        {
            super.getChildrenFeatures(object);
            childrenFeatures.add(OpcxmlPackage.Literals.OPC_XML_DEVICE__SETTINGS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child)
    {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns OpcXmlDevice.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/OpcXmlDevice")); //$NON-NLS-1$
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage() 
    {
        return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object)
    {
        String label = ((OpcXmlDevice)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_OpcXmlDevice_type") : //$NON-NLS-1$
            getString("_UI_OpcXmlDevice_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
    }
    

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification)
    {
        updateChildren(notification);

        switch (notification.getFeatureID(OpcXmlDevice.class))
        {
            case OpcxmlPackage.OPC_XML_DEVICE__PATH:
            case OpcxmlPackage.OPC_XML_DEVICE__PORT:
            case OpcxmlPackage.OPC_XML_DEVICE__PROTOCOL:
            case OpcxmlPackage.OPC_XML_DEVICE__CREDENTIALS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case OpcxmlPackage.OPC_XML_DEVICE__SETTINGS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
    {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (OpcxmlPackage.Literals.OPC_XML_DEVICE__SETTINGS,
                 OpcxmlFactory.eINSTANCE.createConnectionSettings()));
    }

}
