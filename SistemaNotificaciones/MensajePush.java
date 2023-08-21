package SistemaNotificaciones;

public class MensajePush extends NotificacionPush{

    public MensajePush(String remitenteNombre){
        super(remitenteNombre);
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
