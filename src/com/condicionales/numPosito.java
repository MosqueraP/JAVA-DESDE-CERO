package com.condicionales;

public class numPosito {
    static void positivoNetivo(int num1, int num2){
        // && debuelve verdadero si ambas afirmaciones son verdaderas
        if (num1>0 && num2>0) {
            System.out.println("Positivos");
        }
    }
    static void metodo2 (int num1, int num2){
        // || debuelve verdadero si al menos uno es verdaderas
        if (num1<0 || num2>10){
            System.out.println("Negativo");
        }
    }

    public static void main(String[] args) {
        positivoNetivo(3, 4);
        metodo2(-3, 4);
    }

}
