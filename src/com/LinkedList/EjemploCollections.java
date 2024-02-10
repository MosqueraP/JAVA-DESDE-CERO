package src.com.LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import static java.util.Collection.*;

public class EjemploCollections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(7);
        list.add(6);
        list.add(1);

        //Collections.sort(list); // ordena los elementos
        //Collections.shuffle(list); // ordena aleatoria
        Collections.reverse(list); // ivertir ordena los elementos
        System.out.println(list);

    }
}
