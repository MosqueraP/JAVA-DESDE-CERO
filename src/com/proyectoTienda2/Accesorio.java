package src.com.proyectoTienda2;

public class Accesorio  extends Producto{
    private String tipo;
    public Accesorio(String nombre, double precio, int cantidad, String tipo){
        super(nombre, precio, cantidad); // super Producto
        this.tipo = tipo; // atributo propios
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
