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

import org.eclipse.scada.configuration.infrastructure.AbstractFactoryDriver;
import org.eclipse.scada.configuration.infrastructure.CommonDriver;
import org.eclipse.scada.configuration.infrastructure.Device;
import org.eclipse.scada.configuration.infrastructure.World;
import org.eclipse.scada.configuration.infrastructure.lib.AbstractCommonDriverFactory;
import org.eclipse.scada.configuration.infrastructure.lib.DeviceTypeValidator;
import org.eclipse.scada.configuration.infrastructure.lib.DeviceValidator;
import org.eclipse.scada.utils.ecore.validation.ValidationContext;
import org.openscada.da.snmp.configuration.ConfigurationFactory;
import org.openscada.da.snmp.configuration.ConnectionType;
import org.openscada.da.snmp.configuration.SnmpVersion;

public class DriverFactoryImpl extends AbstractCommonDriverFactory<SnmpDriver>
{

    public DriverFactoryImpl ()
    {
        addValidator ( new DeviceTypeValidator<CommonDriver> ( SnmpDevice.class ) );
        addValidator ( new DeviceValidator<CommonDriver, SnmpDevice> ( SnmpDevice.class ) {
            @Override
            protected void validateDevice ( final SnmpDevice device, final ValidationContext ctx )
            {
            }
        } );
    }

    @Override
    protected SnmpDriver createDriver ()
    {
        final SnmpDriver driver = SnmpFactory.eINSTANCE.createSnmpDriver ();
        driver.setConfiguration ( ConfigurationFactory.eINSTANCE.createConfigurationType () );
        driver.getConfiguration ().setMibs ( ConfigurationFactory.eINSTANCE.createMibsType () );
        return driver;
    }

    @Override
    protected void configureDriver ( final World world, final AbstractFactoryDriver infraDriver, final SnmpDriver driver )
    {
        for ( final Device device : infraDriver.getDevices () )
        {
            if ( ! ( device instanceof SnmpDevice ) )
            {
                throw new IllegalStateException ( String.format ( "Device type %s is not supported", device.getClass () ) );
            }
            createDevice ( world, driver, (SnmpDevice)device );
        }
    }

    private void createDevice ( final World world, final SnmpDriver driver, final SnmpDevice device )
    {
        // add connection
        final ConnectionType connection = ConfigurationFactory.eINSTANCE.createConnectionType ();
        connection.setVersion ( SnmpVersion.get ( device.getVersion ().getValue () ) );
        connection.setAddress ( toAddress ( device ) );
        connection.setCommunity ( device.getCommunity () );
        connection.setName ( device.getName () );
        driver.getConfiguration ().getConnection ().add ( connection );

        // add mibs, but only if they not present already
        for ( final MibsType mibs : device.getMibs () )
        {
            if ( mibs instanceof MibDir )
            {
                if ( !driver.getConfiguration ().getMibs ().getMibDir ().contains ( mibs.getPath () ) )
                {
                    driver.getConfiguration ().getMibs ().getMibDir ().add ( mibs.getPath () );
                }
            }
            else if ( mibs instanceof RecursiveMibDir )
            {
                if ( !driver.getConfiguration ().getMibs ().getRecursiveMibDir ().contains ( mibs.getPath () ) )
                {
                    driver.getConfiguration ().getMibs ().getRecursiveMibDir ().add ( mibs.getPath () );
                }
            }
            else if ( mibs instanceof StaticMibName )
            {
                if ( !driver.getConfiguration ().getMibs ().getStaticMibName ().contains ( mibs.getPath () ) )
                {
                    driver.getConfiguration ().getMibs ().getStaticMibName ().add ( mibs.getPath () );
                }
            }
        }
    }

    private String toAddress ( final SnmpDevice device )
    {
        final StringBuilder sb = new StringBuilder ( 32 );
        sb.append ( device.getProtocol () );
        sb.append ( ":" );
        sb.append ( device.getNode ().getHostName () );
        sb.append ( "/" );
        sb.append ( device.getPort () );
        return sb.toString ();
    }
}
