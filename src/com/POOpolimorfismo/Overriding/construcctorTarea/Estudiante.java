package src.com.POOpolimorfismo.Overriding.construcctorTarea;

public class Estudiante {
    /*
    Crea una clase "Estudiante" que tenga dos constructores:
    uno que tome un nombre y una edad, y otro que tome un nombre,
    una edad y una carrera. Si solo se proporciona el nombre
    y la edad, establece la carrera en "ninguna".
     */

    // variables de clases
    private String nombre;
    private int edad;
    private String carrera;

    // constructor
    public Estudiante (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = "Ninguna";
    }

    // constructor2
    public Estudiante (String nombre, int edad, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = "Ninguna1";

    }

    // getter / setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public static void main(String[] args) {
        Estudiante estudianteDos = new Estudiante("Howard", 18);
        Estudiante estudiante = new Estudiante("Edier", 18, "Ingeniero");

        System.out.println(estudianteDos.getCarrera());
        System.out.println(estudianteDos.getNombre());
    }
}
