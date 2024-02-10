package src.com.LinkedList;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkeHashSetEjemplo {
    public static void main(String[] args) {
        LinkedHashSet<String> palabras = new LinkedHashSet<>();
        // LinkedHashSet ->  respeta el orden
        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("Rohymar");
        System.out.println(palabras); // [Hola, Mundo, Rohymar]

        HashSet<String> palabra = new HashSet<>();
        //  HashSet -> no respeta el orden
        palabra.add("Hola");
        palabra.add("Mundo");
        palabra.add("Rohymar");
        System.out.println(palabra); // [Mundo, Rohymar, Hola]

    }
}
