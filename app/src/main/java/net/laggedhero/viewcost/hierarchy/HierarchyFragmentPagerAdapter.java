package net.laggedhero.viewcost.hierarchy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class HierarchyFragmentPagerAdapter extends FragmentPagerAdapter {

    public HierarchyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BadHierarchyFragment();
        }

        return new GoodHierarchyFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Bad";
        }

        return "Good";
    }
}
