package com.example.wekaradwan.daraksablood;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weka radwan on 6/22/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{

    private final List<Fragment> listOfFragment = new ArrayList<>();
    private final List<String> listOfTitle = new ArrayList<>();


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return listOfFragment.get(position);
    }


    @Override
    public int getCount() {
        return listOfTitle.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listOfTitle.get(position);
    }

    public void AddFragment(Fragment fragment, String title){
        listOfFragment.add(fragment);
        listOfTitle.add(title);
    }


}
