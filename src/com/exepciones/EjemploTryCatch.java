package src.com.exepciones;

public class EjemploTryCatch {
    public static void main(String[] args) {
        // manejo de exepcion -> forName: generica para todas la exepciones
        try{
            Class.forName("com.exepciones.expecion");
        } catch(Exception e){
            System.out.println("Clase no existe");
        } finally {
            System.out.println("Me ejecuto haya o no exepciones");
        }

        int[] array = {1,2,3}; // indice hasta el 3
        try {
            System.out.println(array[4]); // indice no existe
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("indice no existe");
            System.out.println("exepcion"+ e.getMessage());
        }
    }

}
