package com.example.juancho.entregableviewpager;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        FragmentManager unFragmentManager = getSupportFragmentManager();

        android.support.v4.app.FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        AboutUsFragment aboutUsFragment = new AboutUsFragment();
        fragmentTransaction.replace(R.id.contenedor_about_us_fragment, aboutUsFragment);

        fragmentTransaction.commit();

    }
}
