package com.Array04;

public class ForEachLoop {
    public static void main(String[] args) {
        String [] carros = { "Rojo", "Naranja", "Morado", "Azul"};
        // forma fortradicional
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }

        // For-Each Loop, version mejorada para recorrer elementos
        // iterar la lista de caarros dentro de una variable carro
        for(String carro : carros) {
            System.out.println(carro);
        }


    }

}
