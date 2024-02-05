package src.com.abstraccion.interfaAccesible;

public interface Accesible {
    String contrasena;

    static void getContrasena(){
        System.out.println("Hola desde la intercas Accesible");
    }

    static void setContrasena(String contrasena){
        String contrasena;
        System.out.println("Hola desde la intercas Accesible" + contrasena);
    }

}
