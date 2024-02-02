package src.com.POO.sup_03;

public class Persona {
    private String nombre;
    private int edad;


    public Persona (String nombre, int edad) {
        // construcctor
        this.nombre = nombre;
        this.edad = edad;
    }

    // getter -> obtener nombre
    public String getNombre() {
        return nombre;
    }

    // getter -> obtener edad
    public int getEdad() {
        return edad;
    }
}
