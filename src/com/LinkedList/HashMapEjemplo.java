package src.com.LinkedList;

import java.util.HashMap;

public class HashMapEjemplo {
    public static void main(String[] args) {
        HashMap<Integer, String> orden = new HashMap<>();
        // no prserva el orden de los datos
        orden.put(123, "Hamburguesa");
        orden.put(444, "Ensalada");
        orden.put(584, "Pizza");
        orden.put(584, "Papas"); // no permite claves duplicadas, actualiza el valor en su defecto

        System.out.println(orden); // {584=Pizza, 123=Hamburguesa, 444=Ensalada}
        System.out.println(orden.remove(444)); // Ensalada
        System.out.println(orden); // {584=Papas, 123=Hamburguesa}

    }
}
