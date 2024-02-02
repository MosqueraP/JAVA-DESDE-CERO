package src.com.proyectoTienda2;

public class Main {

    public static void main(String[] args) {
        Producto[] productos = new Producto[3]; // inicializar product con tamaño 3
        Accesorio manilla = new Accesorio("Manilla", 10, 50, "Elegante");
        Prenda camisa = new Prenda("Camisa", 80, 10, "S"); // agg elemento dell tipo elegante
        Prenda Bermuda = new Prenda("Bermuda", 30, 20, "M");

        // añadir prendas creados a la lista
        productos[0] = manilla;
        productos[1] = camisa;
        productos[2] = Bermuda;

        for (int i = 0; i <productos.length; i++) {
            System.out.println(productos[i].getNombre() + " - $" + productos[i].getPrecio());
        }



    }
}
