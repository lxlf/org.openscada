/*******************************************************************************
 * Copyright (c) 2013, 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.openscada.configuration.opc;

import org.eclipse.scada.configuration.infrastructure.AbstractFactoryDriver;
import org.eclipse.scada.configuration.infrastructure.CommonDriver;
import org.eclipse.scada.configuration.infrastructure.Device;
import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.infrastructure.Node;
import org.eclipse.scada.configuration.infrastructure.World;
import org.eclipse.scada.configuration.infrastructure.lib.AbstractCommonDriverFactory;
import org.eclipse.scada.configuration.infrastructure.lib.DeviceTypeValidator;
import org.eclipse.scada.configuration.infrastructure.lib.DeviceValidator;
import org.eclipse.scada.utils.ecore.validation.Severity;
import org.eclipse.scada.utils.ecore.validation.ValidationContext;
import org.openscada.da.opc.configuration.ConfigurationFactory;
import org.openscada.da.opc.configuration.ConfigurationType;

public class DriverFactoryImpl extends AbstractCommonDriverFactory<OpcDriver>
{

    public DriverFactoryImpl ()
    {
        addValidator ( new DeviceTypeValidator<CommonDriver> ( OpcDevice.class ) );
        addValidator ( new DeviceValidator<CommonDriver, OpcDevice> ( OpcDevice.class ) {
            @Override
            protected void validateDevice ( final OpcDevice device, final ValidationContext ctx )
            {
                if ( getNode ( device ) == null )
                {
                    ctx.add ( InfrastructurePackage.Literals.NODE__DEVICES, Severity.ERROR, "OPC device must be contained by a node", device );
                }
                if ( ( device.getClassId () == null || device.getClassId ().isEmpty () ) && ( device.getProgId () == null || device.getProgId ().isEmpty () ) )
                {
                    ctx.add ( OpcPackage.Literals.OPC_DEVICE__PROG_ID, Severity.ERROR, "OPC device must have either \"ClassId\" or \"ProgId\" set", device );
                }
            }
        } );
    }

    @Override
    protected OpcDriver createDriver ()
    {
        final OpcDriver driver = OpcFactory.eINSTANCE.createOpcDriver ();
        driver.setRoot ( ConfigurationFactory.eINSTANCE.createRootType () );
        driver.getRoot ().setConnections ( ConfigurationFactory.eINSTANCE.createConnectionsType () );

        driver.setSocketTimeout ( 10_000 );

        return driver;
    }

    @Override
    protected void configureDriver ( final World world, final AbstractFactoryDriver infraDriver, final OpcDriver driver )
    {
        for ( final Device device : infraDriver.getDevices () )
        {
            if ( ! ( device instanceof OpcDevice ) )
            {
                throw new IllegalStateException ( String.format ( "Device type %s is not supported", device.getClass () ) );
            }
            createDevice ( world, driver, (OpcDevice)device );
        }
    }

    private Node getNode ( final OpcDevice device )
    {
        if ( device.eContainer () instanceof Node )
        {
            return (Node)device.eContainer ();
        }
        return null;
    }

    private void createDevice ( final World world, final OpcDriver driver, final OpcDevice device )
    {
        final ConfigurationType cfg = ConfigurationFactory.eINSTANCE.createConfigurationType ();
        driver.getRoot ().getConnections ().getConfiguration ().add ( cfg );

        cfg.setAlias ( device.getName () );

        cfg.setAccess ( "SYNC" ); //$NON-NLS-1$
        cfg.setClsid ( device.getClassId () );
        cfg.setProgid ( device.getProgId () );
        cfg.setConnected ( true );
        cfg.setEnabled ( true );

        cfg.setDomain ( device.getDomain () == null ? "" : device.getDomain () ); //$NON-NLS-1$
        cfg.setUser ( device.getUser () );
        cfg.setPassword ( device.getPassword () );
        cfg.setHost ( getNode ( device ).getHostName () );

        cfg.setFlatBrowser ( false );
        cfg.setTreeBrowser ( true );
        cfg.setReconnectDelay ( device.getReconnectDelay () );
        cfg.setRefresh ( device.getPollRate () );
    }
}
