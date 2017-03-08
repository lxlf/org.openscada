/**
 */
package org.openscada.configuration.opc.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.scada.configuration.infrastructure.provider.DeviceItemProvider;
import org.openscada.configuration.opc.OpcDevice;
import org.openscada.configuration.opc.OpcPackage;

/**
 * This is the item provider adapter for a {@link org.openscada.configuration.opc.OpcDevice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcDeviceItemProvider
    extends DeviceItemProvider
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcDeviceItemProvider(AdapterFactory adapterFactory)
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

            addClassIdPropertyDescriptor(object);
            addProgIdPropertyDescriptor(object);
            addUserPropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
            addDomainPropertyDescriptor(object);
            addReconnectDelayPropertyDescriptor(object);
            addPollRatePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Class Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClassIdPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcDevice_classId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcDevice_classId_feature", "_UI_OpcDevice_type"),
                 OpcPackage.Literals.OPC_DEVICE__CLASS_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Prog Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProgIdPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcDevice_progId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcDevice_progId_feature", "_UI_OpcDevice_type"),
                 OpcPackage.Literals.OPC_DEVICE__PROG_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the User feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUserPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcDevice_user_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcDevice_user_feature", "_UI_OpcDevice_type"),
                 OpcPackage.Literals.OPC_DEVICE__USER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPasswordPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcDevice_password_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcDevice_password_feature", "_UI_OpcDevice_type"),
                 OpcPackage.Literals.OPC_DEVICE__PASSWORD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Domain feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDomainPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcDevice_domain_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcDevice_domain_feature", "_UI_OpcDevice_type"),
                 OpcPackage.Literals.OPC_DEVICE__DOMAIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Reconnect Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReconnectDelayPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcDevice_reconnectDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcDevice_reconnectDelay_feature", "_UI_OpcDevice_type"),
                 OpcPackage.Literals.OPC_DEVICE__RECONNECT_DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Poll Rate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPollRatePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpcDevice_pollRate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OpcDevice_pollRate_feature", "_UI_OpcDevice_type"),
                 OpcPackage.Literals.OPC_DEVICE__POLL_RATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns OpcDevice.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/OpcDevice"));
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
        String label = ((OpcDevice)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_OpcDevice_type") :
            getString("_UI_OpcDevice_type") + " " + label;
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

        switch (notification.getFeatureID(OpcDevice.class))
        {
            case OpcPackage.OPC_DEVICE__CLASS_ID:
            case OpcPackage.OPC_DEVICE__PROG_ID:
            case OpcPackage.OPC_DEVICE__USER:
            case OpcPackage.OPC_DEVICE__PASSWORD:
            case OpcPackage.OPC_DEVICE__DOMAIN:
            case OpcPackage.OPC_DEVICE__RECONNECT_DELAY:
            case OpcPackage.OPC_DEVICE__POLL_RATE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
        return OpcEditPlugin.INSTANCE;
    }

}
