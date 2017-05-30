package com.example.juancho.entregableviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juancho on 30/05/17.
 */

public class PageViewImagesAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments = new ArrayList<>();
    private List<Integer> images;

    public PageViewImagesAdapter(FragmentManager fm, List<Integer> images) {
        super(fm);
        this.images = images;

        for (Integer image: this.images) {
            fragments.add(RestaurantImageFragment.dameFragmentoImagen(image));
        }

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
