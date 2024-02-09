package src.com.proyectoListCanciones;

import java.util.LinkedList;

public class Playlist {

    private LinkedList<Cancion> canciones;

    public Playlist() {
        // método constructor
        canciones = new LinkedList<Cancion>();
    }

    public void mostrarPlaylist() {
        System.out.println("Playlist:");
        for (Cancion cancion : canciones) {
            System.out.println(cancion);
        }
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }

    public void buscarPorArtista(String artista) {
        System.out.println("Canciones del artista " + artista + ":");
        for (Cancion cancion : canciones) {
            if (cancion.getArtista().equalsIgnoreCase(artista)) {
                System.out.println(cancion);
            }
        }
    }

}
