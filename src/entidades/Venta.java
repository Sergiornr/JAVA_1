package entidades;

import java.util.Date;

public class Venta {
    private Producto producto;
    private Double montoVenta;
    private Integer idVenta;
    private String vendedor;
    private Date fecha;
    private static Double comision = 10.0;
    private Integer cantidad;


    public Venta (Producto productoR,Integer idVentaR, String vendedorR, Date fechaR,Integer cantidadR){
        this.producto = productoR;
        this. idVenta = idVentaR;
        this.vendedor = vendedorR;
        this.fecha = fechaR;
        this.cantidad = cantidadR;
    }
public boolean verificarDosVentasIguales(Venta otraVenta){
    if (otraVenta == null){
        return false;
    }
    return this.idVenta.equals(otraVenta.idVenta);

}

// esto es un método de instancia
public Double calcularMontoVenta(){
        // guardamos el valor del monto total de la venta en la propiedad correspondiente de esta clase
         this.montoVenta = this.producto.getPrecioVenta()*this.cantidad;
        return    this.montoVenta;
}

public Double calcularComisionVenta(){
    return (montoVenta * comision/100);
}
// agregar metodo statico para actualizar la comision
    @Override
    public String toString() {
        return "Venta{" +
                "producto=" + producto +
                ", montoVenta=" + montoVenta +
                ", idVenta=" + idVenta +
                ", vendedor='" + vendedor + '\'' +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                '}';
    }
}

