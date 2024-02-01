package com.Array04;


import java.util.Arrays;
import java.util.Collections;

public class TareaFor02 {
    public static void main(String[] args) {

        /* ejemplo 1
        Crea un Array con varios números enteros. Encuentra la forma de imprimir
        el número más grande.
         */
        int [] numeros = { 1, 2, 6, 9, 5, 8, 7, 2 };

        int numeroBase = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible de un entero
        for (int num : numeros) {
            if (num > numeroBase) {

                numeroBase = num; // Actualizamos el número más grande encontrado hasta ahora
            }
        }System.out.println("El número más grande es: " + numeroBase);

        /* ejemplo 2
        Crea un Array con varios nombres de personas. Encuentra la forma
         de imprimir todos los nombres que empiecen por la letra "A".
         */

        String nombPersonas [] = {"Anita" ,"Jauana", "Eliseo", "Carmen", "Anabel"};

        char letraBuscada = 'A'; // Cambia a la letra que deseas buscar

        for (String nombre : nombPersonas) {
            if (nombre.charAt(0) == letraBuscada || nombre.charAt(0) == Character.toUpperCase(letraBuscada)) {
                System.out.println(nombre);
            }
        }

        /* ejemplo 3
        Crea un Array con varios números enteros. Encuentra la forma
        de imprimir todos los números impares.
         */

        int [] numeros2 = { 1, 2, 6, 9, 5, 8, 7, 2 };
        for (int numeroImpar : numeros2){
            if(numeroImpar % 2 != 0){
                System.out.println("impar: " + numeroImpar);
            }
        }

        /*  ejemplo 4
        Crea un Array con varios números enteros. Imprime todos
        los números en orden inverso.
         */
        int [] listNumeros = { 1, 2, 6, 9, 5, 8, 7, 2 };
        // Convertir a una lista y revertir
        Collections.reverse(Arrays.asList(listNumeros));

        // Imprimir el array revertido
        System.out.println(Arrays.toString(listNumeros));

    }
}
