package PatronAdapter;

public class main {
    public static void main(String[] args) {
        Enchufe enchufe = new Enchufe();
        EnchufeEuropeo adaptador = new AdaptadorEnchufe(enchufe);
        adaptador.adaptar();
    }
}
