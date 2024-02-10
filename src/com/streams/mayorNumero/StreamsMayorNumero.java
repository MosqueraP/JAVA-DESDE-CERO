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
    }
}
