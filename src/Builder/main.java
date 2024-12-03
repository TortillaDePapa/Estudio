package Builder;

public class main {

    public static void main(String[] args) {

        Director director = new Director();
        Persona crearPersona = director.construirPersona(new Persona.PersonaBuilder());
        System.out.println(crearPersona);
        Persona persona = new Persona.PersonaBuilder().setApellido("Poloni").setEdad(20).setNombre("Benjamin").builder();
        System.out.println(persona.toString());
    }
}
