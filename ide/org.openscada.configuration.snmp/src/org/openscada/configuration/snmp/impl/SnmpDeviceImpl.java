/**
 */
package org.openscada.configuration.snmp.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.scada.configuration.infrastructure.impl.DeviceImpl;
import org.openscada.configuration.snmp.MibsType;
import org.openscada.configuration.snmp.SnmpDevice;
import org.openscada.configuration.snmp.SnmpPackage;
import org.openscada.configuration.snmp.SnmpVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.snmp.impl.SnmpDeviceImpl#getCommunity <em>Community</em>}</li>
 *   <li>{@link org.openscada.configuration.snmp.impl.SnmpDeviceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openscada.configuration.snmp.impl.SnmpDeviceImpl#getMibs <em>Mibs</em>}</li>
 *   <li>{@link org.openscada.configuration.snmp.impl.SnmpDeviceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.openscada.configuration.snmp.impl.SnmpDeviceImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SnmpDeviceImpl extends DeviceImpl implements SnmpDevice
{
    /**
     * The default value of the '{@link #getCommunity() <em>Community</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommunity()
     * @generated
     * @ordered
     */
    protected static final String COMMUNITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCommunity() <em>Community</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommunity()
     * @generated
     * @ordered
     */
    protected String community = COMMUNITY_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final SnmpVersion VERSION_EDEFAULT = SnmpVersion.V1;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected SnmpVersion version = VERSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getMibs() <em>Mibs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMibs()
     * @generated
     * @ordered
     */
    protected EList<MibsType> mibs;

    /**
     * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtocol()
     * @generated
     * @ordered
     */
    protected static final String PROTOCOL_EDEFAULT = "udp";

    /**
     * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtocol()
     * @generated
     * @ordered
     */
    protected String protocol = PROTOCOL_EDEFAULT;

    /**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected static final int PORT_EDEFAULT = 161;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected int port = PORT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SnmpDeviceImpl()
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
        return SnmpPackage.Literals.SNMP_DEVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCommunity()
    {
        return community;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCommunity(String newCommunity)
    {
        String oldCommunity = community;
        community = newCommunity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SnmpPackage.SNMP_DEVICE__COMMUNITY, oldCommunity, community));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SnmpVersion getVersion()
    {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(SnmpVersion newVersion)
    {
        SnmpVersion oldVersion = version;
        version = newVersion == null ? VERSION_EDEFAULT : newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SnmpPackage.SNMP_DEVICE__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MibsType> getMibs()
    {
        if (mibs == null)
        {
            mibs = new EObjectContainmentEList<MibsType>(MibsType.class, this, SnmpPackage.SNMP_DEVICE__MIBS);
        }
        return mibs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProtocol()
    {
        return protocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProtocol(String newProtocol)
    {
        String oldProtocol = protocol;
        protocol = newProtocol;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SnmpPackage.SNMP_DEVICE__PROTOCOL, oldProtocol, protocol));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPort()
    {
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPort(int newPort)
    {
        int oldPort = port;
        port = newPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SnmpPackage.SNMP_DEVICE__PORT, oldPort, port));
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
            case SnmpPackage.SNMP_DEVICE__MIBS:
                return ((InternalEList<?>)getMibs()).basicRemove(otherEnd, msgs);
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
            case SnmpPackage.SNMP_DEVICE__COMMUNITY:
                return getCommunity();
            case SnmpPackage.SNMP_DEVICE__VERSION:
                return getVersion();
            case SnmpPackage.SNMP_DEVICE__MIBS:
                return getMibs();
            case SnmpPackage.SNMP_DEVICE__PROTOCOL:
                return getProtocol();
            case SnmpPackage.SNMP_DEVICE__PORT:
                return getPort();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case SnmpPackage.SNMP_DEVICE__COMMUNITY:
                setCommunity((String)newValue);
                return;
            case SnmpPackage.SNMP_DEVICE__VERSION:
                setVersion((SnmpVersion)newValue);
                return;
            case SnmpPackage.SNMP_DEVICE__MIBS:
                getMibs().clear();
                getMibs().addAll((Collection<? extends MibsType>)newValue);
                return;
            case SnmpPackage.SNMP_DEVICE__PROTOCOL:
                setProtocol((String)newValue);
                return;
            case SnmpPackage.SNMP_DEVICE__PORT:
                setPort((Integer)newValue);
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
            case SnmpPackage.SNMP_DEVICE__COMMUNITY:
                setCommunity(COMMUNITY_EDEFAULT);
                return;
            case SnmpPackage.SNMP_DEVICE__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case SnmpPackage.SNMP_DEVICE__MIBS:
                getMibs().clear();
                return;
            case SnmpPackage.SNMP_DEVICE__PROTOCOL:
                setProtocol(PROTOCOL_EDEFAULT);
                return;
            case SnmpPackage.SNMP_DEVICE__PORT:
                setPort(PORT_EDEFAULT);
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
            case SnmpPackage.SNMP_DEVICE__COMMUNITY:
                return COMMUNITY_EDEFAULT == null ? community != null : !COMMUNITY_EDEFAULT.equals(community);
            case SnmpPackage.SNMP_DEVICE__VERSION:
                return version != VERSION_EDEFAULT;
            case SnmpPackage.SNMP_DEVICE__MIBS:
                return mibs != null && !mibs.isEmpty();
            case SnmpPackage.SNMP_DEVICE__PROTOCOL:
                return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
            case SnmpPackage.SNMP_DEVICE__PORT:
                return port != PORT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (community: ");
        result.append(community);
        result.append(", version: ");
        result.append(version);
        result.append(", protocol: ");
        result.append(protocol);
        result.append(", port: ");
        result.append(port);
        result.append(')');
        return result.toString();
    }

} //SnmpDeviceImpl
