package com.condicionales;

public class NumeroPar {
    /*
    Escribe un programa que tome un número entero,
    y te devuelva si el número es par o impar.
     */
    void numPar (int numPar){
        if (numPar % 2 == 0){
            System.out.println("El numero " +numPar+ " es par");
        } else {
            System.out.println("EL numero " +numPar+ " es impar");
        }
    }
}
