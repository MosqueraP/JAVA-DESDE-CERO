package src.com.POOpolimorfismo;

import com.sun.source.tree.ReturnTree;

import java.sql.SQLOutput;

public class MayorEntero {
    /* 1mera parte
    Crea un método que tome dos enteros como argumentos y devuelva el mayor
    de los dos.
    2da parte
    Luego, crea otro método con el mismo nombre que tome tres enteros como
     argumentos y devuelva el mayor de los tres.
     */
    //mayor numero
    static int mayorNumero(int arg1, int arg2){
        return Math.max(arg1, arg2); // max compara dos numeros nomas
    }

    //mayor numero
    static int mayorNumero(int a, int b, int c){
        int maxAB = Math.max(a, b);
        int maxFinal = Math.max(maxAB, c);

        return maxFinal; //
    }

    public static void main(String[] args) {
        System.out.println("Mayor numero: ");
        System.out.println(mayorNumero(5, 4));
        System.out.println(mayorNumero(8, 6, 7));

    }
}
