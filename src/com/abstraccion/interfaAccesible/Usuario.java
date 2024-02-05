package src.com.abstraccion.interfaAccesible;

public class Usuario implements Accesible{
    private String contrasena;


    @Override
    public String getContrasena() {
        return contrasena;
    }

    @Override
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;

    }
}
