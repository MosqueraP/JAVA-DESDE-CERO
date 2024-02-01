package com.bucles.breackContinue;

import java.util.Scanner;

public class TareaSwitch {
    public static void main(String[] args) {

    /* taera1
    Pide al usuario que introduzca un número del 1 al 7, y muestre el día
    de la semana correspondiente. Si el número introducido no está en ese
    rango, el programa debe mostrar un mensaje de error.
    */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero del 1 al 7");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("Error: ");
        }

    }

}
