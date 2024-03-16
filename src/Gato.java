package src;

public class Gato {
    public static void main(String[] args) {

        Animal animal = new Animal(); // objeto de la clase Animal

        // variables de la clase Animal
        animal.tipoDeanimal = "src.Gato";
        animal.edad = 3;
        animal.comer();

        System.out.println("\nTipo de animal: "+ animal.tipoDeanimal);
        System.out.println("Edad: "+ animal.edad);
        System.out.println("El animal hace : "+ animal.comer());


    }
}