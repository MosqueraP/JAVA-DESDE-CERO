package src.com.POOpolimorfismo;

public class SumaCaracteresDeCadena {
    /* 1mera parte
    Crea un método que tome una cadena como argumento y devuelva el número
    de caracteres que contiene.
     2da parte
    Luego, crea otro método con el mismo nombre que tome dos array de cadenas
    como argumento y devuelva el número total de caracteres de todas las
    cadenas en el array.
     */

    // parte 1 suma de caracteres
    static int cadena(String palabra){
        System.out.println("Total caracteres");
        return palabra.length();
    }

    // parte 2 suma de caracters de dos palabras
    static int cadena(String palabra1, String palabra2){
        int caracteresTotales = palabra1.length() + palabra2.length();
        System.out.println("Totales palabras");
        return caracteresTotales;
    }

    public static void main(String[] args) {
        System.out.println(cadena("Howard"));
        System.out.println(cadena("Howard", "Mosquera"));
    }
}

