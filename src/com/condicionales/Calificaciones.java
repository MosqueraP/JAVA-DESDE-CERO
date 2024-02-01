package com.condicionales;

public class Calificaciones {
    void calificacioNota(String nota){

        if (nota == "a"){
            System.out.println("Su calificacion es: " + 4);
        } else if (nota == "b"){
            System.out.println("Su calificacion es: " + 3);

        }else if (nota == "c"){
            System.out.println("Su calificacion es: " + 2);

        }else if (nota == "d"){
            System.out.println("Su calificacion es: " + 1);

        }else if (nota == "f"){
            System.out.println("Su calificacion es: " + 0);

        }else {
            System.out.println("La calificacion no existe");

        }

    }

}
