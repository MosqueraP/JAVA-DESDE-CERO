package src.com.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class AryListsTarea {
    public static void main(String[] args) {

        // ¿Cómo puedes convertir un Array a un ArrayList?
        String[] palabra = {"Bootcamp", "Howard", "Mosquera"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(palabra));

        System.out.println(arr);
    }
}
