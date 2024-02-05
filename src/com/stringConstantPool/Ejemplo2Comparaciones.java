package src.com.stringConstantPool;

public class Ejemplo2Comparaciones {
    public static void main(String[] args) {

        // punto1, objetros de la case String
        String nombre = new String ("Howard");
        String nombre2 = new String ("Howard");
        System.out.println(nombre == nombre2); // false
            // siempre va ser falso por que apunta al objeto


        // punto2, variables datos primitivos
        String nom = "Edier";
        String nom2 = "Edier";
        System.out.println(nom == nom2); // true;
        System.out.println(nom.equals(nom2)); // true
            // siempre va ser true por que apunta hacia el contenido


        // punto3, objetros de la case String
        String texto = new String ("hola");
        String texto2 = new String ("hola");
        System.out.println(texto == texto2); // false
        System.out.println(texto.equals(texto2)); // true
            // siempre va ser falso por que apunta al objeto

        // punto4, objetros de la case String
        String text = new String ("hola");
        String text2 = new String ("hola");
        //System.out.println("\n");
        System.out.println(text.equals(text2)); // true
        System.out.println(text == text2); // false
            // siempre va ser falso por que apunta al objeto


    }
}
