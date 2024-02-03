package src.com.POOpolimorfismo;

import src.com.ProyectoCajero1.Main;

public class PolimorfismoConcatenarUpercase {
    /*
    Crea un método que tome una cadena como argumento y devuelva la cadena
    en mayúsculas. Luego, crea otro método con el mismo nombre que tome dos
    cadenas como argumentos y devuelva la concatenación de ambas en mayúsculas.
     */

    // metodo con un argumento
    static String mayusculas(String palabra){
        return palabra.toUpperCase();
    }
    // metodo con dos argumento
    static String mayusculas(String palabra1, String palabra2){
        String palabraFinal = (palabra1 + " "+ palabra2).toUpperCase();

        return palabraFinal;
    }

    public static void main(String[] args) {
        System.out.println(mayusculas("howard"));

        System.out.println(mayusculas("howard", "mosquera"));
    }
}
