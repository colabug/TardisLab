package com.colabug.TardisLab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;

public class HelloTardisActivity extends FragmentActivity
{
    @Override
    public void onCreate (Bundle savedInstanceState)
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.hello_tardis );

        Fragment fragment = getSupportFragmentManager().findFragmentById( R.id.outside_fragment );
        fragment.getView().setOnClickListener( generateOutsideClickListener() );
    }

    private View.OnClickListener generateOutsideClickListener ()
    {
        return new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                // "Tablet"
                if ( isMultiPaneLayout() )
                {
                    Toast.makeText( HelloTardisActivity.this,
                                    "PARADOX",
                                    Toast.LENGTH_SHORT ).show();
                }
                // "Phone"
                else
                {
                    startActivity( InsideTardisActivity.createIntent( HelloTardisActivity.this ) );
                }
            }
        };
    }

    private boolean isMultiPaneLayout()
    {
        Fragment insideFragment = getSupportFragmentManager().findFragmentById( R.id.inside_fragment );
        return insideFragment != null &&
               insideFragment.isInLayout() &&
               insideFragment.isVisible();
    }
}