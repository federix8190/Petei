package com.example.petei.data.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.petei.R;
import com.example.petei.data.MyListData;

import java.util.List;

public abstract class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {

    private List<MyListData> listdata;

    // RecyclerView recyclerView;
    public MyListAdapter(List<MyListData> listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_lista_cartas, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    public void removeAll() {
        listdata.clear();
    }

    /*@Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final MyListData myListData = listdata[position];
        holder.imageView.setImageResource(listdata[position].getImgId1());
        if (listdata[position].getImgId2() != -1) {
            holder.imageView2.setImageResource(listdata[position].getImgId2());
        }

        // Botones
        holder.actionView.setImageResource(R.mipmap.upload);
        holder.actionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: " + position * 2, Toast.LENGTH_LONG).show();
            }
        });

        holder.actionView2.setImageResource(R.mipmap.upload);
        holder.actionView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = (position * 2) + 1;
                Toast.makeText(view.getContext(),"click on item: " + aux, Toast.LENGTH_LONG).show();
            }
        });
    }*/

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public ImageView imageView2;
        public ImageView actionView;
        public ImageView actionView2;
        public LinearLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.imageView2 = (ImageView) itemView.findViewById(R.id.imageView2);
            this.actionView = (ImageView) itemView.findViewById(R.id.actionView);
            this.actionView2 = (ImageView) itemView.findViewById(R.id.actionView2);
            relativeLayout = (LinearLayout)itemView.findViewById(R.id.main_item_carta);
        }
    }
}
