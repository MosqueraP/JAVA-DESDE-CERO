package src.com.ProyectoCajero1;

import java.util.Scanner;

public class Cajero {
    private CuentaBanco cuenta;
    public Cajero(CuentaBanco cuenta) {
        this.cuenta = cuenta;
    }


    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- Menú del Cajero ---");
            System.out.println("1. Ver balance");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Balance actual $" + cuenta.getBalance());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = sc.nextDouble();
                    cuenta.depositar(cantidadDeposito);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = sc.nextDouble();
                    cuenta.retirar(cantidadRetiro);
                    break;
                case 4:
                    System.out.println("Saliendo del Cajero. ¡Hasta pronto!");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 4); // ejecuta el menu siempre que número ingresado sea != de 4
    }
}
