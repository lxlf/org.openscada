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
package org.openscada.configuration.opcxml.lib;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.scada.configuration.lib.Nodes;
import org.eclipse.scada.configuration.world.Node;
import org.eclipse.scada.configuration.world.lib.oscar.EquinoxApplicationProcessor;
import org.eclipse.scada.configuration.world.lib.oscar.OscarContext;
import org.openscada.configuration.lib.Helper;
import org.openscada.configuration.opcxml.ConnectionSettings;
import org.openscada.configuration.opcxml.DriverApplication;
import org.openscada.configuration.opcxml.FileSystemSource;
import org.openscada.configuration.opcxml.HiveDevice;
import org.openscada.configuration.opcxml.ItemType;
import org.openscada.configuration.opcxml.Poller;
import org.openscada.configuration.opcxml.ReadRequestPoller;
import org.openscada.configuration.opcxml.Subscription;
import org.openscada.configuration.opcxml.UrlWsdlSource;
import org.openscada.configuration.opcxml.WsdlSource;

public class DriverProcessor extends EquinoxApplicationProcessor
{
    private final DriverApplication driver;

    private IFolder nodeDir;

    private String nodeName;

    public DriverProcessor ( final DriverApplication driver )
    {
        super ( driver );
        this.driver = driver;
    }

    protected static IFolder mkdirs ( final IFolder base, final IProgressMonitor monitor, final String... path ) throws CoreException
    {
        IFolder folder = base;
        for ( final String tok : path )
        {
            folder = folder.getFolder ( tok );
            if ( !folder.isAccessible () )
            {
                folder.create ( true, true, monitor );
            }
        }

        return folder;
    }

    protected void addFile ( final String name, final InputStream stream, final IProgressMonitor monitor, final String... path ) throws CoreException
    {
        final IFolder folder = mkdirs ( mkdirs ( this.nodeDir, monitor, "debian-packages", this.nodeName + "-configuration", "src" ), monitor, path ); //$NON-NLS-1$  //$NON-NLS-2$ //$NON-NLS-3$

        folder.getFile ( name ).create ( stream, IResource.FORCE, monitor );
    }

    @Override
    public void process ( final String phase, final IFolder nodeDir, final IProgressMonitor monitor, final Map<String, String> properties ) throws Exception
    {
        Helper.ensureOpenScadaDependency ( this.driver );
        final Node node = Nodes.fromApp ( this.driver );

        this.nodeName = Nodes.makeName ( node );
        this.nodeDir = nodeDir;

        super.process ( phase, nodeDir, monitor, properties );
    }

    @Override
    protected void processForContext ( final OscarContext ctx, final IFolder output, final IProgressMonitor monitor ) throws Exception
    {
        for ( final HiveDevice device : this.driver.getDevices () )
        {
            addHiveDevice ( ctx, device, monitor );
        }
    }

    private void addHiveDevice ( final OscarContext ctx, final HiveDevice device, final IProgressMonitor monitor ) throws Exception
    {
        final String id = device.getId ();

        final Map<String, String> data = new HashMap<> ();

        data.put ( "url", device.getServerUrl () ); //$NON-NLS-1$

        // connection settings
        {
            final ConnectionSettings settings = device.getSettings ();

            if ( settings.getTimeout () != null && settings.getTimeout () > 0 )
            {
                data.put ( "timeout", "" + settings.getTimeout () ); //$NON-NLS-1$
            }
            data.put ( "serviceName", settings.getServiceName () ); //$NON-NLS-1$

            if ( settings.getPortName () != null && !settings.getPortName ().isEmpty () )
            {
                data.put ( "portName", settings.getPortName () ); //$NON-NLS-1$
            }

            if ( settings.getTypes () != null && !settings.getTypes ().isEmpty () )
            {
                for ( final ItemType itemType : settings.getTypes () )
                {
                    data.put ( "itemType." + itemType.getPattern (), itemType.getType ().getLiteral () );
                }
            }

            final Poller poller = settings.getPoller ();
            if ( poller instanceof Subscription )
            {
                final Subscription subscription = (Subscription)poller;
                if ( subscription.getWaitTime () != null && subscription.getWaitTime () > 0 )
                {
                    data.put ( "waitTime", "" + subscription.getWaitTime () ); //$NON-NLS-1$  //$NON-NLS-2$
                }

                if ( subscription.getSamplingRate () != null && subscription.getSamplingRate () >= 0 )
                {
                    data.put ( "samplingRate", "" + subscription.getSamplingRate () ); //$NON-NLS-1$  //$NON-NLS-2$
                }
            }
            else if ( poller instanceof ReadRequestPoller )
            {
                final ReadRequestPoller reader = (ReadRequestPoller)poller;

                if ( reader.getPeriod () > 0 )
                {
                    data.put ( "period", "" + reader.getPeriod () ); //$NON-NLS-1$  //$NON-NLS-2$
                }
                else
                {
                    data.put ( "period", "1000" ); //$NON-NLS-1$  //$NON-NLS-2$
                }

                if ( reader.getMaxAge () != null && reader.getMaxAge () >= 0 )
                {
                    data.put ( "maxAge", "" + reader.getMaxAge () ); //$NON-NLS-1$  //$NON-NLS-2$
                }

                data.put ( "pollByRead", "true" ); //$NON-NLS-1$  //$NON-NLS-2$
            }
            else
            {
                throw new IllegalArgumentException ( String.format ( "Unknown poller type: %s", poller.eClass ().getName () ) );
            }
        }

        final WsdlSource wsdlSource = device.getWsdlSource ();
        if ( wsdlSource instanceof FileSystemSource )
        {
            final String dirName = makeId ( device );

            URI uri = URI.createURI ( ( (FileSystemSource)wsdlSource ).getLocalWsdlUrl () );

            if ( ( (FileSystemSource)wsdlSource ).getOriginalBase () != null )
            {
                uri = uri.resolve ( ( (FileSystemSource)wsdlSource ).getOriginalBase ().getURI () );
            }

            try ( InputStream stream = new URL ( uri.toString () ).openStream () )
            {
                addFile ( "opcxmlda.wsdl", stream, monitor, "etc", "openscada", "opcxmlda", dirName ); //$NON-NLS-1$  //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
            }
            data.put ( "wsdlUrl", "file:///etc/openscada/opcxmlda/" + dirName + "/opcxmlda.wsdl" ); //$NON-NLS-1$  //$NON-NLS-2$ //$NON-NLS-3$
        }
        else if ( wsdlSource instanceof UrlWsdlSource )
        {
            data.put ( "wsdlUrl", ( (UrlWsdlSource)wsdlSource ).getUrl () ); //$NON-NLS-1$
        }

        ctx.addData ( "org.openscada.da.server.opc.xmlda.server", id, data ); //$NON-NLS-1$
    }

    private String makeId ( final HiveDevice device ) throws UnsupportedEncodingException
    {
        final String id = device.getId ();
        return URLEncoder.encode ( id, "UTF-8" ); //$NON-NLS-1$
    }
}
