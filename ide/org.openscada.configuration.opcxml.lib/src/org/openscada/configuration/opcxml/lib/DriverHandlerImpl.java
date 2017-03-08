/*******************************************************************************
 * Copyright (c) 2014, 2015 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.openscada.configuration.opcxml.lib;

import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.scada.configuration.infrastructure.Node;
import org.eclipse.scada.configuration.infrastructure.lib.AbstractEquinoxDriverHandler;
import org.eclipse.scada.configuration.lib.Nodes;
import org.openscada.configuration.opcxml.DriverApplication;
import org.openscada.configuration.opcxml.FileSystemSource;
import org.openscada.configuration.opcxml.HiveDevice;
import org.openscada.configuration.opcxml.OpcXmlDevice;
import org.openscada.configuration.opcxml.OpcXmlDriver;
import org.openscada.configuration.opcxml.OpcxmlFactory;
import org.openscada.configuration.opcxml.WsdlSource;

public class DriverHandlerImpl extends AbstractEquinoxDriverHandler<OpcXmlDriver, DriverApplication>
{
    @Override
    protected DriverApplication createDriver ( final OpcXmlDriver driver, final Map<Node, org.eclipse.scada.configuration.world.Node> nodes )
    {
        final DriverApplication result = OpcxmlFactory.eINSTANCE.createDriverApplication ();

        for ( final OpcXmlDevice device : driver.getDevices () )
        {
            final HiveDevice hiveDevice = OpcxmlFactory.eINSTANCE.createHiveDevice ();

            hiveDevice.setId ( device.getName () );

            hiveDevice.setSettings ( EcoreUtil.copy ( device.getSettings () ) );

            String port;
            if ( device.getPort () != null )
            {
                port = ":" + device.getPort ();
            }
            else
            {
                port = "";
            }

            String path = device.getPath ();
            if ( path == null )
            {
                path = "";
            }
            else if ( !path.startsWith ( "/" ) )
            {
                path = "/" + path;
            }

            final String host = Nodes.makeHostname ( result, nodes.get ( device.getNode () ) );

            String creds = device.getCredentials ();
            if ( creds != null && !creds.isEmpty () )
            {
                creds = creds + "@";
            }
            else
            {
                creds = "";
            }

            hiveDevice.setServerUrl ( String.format ( "%s://%s%s%s%s", device.getProtocol (), creds, host, port, path ) );

            final WsdlSource copy = EcoreUtil.copy ( device.getWsdlSource () );
            if ( copy instanceof FileSystemSource )
            {
                ( (FileSystemSource)copy ).setOriginalBase ( device.getWsdlSource ().eResource () );
            }
            hiveDevice.setWsdlSource ( copy );

            result.getDevices ().add ( hiveDevice );
        }

        return result;
    }
}
