package src.com.abstraccion.interfascegetArea;

public class Circulo implements Forma {
    private double radio;


    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
}
