package src.com.POO.sup_03;

public class Main {
    public static void main(String[] args) {
        // objeto de la clase estudiante
        Estudiante estudiante = new Estudiante("Howard", 23, "Ingenieria");
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getEdad());
        System.out.println(estudiante.getCarrera());
    }
}
