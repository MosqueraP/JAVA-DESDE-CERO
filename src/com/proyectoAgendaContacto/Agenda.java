package src.com.proyectoAgendaContacto;

import java.util.HashMap;

public class Agenda {
    private static HashMap<String, Contacto> contactos = new HashMap<>();

    public static void agregarContacto(Contacto contacto) {
        contactos.put(contacto.getNombre(), contacto);
        System.out.println("Contacto agregado");
    }

    public static void eliminarContacto(String nombre) {
        contactos.remove(nombre);

    }

    public static Contacto bucarContacto(String nombre) {
        return contactos.get(nombre);
    }
}
