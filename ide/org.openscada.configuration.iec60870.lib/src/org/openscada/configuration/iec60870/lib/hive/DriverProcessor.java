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
package org.openscada.configuration.iec60870.lib.hive;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.scada.configuration.world.lib.oscar.EquinoxApplicationProcessor;
import org.eclipse.scada.configuration.world.lib.oscar.OscarContext;
import org.openscada.configuration.iec60870.ClientDevice;
import org.openscada.configuration.iec60870.DriverApplication;
import org.openscada.configuration.iec60870.lib.Configurations;
import org.openscada.configuration.lib.Helper;

public class DriverProcessor extends EquinoxApplicationProcessor
{
    private final DriverApplication driver;

    public DriverProcessor ( final DriverApplication driver )
    {
        super ( driver );
        this.driver = driver;
    }

    @Override
    public void process ( final String phase, final IFolder nodeDir, final IProgressMonitor monitor, final Map<String, String> properties ) throws Exception
    {
        Helper.ensureOpenScadaDependency ( this.driver );
        super.process ( phase, nodeDir, monitor, properties );
    }

    @Override
    protected void processForContext ( final OscarContext ctx, final IFolder output, final IProgressMonitor monitor ) throws Exception
    {
        for ( final ClientDevice device : this.driver.getDevices () )
        {
            addClientDevice ( ctx, device );
        }
    }

    private void addClientDevice ( final OscarContext ctx, final ClientDevice device )
    {
        final String id = device.getId ();

        final Map<String, String> data = new HashMap<> ();

        data.put ( "host", device.getEndpoint ().getNode ().getHostName () ); //$NON-NLS-1$
        data.put ( "port", "" + device.getEndpoint ().getPortNumber () ); //$NON-NLS-1$ //$NON-NLS-2$

        Configurations.encode ( data, "protocol", device.getProtocolOptions () ); //$NON-NLS-1$
        Configurations.encode ( data, "dataModule", device.getDataModuleOptions () ); //$NON-NLS-1$

        ctx.addData ( "org.openscada.da.server.iec60870.connection", id, data ); //$NON-NLS-1$
    }
}
