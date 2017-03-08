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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openscada.configuration.opcxml.ConnectionSettings;
import org.openscada.configuration.opcxml.OpcxmlFactory;
import org.openscada.configuration.opcxml.OpcxmlPackage;

/**
 * This is the item provider adapter for a {@link org.openscada.configuration.opcxml.ConnectionSettings} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionSettingsItemProvider 
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionSettingsItemProvider(AdapterFactory adapterFactory)
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

            addServiceNamePropertyDescriptor(object);
            addPortNamePropertyDescriptor(object);
            addTimeoutPropertyDescriptor(object);
            addPollerPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Service Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceNamePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectionSettings_serviceName_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionSettings_serviceName_feature", "_UI_ConnectionSettings_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.CONNECTION_SETTINGS__SERVICE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Port Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPortNamePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectionSettings_portName_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionSettings_portName_feature", "_UI_ConnectionSettings_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.CONNECTION_SETTINGS__PORT_NAME,
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
            childrenFeatures.add(OpcxmlPackage.Literals.CONNECTION_SETTINGS__POLLER);
            childrenFeatures.add(OpcxmlPackage.Literals.CONNECTION_SETTINGS__TYPES);
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
     * This adds a property descriptor for the Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeoutPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectionSettings_timeout_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionSettings_timeout_feature", "_UI_ConnectionSettings_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.CONNECTION_SETTINGS__TIMEOUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Poller feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPollerPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectionSettings_poller_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionSettings_poller_feature", "_UI_ConnectionSettings_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.CONNECTION_SETTINGS__POLLER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns ConnectionSettings.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectionSettings")); //$NON-NLS-1$
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
        String label = ((ConnectionSettings)object).getServiceName();
        return label == null || label.length() == 0 ?
            getString("_UI_ConnectionSettings_type") : //$NON-NLS-1$
            getString("_UI_ConnectionSettings_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(ConnectionSettings.class))
        {
            case OpcxmlPackage.CONNECTION_SETTINGS__SERVICE_NAME:
            case OpcxmlPackage.CONNECTION_SETTINGS__PORT_NAME:
            case OpcxmlPackage.CONNECTION_SETTINGS__TIMEOUT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case OpcxmlPackage.CONNECTION_SETTINGS__POLLER:
            case OpcxmlPackage.CONNECTION_SETTINGS__TYPES:
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
                (OpcxmlPackage.Literals.CONNECTION_SETTINGS__POLLER,
                 OpcxmlFactory.eINSTANCE.createSubscription()));

        newChildDescriptors.add
            (createChildParameter
                (OpcxmlPackage.Literals.CONNECTION_SETTINGS__POLLER,
                 OpcxmlFactory.eINSTANCE.createReadRequestPoller()));

        newChildDescriptors.add
            (createChildParameter
                (OpcxmlPackage.Literals.CONNECTION_SETTINGS__TYPES,
                 OpcxmlFactory.eINSTANCE.createItemType()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator()
    {
        return ((IChildCreationExtender)adapterFactory).getResourceLocator();
    }

}
