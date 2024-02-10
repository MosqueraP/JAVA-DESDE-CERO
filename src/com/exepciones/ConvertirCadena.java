package src.com.exepciones;

import java.util.Scanner;

public class ConvertirCadena {
    public static void main(String[] args) {
        /*
         Crea un programa que lea una cadena de texto desde el usuario
          y que lance una excepción si la cadena no se puede convertir
          a un número entero.
         */

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Escribe un numero entero ");
            String cadena = input.nextLine();

            int numero = Integer.parseInt(cadena);
            System.out.println("El numero es: " + numero);
        } catch (Exception e) {
            System.out.println("error: La cadena no se puede convertit a numero");
        }
    }
}
