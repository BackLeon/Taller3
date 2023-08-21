package SistemaNotificaciones;

public class MensajeCorreo extends NotificacionEmail{


    public MensajeCorreo(String remitenteEmail) {
        super(remitenteEmail);
    }

    @Override
    public void enviar(String destinario) {

        System.out.println("Destinario: " + destinario +
                " Mensaje: " + this.mensaje +
                " Remitente:" + remitente);

    }

    @Override
    public String getMensaje(String mensaje) {
        return this.mensaje = mensaje;
    }
}
