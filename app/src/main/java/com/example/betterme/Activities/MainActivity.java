package com.example.betterme.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;
import com.example.betterme.ClasesConcretas.Tarea;

import com.example.betterme.R;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.betterme.databinding.ActivityMainBinding;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Primero inflamos el binding y seteamos el layout
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        // Configuramos el botón flotante usando el binding
        //agregar es la ID del boton
        binding.appBarMain.agregar.setOnClickListener(new View.OnClickListener() {
            LocalDateTime fecha = LocalDateTime.parse("2025-11-03 23:59:59");
            Tarea tarea = new Tarea(1, "NombreDeTarea", "Esto es una tarea",fecha, true, false, true);
            String tareaTXT = "Tarea: " + tarea.getNombre() + " Descripción: " + tarea.getDescripcion();

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, tareaTXT, Toast.LENGTH_SHORT).show();
            }
        });

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;



        Button nuevaClase = findViewById(R.id.buttonPruebaVerClase);
        nuevaClase.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AgregarTareaActivity.class);
                startActivity(intent);
            }
        });





        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}