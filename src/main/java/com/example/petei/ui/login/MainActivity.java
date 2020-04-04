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
import android.widget.ImageView;
import android.widget.Toast;

import com.example.petei.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<Carta> cartas = new ArrayList<Carta>();
    final List<MyListData> myListData = new ArrayList<MyListData>();
    MyListAdapter adapter;
    ImageView mazoView;
    ImageView cartaActualView;
    View colorActualView;
    ImageView sacarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mazoView = findViewById(R.id.mazoView);
        mazoView.setImageResource(R.mipmap.carta_mazo);

        cartaActualView = findViewById(R.id.cartaActualView);
        cartaActualView.setImageResource(R.mipmap.amarillo_0);

        colorActualView = findViewById(R.id.colorActualView);
        //colorActualView.setImageResource(R.mipmap.rojo_6);

        sacarView = findViewById(R.id.sacarView);
        sacarView.setImageResource(R.mipmap.download);
        sacarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agarrar(R.mipmap.amarillo_0);
            }
        });

        cartas.add(new Carta(R.mipmap.rojo_0));
        cartas.add(new Carta(R.mipmap.rojo_1));
        cartas.add(new Carta(R.mipmap.rojo_2));
        cartas.add(new Carta(R.mipmap.rojo_3));
        cartas.add(new Carta(R.mipmap.rojo_4));
        cartas.add(new Carta(R.mipmap.rojo_5));
        cartas.add(new Carta(R.mipmap.rojo_6));
        cartas.add(new Carta(R.mipmap.rojo_7));
        cartas.add(new Carta(R.mipmap.rojo_8));
        //cartas.add(new Carta(R.mipmap.rojo_9));

        for (int i = 0; i < cartas.size(); i = i + 2) {
            int item1 = cartas.get(i).getImgId();
            int item2 = -1;
            if (i < cartas.size() - 1) {
                item2 = cartas.get(i + 1).getImgId();
            }
            myListData.add(new MyListData(item1, item2));
        }

        recyclerView = (RecyclerView) findViewById(R.id.lista_cartas);
        adapter = new MyListAdapter(myListData) {
            @Override
            public void onBindViewHolder(ViewHolder holder, final int position) {

                holder.imageView.setImageResource(myListData.get(position).getImgId1());
                if (myListData.get(position).getImgId2() != -1) {
                    holder.imageView2.setImageResource(myListData.get(position).getImgId2());
                    holder.actionView2.setImageResource(R.mipmap.upload);
                    holder.actionView2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int aux = (position * 2) + 1;
                            cargar(aux);
                        }
                    });
                }

                holder.actionView.setImageResource(R.mipmap.upload);
                holder.actionView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cargar(position * 2);
                    }
                });
            }
        };
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void cargar(int pos) {

        List<Carta> tmp = new ArrayList<Carta>();
        for (Carta item : cartas) {
            tmp.add(item);
        }
        cartas.clear();
        myListData.clear();
        int i = 0;
        for (Carta item : tmp) {
            if (i != pos) {
                cartas.add(item);
            } else {
                cartaActualView.setImageResource(item.getImgId());
            }
            i++;
        }

        for (int j = 0; j < cartas.size(); j = j + 2) {
            int item1 = cartas.get(j).getImgId();
            int item2 = -1;
            if (j < cartas.size() - 1) {
                item2 = cartas.get(j+1).getImgId();
            }
            myListData.add(new MyListData(item1, item2));
        }

        adapter = new MyListAdapter(myListData) {
            @Override
            public void onBindViewHolder(ViewHolder holder, final int position) {

                holder.imageView.setImageResource(myListData.get(position).getImgId1());
                if (myListData.get(position).getImgId2() != -1) {
                    holder.imageView2.setImageResource(myListData.get(position).getImgId2());
                    holder.actionView2.setImageResource(R.mipmap.upload);
                    holder.actionView2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int aux = (position * 2) + 1;
                            cargar(aux);
                        }
                    });
                }

                holder.actionView.setImageResource(R.mipmap.upload);
                holder.actionView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cargar(position * 2);
                    }
                });
            }
        };
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        //adapter.notifyDataSetChanged();
    }

    public void agarrar(int img) {

        cartas.add(new Carta(img));
        myListData.clear();

        for (int i = 0; i < cartas.size(); i = i + 2) {
            int item1 = cartas.get(i).getImgId();
            int item2 = -1;
            if (i < cartas.size() - 1) {
                item2 = cartas.get(i + 1).getImgId();
            }
            myListData.add(new MyListData(item1, item2));
        }

        recyclerView = (RecyclerView) findViewById(R.id.lista_cartas);
        adapter = new MyListAdapter(myListData) {
            @Override
            public void onBindViewHolder(ViewHolder holder, final int position) {

                holder.imageView.setImageResource(myListData.get(position).getImgId1());
                if (myListData.get(position).getImgId2() != -1) {
                    holder.imageView2.setImageResource(myListData.get(position).getImgId2());
                    holder.actionView2.setImageResource(R.mipmap.upload);
                    holder.actionView2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int aux = (position * 2) + 1;
                            cargar(aux);
                        }
                    });
                }
                holder.actionView.setImageResource(R.mipmap.upload);
                holder.actionView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cargar(position * 2);
                    }
                });
            }
        };
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

}
