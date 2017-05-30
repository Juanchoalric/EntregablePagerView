package com.example.juancho.entregableviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantImageFragment extends Fragment {

    ImageView imageView;


    public RestaurantImageFragment() {
        // Required empty public constructor
    }

    public static RestaurantImageFragment dameFragmentoImagen(int imagen){
        RestaurantImageFragment restaurantImageFragment = new RestaurantImageFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("iMAGEN_A_MOSTRAR", imagen);
        restaurantImageFragment.setArguments(bundle);

        return restaurantImageFragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurant_image, container, false);

        Toast.makeText(getActivity(), "buenos dias", Toast.LENGTH_SHORT).show();

        imageView = (ImageView) view.findViewById(R.id.image_view);
        Bundle bundle = getArguments();
        int imagen = bundle.getInt("iMAGEN_A_MOSTRAR");
        imageView.setImageResource(imagen);

        return view;
    }

}
