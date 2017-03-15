/*******************************************************************************
 * Copyright (c) 2014, 2016 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.openscada.protocol.iec60870.server.data;

import java.util.List;

import org.openscada.protocol.iec60870.asdu.ASDUHeader;
import org.openscada.protocol.iec60870.asdu.types.ASDUAddress;
import org.openscada.protocol.iec60870.asdu.types.CauseOfTransmission;
import org.openscada.protocol.iec60870.asdu.types.InformationEntry;
import org.openscada.protocol.iec60870.asdu.types.InformationObjectAddress;
import org.openscada.protocol.iec60870.asdu.types.Value;

public class DataListenerImpl implements DataListener
{
    private final DataModuleMessageSource source;

    public DataListenerImpl ( final DataModuleMessageSource source )
    {
        this.source = source;
    }

    @Override
    public void dataChangeBoolean ( final CauseOfTransmission cause, final ASDUAddress asduAddress, final InformationObjectAddress startAddress, final List<Value<Boolean>> values )
    {
        this.source.sendBooleanValues ( new ASDUHeader ( cause, asduAddress ), startAddress, values );
    }

    @Override
    public void dataChangeBoolean ( final CauseOfTransmission cause, final ASDUAddress asduAddress, final List<InformationEntry<Boolean>> values )
    {
        this.source.sendBooleanValues ( new ASDUHeader ( cause, asduAddress ), values );
    }

    @Override
    public void dataChangeFloat ( final CauseOfTransmission cause, final ASDUAddress asduAddress, final InformationObjectAddress startAddress, final List<Value<Float>> values )
    {
        this.source.sendFloatValues ( new ASDUHeader ( cause, asduAddress ), startAddress, values );
    }

    @Override
    public void dataChangeFloat ( final CauseOfTransmission cause, final ASDUAddress asduAddress, final List<InformationEntry<Float>> values )
    {
        this.source.sendFloatValues ( new ASDUHeader ( cause, asduAddress ), values );
    }

}
