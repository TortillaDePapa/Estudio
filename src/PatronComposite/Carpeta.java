package PatronComposite;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Archivo{

    String nombre;
    List<Archivo> archivos;


    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.archivos = new ArrayList<>();
    }


    public void agregarArchivo(Archivo archivo) {
        archivos.add(archivo);
    }




    @Override
    public void mostrarArchivo() {
        System.out.println(nombre);
        for (Archivo archivo : archivos) {
            System.out.println(archivo);
        }
    }
}
