package src.com.abstraccion.interfascegetArea;

public class Triangulo implements Forma{
    private double numBase;
    private double numAltura;
    private double lado1;
    private double lado2;
    private double lado3;

    // construcctor
    public Triangulo(double numBase, double numAltura, double lado1, double lado2, double lado3) {
        this.numBase = numBase;
        this.numAltura = numAltura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // métodos personalizados
    @Override
    public double getArea() {
        return (0.5 * (numBase * numAltura));
    }

    @Override
    public double getPerimetro() {
        return (lado1 + lado2 + lado3);
    }

    // métodos getters / setters
}
