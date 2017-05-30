package com.example.juancho.entregableviewpager;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class ListaDeRecetasActivity extends AppCompatActivity implements ListaDeRecetasFragment.InformableReceta{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_recetas);

        Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show();

        FragmentManager unFragmentManager = getSupportFragmentManager();

        android.support.v4.app.FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        ListaDeRecetasFragment listaDeRecetasFragment = new ListaDeRecetasFragment();
        fragmentTransaction.replace(R.id.contenedor_lista_recetas_fragment, listaDeRecetasFragment);

        fragmentTransaction.commit();

    }

    @Override
    public void recetaASeleccionar(Receta receta) {
        Intent intent = new Intent(this, DetalleRecetaActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString(DetalleRecetaFragment.TITULO_RECETA,receta.getTitulo());
        bundle.putInt(DetalleRecetaFragment.IMAGE_RECETA,receta.getImage());
        bundle.putString(DetalleRecetaFragment.DESCRIPCION_RECETA,receta.getDescription());

        intent.putExtras(bundle);

        startActivity(intent);

    }
}
