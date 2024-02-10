package src.com.streams.mayorNumero;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class StreamsMayorNumero {
    // Obtén los números mayores que 10 de una lista de números
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(11);
        numeros.add(14);
        numeros.add(7);
        numeros.add(12);
        numeros.add(4);

        List<Integer> numeroMayoresStreams = numeros.stream()
                .filter(numero -> numero > 10)
                //.collect(Collectors.toList());  // [11, 14, 12]
                .toList();  // [11, 14, 12]

        System.out.println(numeroMayoresStreams);


        /* 3
        Convierte todos los nombres a mayúsculas de una
        lista de palabras
         */

        List<String> nombres = new ArrayList<>();

        nombres.add("Nico");
        nombres.add("Andres");
        nombres.add("Jasmes");
        nombres.add("Falcao");
        nombres.add("Falcao");

        List<String> nombresMayuscula = nombres.stream()
                .map(nombre -> nombre.toUpperCase())
                .toList(); //

        System.out.println(nombresMayuscula);

        /* 4
        Elimina elementos duplicados de una lista
         */
        List<String> nombresUnicos = nombres.stream()
                .distinct()
                .toList();
        System.out.println(nombresUnicos);


        /* 5
        Imprime cada elemento de una lista
         */

        nombres.stream()
                .distinct()
                //.forEach(nombre -> System.out.println(nombre));
                .forEach(System.out::println);




    }
}
