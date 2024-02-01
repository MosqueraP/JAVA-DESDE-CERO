package com.bucles.While;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        // para cuando se cuantas veces quiero ejecutar algo
        for (int i=0; i<11; i++){
            //System.out.println("Voy por el "+i);
        }

        // para cuando no se cuantas veces quiero ejecutar algo
        // normalmente se usa i, j o k para iniicar la variable de while
        // whilw -> mientras
        int j = 0;
        while (j < 11){
            //System.out.println("While, voy por el: "+j);
            j++;
        }
        //System.out.println("Fin de la operacion");

        // mientras el numero no sea, ejecuta el programa cuantas veces sea posible
        System.out.println("Dame un numero");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        while (numero != 8){
            System.out.println("Ese no es el nmumero, vuelve a intentar ");
            numero = input.nextInt();
        }
        System.out.println(">>> Adivinaste el numero es: "+numero+"😊");
        System.out.println("Fin del programa");

    }
}