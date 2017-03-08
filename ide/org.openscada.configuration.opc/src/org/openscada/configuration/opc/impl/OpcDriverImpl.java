/**
 */
package org.openscada.configuration.opc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scada.configuration.world.impl.CommonDriverImpl;

import org.openscada.configuration.opc.OpcDriver;
import org.openscada.configuration.opc.OpcPackage;

import org.openscada.da.opc.configuration.RootType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.opc.impl.OpcDriverImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.openscada.configuration.opc.impl.OpcDriverImpl#getSocketTimeout <em>Socket Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcDriverImpl extends CommonDriverImpl implements OpcDriver
{
    /**
     * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoot()
     * @generated
     * @ordered
     */
    protected RootType root;

    /**
     * The default value of the '{@link #getSocketTimeout() <em>Socket Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSocketTimeout()
     * @generated
     * @ordered
     */
    protected static final Integer SOCKET_TIMEOUT_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getSocketTimeout() <em>Socket Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSocketTimeout()
     * @generated
     * @ordered
     */
    protected Integer socketTimeout = SOCKET_TIMEOUT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcDriverImpl()
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
        return OpcPackage.Literals.OPC_DRIVER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RootType getRoot()
    {
        return root;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRoot(RootType newRoot, NotificationChain msgs)
    {
        RootType oldRoot = root;
        root = newRoot;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpcPackage.OPC_DRIVER__ROOT, oldRoot, newRoot);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoot(RootType newRoot)
    {
        if (newRoot != root)
        {
            NotificationChain msgs = null;
            if (root != null)
                msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpcPackage.OPC_DRIVER__ROOT, null, msgs);
            if (newRoot != null)
                msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpcPackage.OPC_DRIVER__ROOT, null, msgs);
            msgs = basicSetRoot(newRoot, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcPackage.OPC_DRIVER__ROOT, newRoot, newRoot));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getSocketTimeout()
    {
        return socketTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSocketTimeout(Integer newSocketTimeout)
    {
        Integer oldSocketTimeout = socketTimeout;
        socketTimeout = newSocketTimeout;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OpcPackage.OPC_DRIVER__SOCKET_TIMEOUT, oldSocketTimeout, socketTimeout));
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
            case OpcPackage.OPC_DRIVER__ROOT:
                return basicSetRoot(null, msgs);
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
            case OpcPackage.OPC_DRIVER__ROOT:
                return getRoot();
            case OpcPackage.OPC_DRIVER__SOCKET_TIMEOUT:
                return getSocketTimeout();
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
            case OpcPackage.OPC_DRIVER__ROOT:
                setRoot((RootType)newValue);
                return;
            case OpcPackage.OPC_DRIVER__SOCKET_TIMEOUT:
                setSocketTimeout((Integer)newValue);
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
            case OpcPackage.OPC_DRIVER__ROOT:
                setRoot((RootType)null);
                return;
            case OpcPackage.OPC_DRIVER__SOCKET_TIMEOUT:
                setSocketTimeout(SOCKET_TIMEOUT_EDEFAULT);
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
            case OpcPackage.OPC_DRIVER__ROOT:
                return root != null;
            case OpcPackage.OPC_DRIVER__SOCKET_TIMEOUT:
                return SOCKET_TIMEOUT_EDEFAULT == null ? socketTimeout != null : !SOCKET_TIMEOUT_EDEFAULT.equals(socketTimeout);
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
        result.append(" (socketTimeout: ");
        result.append(socketTimeout);
        result.append(')');
        return result.toString();
    }

} //OpcDriverImpl
