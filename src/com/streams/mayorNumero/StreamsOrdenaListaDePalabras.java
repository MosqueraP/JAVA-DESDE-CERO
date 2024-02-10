package src.com.streams.mayorNumero;

import java.util.ArrayList;
import java.util.List;

public class StreamsOrdenaListaDePalabras {
    //1. Ordena alfabéticamente una lista de palabras
    public static void main(String[] args) {

        // lista inicial
        List<String> nombres = new ArrayList<>();

        nombres.add("Nico");
        nombres.add("Andres");
        nombres.add("Jasmes");
        nombres.add("Falcao");
        nombres.add("Falcao");

        // lista que obtendrá la ordenación
        List<String> nombresOrdenados = nombres.stream()
                .sorted() // ordena la lista
                .toList(); // datos de nueva lista
        System.out.println(nombresOrdenados);
    }
}
