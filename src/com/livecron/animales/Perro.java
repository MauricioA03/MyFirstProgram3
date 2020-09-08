package com.livecron.animales;

public class Perro extends Animal {

    private char inicial;

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String emitirSonido() {
        return "Wau wau";
    }
    
    @Override
    public String toString() {
        return "Perro{" +
                "macho=" + macho +
                ", edad=" + edad +
                ", inicial=" + inicial +
                ", tamanio=" + tamanio +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estaDurmiendo=" + estaDurmiendo +
                '}';
    }
}
