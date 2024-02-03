package src.com.POOpolimorfismo.Overriding.Saludo;

public class Estudiante extends Persona{
    @Override
    public void presnetarse() {
        System.out.println("Hola, soy un estudiante ");
    }
}
