package com.objetos;

public class MetodoParametrizados {
    // promedio de tres numeros

    // metodo paramtrizado
    void promedio(double num1, double num2, double num3){
        // promedio = (suma de todos los valores)/cantidad nuumeros
        double sumaTotal = (num1+num2+num3)/3;
        System.out.println(sumaTotal);
    }

    public static void main(String[] args) {
        MetodoParametrizados ejemplo = new MetodoParametrizados();
        ejemplo.promedio(1,2,3);
    }
}
