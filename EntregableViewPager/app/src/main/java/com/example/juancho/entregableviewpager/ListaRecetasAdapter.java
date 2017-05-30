package com.example.juancho.entregableviewpager;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by juancho on 30/05/17.
 */

public class ListaRecetasAdapter extends RecyclerView.Adapter<ListaRecetasAdapter.RecetaViewHolder> implements View.OnClickListener{
    private List<Receta> recetas;
    private View.OnClickListener clickListener;

    public ListaRecetasAdapter(List<Receta> recetas, View.OnClickListener clickListener){
        this.recetas = recetas;
        this.clickListener = clickListener;
    }

    public static class RecetaViewHolder extends RecyclerView.ViewHolder{

        private TextView tituloView;
        private ImageView imageView;
        private View view;

        public RecetaViewHolder(View itemView) {
            super(itemView);
            tituloView = (TextView) itemView.findViewById(R.id.titulo_receta);
            imageView = (ImageView) itemView.findViewById(R.id.image_receta);
            view = itemView;
        }
    }

    @Override
    public ListaRecetasAdapter.RecetaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.receta_detalle, parent, false);
        view.setOnClickListener(this);
        RecetaViewHolder recetaViewHolder = new RecetaViewHolder(view);
        return recetaViewHolder;
    }

    @Override
    public void onBindViewHolder(ListaRecetasAdapter.RecetaViewHolder holder, int position) {
        holder.tituloView.setText(recetas.get(position).getTitulo());
        holder.imageView.setImageResource(recetas.get(position).getImage());
        holder.view.setTag(position);
    }

    @Override
    public int getItemCount() {
        return recetas.size();
    }

    @Override
    public void onClick(View v) {
        clickListener.onClick(v);
    }
}
