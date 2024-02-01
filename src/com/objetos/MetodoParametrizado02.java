package com.objetos;

public class MetodoParametrizado02 {
    String nombre = "Howard";
    String saludo = "";


    // metodo
    static void saludo(String nombre){
        System.out.println("Hola " +nombre);
    }

    public static void main(String[] args) {
        saludo("Johan");
    }
}
