package com.Variables03;

public class AnimalS {
    static int x = 10; // compartidas con los objetos
    int y = 20; // no compartidas con los objetos

    public static void main(String[] args) {
        AnimalS animal1 = new AnimalS();
        animal1.x = 50;
        animal1.y = 100;

        AnimalS animal2 = new AnimalS();

        System.out.println(animal2.x);
        System.out.println(animal1.y);

        /* las variables estaticas pueden ser manipuladas sin tener
        que crear un objeto, seacceden simplemente llamando la cclase padre
         */
        System.out.println(AnimalS.x = 2);

    }
}
