package src.com.POOpolimorfismo.Overriding.VehiculoAcciones;

public class Moto extends Vehiculo{
    @Override
    public void arrancar(){
        System.out.println(">> La moto arrancó");
    }
}
