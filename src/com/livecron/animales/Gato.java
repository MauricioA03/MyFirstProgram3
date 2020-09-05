package com.livecron.animales;

public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String emitirSonido() {
        return "Miau miau";
    }
}
