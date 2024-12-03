package Prototype;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Documento documento1 = new Documento("Poloni","Benjamin","Ocampo","091413684");
        System.out.println("Doc original: "+documento1);
        Documento documento2 = documento1.clone();
        documento2.setNombre("Nelson");
        System.out.println("Doc clonado: "+documento2);

    }
}
