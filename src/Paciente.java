import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Paciente extends Persona{

    private String fecha;
    private Set<String,Tratamiento> tratamientosRealizados;

    public Paciente(Integer dni, String nombre, Integer telefono, String fecha) {
        super(dni, nombre, telefono);
        this.fecha = fecha;
        this.tratamientosRealizados = new HashSet<>();
    }
    public String void mostrarInformacionPersonalizada(){

    }
    public String void verificarEstado(){

    }
}
