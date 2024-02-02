package src.com.proyectoTienda2;

public class Prenda extends Producto{
    private String talla;

    public Prenda(String nombre, double precio, int cantidad, String talla) {
        // constructor
        super(nombre, precio, cantidad); // super Producto
        this.talla = talla; // atributo propio
    }

    // getter / setter methods
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
