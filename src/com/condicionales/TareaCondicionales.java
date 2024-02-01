package com.condicionales;

public class TareaCondicionales {
    public static void main(String[] args) {
        // numero positivo
        NumPositivo numPositivo = new NumPositivo();
        numPositivo.numerosPositivo(-3);

        // Calificaciones
        Calificaciones calificacion = new Calificaciones();
        calificacion.calificacioNota("a");
        calificacion.calificacioNota("b");
        calificacion.calificacioNota("c");
        calificacion.calificacioNota("d");
        calificacion.calificacioNota("e");
        calificacion.calificacioNota("f");

        // numero par e impar
        NumeroPar numeroPar = new NumeroPar();
        numeroPar.numPar(2);
        numeroPar.numPar(1);
    }
}
