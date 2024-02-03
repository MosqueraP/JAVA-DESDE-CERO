package src.com.POOpolimorfismo.Overriding.Saludo;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();

        persona.presnetarse();
        estudiante.presnetarse();
    }
}
