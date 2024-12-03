package Builder;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;


    private Persona(PersonaBuilder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.edad = builder.edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    static class PersonaBuilder {
        private String nombre;
        private String apellido;
        private int edad;


        public PersonaBuilder setNombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public PersonaBuilder setApellido(String apellido){
            this.apellido = apellido;
            return this;
        }

        public PersonaBuilder setEdad(int edad){
            this.edad = edad;
            return this;
        }

        public Persona builder(){
            return new Persona(this);
        }
    }
}
