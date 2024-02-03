package src.com.POOpolimorfismo.Overriding.calcAreas;

public class Rectangulo extends FiguraGeometrica {

    @Override
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo();

        System.out.println(rectangulo.calcularArea(5, 10));
    }
}
