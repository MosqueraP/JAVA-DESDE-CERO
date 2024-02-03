package src.com.proyectoTienda2;

public class Main {

    public static void main(String[] args) {

        Producto[] productos = new Producto[3]; // inicializar product con tamaño 3

        // productos
        // en tienda se inicializa la lista con 15 productos y de momento
        // solo agregamos tres el resto de indíces tendrán el valor de null
        // → inventario = new Producto[15]; // null por defecto
        Accesorio manilla = new Accesorio("Manilla", 10, 50, "Elegante");
        Prenda camisa = new Prenda("Camisa", 80, 10, "S"); // agg elemento dell tipo elegante
        Prenda Bermuda = new Prenda("Bermuda", 30, 20, "M");


        // objeto de la clase tienda y encargado de crear de momento
        // 15 elementos
        Tienda tienda = new Tienda();

        // agregar productos
        tienda.agregarProducto(manilla);
        tienda.agregarProducto(camisa);
        tienda.agregarProducto(Bermuda);

        // imprimir ver inventario
        tienda.imprimirInventario();

        // imprimir ver cantidad de productos disponibles
        tienda.cantidadProductosDisponibles();
    }
}
