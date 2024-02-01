package com.Array04;

import java.util.Arrays;

public class ArraysDosDimensiones {
    public static void main(String[] args) {
        int[] numeros = {3, 4, 6, 1}; // una dimension

        int[] masNumeros = Arrays.copyOf(numeros, 10);
        masNumeros[9] = 100;
        //System.out.println(Arrays.toString(masNumeros));

        // arrays dos dimensiones 3 x 3
        String[][] carros = {{"Rojo", null, null},
                            {"Azul", null, null},
                            {null, null, "Morado"}};

        carros[0][1] = "Verde"; // actualizar valor
        // imprimir dos dimensiones
        System.out.println(Arrays.deepToString(carros));
        System.out.println(Arrays.deepToString(carros[2])); // fila posicion un0
    }
}
