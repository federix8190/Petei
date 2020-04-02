package com.example.petei.ui.login;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.petei.R;

import java.util.ArrayList;
import java.util.List;

/*public class AdapterCartas extends RecyclerView.Adapter<AdapterCartas.ViewHolder> {

    private List<Carta> mDataset;

    public class ViewHolder extends RecyclerView.ViewHolder{

        public RelativeLayout relativeLayout;

        public ViewHolder(RelativeLayout v) {
            super(v);
            relativeLayout = v;
        }
    }

    public AdapterCartas(Activity context) {
        this.mDataset = new ArrayList<>();
    }

    public void addItem(Carta plan) {
        mDataset.add(plan);
        notifyItemInserted(getItemCount() - 1);
    }

    public void removeAll() {
        mDataset.clear();
    }

    @Override
    public AdapterCartas.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_cartas, parent, false);
        ViewHolder vh = new ViewHolder((RelativeLayout)v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Carta item = mDataset.get(position);
        int valor = item.getValor();
        int color = item.getColor();
        String c = "Rojo";
        if (color == 1) {
            c = "Amarillo";
        } else if (color == 2) {
            c = "Verde";
        } else if (color == 3) {
            c = "Azul";
        }
        int icono;

        TextView valorView = (TextView) holder.relativeLayout.findViewById(R.id.valor);
        TextView colorView  = (TextView) holder.relativeLayout.findViewById(R.id.color);
        //ImageView _icono  = (ImageView) holder.relativeLayout.findViewById(R.id.icono);

        //valorView.setText(valor);
        //colorView.setText(c);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
*/