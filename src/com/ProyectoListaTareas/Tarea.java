package src.com.ProyectoListaTareas;

public class Tarea {
    private String nombre;
    private boolean completada;

    public Tarea(String nombre) {
        this.nombre = nombre;
        completada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean estaCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        String estado = estaCompletada() ? "[x]" : "[ ]";
        return nombre + " " + estado;
    }
}
