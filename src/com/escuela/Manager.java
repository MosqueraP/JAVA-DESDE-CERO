package com.escuela;

public class Manager extends Empleado {
    String departamento ="Medellin";
    boolean puedeDespedir = true;

    public static void main(String[] args) {
        Manager plinio = new Manager();

        System.out.println("Nombre: "+ plinio.nombre);
        System.out.println("ID: "+ plinio.idEmpleado);
        System.out.println("Salario: "+ plinio.salario);
        System.out.println("Departamento: "+ plinio.departamento);
        System.out.println("Puede despedir: "+ plinio.puedeDespedir);

    }
}
