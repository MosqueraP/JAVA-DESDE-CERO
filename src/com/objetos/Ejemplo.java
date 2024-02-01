package com.objetos;

public class Ejemplo {
    // void, no regresa nada
    void rutinaManana(){
        System.out.println("Me baño");
        System.out.println("Me visto");
        System.out.println("Tomo Café");
    }
    // void, no regresa nada
    void rutinaTarde(){
        System.out.println("Como");
        System.out.println("Trabajo");
        System.out.println("Camino");
    }
    // void, no regresa nada
    void rutinaNoche(){
        System.out.println("Comer");
        System.out.println("Leer");
        System.out.println("Hacer videos");
    }

    public static void main(String[] args) {
        Ejemplo rutina = new Ejemplo(); // crear objeto de la clase Ejemplo
        rutina.rutinaManana(); // imvovar objeto desde el main principal
    }
}
