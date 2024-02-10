package src.com.arrayli;

import java.util.ArrayList;

public class ListaAlimentos {
    public static void main(String[] args) {
        // definicion de Arraylist
        //ArrayList<String> lista = new ArrayList<>(); // almacena solo strin
        ArrayList lista = new ArrayList<>(); // almacena de todo
        lista.add("Manzana"); // Añadir alimento a la lista
        lista.add("Mango"); //
        lista.add("Fresa"); //
        //lista.add(2);
        System.out.println(lista.size()); // tamaño de la lista
        System.out.println(lista);
        System.out.println(lista.indexOf("Fresa")); // indice
        System.out.println(lista.remove("Manzana")); // elimina
        System.out.println(lista);
        System.out.println(lista.size()); // tamaño de la lista

        // convertir un wrapper clase a objeto
        String numero = "3";
        int num = Integer.parseInt(numero);

        System.out.print(num);

    }
}
