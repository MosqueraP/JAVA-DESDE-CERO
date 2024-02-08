package src.com.ProyectoListaTareas;

public class Tarea {
    // atributos de clases
    private String nombre;
    private boolean completada;

    // constructor
    public Tarea(String nombre, boolean completada) {
        this.nombre = nombre;
        this.completada = false; // al crear la tareas esta en false no completada
    }

    // getters / setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
