package com.techdoctorbd.calculator.Adapters;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.techdoctorbd.calculator.Fragments.CalculatorFragment;
import com.techdoctorbd.calculator.Fragments.LifeFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentsAdapter(FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return CalculatorFragment.getInstance();
        else if (position == 1)
            return LifeFragment.getInstance();
        else return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "Calculator";

            case 1:
                return "Life";
        }
        return "";
    }
}
