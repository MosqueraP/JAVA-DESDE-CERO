package com.bucles.breackContinue;

public class Breackcontinue {
    public static void main(String[] args) {

        // break termina la ejecucion del programa donde le indique
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // termina la ejecucion cuando i valga 5
            }
            System.out.println(i);
        }

        // continue, se salta la ejecucion del programa donde le indique
        for (int i = 1; i < 10; i++) {
            if (i == 4) {
                continue; // Se salta el i cuando valga 4
            }
            System.out.println(i);
        }
    }

}
