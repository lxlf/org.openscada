/**
 */
package org.openscada.configuration.snmp.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.scada.configuration.infrastructure.provider.DeviceItemProvider;
import org.openscada.configuration.snmp.SnmpDevice;
import org.openscada.configuration.snmp.SnmpFactory;
import org.openscada.configuration.snmp.SnmpPackage;

/**
 * This is the item provider adapter for a {@link org.openscada.configuration.snmp.SnmpDevice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SnmpDeviceItemProvider
    extends DeviceItemProvider
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpDeviceItemProvider(AdapterFactory adapterFactory)
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

            addCommunityPropertyDescriptor(object);
            addVersionPropertyDescriptor(object);
            addProtocolPropertyDescriptor(object);
            addPortPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Community feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCommunityPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SnmpDevice_community_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SnmpDevice_community_feature", "_UI_SnmpDevice_type"),
                 SnmpPackage.Literals.SNMP_DEVICE__COMMUNITY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVersionPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SnmpDevice_version_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SnmpDevice_version_feature", "_UI_SnmpDevice_type"),
                 SnmpPackage.Literals.SNMP_DEVICE__VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
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
                 getString("_UI_SnmpDevice_protocol_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SnmpDevice_protocol_feature", "_UI_SnmpDevice_type"),
                 SnmpPackage.Literals.SNMP_DEVICE__PROTOCOL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
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
                 getString("_UI_SnmpDevice_port_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SnmpDevice_port_feature", "_UI_SnmpDevice_type"),
                 SnmpPackage.Literals.SNMP_DEVICE__PORT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
            childrenFeatures.add(SnmpPackage.Literals.SNMP_DEVICE__MIBS);
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
     * This returns SnmpDevice.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SnmpDevice"));
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
        String label = ((SnmpDevice)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_SnmpDevice_type") :
            getString("_UI_SnmpDevice_type") + " " + label;
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

        switch (notification.getFeatureID(SnmpDevice.class))
        {
            case SnmpPackage.SNMP_DEVICE__COMMUNITY:
            case SnmpPackage.SNMP_DEVICE__VERSION:
            case SnmpPackage.SNMP_DEVICE__PROTOCOL:
            case SnmpPackage.SNMP_DEVICE__PORT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SnmpPackage.SNMP_DEVICE__MIBS:
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
                (SnmpPackage.Literals.SNMP_DEVICE__MIBS,
                 SnmpFactory.eINSTANCE.createStaticMibName()));

        newChildDescriptors.add
            (createChildParameter
                (SnmpPackage.Literals.SNMP_DEVICE__MIBS,
                 SnmpFactory.eINSTANCE.createMibDir()));

        newChildDescriptors.add
            (createChildParameter
                (SnmpPackage.Literals.SNMP_DEVICE__MIBS,
                 SnmpFactory.eINSTANCE.createRecursiveMibDir()));
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
        return SnmpEditPlugin.INSTANCE;
    }

}
