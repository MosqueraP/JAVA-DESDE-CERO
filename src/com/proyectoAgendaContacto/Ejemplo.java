package src.com.proyectoAgendaContacto;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Howard");
        map.put(2, "Rohymar");
        map.put(3, "Edier");

        // devuelve todas las llaves del Map
//        for (Integer entrada: map.keySet()) {
//            System.out.println(entrada);
//        }

        for (Map.Entry<Integer, String> entrada: map.entrySet()) {
            //System.out.println(entrada); // devuelve clave y valor 1=Howard
            //System.out.println(entrada.getKey()); // devuelve las llaves del Map
            //System.out.println(entrada.getValue()); // devuelve los valores del Map
        }

        for (String entrada: map.values()) {
            System.out.println(entrada); // devuelve los valores del Map
        }

    }

}
