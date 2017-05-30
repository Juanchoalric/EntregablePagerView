package com.example.juancho.entregableviewpager;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaDeRecetasFragment extends Fragment implements View.OnClickListener{

    private List<Receta> recetas;
    private InformableReceta informableReceta;
    private RecyclerView recyclerView;
    private ListaRecetasAdapter listaRecetasAdapter;

    public ListaDeRecetasFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        informableReceta = (InformableReceta) context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lista_de_recetas, container, false);

        createReceta();

        Toast.makeText(getActivity(), "chau", Toast.LENGTH_SHORT).show();

        listaRecetasAdapter = new ListaRecetasAdapter(recetas, this);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(listaRecetasAdapter);
        return view;
    }

    public void createReceta() {
        recetas = new ArrayList<>();
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));
        recetas.add(new Receta("Pasta", " idhw dwihdw iodwhid ihwdi wah dwdiwd widowha waoidwahdwadhwiwaihdwd wdhwihwaodiwhdwidh widh widw hwidwah waihwa ddhwia dwiw wadi", R.drawable.pastas));


    }

    @Override
    public void onClick(View v) {
        informableReceta = (InformableReceta) getActivity();
        informableReceta.recetaASeleccionar(recetas.get((Integer)v.getTag()));
    }

    public interface InformableReceta {
        public void recetaASeleccionar(Receta receta);
    }

}
