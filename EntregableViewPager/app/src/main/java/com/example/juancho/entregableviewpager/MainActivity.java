package com.example.juancho.entregableviewpager;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        NavigationViewListener navigationViewListener = new NavigationViewListener();
        navigationView.setNavigationItemSelectedListener(navigationViewListener);

    }

    private class NavigationViewListener implements NavigationView.OnNavigationItemSelectedListener{

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            if(item.getItemId() == R.id.about_us_item){
                Intent intent = new Intent(getBaseContext(), AboutUsActivity.class);
                startActivity(intent);
            }
            else if(item.getItemId() == R.id.restaurante_item){
                Intent intent = new Intent(getBaseContext(), RestaurantActivity.class);
                startActivity(intent);
            }
            else if(item.getItemId() == R.id.lista_recetas_item){
                Intent intent = new Intent(getApplicationContext(), ListaDeRecetasActivity.class);
                startActivity(intent);
            }
            drawerLayout.closeDrawers();
            return true;
        }
    }
}
