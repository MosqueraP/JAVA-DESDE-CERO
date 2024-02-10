package src.com.proyectoListCanciones;

public class Main {

    public static void main(String[] args) {

        // crear canciones
        Cancion c1 = new Cancion("Time", "Pink Floyd");
        Cancion c2 = new Cancion("Tuyo", "Mora");
        Cancion c3 = new Cancion("Good News", "Mac Miller");

        // objeto de Playlist
        Playlist playlist = new Playlist();

        // agregar canciones
        playlist.agregarCancion(c1);
        playlist.agregarCancion(c2);
        playlist.agregarCancion(c3);

        // invocar al método mostrar lista de canciones
        playlist.mostrarPlaylist();

        // invocar al método eliminar canciones
        playlist.eliminarCancion(c2);

        // invocar al método mostrar canciones nuevamente
        playlist.mostrarPlaylist();

        // invocar al método buscar canciones
        playlist.buscarPorArtista("Guns n' Roses");
        playlist.buscarPorArtista("Pink Floyd");
    }
}
