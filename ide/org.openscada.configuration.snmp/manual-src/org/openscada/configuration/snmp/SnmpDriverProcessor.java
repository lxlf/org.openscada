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
package org.openscada.configuration.snmp;

import java.util.Properties;

import org.eclipse.scada.configuration.world.lib.CommonDriverProcessor;
import org.eclipse.scada.da.server.exporter.HiveConfigurationType;
import org.openscada.da.snmp.configuration.ConfigurationPackage;

public class SnmpDriverProcessor extends CommonDriverProcessor
{
    private final SnmpDriver snmpDriver;

    public SnmpDriverProcessor ( final SnmpDriver snmpDriver )
    {
        super ( snmpDriver );
        this.snmpDriver = snmpDriver;
    }

    @Override
    protected void addConfiguration ( final HiveConfigurationType hiveCfg )
    {
        hiveCfg.getAny ().add ( ConfigurationPackage.Literals.DOCUMENT_ROOT__CONFIGURATION, this.snmpDriver.getConfiguration () );
    }

    @Override
    protected void fillProperties ( final Properties p )
    {
        super.fillProperties ( p );
    }

    @Override
    protected String getHiveId ()
    {
        return "org.openscada.da.server.snmp.Hive";
    }
}
