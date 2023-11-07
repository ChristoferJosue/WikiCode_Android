package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {
    ImageButton btnRegreso;//declaración de el boton


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnRegreso=(ImageButton) findViewById(R.id.btnAtras);
        btnRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent packageContext;
                Intent btnAtras= new Intent(MainActivity3.this,MainActivity.class);//regresa a la actividad anterior, osea a la main
                startActivity(btnAtras);

            }
        });
    }
}