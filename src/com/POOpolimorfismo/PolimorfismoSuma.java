package src.com.POOpolimorfismo;

public class PolimorfismoSuma {
    /*
    Crea un método que tome dos enteros como argumentos y devuelva su suma.
    Luego, crea otro método con el mismo nombre que tome tres enteros
    como argumentos y devuelva su suma.
    */

    /*
        podemos crer tres tipos de metodos

        static public int suma(int a, int b){
            return a + b;
        }

        public void suma(int a, int b){
            return a + b;
        } // deber ser instanciado

        static public int suma(int a, int b){
            return a + b;
        }
     */
    static public int suma(int a, int b){
        return a + b;
    }

    // método sumar con tres parametros
    static public int suma(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(suma(5, 6));
        System.out.println(suma(7, 8, 9));
    }
}
