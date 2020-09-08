package com.livecron.animales;

import java.util.Objects;

public class Animal {

    protected String id;
    protected String nombre;
    protected int edad;
    protected boolean mascota;
    protected String nombreDelPropiertario;
    protected String descripcion;
    protected EstaturaDelAniamal tamanio;
    protected boolean estaDurmiendo;
    protected boolean macho;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer(Comida comida) {
        System.out.println("Esta comiendo" + comida.getNombre());
    }

    public void correr () {
        System.out.println("Correr");
    }

    public void dormir() {
        System.out.println("Esta durmiendo");
    }

    public String emitirSonido() {
        return "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMascota() {
        return mascota;
    }

    public void setMascota(boolean mascota) {
        this.mascota = mascota;
    }

    public String getNombreDelPropiertario() {
        return nombreDelPropiertario;
    }

    public void setNombreDelPropiertario(String nombreDelPropiertario) {
        this.nombreDelPropiertario = nombreDelPropiertario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstaturaDelAniamal getTamanio() {
        return tamanio;
    }

    public void setTamanio(EstaturaDelAniamal tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEstaDurmiendo() {
        return estaDurmiendo;
    }

    public void setEstaDurmiendo(boolean estaDurmiendo) {
        this.estaDurmiendo = estaDurmiendo;
    }

    public boolean isMacho() {
        return macho;
    }

    public void setMacho(boolean macho) {
        this.macho = macho;
    }

    public void saltar(boolean b) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
