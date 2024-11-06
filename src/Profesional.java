import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Profesional extends Persona{
    private Integer matricula;
    private Set<String,Tratamiento> tratamientosHabilitados;

    public Profesional(Integer dni, String nombre, Integer telefono) {
        super(dni, nombre, telefono);
        this.matricula = matricula;
        this.tratamientosHabilitados = new HashSet<>();
    }
    public String void mostrarInformacionPersonalizada(){

    }
    public String void verificarEstado(){

    }
}
