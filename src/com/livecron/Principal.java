package com.livecron;

import com.livecron.animales.Animal;
import com.livecron.animales.EstaturaDelAniamal;
import com.livecron.animales.Perro;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        // Map<Llave, Valor> nombreDeLaVariable = new HashMap<>();

        Map<Long, Producto> productosPorCodigoDeBarra = new TreeMap<>();
        productosPorCodigoDeBarra.put(14345656786756L, new Producto(15, "Red Bull", false));
        productosPorCodigoDeBarra.put(54545654646545L, new Producto(10, "Coca Cola", false));
        productosPorCodigoDeBarra.put(14345656785456L, new Producto(5, "Leche", false));

        Producto resultado = productosPorCodigoDeBarra.get(54545654646545L);
        System.out.println(" Resultado encontrado : " + resultado.getNombre()
                +" precio : " + resultado.getPrecio());
        System.out.println(productosPorCodigoDeBarra.toString());

    }

    public static void main7(String[] args) {

        Animal perro1 = new Perro("Cuki", 7);
        perro1.setId("PERRO-0001");
        Animal perro2 = new Perro("tOKI", 18);
        perro2.setId("PERRO-0002");
        Animal perro3 = new Perro("Rene", 6);
        perro3.setId("PERRO-0001");

        Set<Animal> perros = new HashSet<>();
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);

        System.out.println(" Elementos del Set : " + perros.size());
        perros.forEach(animal -> System.out.println("Perro : " + animal.toString()));

    }


    public static void main2(String[] args) {
        List<Perro> perros = new ArrayList<>();
        // int -> Integer
        // long -> Long
        // boolean -> Boolean
        List<Boolean> azares = new ArrayList<>();
        azares.add(Boolean.FALSE);
        azares.add(Boolean.TRUE);

        List<Integer> numeroDeTelefonos = new ArrayList<>();
        numeroDeTelefonos.add(156565656);
        numeroDeTelefonos.add(256565656);
        numeroDeTelefonos.add(355455655);

        Perro tobi = new Perro("Tobi", 7);
        tobi.setMacho(true);
        tobi.setTamanio(EstaturaDelAniamal.MEDIANO);
        perros.add(tobi);

        Perro cuki = new Perro("Cuki", 8);
        cuki.setMacho(false);
        cuki.setTamanio(EstaturaDelAniamal.PEQUENIO);
        perros.add(cuki);

//        perros.forEach(perro -> System.out.println(" Perro : " + perro.toString()));

        Set<Integer> numerosDeCamisetas = new HashSet<>();
        numerosDeCamisetas.add(10);
        numerosDeCamisetas.add(7);
        numerosDeCamisetas.add(17);
        numerosDeCamisetas.add(10);

        System.out.println(" Eleementos del Set : " + numerosDeCamisetas.size());
        numerosDeCamisetas.forEach(integer -> System.out.println("numero de camiseta : " + integer));
    }

    public static void main1(String[] args) {
        char[] arregloDeVocales = new char[5];
        arregloDeVocales[0] = 'A';
        arregloDeVocales[1] = 'E';
        arregloDeVocales[2] = 'I';
        arregloDeVocales[3] = 'O';
        arregloDeVocales[4] = 'U';

        int[] arregloDeNumeros = {1, 2, 3, 4, 5};

        Perro[] perros = new Perro[2];

        Perro tobi = new Perro("Tobi", 7);
        tobi.setMacho(true);
        tobi.setTamanio(EstaturaDelAniamal.MEDIANO);
        perros[0] = tobi;

        Perro cuki = new Perro("Cuki", 8);
        cuki.setMacho(false);
        cuki.setTamanio(EstaturaDelAniamal.PEQUENIO);
        perros[1] = cuki;

        for (int i = 0; i < perros.length; i++) {
            System.out.println(" Perro : " + perros[i].toString());
        }

//        for (int i = 0 ; i < arregloDeVocales.length ; i++) {
//            System.out.println(" vocal : " + arregloDeVocales[i]);
//        }

    }
}
