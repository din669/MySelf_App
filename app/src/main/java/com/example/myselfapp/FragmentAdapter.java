package com.example.myselfapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter {


    public FragmentAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        MusicFragment fragment = new MusicFragment();
        Bundle bundle = new Bundle();
        return null;
    }


    @Override
    public int getCount() {
        return 2;
    }
}
