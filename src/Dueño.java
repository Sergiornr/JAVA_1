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
    }
public void registrarMascota(Mascota mascotaR){
     this.mascotas.add(mascotaR);
}
public void programarTurno(){
   this.veterinarios.add(Veterinario);
}
public void listarAnimales(){
    for (int i = 0; i < mascotas.size(); i++) {
        System.out.println(mascotas.get(i));
    }
}








}
