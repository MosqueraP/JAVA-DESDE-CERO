package com.bucles.forloop;

import java.util.Scanner;

public class TareaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hola, Ingresa una palabra: ");

        String mensaje = input.nextLine();
        System.out.println("El texto ingresado es: "+ mensaje);

        for (int i = 0; i < mensaje.length(); i++) {
            System.out.println(mensaje.charAt(i));

        }

    }
}
