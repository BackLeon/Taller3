package Tienda;

public class Celulares extends  Electronica{


    public Celulares(String nombreproducto, String precio) {
        super(nombreproducto, precio);
    }

    @Override
    public void mostrarDetalles(){
        System.out.println(this.tipoProductoElectronico + " Precio: " + this.precio);

    }

}
