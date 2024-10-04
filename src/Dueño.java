import java.util.ArrayList;

public class Dueño {

    private String nombre;
    private Integer telefono;
    private String direccion;
    private ArrayList<Mascota>mascotas;
    private ArrayList<Veterinario>veterinarios;

    public Dueño(String nombreR,Integer telefonoR,String direccionR){
        this.nombre = nombreR;
        this.telefono = telefonoR;
        this.direccion = direccionR;
        this.mascotas = new ArrayList<Mascota>();
        this.veterinarios = new ArrayList<Veterinario>();
    }
public void registrarMascota(Mascota mascotaR){
     this.mascotas.add(mascotaR);
}
public void programarTurno(Veterinario veterinario){
   this.veterinarios.add(veterinario);
}

    @Override
    public String toString() {
        return "Dueño{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", mascotas=" + mascotas +
                ", veterinarios=" + veterinarios +
                '}';
    }

    public void listarAnimales(){
    for (int i = 0; i < mascotas.size(); i++) {
        System.out.println(mascotas.get(i));
    }

}








}
