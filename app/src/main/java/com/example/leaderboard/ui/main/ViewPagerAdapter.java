package com.example.leaderboard.ui.main;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.leaderboard.R;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.learning_leaders, R.string.skill_iq_leaders};
    private final Context mContext;

    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return LearnerFragment.newInstance();
            case 1:
                return SkillFragment.newInstance();
        }
        return LearnerFragment.newInstance();
    }


    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }

}