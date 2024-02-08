package src.com.ProyectoListaTareas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTareas {

    private ArrayList<Tarea> listaTareas;
    private Scanner input;

    public ListaDeTareas(Scanner input) {
        listaTareas = new ArrayList<Tarea>();
        this.input = input;
    }

    public void mostrarListaDeTareas() {
        if (listaTareas.size() == 0) {
            System.out.println("No hay tareas en la lista.");
        } else {
            for (int i = 0; i < listaTareas.size(); i++) {
                System.out.println(i + ". " + listaTareas.get(i).toString());
            }
        }
    }
    public void agregarTarea() {
        System.out.print("Escribe el nombre de la tarea: ");
        String nombre = input.nextLine();
        Tarea tarea = new Tarea(nombre);
        listaTareas.add(tarea);
        System.out.println("Tarea agregada correctamente.");
    }

    public void editarTarea() {
        System.out.print("Escribe el índice de la tarea que quieres editar: ");
        int indice = input.nextInt();
        input.nextLine(); // consume el salto de línea

        if (indice >= 0 && indice < listaTareas.size()) {
            System.out.print("Escribe el nuevo nombre de la tarea: ");
            String nombre = input.nextLine();
            Tarea tarea = listaTareas.get(indice);
            tarea.setNombre(nombre);
            System.out.println("Tarea editada correctamente.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarTarea() {
        System.out.print("Escribe el índice de la tarea que quieres eliminar: ");
        int indice = input.nextInt();
        input.nextLine(); // consume el salto de línea

        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.remove(indice);
            System.out.println("Tarea eliminada correctamente.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void marcarTareaComoCompletada() {
        System.out.print("Escribe el índice de la tarea que quieres marcar como completada: ");
        int indice = input.nextInt();
        input.nextLine(); // consume el salto de línea

        if (indice >= 0 && indice < listaTareas.size()) {
            Tarea tarea = listaTareas.get(indice);
            tarea.setCompletada(true);
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
