public class Producto {
    private Integer clave;
    private String descripcion;

    public Producto(Integer clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }

    public Integer getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "clave=" + clave +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
