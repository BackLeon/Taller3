package Tienda;

public abstract class Ropa implements  IProducto{

    protected String tipoProductoRopa;
    protected String precio;

    public Ropa(String nombreproducto, String precio){

        this.tipoProductoRopa = nombreproducto;
        this.precio = precio;

    }

    @Override
    public void mostrarDetalles() {

    }


}
