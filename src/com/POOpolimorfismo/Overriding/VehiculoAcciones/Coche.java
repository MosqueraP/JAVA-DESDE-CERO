package src.com.POOpolimorfismo.Overriding.VehiculoAcciones;

public class Coche extends Vehiculo {
    @Override
    public void arrancar(){
        System.out.println(">> El coche arrancó");
    }
}
