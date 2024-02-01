package com.Array04;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        /*
        1mera forma de inicializar un array
         */
        int[] numeros = {3, 5, 2, 4, 5};

        System.out.println(numeros.length); // longitud
        System.out.println(Arrays.toString(numeros)); // recoorer
        Arrays.sort(numeros); // ordenar de manera accendete
        System.out.println(Arrays.toString(numeros)); // recoorer ordenados

        String[] mercado = {"Arroz", "Leche", "Pollo", "Huevo"};
        System.out.println(Arrays.toString(mercado)); // recoorer
        Arrays.sort(mercado); // ordenar de manera accendete
        System.out.println(Arrays.toString(mercado)); // recoorer ordenados

        // copiar un array a partir de otro
        int [] masNumeros = Arrays.copyOf(numeros, 10);
        System.out.println(Arrays.toString(masNumeros)); // recorer tal cual
        masNumeros[9] = 100 ;
        System.out.println(Arrays.toString(masNumeros)); // recoorer ordenados

    }
}
