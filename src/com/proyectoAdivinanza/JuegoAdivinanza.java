package src.com.proyectoAdivinanza;

import java.util.HashSet;
import java.util.Scanner;

public class JuegoAdivinanza {
    private HashSet<String> palabras = new HashSet<>();
    private int contador = 0;
    /*
    Crea un juego de adivinanza de palabras. Tienes que pasarle una lista
    de palabras al programa, y hacer que el usuario adivine las palabras de
    esa lista. También indicaría cuantas palabras ha adivinado.
    *usando HashSet
     */

    public JuegoAdivinanza(HashSet<String> palabras) {
        for (String palabra : palabras) {
            this.palabras.add(palabra.toLowerCase());
        }
    }

    public void jugar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al juego de adivinanza de palabras!");

        // si la lista no está vacía entra en el while
        while (!palabras.isEmpty()) {
            System.out.print("Ingresa una palabra: ");
            String palabra = input.nextLine().toLowerCase();
            if (palabras.contains(palabra)) {
                palabras.remove(palabra);
                contador++;
                System.out.println("Correcto! Llevas " + contador + " palabra(s) adivinadas.");
            } else {
                System.out.println("Incorrecto. Inténtalo de nuevo. ");
            }
        }
        System.out.println("Felicidades! Adivinaste todas las palabras.");
    }
}
