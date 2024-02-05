package src.com.stringConstantPool;

public class Ejemplo {
    public static void main(String[] args) {
        // == compara datos primitivos
        // .equal() compara objetos

        String howard = "Howard";
        String howard2 = "Howard";
        System.out.println(howard == howard2);

        // instancia objetos
        String howard4 = new String("Howard");
        String howard5= new String("Howard");
        System.out.println(howard4 == howard5); // false
        System.out.println(howard4.equals(howard4)); // true

        // instancia de la clase madre
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1 == obj2);

    }
}
