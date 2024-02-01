package com.condicionales;

public class NumPositivo {
    /*
    programa que tome un número entero,
    y devuelva si el número es positivo, negativo, o cero
     */
    void numerosPositivo(int num){
        if(num > 0 ){
            System.out.println("El numero es positivo");
        } else if (num == 0){
            System.out.println("EL numero es cero");
        }else {
            System.out.println("El numero es negativo ");
        }

    }
}
