package Tienda;

public abstract class Electronica implements IProducto{

    protected String tipoProductoElectronico;
    protected String precio;

    public Electronica(String nombreproducto, String precio){
        this.tipoProductoElectronico = nombreproducto;
        this.precio = precio;
    }

    @Override
    public void mostrarDetalles() {

    }


}
