package src.com.exepciones;

public class Calculadora {
    static public void divicion(int num1, int num2) throws ArithmeticException{
        if (num2 == 0) {
            throw new ArithmeticException("Divicion por cero");
        }
        System.out.println(num1 / num2);
    }

    // tener control total del flujo del programa
    public static void main(String[] args) {
        divicion(10, 0);

    }
}
