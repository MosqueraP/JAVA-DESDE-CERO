package src.com.LinkedList;

import java.util.TreeSet;

public class TreeSetEjemplo {
    public static void main(String[] args) {
        // TreeSet -> organiza de manera accedente
        // y elimina duplicados, definiticamente hereda de sortedSet
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(20);
        numeros.add(3);
        numeros.add(3);
        numeros.add(7);
        numeros.add(10);
        numeros.add(15);
        //System.out.println(numeros);

        // elementos mayores o iguales a 5 y menores que 10
        System.out.println(numeros.subSet(5,10));

        // elementos mayores que 9
        System.out.println(numeros.tailSet(9));


        // de igual mera elimina duplicados y ordena
        TreeSet<String> nombres = new TreeSet<>();
        nombres.add("Howard");
        nombres.add("Edier");
        nombres.add("Howard");
        nombres.add("Rohymar");


        //System.out.println(nombres);
    }
}
