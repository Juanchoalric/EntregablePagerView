package com.example.juancho.entregableviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleRecetaFragment extends Fragment {

    public final static String TITULO_RECETA = "titulo de la receta";
    public final static String IMAGE_RECETA = "imagen de la receta";
    public final static String DESCRIPCION_RECETA = "descripcion de la receta";

    TextView tituloTextView;
    TextView descripcionTextView;
    ImageView imagenView;


    public DetalleRecetaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_receta, container, false);

        tituloTextView = (TextView) view.findViewById(R.id.titulo_receta_detalle);
        descripcionTextView = (TextView) view.findViewById(R.id.descripcion_receta);
        imagenView = (ImageView) view.findViewById(R.id.detalle_imagen_receta);

        Bundle bungle = getArguments();

        String titulo = bungle.getString(TITULO_RECETA);
        String descripcion = bungle.getString(DESCRIPCION_RECETA);
        int imagen = bungle.getInt(IMAGE_RECETA);

        tituloTextView.setText(titulo);
        descripcionTextView.setText(descripcion);
        imagenView.setImageResource(imagen);


        return view;
    }

}
