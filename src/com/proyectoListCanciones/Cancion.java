package src.com.proyectoListCanciones;

public class Cancion {
    private String nombre;
    private String artista;
    /*
    Crea un programa que permita tener canciones en una playlist.
    El usuario debe tener la opción de añadir canciones a la playlist,
    eliminarlas, verlas, y buscar por artista.

    *usando LinkedList
     */

    // método constructor de Caciones
    public Cancion(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    // getters / setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return nombre + " - " + artista;
    }
}
