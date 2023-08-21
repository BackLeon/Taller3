package Tienda;

public class Tenis extends Ropa{


    public Tenis(String nombreproducto, String precio) {
        super(nombreproducto, precio);
    }

    @Override
    public void mostrarDetalles(){
        System.out.println(this.tipoProductoRopa + " Precio: " + this.precio);

    }



}
