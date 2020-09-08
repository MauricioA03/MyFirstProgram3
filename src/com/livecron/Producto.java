package com.livecron;

public class Producto {
    private int precio;
    private String nombre;
    private boolean stock;

    public Producto(int precio, String nombre, boolean stock) {
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", stock=" + stock +
                '}';
    }
}
