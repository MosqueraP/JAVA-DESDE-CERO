package com.Operadores;

public class Relacionales {
    int edadUsuario =  5;

    // metodo principal
    public static void main(String[] args) {
        int edadHoward = 10;

        Relacionales usuario1 = new Relacionales(); // usuario1 -> objeto1
        Relacionales usuario2 = new Relacionales(); // usuario2 -> objeto2


        System.out.println(usuario1 == usuario2); // false
        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}
