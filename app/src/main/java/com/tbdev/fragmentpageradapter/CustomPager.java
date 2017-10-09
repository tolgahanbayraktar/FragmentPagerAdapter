package com.tbdev.fragmentpageradapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by developer on 9.10.2017.
 */

/**
 * FragmentPagerAdapter
 * kullanırsak fragmentlerde herhangibir remove işlemi olmaz
 * detach işlemi olur fragment activitiden detach olur ama hafızadan silinmez
 * mCurTransaction.detach((Fragment)object);
 */

/**
 * FragmentStatePagerAdapter
 * kullanırsak fragmentler silinir ve hafızada yer kaplamaz
 * mCurTransaction.remove(fragment);
 */

class CustomPager extends FragmentPagerAdapter {

    private final int ITEMS = 6;

    public CustomPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new FragmentOne();
                break;
            case 1:
                fragment = new FragmentTwo();
                break;
            case 2:
                fragment = new FragmentThree();
                break;
            case 3:
                fragment = new FragmentFour();
                break;
            case 4:
                fragment = new FragmentFive();
                break;
            case 5:
                fragment = new FragmentSix();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return ITEMS;
    }
}
