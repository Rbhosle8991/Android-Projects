package com.example.chatapp_resume_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class Homepage extends AppCompatActivity {

    TabLayout firsttablayout;
    ViewPager2 firstviewpager;

  viewpageradapter viewpageradapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        firsttablayout = findViewById(R.id.firsttablayout);
        firstviewpager = findViewById(R.id.firstviewpager);
        viewpageradapter = new viewpageradapter(this);

        firstviewpager.setAdapter(viewpageradapter);

        firsttablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                firstviewpager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        firstviewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                Objects.requireNonNull(firsttablayout.getTabAt(position)).select();
            }
        });

    }
}