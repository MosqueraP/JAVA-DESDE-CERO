package src.com.POOpolimorfismo.Overriding;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Perro perro = new Perro();
        Gato gato = new Gato();

        animal.hacerSonido();
        perro.hacerSonido();
        gato.hacerSonido();

    }
}
