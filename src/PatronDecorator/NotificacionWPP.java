package PatronDecorator;

public class NotificacionWPP extends Decorador{

    public NotificacionWPP(Notificacion notificacion) {
        super(notificacion);
    }


    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Mensaje enviado por WPP: " + mensaje);
    }
}
