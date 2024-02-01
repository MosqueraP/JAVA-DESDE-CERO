package com.Variables03;

public class Animal {
    String nombre ; // null, el lenguaje le coloca nullo por defecto
    int edad = 1; // tambien podemos inializarlo con un valor
    int numDePatas = 4; // iniclaizamos en 4

    public static void main(String[] args) {
        // creacion de objeto de la clase de Animal
        Animal animal1 = new Animal(); // objeto1
        animal1.nombre = "Pajaro";

        Animal animal2 = new Animal(); // objeto2
        animal2.nombre = "Leon";
    }
}
