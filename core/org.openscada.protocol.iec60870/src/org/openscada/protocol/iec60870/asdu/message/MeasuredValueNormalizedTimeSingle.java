/*******************************************************************************
 * Copyright (c) 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.openscada.protocol.iec60870.asdu.message;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openscada.protocol.iec60870.ProtocolOptions;
import org.openscada.protocol.iec60870.asdu.ASDUHeader;
import org.openscada.protocol.iec60870.asdu.types.ASDU;
import org.openscada.protocol.iec60870.asdu.types.InformationEntry;
import org.openscada.protocol.iec60870.asdu.types.InformationObjectAddress;
import org.openscada.protocol.iec60870.asdu.types.InformationStructure;
import org.openscada.protocol.iec60870.asdu.types.Value;

@ASDU ( id = 34, name = "M_ME_TD_1", informationStructure = InformationStructure.SINGLE )
public class MeasuredValueNormalizedTimeSingle extends AbstractMeasuredValueNormalized
{
    private MeasuredValueNormalizedTimeSingle ( final ASDUHeader header, final List<InformationEntry<Double>> entries )
    {
        super ( header, entries, true );
    }

    public static MeasuredValueNormalizedTimeSingle parse ( final ProtocolOptions options, final byte length, final ASDUHeader header, final ByteBuf data )
    {
        return new MeasuredValueNormalizedTimeSingle ( header, parseEntries ( options, length, data, true ) );
    }

    public static MeasuredValueNormalizedTimeSingle create ( final ASDUHeader header, final InformationObjectAddress address, final Value<Double> value )
    {
        return createInternal ( header, Collections.singletonList ( new InformationEntry<> ( address, value ) ) );
    }

    public static MeasuredValueNormalizedTimeSingle create ( final ASDUHeader header, final List<InformationEntry<Double>> values )
    {
        if ( values.size () > MAX_INFORMATION_ENTRIES )
        {
            throw new IllegalArgumentException ( String.format ( "A maximum of %s values can be transmitted", MAX_INFORMATION_ENTRIES ) );
        }
        return createInternal ( header, new ArrayList<> ( values ) );
    }

    private static MeasuredValueNormalizedTimeSingle createInternal ( final ASDUHeader header, final List<InformationEntry<Double>> values )
    {
        return new MeasuredValueNormalizedTimeSingle ( header, values );
    }

}
