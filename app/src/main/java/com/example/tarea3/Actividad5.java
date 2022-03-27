package com.example.tarea3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Actividad5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad5);

        //Obetenos las Imagenes
        ImageView imageView = findViewById(R.id.imageView);

        // Obtener el intent que se nos fue enviado
        Intent intent = getIntent();
        // Al ImageView le ponemos el auto
        imageView.setImageResource(R.drawable.pantalla5);


        // Obtener referencias de los botones que nos deplasaroan por mlas actividades
        Button botonEntrar1 = findViewById(R.id.button);
        Button botonEntrar2 = findViewById(R.id.button2);
        Button botonEntrar3 = findViewById(R.id.button3);
        Button botonEntrar4 = findViewById(R.id.button4);
        Button botonEntrar5 = findViewById(R.id.button5);

        // Ahora escuchamos el click del botón
        botonEntrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ahora vamos la otra actividad
                Intent intent = new Intent(Actividad5.this, MainActivity.class);
                startActivity(intent);
            }
        });
        // Ahora escuchamos el click del botón
        botonEntrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ahora vamos la otra actividad
                Intent intent = new Intent(Actividad5.this, Actividad2.class);
                startActivity(intent);
            }
        });
        // Ahora escuchamos el click del botón
        botonEntrar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ahora vamos la otra actividad
                Intent intent = new Intent(Actividad5.this, Actividad3.class);
                startActivity(intent);
            }
        });
        // Ahora escuchamos el click del botón
        botonEntrar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ahora vamos la otra actividad
                Intent intent = new Intent(Actividad5.this, Actividad4.class);
                startActivity(intent);
            }
        });
        // Ahora escuchamos el click del botón
        botonEntrar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ahora vamos la otra actividad
                Intent intent = new Intent(Actividad5.this, Actividad5.class);
                startActivity(intent);
            }
        });

    }
}