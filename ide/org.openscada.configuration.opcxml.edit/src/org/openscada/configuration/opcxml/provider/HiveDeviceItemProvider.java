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
import org.openscada.configuration.opcxml.HiveDevice;
import org.openscada.configuration.opcxml.OpcxmlFactory;
import org.openscada.configuration.opcxml.OpcxmlPackage;

/**
 * This is the item provider adapter for a {@link org.openscada.configuration.opcxml.HiveDevice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HiveDeviceItemProvider 
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
    public HiveDeviceItemProvider(AdapterFactory adapterFactory)
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

            addIdPropertyDescriptor(object);
            addServerUrlPropertyDescriptor(object);
            addWsdlSourcePropertyDescriptor(object);
            addSettingsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_HiveDevice_id_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_HiveDevice_id_feature", "_UI_HiveDevice_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.HIVE_DEVICE__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Server Url feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServerUrlPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_HiveDevice_serverUrl_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_HiveDevice_serverUrl_feature", "_UI_HiveDevice_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.HIVE_DEVICE__SERVER_URL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
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
                 getString("_UI_HiveDevice_wsdlSource_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_HiveDevice_wsdlSource_feature", "_UI_HiveDevice_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.HIVE_DEVICE__WSDL_SOURCE,
                 true,
                 false,
                 true,
                 null,
                 null,
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
                 getString("_UI_HiveDevice_settings_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_HiveDevice_settings_feature", "_UI_HiveDevice_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 OpcxmlPackage.Literals.HIVE_DEVICE__SETTINGS,
                 true,
                 false,
                 true,
                 null,
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
            childrenFeatures.add(OpcxmlPackage.Literals.HIVE_DEVICE__WSDL_SOURCE);
            childrenFeatures.add(OpcxmlPackage.Literals.HIVE_DEVICE__SETTINGS);
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
     * This returns HiveDevice.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/HiveDevice")); //$NON-NLS-1$
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
        String label = ((HiveDevice)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_HiveDevice_type") : //$NON-NLS-1$
            getString("_UI_HiveDevice_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(HiveDevice.class))
        {
            case OpcxmlPackage.HIVE_DEVICE__ID:
            case OpcxmlPackage.HIVE_DEVICE__SERVER_URL:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case OpcxmlPackage.HIVE_DEVICE__WSDL_SOURCE:
            case OpcxmlPackage.HIVE_DEVICE__SETTINGS:
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
                (OpcxmlPackage.Literals.HIVE_DEVICE__WSDL_SOURCE,
                 OpcxmlFactory.eINSTANCE.createUrlWsdlSource()));

        newChildDescriptors.add
            (createChildParameter
                (OpcxmlPackage.Literals.HIVE_DEVICE__WSDL_SOURCE,
                 OpcxmlFactory.eINSTANCE.createFileSystemSource()));

        newChildDescriptors.add
            (createChildParameter
                (OpcxmlPackage.Literals.HIVE_DEVICE__SETTINGS,
                 OpcxmlFactory.eINSTANCE.createConnectionSettings()));
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
