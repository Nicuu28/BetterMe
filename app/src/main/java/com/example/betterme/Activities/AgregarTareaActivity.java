package com.example.betterme.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.betterme.R;

public class AgregarTareaActivity extends AppCompatActivity {
    public String nombreTarea = "";
    public String descTarea = "";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //Hacemos referencia al archivo XML
        setContentView(R.layout.activity_agregar_tarea);

        //FindViewById busca los elementos dentro del archivo XML
        EditText editNombre = findViewById(R.id.CampoNombre);
        EditText editDescripcion = findViewById(R.id.CampoDescripcion);
        Button buttonGuardar = findViewById(R.id.buttonAgregar);
        Button buttonLeer = findViewById(R.id.buttonLeer);

        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreTarea = editNombre.getText().toString().trim();
                descTarea = editDescripcion.getText().toString().trim();
            }
        });



        buttonLeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tareaTXT = "Nombre de la tarea: "+nombreTarea+" Descripcion de la tarea: "+descTarea;
                Toast.makeText(AgregarTareaActivity.this, tareaTXT, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
