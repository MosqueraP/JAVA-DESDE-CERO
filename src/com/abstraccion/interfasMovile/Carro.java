package src.com.abstraccion.interfasMovile;

public class Carro implements Movile {

    @Override // cambiar comportamiento desde esta implementación
    public void mover() {
        System.out.println("El carro se mueve");

    }
}
