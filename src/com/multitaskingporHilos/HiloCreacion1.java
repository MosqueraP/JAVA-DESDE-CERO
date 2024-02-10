package src.com.multitaskingporHilos;

public class HiloCreacion1 extends Thread {

    public void run() {
        // codigo
        System.out.println("Aqui");
    }

    public static void main(String[] args) {
        HiloCreacion1 miHilo = new HiloCreacion1();

        miHilo.start();
        System.out.println("Despues del hilo");

    }
}
