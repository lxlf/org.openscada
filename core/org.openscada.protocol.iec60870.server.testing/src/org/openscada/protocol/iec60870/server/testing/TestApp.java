package org.openscada.protocol.iec60870.server.testing;

import java.util.ArrayList;
import java.util.List;

import org.openscada.protocol.iec60870.ProtocolOptions;
import org.openscada.protocol.iec60870.server.Server;
import org.openscada.protocol.iec60870.server.ServerModule;
import org.openscada.protocol.iec60870.server.data.DataModule;
import org.openscada.protocol.iec60870.server.data.DataModuleOptions;

public class TestApp
{
    public static void main ( String[] args ) throws Exception
    {
        new TestApp ().run ();
    }

    private Server server;

    private TestModel dataModel;

    private void run () throws Exception
    {
        while ( true )
        {
            createServer ();
            destroyServer ();
        }
    }

    private void createServer () throws Exception
    {
        ProtocolOptions protocolOptions = new ProtocolOptions.Builder ().build ();
        DataModuleOptions options = new DataModuleOptions.Builder ().build ();
        dataModel = new TestModel ();
        DataModule d = new DataModule ( options, dataModel );
        List<ServerModule> sm = new ArrayList<> ();
        sm.add ( d );
        server = new Server ( 2404, protocolOptions, sm );
    }

    private void destroyServer ()
    {
        if ( server != null )
        {
            try
            {
            	System.out.println("closing ...");
                server.closeAndWait();
            	System.out.println(".. closed");
            }
            catch ( Exception e )
            {
                e.printStackTrace ();
            }
            server = null;
        }
        if ( dataModel != null )
        {
            try
            {
                dataModel.dispose ();
            }
            catch ( Exception e )
            {
                e.printStackTrace ();
            }
            dataModel = null;
        }
    }
}