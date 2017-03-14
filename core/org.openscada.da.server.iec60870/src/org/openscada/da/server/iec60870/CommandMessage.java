package org.openscada.da.server.iec60870;

import org.eclipse.scada.core.Variant;
import org.openscada.protocol.iec60870.asdu.ASDUHeader;
import org.openscada.protocol.iec60870.asdu.message.SetPointCommandNormalizedValue;
import org.openscada.protocol.iec60870.asdu.message.SetPointCommandNormalizedValueTime;
import org.openscada.protocol.iec60870.asdu.message.SetPointCommandScaledValue;
import org.openscada.protocol.iec60870.asdu.message.SetPointCommandScaledValueTime;
import org.openscada.protocol.iec60870.asdu.message.SetPointCommandShortFloatingPoint;
import org.openscada.protocol.iec60870.asdu.message.SetPointCommandShortFloatingPointTime;
import org.openscada.protocol.iec60870.asdu.message.SingleCommand;
import org.openscada.protocol.iec60870.asdu.message.SingleCommandTime;
import org.openscada.protocol.iec60870.asdu.message.ValueCommandMessage;
import org.openscada.protocol.iec60870.asdu.types.CommandValue;
import org.openscada.protocol.iec60870.asdu.types.InformationObjectAddress;

public enum CommandMessage
{
    C_SC_NA_1 ( (byte)45 ),
    C_SE_NA_1 ( (byte)48 ),
    C_SE_NB_1 ( (byte)49 ),
    C_SE_NC_1 ( (byte)50 ),
    C_SC_TA_1 ( (byte)58 ),
    C_SE_TA_1 ( (byte)61 ),
    C_SE_TB_1 ( (byte)62 ),
    C_SE_TC_1 ( (byte)63 );

    private byte type;

    CommandMessage ( byte type )
    {
        this.type = type;
    }

    public int getType ()
    {
        return type;
    }

    public ValueCommandMessage createMessage ( ASDUHeader header, InformationObjectAddress objectAddress, Variant value, long timestamp )
    {
        switch ( this )
        {
            case C_SC_NA_1:
                return new SingleCommand ( header, objectAddress, value.asBoolean ( false ) );
            case C_SC_TA_1:
                return new SingleCommandTime ( header, objectAddress, new CommandValue<Boolean> ( value.asBoolean ( false ), timestamp ) );
            case C_SE_NA_1:
                return new SetPointCommandNormalizedValue ( header, objectAddress, value.asDouble ( 0.0 ) );
            case C_SE_NB_1:
                return new SetPointCommandNormalizedValueTime ( header, objectAddress, new CommandValue<Double> ( value.asDouble ( 0.0 ), timestamp ) );
            case C_SE_NC_1:
                return new SetPointCommandShortFloatingPoint ( header, objectAddress, value.asDouble ( 0.0 ).floatValue () );
            case C_SE_TA_1:
                return new SetPointCommandShortFloatingPointTime ( header, objectAddress, new CommandValue<Float> ( value.asDouble ( 0.0 ).floatValue (), timestamp ) );
            case C_SE_TB_1:
                return new SetPointCommandScaledValue ( header, objectAddress, value.asInteger ( 0 ).shortValue () );
            case C_SE_TC_1:
                return new SetPointCommandScaledValueTime ( header, objectAddress, new CommandValue<Short> ( value.asInteger ( 0 ).shortValue (), timestamp ) );
        }
        throw new IllegalArgumentException ( String.format ( "could not create message for %s-%s value %s", header, objectAddress, value ) );
    }

    public static ValueCommandMessage createMessage ( ASDUHeader header, InformationObjectAddress objectAddress, String value )
    {
        final String[] parts = value.split ( "#" );
        if ( parts == null || parts.length < 2 )
        {
            throw new IllegalArgumentException ( String.format ( "could not create message for %s-%s value %s", header, objectAddress, value ) );
        }
        final CommandMessage cm = CommandMessage.valueOf ( parts[0] );
        final long timestamp;
        if ( parts.length > 2 )
        {
            timestamp = Long.parseLong ( parts[2] );
        }
        else
        {
            timestamp = System.currentTimeMillis ();
        }
        return cm.createMessage ( header, objectAddress, Variant.valueOf ( parts[1] ), timestamp );
    }
}
