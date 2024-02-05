package src.com.abstraccion.ejemplo1;

// plantilla para otras plantillas
public abstract class Personaje {
    private int salud;
    private double precio;

    // getters / setters

    // los métodos abstractos no pueden tener un cuerpo
    // método obligatorio en las instancias que se realicen
    public abstract void atacar();

}
