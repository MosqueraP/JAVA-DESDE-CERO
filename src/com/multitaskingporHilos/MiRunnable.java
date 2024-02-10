package src.com.multitaskingporHilos;

public class MiRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Interfaz");

    }

    public static void main(String[] args) {
        MiRunnable miRunnable = new MiRunnable();

        Thread t = new Thread(miRunnable);

        t.start();
        System.out.println("Después de la Interfaz");
    }
}
