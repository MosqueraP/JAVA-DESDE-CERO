package src.com.exepciones;

import java.util.Scanner;

public class Calucladora2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe el primer numero ");
        double num1 = input.nextDouble();

        System.out.println("Escribe el segundo numero ");
        double num2 = input.nextDouble();

        System.out.println("Escribe la operación (+, -, *, /): ");
        char operacion = input.next().charAt(0); // toma el primer indice

        double resultado = 0;

        try {
            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede dividir por cero");
                    }
                    resultado = num1 / num2;
                        break;
                default:
                    throw new Exception("Operacion invalida");
            }
            System.out.println("el resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
