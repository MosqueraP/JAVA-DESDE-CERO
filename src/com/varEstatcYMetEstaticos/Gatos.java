package src.com.varEstatcYMetEstaticos;

public class Gatos {
    public int cantidadGatosInstancias = 0; // variable compartida
    public static int cantidadGatosEstaticas = 0; // variable

    // constructor
    // cada vez creada una instancia agregar uno
    public Gatos(){
        cantidadGatosInstancias++;
        cantidadGatosEstaticas++;
    }

    public static void cuentaEstatica(){
        System.out.println(cantidadGatosEstaticas);
    }

    public static void main(String[] args) {
        Gatos gto1 = new Gatos();
        Gatos gto2 = new Gatos();

        System.out.println(gto1.cantidadGatosInstancias); // debe ser instanciada
        System.out.println(gto2.cantidadGatosInstancias); // debe ser instanciada

        cuentaEstatica();

    }
}
