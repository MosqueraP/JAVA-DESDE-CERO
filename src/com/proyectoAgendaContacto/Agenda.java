package src.com.proyectoAgendaContacto;

import java.util.HashMap;

public class Agenda {

    private static HashMap<String, Contacto> contactos = new HashMap<>();

    public static void agregarContacto(Contacto contacto) {
        contactos.put(contacto.getNombre(), contacto); // put-> agrega un contacto
        System.out.println("Contacto agregado");
    }

    public static void eliminarContacto(String nombre) {
        contactos.remove(nombre); // remove -> elimina un contacto por nombre
    }

    public static Contacto buscarContacto(String nombre) {
        System.out.println("Contacto encontrado");
        return contactos.get(nombre); // buscar contacto para aseguranos de que existe
    }

    public static void actualizarTelefono(String nombre, String telefono) {
        Contacto contacto = contactos.get(nombre); // guardar el resultado del nombre buscado en contacto
        // si el contacto es null
        if(contacto != null) {
            contacto.setTelefono(telefono); // setTelefono -> actualiza el contacto por teléfono
            System.out.println("Telefono actualizado");
        } else {
            System.out.println("Contacto inexistente");
        }
    }

    public static void imprimirContactos() {
        System.out.println("Lista de contactos");
        for(Contacto contacto: contactos.values()) {
            System.out.println(contacto.getNombre() + " - " + contacto.getTelefono());
        }
    }


}
