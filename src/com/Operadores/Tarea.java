package com.Operadores;

public class Tarea {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int num3 = 0;
        ++ num3;

        double divicion = (double) num1 / num2; // typecastin, resultado será el modulo
        double cantidaEspectadoresPartido1 = 10;
        double cantidaEspectadoresPartido2 = 20;

        double pescacado = 20.99;
        double bischocho = 30.99;

        if (pescacado > bischocho) {
            System.out.println("El pescado cuesta más que el bischocho! ");
        } else {
            System.out.println("El bischocho cuesta mas que el pescacado! ");
        }

        int vandejaPaisa = 50;
        int casuelaDeMarisco = 20;

        if (vandejaPaisa > casuelaDeMarisco) {
            // block of code
            System.out.println(vandejaPaisa);
        } else {
            // block of code
            System.out.println(casuelaDeMarisco);
        }


        //System.out.println(num1 / num2); // 1
        //System.out.println(num2 / num3); // 5
        //System.out.println(divicion); // 5
        //System.out.println(10*3); // by zero
        System.out.println(num3++); // by zero
        //System.out.println(num3); // incrementa en uno la variable num3
        //System.out.println(cantidaEspectadoresPartido1 + cantidaEspectadoresPartido2); // suma
        //System.out.println(cantidaEspectadoresPartido1 + cantidaEspectadoresPartido2); // suma

        //System.out.println(cantidaEspectadoresPartido1 + cantidaEspectadoresPartido2); // suma

    }
}
