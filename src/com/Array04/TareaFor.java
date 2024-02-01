package com.Array04;

import java.util.Arrays;

public class TareaFor {
    public static void main(String[] args) {
        /* ejemplo1
        Crea un Array que tenga varios números enteros. Al índice 3,
        asígnale un número negativo. Ahora busca la forma de imprimir todos
         los numeros del Array hasta que se encuentre el primer número
         negativo.
         */
        int [] numeros = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(numeros));
        numeros[3] = -4;
        System.out.println(Arrays.toString(numeros));

        for (int num : numeros) {
            if (num == -4 ) { // (num < 0)
                break;
            }
            System.out.println(num);
        }

        /* ejemplo2
        Crea un Array que tenga varios números enteros. Ahora busca la forma
        de imprimir todos los números del Array hasta que se encuentre un
        número que sea divisible por 5.
         */
        int [] listNumeros = { 2, 7, 12, 20, 25, 30, 11 };

        for (int numero : listNumeros) {
            if (numero % 5 != 0) {
                System.out.println(numero+" -> No es divisible por cinco");
            }
        }

        /* ejemplo3
        Crea el siguiente Array: String[] palabras = { "hola", "mundo", "esto",
        "es", "un", "programa", "fin", "adiós" }. Ahora busca la forma de
        imprimir todas las palabras del Array
        hasta que se encuentre la palabra
         "fin".
         */

        String[] palabras = { "hola", "mundo", "esto", "es", "un", "programa", "fin", "adiós" };
        for (String palabra : palabras) {
            //if (palabra == "fin"){}
            if (palabra.equals("fin")) {
                break;  // Termina el bucle cuando encuentra la palabra "fin"
            }
            System.out.println(palabra);
        }
    }
}
