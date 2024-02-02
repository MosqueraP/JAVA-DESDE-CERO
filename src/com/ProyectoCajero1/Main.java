package src.com.ProyectoCajero1;

public class Main {
    public static void main(String[] args) {

        // Creamos una c.bancaria con un balance inicial de 1000 ->  instancia de cuenta
        CuentaBanco cuentaBancaria = new CuentaBanco("Mosquera", 1000 );

        // Creación de cajero asociado a la cuenta bancaria
        Cajero cajero = new Cajero(cuentaBancaria);

        // saludos para el usuario
        System.out.println("\nBienvenido, "+ cuentaBancaria.getTitular() + " ☺");

        // Mostrar el menú del cajero
        cajero.mostrarMenu();
    }
}
