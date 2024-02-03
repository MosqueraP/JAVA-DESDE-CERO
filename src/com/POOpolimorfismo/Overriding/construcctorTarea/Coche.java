package src.com.POOpolimorfismo.Overriding.construcctorTarea;

public class Coche {
    /*
    Crea una clase "Coche" que tenga dos constructores:
    uno que tome una marca y un modelo, y otro que tome una marca,
    un modelo y un año. Si solo se proporciona la marca y el modelo,
     establece el año en 2021.
     */

    // atributos de clase Coche
    private String marca;
    private String modelo;
    private int ano;

    // constructor
    public Coche (String marca, String modelo){
        // constructor de clase Coche
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 2000;
    }

    public Coche (String marca, String modelo, int ano){
        // constructor de clase Coche
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 2000;
    }

    // getters / setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Fz", "2020");
        Coche coche2 = new Coche("Nmax", "2023", 2023);

        System.out.println(coche1.getMarca() + " - " + coche1.getModelo() + " - " + coche1.getAno());
        System.out.println(coche2.getMarca() + " - " + coche2.getModelo() + " - " + coche2.getAno());

    }
}


