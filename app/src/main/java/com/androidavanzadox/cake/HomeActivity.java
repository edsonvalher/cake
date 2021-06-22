package com.androidavanzadox.cake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lista;
    List<String> androidVersionList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //recibe parametro
        Bundle extras = getIntent().getExtras();
        String email = extras.getString("valoremail");
        //colocar titulo de pantalla
        setTitle(email);


        //conectar listview a nuestra instancia
        lista = findViewById(R.id.listVista);

        // cargar los elementos
        androidVersionList = new ArrayList<>();
        androidVersionList.add("Pie");
        androidVersionList.add("Q");
        androidVersionList.add("Oreo");
        androidVersionList.add("Nougat");
        androidVersionList.add("Marshmallow");
        androidVersionList.add("Lolipop");
        androidVersionList.add("Kitkat");

        //adaptar arreglo a al tipo de lista (diseño) componente
        ArrayAdapter adaptador = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1,androidVersionList
        );

        //vincular adaptador a listview
        lista.setAdapter(adaptador);

        //gestion de evento click en cada elemento de lista
        lista.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //obtiene el valor por posicion de los elementos de la lista y se busca por posición dentro del array
        String valorversion = androidVersionList.get(position);
        //muestra encontrado
        Toast.makeText(this,valorversion,Toast.LENGTH_SHORT).show();


    }
}