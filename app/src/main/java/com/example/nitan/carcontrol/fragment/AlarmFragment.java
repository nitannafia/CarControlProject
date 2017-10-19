package com.example.nitan.carcontrol.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nitan.carcontrol.R;


public class AlarmFragment extends Fragment {

    public AlarmFragment (){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageOne=inflater.inflate(R.layout.fragment_alarm, container, false);
        return PageOne;
    }
}
