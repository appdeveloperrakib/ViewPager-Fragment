package com.appdeveloperrakib.viewpagerapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.appdeveloperrakib.viewpagerapp.Adapter.MyViewPagerAdapter;
import com.appdeveloperrakib.viewpagerapp.Fragment.Fragment1;
import com.appdeveloperrakib.viewpagerapp.Fragment.Fragment2;
import com.appdeveloperrakib.viewpagerapp.Fragment.Fragment3;
import com.appdeveloperrakib.viewpagerapp.R;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    MyViewPagerAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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






    }
}