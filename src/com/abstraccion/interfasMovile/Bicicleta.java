package src.com.abstraccion.interfasMovile;

public class Bicicleta implements Movile{

    @Override // cambiar comportamiento desde esta implementación
    public void mover() {
        System.out.println("La bici se mueve");

    }
}
