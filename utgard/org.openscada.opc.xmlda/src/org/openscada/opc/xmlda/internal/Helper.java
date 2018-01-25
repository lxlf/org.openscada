/*******************************************************************************
 * Copyright (c) 2015 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.openscada.opc.xmlda.internal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.opcfoundation.webservices.xmlda._1.ArrayOfAnyType;
import org.opcfoundation.webservices.xmlda._1.ArrayOfBoolean;
import org.opcfoundation.webservices.xmlda._1.ArrayOfByte;
import org.opcfoundation.webservices.xmlda._1.ArrayOfDateTime;
import org.opcfoundation.webservices.xmlda._1.ArrayOfDecimal;
import org.opcfoundation.webservices.xmlda._1.ArrayOfDouble;
import org.opcfoundation.webservices.xmlda._1.ArrayOfFloat;
import org.opcfoundation.webservices.xmlda._1.ArrayOfInt;
import org.opcfoundation.webservices.xmlda._1.ArrayOfLong;
import org.opcfoundation.webservices.xmlda._1.ArrayOfShort;
import org.opcfoundation.webservices.xmlda._1.ArrayOfString;
import org.opcfoundation.webservices.xmlda._1.ArrayOfUnsignedInt;
import org.opcfoundation.webservices.xmlda._1.ArrayOfUnsignedLong;
import org.opcfoundation.webservices.xmlda._1.ArrayOfUnsignedShort;
import org.opcfoundation.webservices.xmlda._1.BrowseElement;
import org.opcfoundation.webservices.xmlda._1.ItemProperty;
import org.opcfoundation.webservices.xmlda._1.ItemValue;
import org.opcfoundation.webservices.xmlda._1.LimitBits;
import org.opcfoundation.webservices.xmlda._1.OPCError;
import org.opcfoundation.webservices.xmlda._1.OPCQuality;
import org.opcfoundation.webservices.xmlda._1.QualityBits;
import org.opcfoundation.webservices.xmlda._1.ServerState;
import org.openscada.opc.xmlda.OpcType;
import org.openscada.opc.xmlda.requests.BrowseEntry;
import org.openscada.opc.xmlda.requests.BrowseRequest;
import org.openscada.opc.xmlda.requests.BrowseResponse;
import org.openscada.opc.xmlda.requests.ErrorInformation;
import org.openscada.opc.xmlda.requests.Limit;
import org.openscada.opc.xmlda.requests.Quality;
import org.openscada.opc.xmlda.requests.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Helper
{
    private final static Logger logger = LoggerFactory.getLogger ( Helper.class );

    private Helper ()
    {
    }

    public static String toStringLocal ( final Calendar timestamp )
    {
        if ( timestamp == null )
        {
            return null;
        }

        final SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss.SSS" );
        format.setTimeZone ( timestamp.getTimeZone () );
        return format.format ( timestamp.getTime () );
    }

    public static GregorianCalendar convert ( final XMLGregorianCalendar time )
    {
        if ( time == null )
        {
            return null;
        }

        return time.toGregorianCalendar ();
    }

    public static org.openscada.opc.xmlda.requests.ServerState convert ( final ServerState state )
    {
        if ( state == null )
        {
            return null;
        }

        switch ( state )
        {
            case COMM_FAULT:
                return org.openscada.opc.xmlda.requests.ServerState.COMMUNICATION_FAULT;
            case FAILED:
                return org.openscada.opc.xmlda.requests.ServerState.FAILED;
            case NO_CONFIG:
                return org.openscada.opc.xmlda.requests.ServerState.NOT_CONFIGURED;
            case RUNNING:
                return org.openscada.opc.xmlda.requests.ServerState.RUNNING;
            case SUSPENDED:
                return org.openscada.opc.xmlda.requests.ServerState.SUSPENDED;
            case TEST:
                return org.openscada.opc.xmlda.requests.ServerState.TEST_MODE;
            default:
                return org.openscada.opc.xmlda.requests.ServerState.UNKNOWN;
        }
    }

    private static State convert ( final OPCQuality quality )
    {
        if ( quality == null )
        {
            return State.GOOD;
        }

        return new State ( convert ( quality.getQualityField () ), convert ( quality.getLimitField () ), quality.getVendorField () );
    }

    private static Quality convert ( final QualityBits quality )
    {
        if ( quality == null )
        {
            return null;
        }

        switch ( quality )
        {
            case GOOD:
                return Quality.GOOD;
            case UNCERTAIN:
                return Quality.UNCERTAIN;
            case BAD:
                return Quality.BAD;

            case GOOD_LOCAL_OVERRIDE:
                return Quality.GOOD_LOCAL_OVERRIDE;

            case UNCERTAIN_EU_EXCEEDED:
                return Quality.UNCERTAIN_EU_EXCEEDED;
            case UNCERTAIN_LAST_USABLE_VALUE:
                return Quality.UNCERTAIN_LAST_USABLE_VALUE;
            case UNCERTAIN_SENSOR_NOT_ACCURATE:
                return Quality.UNCERTAIN_SENSOR_NOT_ACCURATE;
            case UNCERTAIN_SUB_NORMAL:
                return Quality.UNCERTAIN_SUB_NORMAL;

            case BAD_COMM_FAILURE:
                return Quality.BAD_COMM_FAILURE;
            case BAD_CONFIGURATION_ERROR:
                return Quality.BAD_CONFIGURATION_ERROR;
            case BAD_DEVICE_FAILURE:
                return Quality.BAD_DEVICE_FAILURE;
            case BAD_LAST_KNOWN_VALUE:
                return Quality.BAD_LAST_KNOWN_VALUE;
            case BAD_NOT_CONNECTED:
                return Quality.BAD_NOT_CONNECTED;
            case BAD_OUT_OF_SERVICE:
                return Quality.BAD_OUT_OF_SERVICE;
            case BAD_SENSOR_FAILURE:
                return Quality.BAD_SENSOR_FAILURE;
            case BAD_WAITING_FOR_INITIAL_DATA:
                return Quality.BAD_WAITING_FOR_INITIAL_DATA;

            default:
                return Quality.UNKNOWN;
        }
    }

    private static Limit convert ( final LimitBits limit )
    {
        if ( limit == null )
        {
            return null;
        }

        switch ( limit )
        {
            case NONE:
                return Limit.NONE;
            case CONSTANT:
                return Limit.CONSTANT;
            case HIGH:
                return Limit.HIGH;
            case LOW:
                return Limit.LOW;
            default:
                return null;
        }
    }

    public static Map<QName, String> mapErrors ( final List<OPCError> errors )
    {
        if ( errors == null )
        {
            return Collections.emptyMap ();
        }

        final Map<QName, String> errorMap = new HashMap<> ();

        for ( final OPCError err : errors )
        {
            errorMap.put ( err.getID (), err.getText () );
        }
        return errorMap;
    }

    public static org.openscada.opc.xmlda.requests.ItemValue convertValue ( final ItemValue value, final Map<QName, String> errorMap )
    {
        if ( value == null )
        {
            return null;
        }

        return convertValue ( value, value.getItemName (), errorMap );
    }

    public static org.openscada.opc.xmlda.requests.ItemValue convertValue ( final ItemValue value, final String itemName, final Map<QName, String> errorMap )
    {
        if ( value == null )
        {
            return null;
        }

        final String itemPath = value.getItemPath ();
        final GregorianCalendar timestamp = convert ( value.getTimestamp () );
        final Object valueObj = convertRawValue ( value.getValue () );
        final State quality = convert ( value.getQuality () );

        return new org.openscada.opc.xmlda.requests.ItemValue ( itemName, itemPath, valueObj, quality, timestamp, makeError ( value.getResultID (), errorMap ) );
    }

    public static Object convertRawValue ( final Object value )
    {
        if ( value instanceof OPCQuality )
        {
            return convert ( (OPCQuality)value );
        }
        else if ( value instanceof XMLGregorianCalendar )
        {
            return convert ( (XMLGregorianCalendar)value );
        }
        else if ( value instanceof ArrayOfAnyType )
        {
            return ( (ArrayOfAnyType)value ).getAnyType ();
        }
        else if ( value instanceof ArrayOfBoolean )
        {
            return ( (ArrayOfBoolean)value ).getBoolean ();
        }
        else if ( value instanceof ArrayOfByte )
        {
            return ( (ArrayOfByte)value ).getByte ();
        }
        else if ( value instanceof ArrayOfDateTime )
        {
            final List<XMLGregorianCalendar> from = ( (ArrayOfDateTime)value ).getDateTime ();
            final List<Calendar> result = new ArrayList<Calendar> ( from.size () );

            for ( final XMLGregorianCalendar cal : from )
            {
                result.add ( convert ( cal ) );
            }

            return result;
        }
        else if ( value instanceof ArrayOfDecimal )
        {
            return ( (ArrayOfDecimal)value ).getDecimal ();
        }
        else if ( value instanceof ArrayOfDouble )
        {
            return ( (ArrayOfDouble)value ).getDouble ();
        }
        else if ( value instanceof ArrayOfFloat )
        {
            return ( (ArrayOfFloat)value ).getFloat ();
        }
        else if ( value instanceof ArrayOfInt )
        {
            return ( (ArrayOfInt)value ).getInt ();
        }
        else if ( value instanceof ArrayOfLong )
        {
            return ( (ArrayOfLong)value ).getLong ();
        }
        else if ( value instanceof ArrayOfShort )
        {
            return ( (ArrayOfShort)value ).getShort ();
        }
        else if ( value instanceof ArrayOfString )
        {
            return ( (ArrayOfString)value ).getString ();
        }
        else if ( value instanceof ArrayOfUnsignedInt )
        {
            return ( (ArrayOfUnsignedInt)value ).getUnsignedInt ();
        }
        else if ( value instanceof ArrayOfUnsignedLong )
        {
            return ( (ArrayOfUnsignedLong)value ).getUnsignedLong ();
        }
        else if ( value instanceof ArrayOfUnsignedShort )
        {
            return ( (ArrayOfUnsignedShort)value ).getUnsignedShort ();
        }

        // just pass back the value
        return value;
    }

    /**
     * ArrayOfAnyType and ArrayOfUnsignedByte (which doesn't really exist) is
     * not supported
     * if parsing of any value fails it will be returned as a string
     * 
     * @param value
     * @return
     */
    public static Object parseStringValue ( final String value, final OpcType opcType )
    {
        logger.trace ( "try to convert value: value = {}, opcType = {}", value, opcType );
        if ( value == null || opcType == null )
        {
            logger.trace ( "precondition failed" );
            return value;
        }
        final EnumSet<OpcType> supportedArrayTypes = EnumSet.of ( OpcType.ARRAY_OF_BOOLEAN, OpcType.ARRAY_OF_BYTE, OpcType.ARRAY_OF_DECIMAL, //
                OpcType.ARRAY_OF_DOUBLE, OpcType.ARRAY_OF_FLOAT, OpcType.ARRAY_OF_INT, OpcType.ARRAY_OF_LONG, //
                OpcType.ARRAY_OF_SHORT, OpcType.ARRAY_OF_STRING, OpcType.ARRAY_OF_UNSIGNED_INT, //
                OpcType.ARRAY_OF_UNSIGNED_LONG, OpcType.ARRAY_OF_UNSIGNED_SHORT, OpcType.ARRAY_OF_DATE_TIME );
        final EnumSet<OpcType> unsupportedArrayTypes = EnumSet.of ( OpcType.ARRAY_OF_ANY_TYPE, OpcType.ARRAY_OF_UNSIGNED_BYTE );

        try
        {
            if ( supportedArrayTypes.contains ( opcType ) && value.startsWith ( "[" ) && value.endsWith ( "]" ) )
            {
                logger.trace ( "try to convert as Array" );
                switch ( opcType )
                {
                    case ARRAY_OF_BOOLEAN:
                    {
                        ArrayOfBoolean v = new ArrayOfBoolean ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getBoolean ().add ( toBoolean ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_BYTE:
                    {
                        ArrayOfByte v = new ArrayOfByte ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getByte ().add ( Byte.parseByte ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_DECIMAL:
                    {
                        ArrayOfDecimal v = new ArrayOfDecimal ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getDecimal ().add ( new BigDecimal ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_DOUBLE:
                    {
                        ArrayOfDouble v = new ArrayOfDouble ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getDouble ().add ( Double.parseDouble ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_FLOAT:
                    {
                        ArrayOfFloat v = new ArrayOfFloat ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getFloat ().add ( Float.parseFloat ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_INT:
                    {
                        ArrayOfInt v = new ArrayOfInt ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getInt ().add ( Integer.parseInt ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_LONG:
                    {
                        ArrayOfLong v = new ArrayOfLong ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getLong ().add ( Long.parseLong ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_SHORT:
                    {
                        ArrayOfShort v = new ArrayOfShort ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getShort ().add ( Short.parseShort ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_STRING:
                    {
                        ArrayOfString v = new ArrayOfString ();
                        v.getString ().addAll ( toStringList ( value ) );
                    }
                    case ARRAY_OF_UNSIGNED_INT:
                    {
                        ArrayOfUnsignedInt v = new ArrayOfUnsignedInt ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getUnsignedInt ().add ( Long.parseLong ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_UNSIGNED_LONG:
                    {
                        ArrayOfUnsignedLong v = new ArrayOfUnsignedLong ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getUnsignedLong ().add ( new BigInteger ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_UNSIGNED_SHORT:
                    {
                        ArrayOfUnsignedShort v = new ArrayOfUnsignedShort ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getUnsignedShort ().add ( Integer.parseInt ( el ) );
                        }
                        return v;
                    }
                    case ARRAY_OF_DATE_TIME:
                        ArrayOfDateTime v = new ArrayOfDateTime ();
                        for ( String el : toStringList ( value ) )
                        {
                            v.getDateTime ().add ( toDateTime ( el ) );
                        }
                        return v;
                    default:
                        logger.warn ( "can not actually happen!" );
                        break;
                }
            }
            else if ( unsupportedArrayTypes.contains ( opcType ) )
            {
                logger.warn ( "opcType '{}' is not supported!", opcType );
                return value;
            }
            else
            {
                switch ( opcType )
                {
                    case BOOLEAN:
                        return toBoolean ( value );
                    case BYTE:
                        return Byte.parseByte ( value );
                    case DATE:
                        return toDate ( value );
                    case DATE_TIME:
                        return toDateTime ( value );
                    case DECIMAL:
                        return new BigDecimal ( value );
                    case DOUBLE:
                        return Double.parseDouble ( value );
                    case DURATION:
                        return DatatypeFactory.newInstance ().newDuration ( Long.parseLong ( value ) );
                    case FLOAT:
                        return Float.parseFloat ( value );
                    case INT:
                    case UNSIGNED_SHORT:
                        return Integer.parseInt ( value );
                    case LONG:
                    case UNSIGNED_INT:
                        return Long.parseLong ( value );
                    case SHORT:
                    case UNSIGNED_BYTE:
                        return Short.parseShort ( value );
                    case TIME:
                        return toTime ( value );
                    case UNSIGNED_LONG:
                        return new BigInteger ( value );
                    default:
                        break;
                }
            }
        }
        catch ( NumberFormatException e )
        {
            logger.warn ( "value could not be converted!", e );
            return value;
        }
        catch ( ParseException e )
        {
            logger.warn ( "value could not be converted!", e );
            return value;
        }
        catch ( DatatypeConfigurationException e )
        {
            logger.warn ( "value could not be converted!", e );
            return value;
        }
        logger.debug ( "no conversation method applied, returning value as is!" );
        return value;
    }

    private static XMLGregorianCalendar toDateTime ( String value ) throws ParseException, DatatypeConfigurationException
    {
        GregorianCalendar cal = new GregorianCalendar ();
        cal.setTimeZone ( TimeZone.getTimeZone ( "UTC" ) );
        if ( value.contains ( "-" ) )
        {
            final SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss.SSS" );
            cal.setTime ( format.parse ( value ) );
        }
        else
        {
            cal.setTime ( new Date ( Long.parseLong ( value ) ) );
        }
        final XMLGregorianCalendar xcal = DatatypeFactory.newInstance ().newXMLGregorianCalendar ( cal );
        return xcal;
    }

    private static XMLGregorianCalendar toDate ( String value ) throws ParseException, DatatypeConfigurationException
    {
        GregorianCalendar cal = new GregorianCalendar ();
        cal.setTimeZone ( TimeZone.getTimeZone ( "UTC" ) );
        if ( value.contains ( "-" ) )
        {
            final SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd" );
            cal.setTime ( format.parse ( value ) );
        }
        else
        {
            cal.setTime ( new Date ( Long.parseLong ( value ) ) );
        }

        final XMLGregorianCalendar xcal = DatatypeFactory.newInstance ().newXMLGregorianCalendarDate ( cal.get ( Calendar.YEAR ), cal.get ( Calendar.MONTH ), cal.get ( Calendar.DAY_OF_MONTH ), 0 );
        return xcal;
    }

    private static XMLGregorianCalendar toTime ( String value ) throws ParseException, DatatypeConfigurationException
    {
        GregorianCalendar cal = new GregorianCalendar ();
        cal.setTimeZone ( TimeZone.getTimeZone ( "UTC" ) );
        if ( value.contains ( ":" ) )
        {
            final SimpleDateFormat format = new SimpleDateFormat ( "HH:mm:ss.SSS" );
            cal.setTime ( format.parse ( value ) );
        }
        else
        {
            cal.setTime ( new Date ( Long.parseLong ( value ) ) );
        }

        final XMLGregorianCalendar xcal = DatatypeFactory.newInstance ().newXMLGregorianCalendarTime ( cal.get ( Calendar.HOUR_OF_DAY ), cal.get ( Calendar.MINUTE ), cal.get ( Calendar.SECOND ), ( Calendar.MILLISECOND ), 0 );
        return xcal;
    }

    private static Boolean toBoolean ( String value )
    {
        if ( value == null )
        {
            return false;
        }
        return Arrays.asList ( "true", "t", "yes", "y", "1" ).contains ( value.toLowerCase () );
    }

    private static List<String> toStringList ( String value )
    {
        if ( value.equals ( "[]" ) )
        {
            return Collections.emptyList ();
        }
        return Arrays.asList ( value.substring ( 1, value.length () - 1 ).split ( ", " ) );
    }

    private static ErrorInformation makeError ( final QName error, final Map<QName, String> errorMap )
    {
        if ( error == null )
        {
            return null;
        }

        return new ErrorInformation ( error, errorMap.get ( error ) );
    }

    public static Map<String, org.openscada.opc.xmlda.requests.ItemProperty> convert ( final List<ItemProperty> properties, final Map<QName, String> errorMap )
    {
        if ( properties == null )
        {
            return null;
        }
        if ( properties.isEmpty () )
        {
            return Collections.emptyMap ();
        }

        final Map<String, org.openscada.opc.xmlda.requests.ItemProperty> result = new HashMap<> ( properties.size () );

        for ( final ItemProperty ip : properties )
        {
            final org.openscada.opc.xmlda.requests.ItemProperty nip = convert ( ip, errorMap );
            if ( nip != null )
            {
                result.put ( nip.getNameAsString (), nip );
            }
        }

        return result;
    }

    public static org.openscada.opc.xmlda.requests.ItemProperty convert ( final ItemProperty ip, final Map<QName, String> errorMap )
    {
        if ( ip == null )
        {
            return null;
        }

        String errorMessage;

        if ( ip.getResultID () != null )
        {
            errorMessage = errorMap.get ( ip.getResultID () );
        }
        else
        {
            errorMessage = null;
        }

        return new org.openscada.opc.xmlda.requests.ItemProperty ( ip.getName (), convertRawValue ( ip.getValue () ), ip.getDescription (), ip.getItemName (), ip.getItemPath (), ip.getResultID (), errorMessage );
    }

    public static BrowseResponse convert ( final org.opcfoundation.webservices.xmlda._1.BrowseResponse response, final BrowseRequest request )
    {
        if ( response == null )
        {
            return null;
        }

        final BrowseResponse.Builder result = new BrowseResponse.Builder ();

        result.setBase ( response.getBrowseResult () );
        result.setRequest ( request );
        result.setContinuationPoint ( response.getContinuationPoint () );

        final Map<QName, String> errorMap = Helper.mapErrors ( response.getErrors () );

        for ( final BrowseElement ele : response.getElements () )
        {
            final BrowseEntry entry = new BrowseEntry ( ele.getName (), ele.isIsItem (), ele.isHasChildren (), ele.getItemName (), ele.getItemPath (), convert ( ele.getProperties (), errorMap ) );
            result.addEntry ( entry );
        }

        return result.build ();
    }
}
