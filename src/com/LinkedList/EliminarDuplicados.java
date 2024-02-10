package src.com.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class EliminarDuplicados {
    public static void main(String[] args) {

        // Escribe un código que elimine todos los valores duplicados
        // de un ArrayList.


        String[] palabra = {"Bootcamp", "Howard", "Mosquera", "Howard"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(palabra));

        // elimina duplicados con HashSet, por qué este no permite duplicados
        HashSet<String> hashSet = new HashSet<>(arr);

        System.out.println(arr);
        System.out.println(hashSet);

    }
}
