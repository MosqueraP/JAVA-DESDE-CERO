package com.aprenderjava;

public class Mosquera extends Papa{
    public static void main(String[] args) {
        Mosquera mosquera = new Mosquera();
        //System.out.println(mosquera.getClass()); // debuleve en la clase donde se invoca
        System.out.println(mosquera.toString()); // direccion de memnoria
    }
}
