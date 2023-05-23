package telcel.curso.appalmacenverduleria;

public class EjemploAlmacenVerduleria {

    public static void main(String args[] ){

        Producto[] productos = new Producto[8] ;

        Producto manzanaRoja = new Fruta("Red Delicious", 40, 15f, "Rojo");
        Producto durazno = new Fruta("Durazno", 75, 25, "Amarillo");

        Producto cremaLala = new Lacteo("Crema lala", 15, 1,500);
        Producto queso = new Lacteo("Queso panela", 15, 2, 200);

        Producto fabuloso = new Limpieza("Fabuloso", 58, "Lavanda y cloro", 1);
        Producto Ace = new Limpieza("Jabon en polvo Ace", 25, "con suavizante", 1);

        Producto papelCharmin = new NoPerecible("charmin", 35);
        Producto bolsas = new NoPerecible("Bolsas para basura", 25);

        productos[0] = manzanaRoja;
        productos[1] = durazno;
        productos[2] = cremaLala;
        productos[3] = queso;
        productos[4] = fabuloso;
        productos[5] = Ace;
        productos[6] = papelCharmin;
        productos[7] = bolsas;

        for(Producto prod: productos){

            System.out.println("=======" + prod.getClass().getSimpleName() + "=======");
            System.out.println("Habitat " + prod.getNombre() );
            System.out.println("Altura " + prod.getPrecio() );

            if(prod instanceof  Fruta){
                System.out.println("Color:  " + ( (Fruta) prod ).getColor());
                System.out.println("Peso:  " + ( (Fruta) prod ).getPeso());

            }
            if(prod instanceof  Lacteo){
                System.out.println("Cantidad:  " + ( (Lacteo) prod ).getCantidad());
                System.out.println("Proteinas:  " + ( (Lacteo) prod ).getProteinas());

            }
            if(prod instanceof  Limpieza){
                System.out.println("Componentes:  " + ( (Limpieza) prod ).getComponentes());
                System.out.println("Litros :  " + ( (Limpieza) prod ).getLitros());
            }

        }



    }
}
