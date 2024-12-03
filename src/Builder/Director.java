package Builder;

public class Director {

    public Persona construirPersona(Persona.PersonaBuilder builder) {
        return builder.setNombre("Benjamin").setApellido("Poloni").setEdad(20).builder();
    }

    public Persona construirPersona2(Persona.PersonaBuilder builder) {
        return builder.setNombre("Lucas").setApellido("Leguizamon").setEdad(21).builder();
    }
}
