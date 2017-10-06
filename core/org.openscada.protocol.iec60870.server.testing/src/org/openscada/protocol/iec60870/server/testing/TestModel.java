package org.openscada.protocol.iec60870.server.testing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

import org.openscada.protocol.iec60870.asdu.ASDUHeader;
import org.openscada.protocol.iec60870.asdu.types.ASDUAddress;
import org.openscada.protocol.iec60870.asdu.types.CauseOfTransmission;
import org.openscada.protocol.iec60870.asdu.types.CommandValue;
import org.openscada.protocol.iec60870.asdu.types.InformationEntry;
import org.openscada.protocol.iec60870.asdu.types.InformationObjectAddress;
import org.openscada.protocol.iec60870.asdu.types.StandardCause;
import org.openscada.protocol.iec60870.asdu.types.Value;
import org.openscada.protocol.iec60870.io.MirrorCommand;
import org.openscada.protocol.iec60870.server.data.AbstractBaseDataModel;
import org.openscada.protocol.iec60870.server.data.BackgroundIterator;
import org.openscada.protocol.iec60870.server.data.DataListener;

import com.google.common.base.Function;
import com.google.common.util.concurrent.ListenableFuture;

public class TestModel extends AbstractBaseDataModel
{

    private static final ASDUAddress ASDU_ADDRESS = ASDUAddress.valueOf ( 1 );

    private static final CauseOfTransmission spontaneousCause = new CauseOfTransmission ( StandardCause.SPONTANEOUS );


    public TestModel (  )
    {
        super ( "x" );
    }

    @Override
    public ListenableFuture<Value<?>> read ( ASDUAddress asduAddress, final InformationObjectAddress address )
    {
        if ( !ASDU_ADDRESS.equals ( asduAddress ) )
        {
            return null;
        }
        return this.executor.submit ( new Callable<Value<?>> () {

            @Override
            public Value<?> call () throws Exception
            {
                
                return null;
            }
        } );

    }

    @Override
    public ListenableFuture<Void> readAll ( CauseOfTransmission cause, ASDUAddress asduAddress, Runnable prepare, final DataListener listener )
    {
        if ( !ASDU_ADDRESS.equals ( asduAddress ) )
        {
            return null;
        }

        this.executor.submit ( prepare );

        return this.executor.submit ( new Callable<Void> () {

            @SuppressWarnings ( "unchecked" )
            @Override
            public Void call () throws Exception
            {
                List<InformationEntry<Boolean>> booleans = new LinkedList<> ();
                List<InformationEntry<Float>> floats = new LinkedList<> ();
                int i = 0;
                for ( Value<?> value : allValues () )
                {
                    if ( value.getValue () instanceof Boolean )
                    {
                        booleans.add ( new InformationEntry<Boolean> ( InformationObjectAddress.valueOf ( i ), (Value<Boolean>)value ) );
                    }
                    else if ( value.getValue () instanceof Float )
                    {
                        floats.add ( new InformationEntry<Float> ( InformationObjectAddress.valueOf ( i ), (Value<Float>)value ) );
                    }
                    i++;
                }
                listener.dataChangeBoolean ( CauseOfTransmission.ACTIVATED, ASDU_ADDRESS, booleans );
                listener.dataChangeFloat ( CauseOfTransmission.ACTIVATED, ASDU_ADDRESS, floats );
                return null;
            }
        } );
    }

    @Override
    public BackgroundIterator createBackgroundIterator ()
    {
        return null;
    }

    @Override
    public void forAllAsdu ( Function<ASDUAddress, Void> function, Runnable ifNoneFound )
    {
        function.apply ( ASDU_ADDRESS );
    }

    @Override
    public void writeValue ( ASDUHeader header, InformationObjectAddress informationObjectAddress, CommandValue<?> value, byte type, MirrorCommand mirrorCommand, boolean execute )
    {
        if ( informationObjectAddress.getAddress () == 10 )
        {
        }
        if ( informationObjectAddress.getAddress () == 11 )
        {
        }
        mirrorCommand.sendActivationTermination ();
    }

    private List<Value<?>> allValues ()
    {
        final List<Value<?>> result = new ArrayList<> ( 12 );

        return result;
    }

    @SuppressWarnings ( "unchecked" )
    public void update ()
    {
        List<InformationEntry<Boolean>> booleans = new LinkedList<> ();
        List<InformationEntry<Float>> floats = new LinkedList<> ();
      
        notifyChangeBoolean ( spontaneousCause, ASDU_ADDRESS, booleans );
        notifyChangeFloat ( spontaneousCause, ASDU_ADDRESS, floats );
    }
}