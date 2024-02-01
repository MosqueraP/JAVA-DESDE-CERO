package com.bucles.breackContinue;

import java.util.Scanner;

public class SwitchVsIF {
    public static void main(String[] args) {
        // Que dia es?
        // if
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero del 1 al 3");
        int numeroUsuario = sc.nextInt();

        System.out.println("Con if");
        if (numeroUsuario == 1) {
            System.out.println("Es lunes");
        } else if (numeroUsuario == 2) {
            System.out.println("Es martes");
        } else if (numeroUsuario == 3) {
            System.out.println("Es miercoles");
        }else{
            System.out.println("No existe este dias");
        }

        // switch
        System.out.println("Con switch");
        switch (numeroUsuario) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No existe este dias...");
                break;
        }
    }
}
