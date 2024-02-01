package com.bucles.forloop;

import java.util.Scanner;

public class SumaHastaNumero {
    public static void main(String[] args) {
        // pedir el numero al usuario
        // variable con la suma de todos los numeros

        Scanner input = new Scanner(System.in);
        System.out.println("Dame un numero ");
        int usuarioInput = input.nextInt();

        int sumaTotal = 0;

        for (int i = 1; i <= usuarioInput; i++){
            // sumaTotal = sumaTotal + i;
            sumaTotal += i;
            System.out.println("Estamos en el numero :" + i);
        }
        System.out.println("Resultado: "+sumaTotal);
    }
}
