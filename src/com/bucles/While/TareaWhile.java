package com.bucles.While;

import java.util.Scanner;

public class TareaWhile {
    public static void main(String[] args) {
        /*ejemplo 1
        Crea un programa que tome una String y te devuelva la cantidad
         de letras que hay en la frase o palabra.*/

        String texto = "Camilo";
        System.out.println("El texto "+ texto + " tiene "+texto.length()+" letras");

        /*ejmemplo 2
        Programa que tome una String llamada contraseña, y que le pida al usuario
        por esa contraseña.
        Si el usuario no escribe la contraseña correcta, el programa va a seguir siendo ejecutado
         hasta que el usuario ponga la contraseña correcta.*/

        String contrasena = "Howard123";
        //String texto;

        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Escribe la contraseña:");
            texto = input.nextLine();

            if (texto.equals(contrasena)) {
                System.out.println("¡Adivinaste! 😊");
                System.out.println("Bienvenido");
                break;
            } else {
                System.out.println("Contraseña incorrecta. Sigue intentando.");
            }
        }

        /* ejemplo 3
        de esa String en reversa (ejemplo: si pones "Nico", el programa
         te devolvería "o c i N" en la consola)*/
        String original = "Nico";
        String invertida = new StringBuilder(original).reverse().toString();
        System.out.println("Cadena original: " + original);
        System.out.println("Cadena invertida: " + invertida);
    }

}
