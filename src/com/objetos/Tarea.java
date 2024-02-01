package com.objetos;

public class Tarea {

    public static void main(String[] args) {
        // Llamamos a los métodos desde el método main
        sumaDeNumeros(3, 4);
        restaDeNumeros(8, 3);
        multDeNumeros(3, 4);
        divDeNumeros(8, 4);
        mayorNumeros(5, 4);
    }

    // Método que realiza la suma de dos números e imprime el resultado
    public static void sumaDeNumeros(int num1, int num2) {
        int suma = num1 + num2;
        System.out.println("Suma: " + suma);
    }

    // Método que realiza la resta de dos números e imprime el resultado
    public static void restaDeNumeros(int num1, int num2) {
        int resultado = num1 - num2;
        System.out.println("Resta: " + resultado);
    }

    // Método que realiza la multiplicación de dos números e imprime el resultado
    public static void multDeNumeros(int num1, int num2) {
        int mult = num1 * num2;
        System.out.println("Multiplicación: " + mult);
    }

    // Método que realiza la división de dos números e imprime el resultado
    public static void divDeNumeros(int num1, int num2) {
        int div = num1 / num2;
        System.out.println("División: " + div);
    }

    // Método que determina el número mayor entre dos números e imprime el resultado
    public static void mayorNumeros(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Número " + num1 + " es mayor que número " + num2);
        } else if (num1 > num2){
            System.out.println("Número " + num2 + " es mayor que número " + num1);
        } else{
            System.out.println(num1+ " y " +num2 + " son iguales");
        }
    }
}
