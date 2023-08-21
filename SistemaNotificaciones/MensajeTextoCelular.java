package SistemaNotificaciones;

public class MensajeTextoCelular extends NotificacionMensajeTexto{

    public MensajeTextoCelular(String remitenteCelularNumero){
        super(remitenteCelularNumero);
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
