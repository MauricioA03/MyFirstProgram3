package com.livecron.figuras;

// Figura puede ser Circulo, Rectangulo, Cuadrado
public interface Figura {

    final static String COLOR_POR_DEFECTO = "Negro";
    final static boolean LLENA = false;

    public double getArea();
    public double getPerimetro();

}
