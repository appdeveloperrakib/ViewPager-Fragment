package com.appdeveloperrakib.viewpagerapp.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.appdeveloperrakib.viewpagerapp.Adapter.MyViewPagerAdapter;
import com.appdeveloperrakib.viewpagerapp.Fragment.Fragment1;
import com.appdeveloperrakib.viewpagerapp.Fragment.Fragment2;
import com.appdeveloperrakib.viewpagerapp.Fragment.Fragment3;
import com.appdeveloperrakib.viewpagerapp.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    MyViewPagerAdapter myAdapter;

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);

        myAdapter = new MyViewPagerAdapter(
                getSupportFragmentManager(),getLifecycle()
        );

        // Addimg Fragments to the list in the adapter class

        myAdapter.addFragment(new Fragment1());
        myAdapter.addFragment(new Fragment2());
        myAdapter.addFragment(new Fragment3());

        //Set the orientation in ViewPager2

        viewPager2 = findViewById(R.id.viewPager);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        //Connecting the adapter with viewpager2

        viewPager2.setAdapter(myAdapter);

        //Connecting tablayout with viewpager

        new TabLayoutMediator(
                tabLayout,
                viewPager2,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText("Fragment "+(position+1));
                    }
                }

        ).attach();





    }
}