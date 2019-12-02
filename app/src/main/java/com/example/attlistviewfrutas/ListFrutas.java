package com.example.attlistviewfrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class ListFrutas extends AppCompatActivity {

    ListView listView;
    private Object ListFrutas;

    public ListFrutas(Context applicationContext, int templete_item, Fruta[] frutas) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_frutas);

        listView = findViewById(R.id.listView);
        Controller frutaController= new Controller();

        com.example.attlistviewfrutas.ListFrutas adapter;
        ListFrutas = adapter = new ListFrutas(getApplicationContext(), R.layout.templete_item,frutaController.FRUTAS);
        
        listView.setAdapter(adapter);

    }
}


