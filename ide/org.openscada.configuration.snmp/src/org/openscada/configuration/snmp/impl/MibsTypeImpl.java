/**
 */
package org.openscada.configuration.snmp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openscada.configuration.snmp.MibsType;
import org.openscada.configuration.snmp.SnmpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mibs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.snmp.impl.MibsTypeImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MibsTypeImpl extends MinimalEObjectImpl.Container implements MibsType
{
    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected static final String PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected String path = PATH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MibsTypeImpl()
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
        return SnmpPackage.Literals.MIBS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPath()
    {
        return path;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPath(String newPath)
    {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SnmpPackage.MIBS_TYPE__PATH, oldPath, path));
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
            case SnmpPackage.MIBS_TYPE__PATH:
                return getPath();
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
            case SnmpPackage.MIBS_TYPE__PATH:
                setPath((String)newValue);
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
            case SnmpPackage.MIBS_TYPE__PATH:
                setPath(PATH_EDEFAULT);
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
            case SnmpPackage.MIBS_TYPE__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
        result.append(" (path: ");
        result.append(path);
        result.append(')');
        return result.toString();
    }

} //MibsTypeImpl
