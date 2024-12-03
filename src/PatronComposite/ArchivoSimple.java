package PatronComposite;

public class ArchivoSimple implements Archivo {

    String nombre;


    @Override
    public void mostrarArchivo() {
        System.out.println(this.nombre);
    }


    public ArchivoSimple(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ArchivoSimple{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
