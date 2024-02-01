package com.bucles.doWhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // While
        Scanner sc = new Scanner(System.in);
        System.out.println("Dama un numero");
        int numeroUsuario = sc.nextInt();

        while (numeroUsuario % 2 != 0) {
            System.out.println("Numero impar, dame otro: ");
            numeroUsuario = sc.nextInt();
        }
        System.out.println("Adivinastes ☺ "+ numeroUsuario);
    }
}
