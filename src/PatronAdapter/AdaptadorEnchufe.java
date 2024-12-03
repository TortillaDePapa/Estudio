package PatronAdapter;

public class AdaptadorEnchufe implements EnchufeEuropeo{

    Enchufe enchufe;

    public AdaptadorEnchufe(Enchufe enchufe) {
        this.enchufe = enchufe;
    }
    @Override
    public void adaptar() {
    enchufe.enchufar();
    }
}
