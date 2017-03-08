/**
 */
package org.openscada.configuration.opc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.scada.configuration.infrastructure.impl.DeviceImpl;
import org.openscada.configuration.opc.OpcDevice;
import org.openscada.configuration.opc.OpcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opc.impl.OpcDeviceImpl#getClassId <em>Class Id</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.impl.OpcDeviceImpl#getProgId <em>Prog Id</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.impl.OpcDeviceImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.impl.OpcDeviceImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.impl.OpcDeviceImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.impl.OpcDeviceImpl#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.impl.OpcDeviceImpl#getPollRate <em>Poll Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcDeviceImpl extends DeviceImpl implements OpcDevice
{
    /**
     * The default value of the '{@link #getClassId() <em>Class Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassId()
     * @generated
     * @ordered
     */
    protected static final String CLASS_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClassId() <em>Class Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassId()
     * @generated
     * @ordered
     */
    protected String classId = CLASS_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getProgId() <em>Prog Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProgId()
     * @generated
     * @ordered
     */
    protected static final String PROG_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProgId() <em>Prog Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProgId()
     * @generated
     * @ordered
     */
    protected String progId = PROG_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getUser() <em>User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUser()
     * @generated
     * @ordered
     */
    protected static final String USER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUser()
     * @generated
     * @ordered
     */
    protected String user = USER_EDEFAULT;

    /**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected static final String PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected String password = PASSWORD_EDEFAULT;

    /**
     * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected static final String DOMAIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected String domain = DOMAIN_EDEFAULT;

    /**
     * The default value of the '{@link #getReconnectDelay() <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectDelay()
     * @generated
     * @ordered
     */
    protected static final int RECONNECT_DELAY_EDEFAULT = 10000;

    /**
     * The cached value of the '{@link #getReconnectDelay() <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectDelay()
     * @generated
     * @ordered
     */
    protected int reconnectDelay = RECONNECT_DELAY_EDEFAULT;

    /**
     * The default value of the '{@link #getPollRate() <em>Poll Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPollRate()
     * @generated
     * @ordered
     */
    protected static final int POLL_RATE_EDEFAULT = 250;

    /**
     * The cached value of the '{@link #getPollRate() <em>Poll Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPollRate()
     * @generated
     * @ordered
     */
    protected int pollRate = POLL_RATE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcDeviceImpl()
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
        return OpcPackage.Literals.OPC_DEVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getClassId()
    {
        return classId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClassId(String newClassId)
    {
        String oldClassId = classId;
        classId = newClassId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcPackage.OPC_DEVICE__CLASS_ID, oldClassId, classId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProgId()
    {
        return progId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProgId(String newProgId)
    {
        String oldProgId = progId;
        progId = newProgId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcPackage.OPC_DEVICE__PROG_ID, oldProgId, progId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUser()
    {
        return user;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUser(String newUser)
    {
        String oldUser = user;
        user = newUser;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcPackage.OPC_DEVICE__USER, oldUser, user));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassword(String newPassword)
    {
        String oldPassword = password;
        password = newPassword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcPackage.OPC_DEVICE__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDomain()
    {
        return domain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDomain(String newDomain)
    {
        String oldDomain = domain;
        domain = newDomain;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcPackage.OPC_DEVICE__DOMAIN, oldDomain, domain));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getReconnectDelay()
    {
        return reconnectDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReconnectDelay(int newReconnectDelay)
    {
        int oldReconnectDelay = reconnectDelay;
        reconnectDelay = newReconnectDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcPackage.OPC_DEVICE__RECONNECT_DELAY, oldReconnectDelay, reconnectDelay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPollRate()
    {
        return pollRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPollRate(int newPollRate)
    {
        int oldPollRate = pollRate;
        pollRate = newPollRate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcPackage.OPC_DEVICE__POLL_RATE, oldPollRate, pollRate));
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
            case OpcPackage.OPC_DEVICE__CLASS_ID:
                return getClassId();
            case OpcPackage.OPC_DEVICE__PROG_ID:
                return getProgId();
            case OpcPackage.OPC_DEVICE__USER:
                return getUser();
            case OpcPackage.OPC_DEVICE__PASSWORD:
                return getPassword();
            case OpcPackage.OPC_DEVICE__DOMAIN:
                return getDomain();
            case OpcPackage.OPC_DEVICE__RECONNECT_DELAY:
                return getReconnectDelay();
            case OpcPackage.OPC_DEVICE__POLL_RATE:
                return getPollRate();
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
            case OpcPackage.OPC_DEVICE__CLASS_ID:
                setClassId((String)newValue);
                return;
            case OpcPackage.OPC_DEVICE__PROG_ID:
                setProgId((String)newValue);
                return;
            case OpcPackage.OPC_DEVICE__USER:
                setUser((String)newValue);
                return;
            case OpcPackage.OPC_DEVICE__PASSWORD:
                setPassword((String)newValue);
                return;
            case OpcPackage.OPC_DEVICE__DOMAIN:
                setDomain((String)newValue);
                return;
            case OpcPackage.OPC_DEVICE__RECONNECT_DELAY:
                setReconnectDelay((Integer)newValue);
                return;
            case OpcPackage.OPC_DEVICE__POLL_RATE:
                setPollRate((Integer)newValue);
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
            case OpcPackage.OPC_DEVICE__CLASS_ID:
                setClassId(CLASS_ID_EDEFAULT);
                return;
            case OpcPackage.OPC_DEVICE__PROG_ID:
                setProgId(PROG_ID_EDEFAULT);
                return;
            case OpcPackage.OPC_DEVICE__USER:
                setUser(USER_EDEFAULT);
                return;
            case OpcPackage.OPC_DEVICE__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case OpcPackage.OPC_DEVICE__DOMAIN:
                setDomain(DOMAIN_EDEFAULT);
                return;
            case OpcPackage.OPC_DEVICE__RECONNECT_DELAY:
                setReconnectDelay(RECONNECT_DELAY_EDEFAULT);
                return;
            case OpcPackage.OPC_DEVICE__POLL_RATE:
                setPollRate(POLL_RATE_EDEFAULT);
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
            case OpcPackage.OPC_DEVICE__CLASS_ID:
                return CLASS_ID_EDEFAULT == null ? classId != null : !CLASS_ID_EDEFAULT.equals(classId);
            case OpcPackage.OPC_DEVICE__PROG_ID:
                return PROG_ID_EDEFAULT == null ? progId != null : !PROG_ID_EDEFAULT.equals(progId);
            case OpcPackage.OPC_DEVICE__USER:
                return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
            case OpcPackage.OPC_DEVICE__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case OpcPackage.OPC_DEVICE__DOMAIN:
                return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
            case OpcPackage.OPC_DEVICE__RECONNECT_DELAY:
                return reconnectDelay != RECONNECT_DELAY_EDEFAULT;
            case OpcPackage.OPC_DEVICE__POLL_RATE:
                return pollRate != POLL_RATE_EDEFAULT;
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
        result.append(" (classId: ");
        result.append(classId);
        result.append(", progId: ");
        result.append(progId);
        result.append(", user: ");
        result.append(user);
        result.append(", password: ");
        result.append(password);
        result.append(", domain: ");
        result.append(domain);
        result.append(", reconnectDelay: ");
        result.append(reconnectDelay);
        result.append(", pollRate: ");
        result.append(pollRate);
        result.append(')');
        return result.toString();
    }

} //OpcDeviceImpl
