package src.com.proyectoTienda2;

public class Tienda {

    // clase tienda para el manejo de inventario
    private Producto[] inventario; //
    private int cantidadProductos;

    public Tienda() {
        // construcctor de la tienda son parametrps
        // cada vez que se cree una tienda abran 15 productos
        inventario = new Producto[15]; // null por defecto
        cantidadProductos = 0;
    }

    public void imprimirInventario(){
        for (int i = 0; i <cantidadProductos; i++) {
            System.out.println(inventario[i].getNombre() + " - $" + inventario[i].getPrecio());
        }
    }

    public void agregarProducto( Producto producto){
        inventario[cantidadProductos] = producto;
        cantidadProductos ++; // agregar uno cada vez se cree un producto

    }

    public void cantidadProductosDisponibles(){
        System.out.println("Productos totales: " + cantidadProductos);
    }

}
