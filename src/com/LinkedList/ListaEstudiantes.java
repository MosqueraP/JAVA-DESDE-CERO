package src.com.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ListaEstudiantes {
    public static void main(String[] args) {

        // lista generica de elementos
        // permite valores duplicados
        LinkedList lista = new LinkedList();
        lista.add("Howard");
        lista.add("Edier");
        lista.add("Rohymar");
        lista.add("Rohymar");
        lista.add(null);
        lista.add(2);

        //lista.removeFirst(); // elimina el primer elemento
        //lista.removeLast(); // elimina el ultimo elemento

        System.out.println(lista); //elimina el ultimo elemento

    }
}
