public class Mascota {

    private String nombre;
    private Integer edad;
    private String especie;

    public Mascota(String nombreR,Integer edadR,String especieR){
        this.nombre = nombreR;
        this.edad = edadR;
        this.especie = especieR;

    }


    public void setInfo(String nombreR,Integer edadR ){
        this.nombre = nombreR;
        this.edad = edadR;
    };


    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                '}';
    }
}
