package com.livecron.figuras;

public class Rectangulo implements Figura {

    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // A = b * h
    @Override
    public double getArea() {
        return calcularArea(altura, base);
    }

    @Override
    public double getPerimetro() {
        return 0;
    }

    protected double calcularArea(double altura, double base) {
        return altura * base;
    }
}
