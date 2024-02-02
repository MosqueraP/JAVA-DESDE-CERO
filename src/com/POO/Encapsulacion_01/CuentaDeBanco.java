package src.com.POO.Encapsulacion_01.sem_04;

public class CuentaDeBanco {
    private String titular;
    public double balance;

    // getter -> obtener
    // metodo
    public double getBalance() {
        return this.balance;
    }

    // getter -> obtener
    public String getTitular() {
        return this.titular;
    }

    // setter -> cambiar-modificar el balance
    // metodo modificdor
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // setter -> cambiar-modificar el titular
    // metodo modificdor
    public void setTitular(String titular) {
        this.titular = titular;
    }

}
