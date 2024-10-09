public class Empleado {
    private String nombre;
    private Integer dni;
    private Integer legajo;


    public Empleado(String nombreR,Integer dniR,Integer legajoR){
        this.nombre = nombreR;
        this.dni = dniR;
        this.legajo = legajoR;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", legajo=" + legajo +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || ! (obj instanceof Empleado))
        {return false;}
        return ((Empleado)obj).dni.equals(this.dni);
    }

    @Override
    public int hashCode() {
        int hash= 19;
        hash = hash* nombre.hashCode()*dni.hashCode()*legajo.hashCode();
        return hash;
    }
}
