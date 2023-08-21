package SistemaNotificaciones;

public abstract class NotificacionEmail implements INotificacion {


    protected String remitente;
    protected String mensaje;

    public NotificacionEmail(String remitenteEmail){

        this.remitente = remitente;

    }

    public abstract String getMensaje(String mensaje);


}
