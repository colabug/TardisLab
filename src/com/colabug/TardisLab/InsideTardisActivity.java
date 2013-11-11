package com.colabug.TardisLab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class InsideTardisActivity extends FragmentActivity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.inside_tardis_single_pane );
    }

    public static Intent createIntent( Context context )
    {
        return new Intent( context, InsideTardisActivity.class );
    }
}