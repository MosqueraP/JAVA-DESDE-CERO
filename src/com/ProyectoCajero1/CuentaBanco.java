package src.com.ProyectoCajero1;

public class CuentaBanco {
     private String titular;
     private double balance;
     private int password; // para un futuro permitir operar mediante una contraseña


     public CuentaBanco(String titular, double balance){
         // constructor de clase Cuenta
         this.titular = titular;
         this.balance = balance;
     }

    public String getTitular() {
        return titular;
    }

    public double getBalance() {
        return balance;
    }

    public void depositar(double cantidad) {
         // método para depositar dinero
        balance += cantidad;
        System.out.println("Depósito exitoso. Nuevo balance $" + balance);
    }

    public void retirar(double cantidad) {
        // método para retirar dinero
        if (cantidad <= balance) {
            balance -= cantidad;  // balance = balance - cantidad
            System.out.println("Retiro exitoso. Nuevo balance $" + balance);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro. ");
        }
    }
}
