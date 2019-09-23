package com.techdoctorbd.calculator.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techdoctorbd.calculator.R;


public class LifeFragment extends Fragment {

    private static LifeFragment INSTANCE = null;

    public LifeFragment() {

    }

    public static LifeFragment getInstance()
    {
        if (INSTANCE == null)
            INSTANCE = new LifeFragment();
        return INSTANCE;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View lifeView = inflater.inflate(R.layout.fragment_life, container, false);




        return lifeView;
    }

}
