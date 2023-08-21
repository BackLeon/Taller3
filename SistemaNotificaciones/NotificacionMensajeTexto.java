package SistemaNotificaciones;

public abstract class NotificacionMensajeTexto implements INotificacion{

    protected String remitente;
    protected String mensaje;

    public NotificacionMensajeTexto(String remitenteNumeroCelular){

        this.remitente = remitenteNumeroCelular;

    }

    public abstract String getMensaje(String mensaje);



}
