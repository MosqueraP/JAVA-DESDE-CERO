package src.com.POOpolimorfismo.Overriding.construcctorTarea;

public class Empleado {
     /*
    Crea una clase "Empleado" que tenga dos constructores:
    uno que tome un nombre y un salario, y otro que tome un nombre,
    un salario y una fecha de contratación. Si solo se proporciona
    el nombre y el salario, establece la fecha de contratación en la
    fecha actual.
     */

    // atributos propios con acceso solo con getters y setters
    private String nombre;
    private double salario;
    private String fechaContratacion;

    // construcctor
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
        this.fechaContratacion = "02-02-2024";
    }

    // construcctor
    public Empleado(String nombre, double salario, String fechaContratacion){
        this.nombre = nombre;
        this.salario = salario;
        this.fechaContratacion = "02-02-2024";
    }

    // getters / setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public static void main(String[] args) {
        // mettodo principal

        // instancias de la clase empleado

        Empleado empleado1 = new Empleado("Howard", 5000);
        Empleado empleado2 = new Empleado("Rohymar", 100000, "01-03-2022");

        System.out.println("\n----empleado 1----");
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getSalario());
        System.out.println(empleado1.getFechaContratacion());

        System.out.println("\n----empleado 2----");
        System.out.println(empleado2.getNombre());
        System.out.println(empleado2.getSalario());
        System.out.println(empleado2.getFechaContratacion());

    }
}
