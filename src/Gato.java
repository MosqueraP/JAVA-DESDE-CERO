package src;

import src.Animal;

public class Gato {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.tipoDeanimal = "src.Gato";
        animal.edad = 3;
        animal.comer();

        System.out.println(animal.tipoDeanimal);
        System.out.println(animal.edad);
        System.out.println(animal.comer());


    }
}
