package com.bucles.forloop;

public class Tarea10For {
    /*
    1. imprimir los numeros del uno al 10 cada uno en una nueva linea
     */
    void imprimirNumeros(){
        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }
    }
    /*
    2. Crea un programa que tome una String y te devuelva el número de vocales
     que tiene la palabra (A, E, I, O, U).
     */
    void numeroPalabras(String input){

        String palabra = input.toUpperCase(); // convierte a mayuscula
        int cuentaTotal = 0;
        for (int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i) == 'A' || palabra.charAt(i) == 'E'
                    || palabra.charAt(i) == 'I' || palabra.charAt(i) == 'O'
                    || palabra.charAt(i) == 'U'){
                // añadimos uno a la cuenta total
                cuentaTotal++;
            }
        }
        System.out.println("Numero de vocales: "+cuentaTotal);
    }

    /*
    3. Crea un programa que tome una String y te devuelva la cantidad de
    palabras en la String.
     */
    void cantidadPalabras(String input){
        int cantidaTotalPalabras = 1;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == ' '){
                cantidaTotalPalabras++;
            }
        }
        System.out.println("Catidad total de palabras: "+cantidaTotalPalabras);
    }

}
