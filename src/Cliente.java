public class Cliente {
    private Integer id;
    private String apellido;
    private Integer dni;
    private Integer cuit;

    public Cliente(Integer id, String apellido, Integer dni, Integer cuit) {
        this.id = id;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
    public void depositarAcuenta(Double monto){

    }
    @Override
    public int hashCode() {
        int hash=17;
        hash= hash* apellido.hashCode() * dni.hashCode();
        return hash;

        @Override
        public boolean equals(Object obj) {
            if(obj== null || ! (obj instanceof Cliente) )
            {return false;}
            return  this.dni.equals(((Cliente)obj).dni);
}
