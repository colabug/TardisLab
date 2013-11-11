package com.colabug.TardisLab;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class HelloTardisActivity extends FragmentActivity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.hello_tardis );
    }
}
