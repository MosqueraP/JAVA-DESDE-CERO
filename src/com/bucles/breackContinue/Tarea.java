package com.bucles.breackContinue;

import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        /* Tarea1
        Pide al usuario un número del 1 al 10.  El programa debe pedir
        al usuario que introduzca de nuevo el número hasta que el número
       introducido esté dentro del rango, y finalmente imprimir ese número. */

        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a jugar: ");
        System.out.println("Introduce un numero del 1 al 10");
        int numero = sc.nextInt();

        while (true){
            if (numero >= 1 && numero <= 10){
                System.out.println("Es correcto, numero ingresado es: "+ numero+" 😊");
                System.out.println("Fin del juego!...");
                break;
            }else {
                System.out.println("Ingresa otro numero dentro del rango de 1 al 10"+" 😥");
                numero = sc.nextInt();
            }
        }
         */

        /* Tarea2
        El programa debe pedir al usuario que introduzca una palabra hasta que la longitud
         de la palabra sea mayor que 5.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a jugar: ");
        System.out.println("Introduce una palabra con longitud mayor a 5 ");
        String palabra = sc.nextLine();

        while (palabra.length() <= 5){
            System.out.println("Introduce una palabra mayor a 5 😥");
            System.out.println("Tu palabra ingresada es: " + palabra);
            palabra = sc.nextLine();
            }
        System.out.println("Correcto, está dentro del rango 😊");
        System.out.println("Tu palabra ingresada es: " + palabra);
        System.out.println("Fin del juego...");
    }
}