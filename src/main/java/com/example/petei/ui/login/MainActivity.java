package com.example.petei.ui.login;

import android.os.Bundle;

import com.example.petei.data.MyListData;
import com.example.petei.data.adapter.MyListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import android.support.v7.widget.RecyclerView;

import android.view.View;

import com.example.petei.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listaPlanesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MyListData[] myListData = new MyListData[] {
                new MyListData("Email", R.mipmap.cero_rojo),
                new MyListData("Info", android.R.drawable.ic_dialog_info),
                new MyListData("Delete", android.R.drawable.ic_delete),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert),
                new MyListData("Map", android.R.drawable.ic_dialog_map),
                new MyListData("Email", android.R.drawable.ic_dialog_email),
                new MyListData("Info", android.R.drawable.ic_dialog_info),
                new MyListData("Delete", android.R.drawable.ic_delete),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert),
                new MyListData("Map", android.R.drawable.ic_dialog_map),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lista_cartas);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        /*listaPlanesView = (RecyclerView) findViewById(R.id.lista_cartas);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        listaPlanesView.setLayoutManager(mLayoutManager);*/


    }

    /*@Override
    public void onStart() {
        super.onStart();
        List<Carta> datos = new ArrayList<Carta>();
        datos.add(new Carta(1, 0));
        datos.add(new Carta(4, 1));
        datos.add(new Carta(5, 3));
        datos.add(new Carta(8, 0));
        datos.add(new Carta(9, 2));
        datos.add(new Carta(6, 1));
        datos.add(new Carta(7, 3));
        cargarDatos(datos);
    }

    /*private void cargarDatos(List<Carta> datos) {
        AdapterCartas mAdapter = new AdapterCartas(this);
        listaPlanesView.setAdapter(mAdapter);
        for (Carta plan: datos) {
            mAdapter.addItem(plan);
        }
    }*/

}
