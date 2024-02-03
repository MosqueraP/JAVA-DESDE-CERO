package src.com.POOpolimorfismo;

import java.util.Arrays;

public class polimorfismoSumaArray {
    /*
     1mera parte:
     Crea un método que tome un array de enteros como argumento y devuelva la suma
     de todos los elementos del array.
     2da parte:
     Luego, crea otro método con el mismo nombre que tome dos arrays de enteros
     como argumentos y devuelva un nuevo array que
     contenga la suma de los elementos correspondientes de cada array
     (por ejemplo, si el primer array es {1, 2, 3} y el segundo es {4, 5, 6},
     el nuevo array sería {5, 7, 9}).
     */

    // suma de datos del array
    static int arraySuma(int[] array){
        int sumaTotal = 0;
        for (int j : array) {
            sumaTotal += j;

        }
        return sumaTotal;
    }

    // suma de dos arrays
    static int[] arraySuma(int[] array, int[] array2){
        int[] arrayFinal = new int[array.length];

        for (int i = 0; i < array.length; i++){
            arrayFinal[i] = array[i] + array2[i];

        }
        return arrayFinal;
    }

    public static void main(String[] args) {
        // metodo principal

        int[] array = {1, 2, 3};
        System.out.println(arraySuma(array));

        int[] array2 = {0, 4, 3};
        System.out.println(Arrays.toString(arraySuma(array, array2)));
    }
}
