package com.livecron.figuras;

public class Cuadrado extends Rectangulo implements Figura {

    public String getColor() {
        return COLOR_POR_DEFECTO;
    }

    public String convertirColorABlanco(String color) {
        return COLOR_POR_DEFECTO + color;
    }
    // A = b * h
    @Override
    public double getArea() {
        return super.calcularArea(getBase(), getBase());
    }

    @Override
    public double getPerimetro() {
        return 0;
    }
}
