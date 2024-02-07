package src.com.LinkedList;

import java.util.HashSet;

public class HashSetAnimales {
    public static void main(String[] args) {
        // cuando tenga el 80% crea otro hast con el doble de elementos es decir 20 elementos
        HashSet set = new HashSet<>(10, 0.80f); // lista desordenados
        set.add("Leon");
        set.add("Perro");
        set.add("Gato");

        set.remove("Gato"); // elimina
        set.remove("Leon"); // elimina


        // set.contains -> verifica si se encuentra el objeto
        System.out.println(set.contains("Perro")); // true / false
    }
}
