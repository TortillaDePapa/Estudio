package Prototype;

public class Documento implements Cloneable {
   private String nombre;
   private String apellido;
   private String direccion;
   private String telefono;

    public Documento(String apellido, String nombre, String direccion, String telefono) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public Documento clone() throws CloneNotSupportedException {
        return new Documento(this.apellido,this.nombre, this.direccion, this.telefono);
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
