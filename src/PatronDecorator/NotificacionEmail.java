package PatronDecorator;

public class NotificacionEmail implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Mensaje enviado por email"+mensaje);
    }

}
