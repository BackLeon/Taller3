package InstrumentosMusicales;

public abstract class InstrumentoMusical {
    protected String nombre;

    public InstrumentoMusical(String nombre) {
        this.nombre = nombre;
    }

    public abstract void tocar();
    
}
