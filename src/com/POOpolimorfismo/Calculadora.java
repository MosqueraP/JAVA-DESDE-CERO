package src.com.POOpolimorfismo;

public class Calculadora {
    public int sumar(int a, int b) {
        return a+b;
    }

    public double sumar(double a, double b) {
        return a+b;
    }

    public float sumar(float a, float b) {
        return a+b;
    }


    public static void main(String[] args) {
        // motodo principal

        Calculadora calculadora = new Calculadora(); // instancia de calculadora

        System.out.println(calculadora.sumar(3, 2));
        System.out.println(calculadora.sumar(0.86, 0.60));
        System.out.println(calculadora.sumar(3.14f, 8.888f));

    }
}
