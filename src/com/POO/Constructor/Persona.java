package src.com.POO.Constructor;

public class Persona {

    /*
    *private - > si se quiere modificar desde afuera sea a travez de los metodos
    * */
    private String nombre;
    private int edad;

    // constructor con parametros desde donde se llame
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // obtener nombre
    public String getNombre() {
        return nombre;
    }
    // modificar nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // obtener edad
    public int getEdad() {
        return edad;
    }
    // modificar edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
