package src.com.POOpolimorfismo.Overriding.VehiculoAcciones;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.arrancar();

        Coche coche = new Coche();
        coche.arrancar();

        Moto moto = new Moto();
        moto.arrancar();
    }
}
