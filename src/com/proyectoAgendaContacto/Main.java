package src.com.proyectoAgendaContacto;

public class Main {

    public static void main(String[] args) {
        // Crear algunos contactos
        Contacto contacto1 = new Contacto("Howard", "123456789");
        Contacto contacto2 = new Contacto("Rohymard", "987654321");
        Contacto contacto3 = new Contacto("Mosquera", "555555555");

        // Agregar contactos a la agenda
        Agenda.agregarContacto(contacto1);
        Agenda.agregarContacto(contacto2);
        Agenda.agregarContacto(contacto3);
        System.out.println();

        // Buscar un contacto por nombre
        Contacto contactoEncontrado = Agenda.buscarContacto("Howard");
        System.out.println("Teléfono de Howard: " + contactoEncontrado.getTelefono());
        System.out.println();

        // Actualizar el número de teléfono de un contacto
        Agenda.actualizarTelefono("Howard", "111111111");
        Agenda.actualizarTelefono("Rohymar", "111111111");
        System.out.println();

        // Eliminar un contacto
        Agenda.eliminarContacto("Howard");
        Agenda.eliminarContacto("Rohymar");

        Agenda.imprimirContactos();


    }
}

