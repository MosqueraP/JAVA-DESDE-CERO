package src.com.POOpolimorfismo.Overriding.VehiculoAcciones;

public class Vehiculo {
    /*
    #1.Crea una clase Vehiculo con un método arrancar() que imprima
    "El vehículo arrancó".
    #2Luego, crea una clase Coche que herede de Vehiculo y sobrescriba
     el método arrancar() para imprimir "El coche arrancó".
    #3.Crea un objeto de la clase Coche y llama al método arrancar()
     para verificar que imprime "El coche arrancó".
     #4. Luego, crea una clase Moto que también herede de Vehiculo y
     sobrescriba el método arrancar() para imprimir "La moto arrancó".
     #5. Crea un objeto de la clase Moto y llama al método arrancar()
      para verificar que imprime "La moto arrancó".
    * */
    public void arrancar(){
        System.out.println("> El vehiculo arrancó");
    }
}
