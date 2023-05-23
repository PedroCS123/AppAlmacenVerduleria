package telcel.curso.appalmacenverduleria;

public class Fruta extends Producto {


    private float peso;
    private String color;


    public Fruta(String nombre, double precio, float peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }





}
