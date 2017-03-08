/**
 */
package org.openscada.configuration.snmp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.scada.configuration.world.impl.CommonDriverImpl;
import org.openscada.configuration.snmp.SnmpDriver;
import org.openscada.configuration.snmp.SnmpPackage;
import org.openscada.da.snmp.configuration.ConfigurationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.snmp.impl.SnmpDriverImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SnmpDriverImpl extends CommonDriverImpl implements SnmpDriver
{
    /**
     * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfiguration()
     * @generated
     * @ordered
     */
    protected ConfigurationType configuration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SnmpDriverImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return SnmpPackage.Literals.SNMP_DRIVER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigurationType getConfiguration()
    {
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConfiguration(ConfigurationType newConfiguration, NotificationChain msgs)
    {
        ConfigurationType oldConfiguration = configuration;
        configuration = newConfiguration;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SnmpPackage.SNMP_DRIVER__CONFIGURATION, oldConfiguration, newConfiguration);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfiguration(ConfigurationType newConfiguration)
    {
        if (newConfiguration != configuration)
        {
            NotificationChain msgs = null;
            if (configuration != null)
                msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SnmpPackage.SNMP_DRIVER__CONFIGURATION, null, msgs);
            if (newConfiguration != null)
                msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SnmpPackage.SNMP_DRIVER__CONFIGURATION, null, msgs);
            msgs = basicSetConfiguration(newConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SnmpPackage.SNMP_DRIVER__CONFIGURATION, newConfiguration, newConfiguration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case SnmpPackage.SNMP_DRIVER__CONFIGURATION:
                return basicSetConfiguration(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case SnmpPackage.SNMP_DRIVER__CONFIGURATION:
                return getConfiguration();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case SnmpPackage.SNMP_DRIVER__CONFIGURATION:
                setConfiguration((ConfigurationType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID)
    {
        switch (featureID)
        {
            case SnmpPackage.SNMP_DRIVER__CONFIGURATION:
                setConfiguration((ConfigurationType)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID)
    {
        switch (featureID)
        {
            case SnmpPackage.SNMP_DRIVER__CONFIGURATION:
                return configuration != null;
        }
        return super.eIsSet(featureID);
    }

} //SnmpDriverImpl
