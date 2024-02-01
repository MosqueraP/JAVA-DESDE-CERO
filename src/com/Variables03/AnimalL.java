package com.Variables03;

public class AnimalL {
    String nombre ; // null, el lenguaje le coloca nullo por defecto
    int edad = 1; // tambien podemos inializarlo con un valor
    int numDePatas = 4; // iniclaizamos en 4

    void comer(){
        for (int i = 0; i < 11; i++) {
            System.out.println(i); // al ser i una variable local del metodo solo funcioan aqui dentro
        }
    }

    public static void main(String[] args) {

    }
}
