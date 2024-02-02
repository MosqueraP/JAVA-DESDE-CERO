package src.com.POO.sup_03;

public class Estudiante extends Persona{
    private String carrera;

    public String getCarrera() {
        // metodo
        return carrera;
    }

    public Estudiante(String nombre, int edad, String carrera) {
        // constructor de la clase estudiante
        super(nombre, edad);
        this.carrera = carrera;
        // para obtener los parametros del construcctor de la clase padre +  los nuetros

    }

}
