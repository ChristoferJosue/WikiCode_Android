package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ImageButton BtnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        BtnSalir=(ImageButton) findViewById(R.id.btnSalir);
        BtnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finaliza todo
                finishAffinity();
            }
        });

        //lista de nombres e iconos de los diferentes lenguajes
        String[] nombreLenguaje={"C","Java","Python","C#"};
        int[] imagen={R.drawable.c,R.drawable.j,R.drawable.p,R.drawable.d};


        GridAdapter gridAdapter= new GridAdapter(MainActivity.this,nombreLenguaje,imagen);
        binding.Grid1.setAdapter(gridAdapter);
        //si haces click a un item en el gridview
        binding.Grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent packageContext;
                switch (i){
                    //va ser el case para el c
                    case 0:

                        Intent Grid1=new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(Grid1);
                        break;
                    //case para java
                    case 1:

                        Intent Grid2=new Intent(MainActivity.this, MainActivity3.class);
                        startActivity(Grid2);
                        break;

                    //case para python
                    case 2:
                        Intent Grid3=new Intent(MainActivity.this, MainActivity4.class);
                        startActivity(Grid3);

                        break;
                    //case para c#
                    case 3:
                        Intent Grid4=new Intent(MainActivity.this, MainActivity5.class);
                        startActivity(Grid4);
                        break;
                }

                Toast.makeText(MainActivity.this,"Clickeaste "+nombreLenguaje[i] , Toast.LENGTH_SHORT).show();
            }

        });






    }
}