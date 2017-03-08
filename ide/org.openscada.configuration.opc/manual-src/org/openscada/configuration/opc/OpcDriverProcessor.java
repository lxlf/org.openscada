/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.openscada.configuration.opc;

import java.util.Properties;

import org.eclipse.scada.configuration.world.lib.CommonDriverProcessor;
import org.eclipse.scada.da.server.exporter.HiveConfigurationType;
import org.openscada.da.opc.configuration.ConfigurationPackage;

public class OpcDriverProcessor extends CommonDriverProcessor
{
    private final OpcDriver opcDriver;

    public OpcDriverProcessor ( final OpcDriver opcDriver )
    {
        super ( opcDriver );
        this.opcDriver = opcDriver;
    }

    @Override
    protected void addConfiguration ( final HiveConfigurationType hiveCfg )
    {
        hiveCfg.getAny ().add ( ConfigurationPackage.Literals.DOCUMENT_ROOT__ROOT, this.opcDriver.getRoot () );
    }

    @Override
    protected void fillProperties ( final Properties p )
    {
        super.fillProperties ( p );
        if ( this.opcDriver.getSocketTimeout () != null )
        {
            p.setProperty ( "rpc.socketTimeout", "" + this.opcDriver.getSocketTimeout () ); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    @Override
    protected String getHiveId ()
    {
        return "org.openscada.da.server.opc.Hive";
    }
}
