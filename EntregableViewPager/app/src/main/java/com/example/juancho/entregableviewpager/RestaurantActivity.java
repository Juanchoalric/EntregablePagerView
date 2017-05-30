package com.example.juancho.entregableviewpager;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);

        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.astridygaston);
        images.add(R.drawable.borago);
        images.add(R.drawable.central);
        images.add(R.drawable.dom);
        images.add(R.drawable.maido);
        images.add(R.drawable.quintonil);
        images.add(R.drawable.tegui);

        PageViewImagesAdapter viewPagerAdapter = new PageViewImagesAdapter(getSupportFragmentManager(),images);
        viewPager.setAdapter(viewPagerAdapter);


    }
}
