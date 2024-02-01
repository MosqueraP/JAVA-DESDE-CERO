package src.com.Array04;

public class ForEachTarea16 {
    public static void main(String[] args) {
        /* #1
        Crea un Array con varios números enteros. Calcula la suma de
        todos los números dentro del Array.
         */
        int [] listNumeros = {1, 2, 3, 4};

        int sumatorio = 0;

        for (int suma : listNumeros){
            sumatorio += suma;
        }
        System.out.println(sumatorio);

        /*#2
        Crea un Array con varias palabras. Imprime todas las palabras
        que tengan una longitud mayor que 5 caracteres.
         */

        String [] palabras = {"Pc", "Lapto", "Impresora", "Monitor"};
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 5){
                System.out.println(palabras[i]);
            }
        }


        /* #3
        Crea un Array con varios números enteros. Encuentra el promedio
         de todos los elementos.
         */
    }
}
