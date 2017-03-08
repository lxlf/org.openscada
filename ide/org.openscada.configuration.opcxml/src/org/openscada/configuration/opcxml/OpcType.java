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
package org.openscada.configuration.opcxml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Opc Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.opcxml.OpcxmlPackage#getOpcType()
 * @model
 * @generated
 */
public enum OpcType implements Enumerator
{
    /**
     * The '<em><b>String</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRING_VALUE
     * @generated
     * @ordered
     */
    STRING(0, "string", "string"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Boolean</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOOLEAN_VALUE
     * @generated
     * @ordered
     */
    BOOLEAN(1, "boolean", "boolean"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Float</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLOAT_VALUE
     * @generated
     * @ordered
     */
    FLOAT(2, "float", "float"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Double</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_VALUE
     * @generated
     * @ordered
     */
    DOUBLE(3, "double", "double"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Decimal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DECIMAL_VALUE
     * @generated
     * @ordered
     */
    DECIMAL(4, "decimal", "decimal"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Long</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LONG_VALUE
     * @generated
     * @ordered
     */
    LONG(5, "long", "long"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Int</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INT_VALUE
     * @generated
     * @ordered
     */
    INT(6, "int", "int"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Short</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHORT_VALUE
     * @generated
     * @ordered
     */
    SHORT(7, "short", "short"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Byte</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BYTE_VALUE
     * @generated
     * @ordered
     */
    BYTE(8, "byte", "byte"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Unsigned Long</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNSIGNED_LONG_VALUE
     * @generated
     * @ordered
     */
    UNSIGNED_LONG(9, "unsignedLong", "unsignedLong"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Unsigned Int</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNSIGNED_INT_VALUE
     * @generated
     * @ordered
     */
    UNSIGNED_INT(10, "unsignedInt", "unsignedInt"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Unsigned Short</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNSIGNED_SHORT_VALUE
     * @generated
     * @ordered
     */
    UNSIGNED_SHORT(11, "unsignedShort", "unsignedShort"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Unsigned Byte</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNSIGNED_BYTE_VALUE
     * @generated
     * @ordered
     */
    UNSIGNED_BYTE(12, "unsignedByte", "unsignedByte"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Base64 Binary</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BASE64_BINARY_VALUE
     * @generated
     * @ordered
     */
    BASE64_BINARY(13, "base64Binary", "base64Binary"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Date Time</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATE_TIME_VALUE
     * @generated
     * @ordered
     */
    DATE_TIME(14, "dateTime", "dateTime"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Time</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TIME_VALUE
     * @generated
     * @ordered
     */
    TIME(15, "time", "time"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Date</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATE_VALUE
     * @generated
     * @ordered
     */
    DATE(16, "date", "date"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Duration</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DURATION_VALUE
     * @generated
     * @ordered
     */
    DURATION(17, "duration", "duration"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>QName</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QNAME_VALUE
     * @generated
     * @ordered
     */
    QNAME(18, "QName", "QName"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Any Type</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_ANY_TYPE_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_ANY_TYPE(19, "ArrayOfAnyType", "ArrayOfAnyType"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of String</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_STRING_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_STRING(20, "ArrayOfString", "ArrayOfString"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Boolean</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_BOOLEAN_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_BOOLEAN(21, "ArrayOfBoolean", "ArrayOfBoolean"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Float</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_FLOAT_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_FLOAT(22, "ArrayOfFloat", "ArrayOfFloat"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Double</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_DOUBLE_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_DOUBLE(23, "ArrayOfDouble", "ArrayOfDouble"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Decimal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_DECIMAL_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_DECIMAL(24, "ArrayOfDecimal", "ArrayOfDecimal"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Long</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_LONG_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_LONG(25, "ArrayOfLong", "ArrayOfLong"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Int</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_INT_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_INT(26, "ArrayOfInt", "ArrayOfInt"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Short</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_SHORT_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_SHORT(27, "ArrayOfShort", "ArrayOfShort"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Byte</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_BYTE_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_BYTE(28, "ArrayOfByte", "ArrayOfByte"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Unsigned Long</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_UNSIGNED_LONG_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_UNSIGNED_LONG(29, "ArrayOfUnsignedLong", "ArrayOfUnsignedLong"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Unsigned Int</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_UNSIGNED_INT_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_UNSIGNED_INT(30, "ArrayOfUnsignedInt", "ArrayOfUnsignedInt"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Unsigned Short</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_UNSIGNED_SHORT_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_UNSIGNED_SHORT(31, "ArrayOfUnsignedShort", "ArrayOfUnsignedShort"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Unsigned Byte</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_UNSIGNED_BYTE_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_UNSIGNED_BYTE(32, "ArrayOfUnsignedByte", "ArrayOfUnsignedByte"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Array Of Date Time</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_DATE_TIME_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF_DATE_TIME(33, "ArrayOfDateTime", "ArrayOfDateTime"); //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>String</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STRING
     * @model name="string"
     * @generated
     * @ordered
     */
    public static final int STRING_VALUE = 0;

    /**
     * The '<em><b>Boolean</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BOOLEAN
     * @model name="boolean"
     * @generated
     * @ordered
     */
    public static final int BOOLEAN_VALUE = 1;

    /**
     * The '<em><b>Float</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FLOAT
     * @model name="float"
     * @generated
     * @ordered
     */
    public static final int FLOAT_VALUE = 2;

    /**
     * The '<em><b>Double</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DOUBLE
     * @model name="double"
     * @generated
     * @ordered
     */
    public static final int DOUBLE_VALUE = 3;

    /**
     * The '<em><b>Decimal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Decimal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DECIMAL
     * @model name="decimal"
     * @generated
     * @ordered
     */
    public static final int DECIMAL_VALUE = 4;

    /**
     * The '<em><b>Long</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LONG
     * @model name="long"
     * @generated
     * @ordered
     */
    public static final int LONG_VALUE = 5;

    /**
     * The '<em><b>Int</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INT
     * @model name="int"
     * @generated
     * @ordered
     */
    public static final int INT_VALUE = 6;

    /**
     * The '<em><b>Short</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SHORT
     * @model name="short"
     * @generated
     * @ordered
     */
    public static final int SHORT_VALUE = 7;

    /**
     * The '<em><b>Byte</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Byte</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BYTE
     * @model name="byte"
     * @generated
     * @ordered
     */
    public static final int BYTE_VALUE = 8;

    /**
     * The '<em><b>Unsigned Long</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unsigned Long</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNSIGNED_LONG
     * @model name="unsignedLong"
     * @generated
     * @ordered
     */
    public static final int UNSIGNED_LONG_VALUE = 9;

    /**
     * The '<em><b>Unsigned Int</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unsigned Int</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNSIGNED_INT
     * @model name="unsignedInt"
     * @generated
     * @ordered
     */
    public static final int UNSIGNED_INT_VALUE = 10;

    /**
     * The '<em><b>Unsigned Short</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unsigned Short</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNSIGNED_SHORT
     * @model name="unsignedShort"
     * @generated
     * @ordered
     */
    public static final int UNSIGNED_SHORT_VALUE = 11;

    /**
     * The '<em><b>Unsigned Byte</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unsigned Byte</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNSIGNED_BYTE
     * @model name="unsignedByte"
     * @generated
     * @ordered
     */
    public static final int UNSIGNED_BYTE_VALUE = 12;

    /**
     * The '<em><b>Base64 Binary</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Base64 Binary</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BASE64_BINARY
     * @model name="base64Binary"
     * @generated
     * @ordered
     */
    public static final int BASE64_BINARY_VALUE = 13;

    /**
     * The '<em><b>Date Time</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Date Time</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DATE_TIME
     * @model name="dateTime"
     * @generated
     * @ordered
     */
    public static final int DATE_TIME_VALUE = 14;

    /**
     * The '<em><b>Time</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TIME
     * @model name="time"
     * @generated
     * @ordered
     */
    public static final int TIME_VALUE = 15;

    /**
     * The '<em><b>Date</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DATE
     * @model name="date"
     * @generated
     * @ordered
     */
    public static final int DATE_VALUE = 16;

    /**
     * The '<em><b>Duration</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Duration</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DURATION
     * @model name="duration"
     * @generated
     * @ordered
     */
    public static final int DURATION_VALUE = 17;

    /**
     * The '<em><b>QName</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>QName</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QNAME
     * @model name="QName"
     * @generated
     * @ordered
     */
    public static final int QNAME_VALUE = 18;

    /**
     * The '<em><b>Array Of Any Type</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Any Type</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_ANY_TYPE
     * @model name="ArrayOfAnyType"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_ANY_TYPE_VALUE = 19;

    /**
     * The '<em><b>Array Of String</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of String</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_STRING
     * @model name="ArrayOfString"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_STRING_VALUE = 20;

    /**
     * The '<em><b>Array Of Boolean</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Boolean</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_BOOLEAN
     * @model name="ArrayOfBoolean"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_BOOLEAN_VALUE = 21;

    /**
     * The '<em><b>Array Of Float</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Float</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_FLOAT
     * @model name="ArrayOfFloat"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_FLOAT_VALUE = 22;

    /**
     * The '<em><b>Array Of Double</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Double</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_DOUBLE
     * @model name="ArrayOfDouble"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_DOUBLE_VALUE = 23;

    /**
     * The '<em><b>Array Of Decimal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Decimal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_DECIMAL
     * @model name="ArrayOfDecimal"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_DECIMAL_VALUE = 24;

    /**
     * The '<em><b>Array Of Long</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Long</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_LONG
     * @model name="ArrayOfLong"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_LONG_VALUE = 25;

    /**
     * The '<em><b>Array Of Int</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Int</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_INT
     * @model name="ArrayOfInt"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_INT_VALUE = 26;

    /**
     * The '<em><b>Array Of Short</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Short</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_SHORT
     * @model name="ArrayOfShort"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_SHORT_VALUE = 27;

    /**
     * The '<em><b>Array Of Byte</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Byte</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_BYTE
     * @model name="ArrayOfByte"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_BYTE_VALUE = 28;

    /**
     * The '<em><b>Array Of Unsigned Long</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Unsigned Long</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_UNSIGNED_LONG
     * @model name="ArrayOfUnsignedLong"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_UNSIGNED_LONG_VALUE = 29;

    /**
     * The '<em><b>Array Of Unsigned Int</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Unsigned Int</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_UNSIGNED_INT
     * @model name="ArrayOfUnsignedInt"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_UNSIGNED_INT_VALUE = 30;

    /**
     * The '<em><b>Array Of Unsigned Short</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Unsigned Short</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_UNSIGNED_SHORT
     * @model name="ArrayOfUnsignedShort"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_UNSIGNED_SHORT_VALUE = 31;

    /**
     * The '<em><b>Array Of Unsigned Byte</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Unsigned Byte</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_UNSIGNED_BYTE
     * @model name="ArrayOfUnsignedByte"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_UNSIGNED_BYTE_VALUE = 32;

    /**
     * The '<em><b>Array Of Date Time</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of Date Time</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_DATE_TIME
     * @model name="ArrayOfDateTime"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_DATE_TIME_VALUE = 33;

    /**
     * An array of all the '<em><b>Opc Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OpcType[] VALUES_ARRAY =
        new OpcType[]
        {
            STRING,
            BOOLEAN,
            FLOAT,
            DOUBLE,
            DECIMAL,
            LONG,
            INT,
            SHORT,
            BYTE,
            UNSIGNED_LONG,
            UNSIGNED_INT,
            UNSIGNED_SHORT,
            UNSIGNED_BYTE,
            BASE64_BINARY,
            DATE_TIME,
            TIME,
            DATE,
            DURATION,
            QNAME,
            ARRAY_OF_ANY_TYPE,
            ARRAY_OF_STRING,
            ARRAY_OF_BOOLEAN,
            ARRAY_OF_FLOAT,
            ARRAY_OF_DOUBLE,
            ARRAY_OF_DECIMAL,
            ARRAY_OF_LONG,
            ARRAY_OF_INT,
            ARRAY_OF_SHORT,
            ARRAY_OF_BYTE,
            ARRAY_OF_UNSIGNED_LONG,
            ARRAY_OF_UNSIGNED_INT,
            ARRAY_OF_UNSIGNED_SHORT,
            ARRAY_OF_UNSIGNED_BYTE,
            ARRAY_OF_DATE_TIME,
        };

    /**
     * A public read-only list of all the '<em><b>Opc Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<OpcType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Opc Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OpcType get(String literal)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            OpcType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Opc Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OpcType getByName(String name)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            OpcType result = VALUES_ARRAY[i];
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Opc Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OpcType get(int value)
    {
        switch (value)
        {
            case STRING_VALUE: return STRING;
            case BOOLEAN_VALUE: return BOOLEAN;
            case FLOAT_VALUE: return FLOAT;
            case DOUBLE_VALUE: return DOUBLE;
            case DECIMAL_VALUE: return DECIMAL;
            case LONG_VALUE: return LONG;
            case INT_VALUE: return INT;
            case SHORT_VALUE: return SHORT;
            case BYTE_VALUE: return BYTE;
            case UNSIGNED_LONG_VALUE: return UNSIGNED_LONG;
            case UNSIGNED_INT_VALUE: return UNSIGNED_INT;
            case UNSIGNED_SHORT_VALUE: return UNSIGNED_SHORT;
            case UNSIGNED_BYTE_VALUE: return UNSIGNED_BYTE;
            case BASE64_BINARY_VALUE: return BASE64_BINARY;
            case DATE_TIME_VALUE: return DATE_TIME;
            case TIME_VALUE: return TIME;
            case DATE_VALUE: return DATE;
            case DURATION_VALUE: return DURATION;
            case QNAME_VALUE: return QNAME;
            case ARRAY_OF_ANY_TYPE_VALUE: return ARRAY_OF_ANY_TYPE;
            case ARRAY_OF_STRING_VALUE: return ARRAY_OF_STRING;
            case ARRAY_OF_BOOLEAN_VALUE: return ARRAY_OF_BOOLEAN;
            case ARRAY_OF_FLOAT_VALUE: return ARRAY_OF_FLOAT;
            case ARRAY_OF_DOUBLE_VALUE: return ARRAY_OF_DOUBLE;
            case ARRAY_OF_DECIMAL_VALUE: return ARRAY_OF_DECIMAL;
            case ARRAY_OF_LONG_VALUE: return ARRAY_OF_LONG;
            case ARRAY_OF_INT_VALUE: return ARRAY_OF_INT;
            case ARRAY_OF_SHORT_VALUE: return ARRAY_OF_SHORT;
            case ARRAY_OF_BYTE_VALUE: return ARRAY_OF_BYTE;
            case ARRAY_OF_UNSIGNED_LONG_VALUE: return ARRAY_OF_UNSIGNED_LONG;
            case ARRAY_OF_UNSIGNED_INT_VALUE: return ARRAY_OF_UNSIGNED_INT;
            case ARRAY_OF_UNSIGNED_SHORT_VALUE: return ARRAY_OF_UNSIGNED_SHORT;
            case ARRAY_OF_UNSIGNED_BYTE_VALUE: return ARRAY_OF_UNSIGNED_BYTE;
            case ARRAY_OF_DATE_TIME_VALUE: return ARRAY_OF_DATE_TIME;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private OpcType(int value, String name, String literal)
    {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue()
    {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName()
    {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral()
    {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        return literal;
    }
    
} //OpcType
