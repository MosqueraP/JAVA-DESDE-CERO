package com.bucles.breackContinue;

import java.util.Scanner;

public class TareaGradFahrehei {
    public static void main(String[] args) {
    /* tarea2
    Pide al usuario que introduzca una temperatura en grados Fahrenheit o Celsius,
     y muestre la temperatura equivalente en la otra unidad.
     El programa debe pedir al usuario que introduzca la unidad de la
     temperatura (F o C) (tendrás que pedir 2 inputs del usuario,
     e investigar las fórmulas para convertir la temperatura de F a C y
     viceversa).
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los grados fahrehei: ");
        double fahreh = sc.nextDouble();

        int totalCelciu = (int)((fahreh - 32)/1.8);
        int totalFahrenheit = (int)((1.8*totalCelciu)+32);

        System.out.println(">>> Los grados celcius son: " + totalCelciu);
        System.out.println(">>> Los grados Fahrenheit son: " + totalFahrenheit);

    }
}
