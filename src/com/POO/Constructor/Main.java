package src.com.POO.Constructor;

public class Main {
    public static void main(String[] args) {
        // onjeto parametrizado desde la clase Persona
        Persona persona = new Persona("Howard", 20);
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());

    }
}
