public class Persona {
    abstract Integer dni;
    abstract String nombre;
    abstract Integer telefono;

    public Persona(Integer dni, String nombre, Integer telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Integer getDni() {
        return dni;
    }
}

}