import java.util.ArrayList;
import java.util.Objects;

public class Cliente implements Comparable<Cliente>{
    private Integer id;
    private String apellido;
    private Integer dni;
    private Integer cuit;
    private ArrayList<Cuenta> cuentas;

    public Cliente(Integer id, String apellido, Integer dni, Integer cuit) {
        this.id = id;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.cuentas = new ArrayList<Cuenta>();
    }

    public void depositarAcuenta(Double monto) {

    }

    @Override
    public int hashCode() {
      /*  int hash = 17;
        hash = hash * apellido.hashCode() * dni.hashCode();
        return hash;*/
        return Objects.hash(apellido, dni);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Cliente)) {
            return false;
        }
        return this.dni.equals(((Cliente) obj).dni);
    }

    @Override
    public int compareTo(Cliente o) {
        return 0;
    }
}
