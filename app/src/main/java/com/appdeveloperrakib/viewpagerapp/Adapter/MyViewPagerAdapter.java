package com.appdeveloperrakib.viewpagerapp.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> fragmentlist = new ArrayList<>();
    public MyViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        /* responsible for creating and returing a
        fragment for a specific position within ViewPager2
         */


        return fragmentlist.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentlist.size();
    }

    public  void addFragment (Fragment fragment){
        fragmentlist.add(fragment);
    }

}
