package com.condicionales;

public class OperadorTernario {
    public static void main(String[] args) {

        // variable = condicion ? algunValor : otroValor

        int precioVuelo = 300;
        String mensaje = precioVuelo > 200 ? "Tienes acceso a  VIP!" : "No tienes acceso a VIP";

        System.out.println(mensaje);
    }
}
