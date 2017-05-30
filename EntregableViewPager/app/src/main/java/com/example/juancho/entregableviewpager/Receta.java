package com.example.juancho.entregableviewpager;

/**
 * Created by juancho on 30/05/17.
 */

public class Receta {
    private String Titulo;
    private String description;
    private int image;

    public Receta(String titulo, String description, int image) {
        Titulo = titulo;
        this.description = description;
        this.image = image;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
