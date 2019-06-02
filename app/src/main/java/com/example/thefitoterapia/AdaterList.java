package com.example.thefitoterapia;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaterList extends RecyclerView.Adapter<AdaterList.ViewHolder>{
    ArrayList<Dados> listaDados;

    public AdaterList(ArrayList<Dados> dados) {
        this.listaDados = dados;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,
                viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.titulo.setText(listaDados.get(position).getTitulo());
    }

    @Override
    public int getItemCount() {
        return this.listaDados.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.titulo);
        }
    }
}
