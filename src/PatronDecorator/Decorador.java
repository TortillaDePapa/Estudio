package PatronDecorator;

public abstract class Decorador implements Notificacion{
    Notificacion notificacion;

    public Decorador(Notificacion notificacion) {
        this.notificacion = notificacion;
    }


    @Override
    public void enviar(String mensaje) {
        notificacion.enviar(mensaje);
    }
}
