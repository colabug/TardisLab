package com.colabug.TardisLab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Author: Corey Leigh Latislaw
 * Date: 5/30/13
 * Purpose:
 */
public class OutsideTardisFragment extends Fragment
{
    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState )
    {
        View layout = inflater.inflate( R.layout.outside_tardis, container, false );
        return layout;
    }
}
