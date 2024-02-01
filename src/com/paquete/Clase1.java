package com.paquete;
import java.time.LocalDate;
import java.util.Scanner;

public class Clase1 {
    void metodo1(){

        System.out.println("Estoy en la Clase1");

        // fecha hoy
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        // ingreso datos por teclados
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre? ");
        String nombreUsuario = input.nextLine();
        System.out.println("Tu nombre es: "+nombreUsuario);

    }
}
