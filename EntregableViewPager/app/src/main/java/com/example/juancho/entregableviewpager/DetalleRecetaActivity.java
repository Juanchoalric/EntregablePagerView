package com.example.juancho.entregableviewpager;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetalleRecetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_receta);

        Intent intentQueRecibeInfo = getIntent();

        FragmentManager unFragmentManager = getSupportFragmentManager();

        android.support.v4.app.FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        DetalleRecetaFragment detalleRecetaFragment = new DetalleRecetaFragment();
        fragmentTransaction.replace(R.id.contenedor_detalle_receta_fragment, detalleRecetaFragment);

        detalleRecetaFragment.setArguments(intentQueRecibeInfo.getExtras());

        fragmentTransaction.commit();
    }
}
