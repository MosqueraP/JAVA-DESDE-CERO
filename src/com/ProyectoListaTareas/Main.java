package src.com.ProyectoListaTareas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // la variable lista para operar sobre las listas de tareas dentro del while
        ListaDeTareas lista = new ListaDeTareas(sc);

        while (true) {
            System.out.println("MENU");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Editar tarea");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Marcar tarea como completada");
            System.out.println("5. Ver lista de tareas");
            System.out.println("0. Salir");

            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // consume el salto de línea

            switch (opcion) {
                case 0:
                    System.out.println("Adiós!");
                    System.exit(0);
                case 1:
                    lista.agregarTarea();
                    break;
                case 2:
                    lista.editarTarea();
                    break;
                case 3:
                    lista.eliminarTarea();
                    break;
                case 4:
                    lista.marcarTareaComoCompletada();
                    break;
                case 5:
                    lista.mostrarListaDeTareas();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            System.out.println();
        }

    }
}
