/*******************************************************************************
 * Copyright (c) 2016 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.openscada.configuration.lib;

import org.eclipse.emf.common.util.EList;
import org.eclipse.scada.configuration.lib.Nodes;
import org.eclipse.scada.configuration.world.Node;
import org.eclipse.scada.configuration.world.deployment.CommonDeploymentMechanism;
import org.eclipse.scada.configuration.world.deployment.DeploymentMechanism;
import org.eclipse.scada.configuration.world.osgi.EquinoxApplication;

public final class Helper
{
    private Helper ()
    {
    }

    public static void ensureOpenScadaDependency ( final EquinoxApplication application )
    {
        final Node node = Nodes.fromApp ( application );
        for ( final DeploymentMechanism dm : node.getDeployments () )
        {
            if ( dm instanceof CommonDeploymentMechanism )
            {
                final EList<String> deps = ( (CommonDeploymentMechanism)dm ).getAdditionalDependencies ();
                if ( !deps.contains ( "org.openscada.p2" ) )
                {
                    deps.add ( "org.openscada.p2" );
                }
            }
        }
    }

}
