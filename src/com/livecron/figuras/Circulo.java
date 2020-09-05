package com.livecron.figuras;

public class Circulo implements Figura {

    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    // A = pi * r2
    @Override
    public double getArea() {
        return 3.1416 * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 0;
    }
}
