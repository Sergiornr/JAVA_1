public class Veterinario {

    private String nombre;
    private Integer matricula;
    private String especialidad;


    public Veterinario(String nombreR,Integer matriculaR,String especialidadR){
        this.nombre = nombreR;
        this.matricula = matriculaR;
        this.especialidad = especialidadR;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", matricula=" + matricula +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
    public void realizarExamen(Mascota mascotaR){
        System.out.println("atendiendo a la mascota "+ nombre);
    }

}
