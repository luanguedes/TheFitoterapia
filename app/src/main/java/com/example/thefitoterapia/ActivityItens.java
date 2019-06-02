package com.example.thefitoterapia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ActivityItens extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_main, container, false);

        RecyclerView lista = v.findViewById(R.id.lista);
        lista.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        lista.setLayoutManager(llm);

        ArrayList<Dados> dadosList = new ArrayList<>();
        dadosList.add(new Dados("Título 1"));
        dadosList.add(new Dados("Título 2"));
        dadosList.add(new Dados("Título 3"));
        dadosList.add(new Dados("Título 4"));
        dadosList.add(new Dados("Título 5"));
        dadosList.add(new Dados("Título 6"));
        dadosList.add(new Dados("Título 7"));
        dadosList.add(new Dados("Título 8"));

        AdaterList adpt = new AdaterList(dadosList);
        lista.setAdapter(adpt);

        return v;
    }

}
