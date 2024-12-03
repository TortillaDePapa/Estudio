package PatronDecorator;

public class main {
    public static void main(String[] args) {
        Notificacion notificacion = new NotificacionEmail();

        notificacion = new NotificacionSMS(notificacion);
        notificacion = new NotificacionWPP(notificacion);
        notificacion.enviar("Tenias una agenda para ayer");



    }
}
