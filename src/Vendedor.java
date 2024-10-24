import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Vendedor implements Comparable<Vendedor> {
    private Integer dni;
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String sector;
    private Double sueldo;
    private Integer ventas;
    private List<String> tareas= new ArrayList<>();

    public Vendedor(Integer dni, String nombre, String apellido, Integer telefono, String sector, Double sueldo, Integer ventas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.sector = sector;
        this.sueldo = sueldo;
        this.ventas = ventas;
        this.tareas = new ArrayList<>();
    }

    @Override
    public int compareTo(Vendedor o) {
        return this.sueldo.compareTo(o.sueldo);

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", sector='" + sector + '\'' +
                ", sueldo=" + sueldo +
                ", ventas=" + ventas +
                '}';
    }

    public void vender() {

    }

    public void reponerStock() {

    }


    public Double cobrarSueldo() {
return 0.0
    }
public void listarTareas(){
    tareas.forEach(i -> System.out.println(i));
}
public void agregarTareas(String tarea){
        tareas.add(tarea);
}

}