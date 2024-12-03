package PatronComposite;

public class main {
    public static void main(String[] args) {
        Archivo documento = new ArchivoSimple("documento.txt");
        Archivo imagen = new ArchivoSimple("imagen.jpg");

        Carpeta carpeta = new Carpeta("Carpeta");
        carpeta.agregarArchivo(documento);
        carpeta.agregarArchivo(imagen);

        carpeta.mostrarArchivo();
    }
}
