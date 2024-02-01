package com.escuela;

public class Estudiante extends Persona{
    // atributos propios de la clase persona
    int idDeEstudiante = 12565745;
    double calificacion = 4.5;

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        System.out.println(">>> Se ha creado un estudiante...");
        System.out.println("Nombre: "+estudiante.nombre);
        System.out.println("Edad: "+estudiante.edad);
        System.out.println("Direccion: "+estudiante.direccion);
        System.out.println("Id: "+estudiante.idDeEstudiante);
        System.out.println("Calificacion: "+estudiante.calificacion);
    }
}
