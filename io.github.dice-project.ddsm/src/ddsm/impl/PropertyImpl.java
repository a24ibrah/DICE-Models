/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.PropertyImpl#getPropertyId <em>Property Id</em>}</li>
 *   <li>{@link ddsm.impl.PropertyImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
    /**
     * The default value of the '{@link #getPropertyId() <em>Property Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertyId()
     * @generated
     * @ordered
     */
    protected static final String PROPERTY_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPropertyId() <em>Property Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertyId()
     * @generated
     * @ordered
     */
    protected String propertyId = PROPERTY_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPropertyId(String newPropertyId) {
        String oldPropertyId = propertyId;
        propertyId = newPropertyId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PROPERTY__PROPERTY_ID, oldPropertyId, propertyId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PROPERTY__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.PROPERTY__PROPERTY_ID:
                return getPropertyId();
            case DdsmPackage.PROPERTY__VALUE:
                return getValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DdsmPackage.PROPERTY__PROPERTY_ID:
                setPropertyId((String)newValue);
                return;
            case DdsmPackage.PROPERTY__VALUE:
                setValue((String)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case DdsmPackage.PROPERTY__PROPERTY_ID:
                setPropertyId(PROPERTY_ID_EDEFAULT);
                return;
            case DdsmPackage.PROPERTY__VALUE:
                setValue(VALUE_EDEFAULT);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DdsmPackage.PROPERTY__PROPERTY_ID:
                return PROPERTY_ID_EDEFAULT == null ? propertyId != null : !PROPERTY_ID_EDEFAULT.equals(propertyId);
            case DdsmPackage.PROPERTY__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (propertyId: ");
        result.append(propertyId);
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //PropertyImpl
