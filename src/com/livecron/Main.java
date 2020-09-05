package com.livecron;

import com.livecron.animales.*;
import com.livecron.figuras.Circulo;
import com.livecron.figuras.Cuadrado;
import com.livecron.figuras.Rectangulo;
import com.livecron.calculaciones.*;

public class Main {

    public static void main(String[] args) {
        // for / variable para inicializar, condicion y el incremento
        for (int contador = 1; contador < 11; contador++) {
            System.out.println("Contador es: " + contador);
        }

        String palabra = "rectangulo";
        Calculadora calculadora = new Calculadora();
        int indice = calculadora.calcularElIndiceDeUnaLetra(palabra, 'o');
        System.out.println("El indice calculado es : " + indice);

        int contador = 1;
        do {
            if (contador == 1) {
                System.out.println("Esta variable es inicial: " + contador);
            }
            System.out.println("Contador es: " + contador);
            contador++;
        } while (contador < 11);


        while (contador < 11) {
            System.out.println("Contador es: " + contador);
            contador = contador + 1;
        }

        Circulo circulo = new Circulo();
        circulo.setRadio(20);
        System.out.println(circulo.getArea());

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setBase(20);
        System.out.println(cuadrado.getArea());

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(20);
        System.out.println(rectangulo.getArea());


        calculadora = new Calculadora();
        int resultado1 = calculadora.multiplicar(100, 20);
        int resultado2 = calculadora.restar(100, 20);
        int resultado3 = calculadora.sumar(100, 20);
        double resultado4 = calculadora.dividir(100.0, 20.0);
        int resultado5 = calculadora.resto(29931, 2);
        double resultado6 = calculadora.calcularRaizCuadrada(25);
        calculadora.valorAbsoluto(100, "Stirng", 12.4);
        double resultado7 = calculadora.calcular(20.0, 10.0, Calculadora.Operador.SUMA);

        //  40 / 2 = 20    residuo 0
        //  2  /  3 =  0.6 residuo
        System.out.println(" Resultado de la Multiplicacion : " + resultado1);
        System.out.println(" Resultado de la Resta : " + resultado2);
        System.out.println(" Resultado de la Sumar : " + resultado3);
        System.out.println(" Resultado de la Dividir : " + resultado4);
        System.out.println(" Resultado de la Resto : " + resultado5);
        System.out.println(" Resultado de la RaizCuadrada : " + resultado6);
        System.out.println(" Resultado de la Suma : " + resultado7);

	    // write your code here
        System.out.println("Iniciando mi clase de Java");

        // nombre de la clase / nombre de la variable = new /nombre de la clase (parametros);\
        Animal gatoCuki = new Gato("Cuki", 2);
        gatoCuki.saltar(true);
        gatoCuki.setMacho(false);
        gatoCuki.setTamanio(EstaturaDelAnimal.LARGO);

        System.out.println(gatoCuki.toString());

        Animal leon = new Leon("Cuki1", 2);
        leon.setMacho(false);
        leon.setMascota(false);
        leon.setTamanio(EstaturaDelAnimal.LARGO);

        System.out.println(leon.toString());

        Perro tobi = new Perro("Tobi", 20);
        tobi.setEdad(1);
        tobi.setMacho(true);
        tobi.setTamanio(EstaturaDelAnimal.MEDIANO);
        System.out.println(tobi.toString());
    }
}
