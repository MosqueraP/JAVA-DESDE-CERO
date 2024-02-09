package src.com.proyectoAdivinanza;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> palabras = new HashSet<>();
        palabras.add("perro");
        palabras.add("gato");
        palabras.add("pajaro");
        palabras.add("leon");

        JuegoAdivinanza juego = new JuegoAdivinanza(palabras);
        juego.jugar();
    }
}
