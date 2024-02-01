package com.condicionales;

import java.util.Scanner;

public class EjemploIF {
    public static void main(String[] args) {
        // if (dcondicion){bloque o proceso}

        System.out.println("¿Cual es la temperatura?: ");
        Scanner input = new Scanner(System.in);
        int temperatura = input.nextInt();

        if (temperatura >= 30){
            System.out.println("Está muy caliente");
        } else if (temperatura > 15){
            System.out.println("Está normal");
        }else {
            System.out.println("Esto ya no es normal😄 ");
        }

    }
}
