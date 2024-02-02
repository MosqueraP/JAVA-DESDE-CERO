package src.com.POO.Encapsulacion_01.sem_04;

public class Ejemplo {
    public static void main(String[] args) {
        //Persona persona = new Persona();
        //persona.setNombre("Howard");

        CuentaDeBanco cuentaDeBanco = new CuentaDeBanco();
        cuentaDeBanco.setBalance(100); // modifca el valor de la variable instancia
        System.out.println(cuentaDeBanco.getBalance()); // obtiene el valor

    }
}
