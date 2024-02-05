package src.com.abstraccion.interfascegetArea;

public class Rectangulo implements Forma {
    private double numBase;
    private double numAltura;

    public Rectangulo(double numBase, double numAltura) {
        this.numBase = numBase;
        this.numAltura = numAltura;
    }

    @Override
    public double getArea(){
        return numBase * numAltura;
    }

    @Override
    public double getPerimetro() {
        return 2 *  (numBase * numAltura);
    }
}
