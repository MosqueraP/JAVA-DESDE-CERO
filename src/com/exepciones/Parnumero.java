package src.com.exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parnumero {

    public static void main(String[] args) {
    /*
     Crea un programa que solicite al usuario un número entero y
     determine si es par o impar. Si el usuario ingresa un valor no entero,
     el programa debería lanzar una excepción y mostrar un mensaje de error
     */
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Escribe un numero: ");
            // hasNextInt, comprueba que el dato ingresado sea entero
            if (input.hasNextInt()) {
                int num = input.nextInt(); // recoje enteros

                if (num % 2 == 0) {
                    System.out.println("El numero es par");
                } else {
                    System.out.println("El numero es impar");
                }
            } else {
                throw new InputMismatchException("Debes ingresar un número entero.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
