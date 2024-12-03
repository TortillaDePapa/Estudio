package Patrones.Singelton;

public class Singelton {
    private static Singelton instance;
    private Singelton() {}
    public static Singelton getInstance() {
        if (instance == null) {
            instance = new Singelton();
        }
        return instance;
    }
}
