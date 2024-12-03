package PatronDecorator;

public class NotificacionSMS extends Decorador{
    public NotificacionSMS(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String texto) {
        super.enviar(texto);
        System.out.println("Mensaje enviado por SMS"+texto);
    }
}
