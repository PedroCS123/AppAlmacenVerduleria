package telcel.curso.appalmacenverduleria;

public class Limpieza extends Producto{

    private String componentes;
    private int litros;



    public Limpieza(String nombre, double precio, String componentes, int litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public int getLitros() {
        return litros;
    }

}
