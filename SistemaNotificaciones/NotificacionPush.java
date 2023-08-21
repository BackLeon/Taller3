package SistemaNotificaciones;

public abstract class NotificacionPush implements INotificacion{

    protected String remitente;
    protected String mensaje;

    public NotificacionPush(String remitenteNombre){

        this.remitente = remitenteNombre;

    }

    public abstract String getMensaje(String mensaje);

}
