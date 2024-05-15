package com.ucompensar.tiendaonline;

public class Producto {
    private String nombre;
    private double precio;
    private int imagen; // Aquí puedes usar un recurso de imagen o una URL si obtienes las imágenes de forma remota

    public Producto(String nombre, double precio, int imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}