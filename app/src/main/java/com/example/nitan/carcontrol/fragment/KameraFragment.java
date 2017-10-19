package com.example.nitan.carcontrol.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nitan.carcontrol.R;

/**
 * Created by nitan on 10/15/2017.
 */

public class KameraFragment extends Fragment {

    public KameraFragment (){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageTwo=inflater.inflate(R.layout.fragment_kamera, container, false);
        return PageTwo;
    }
}

