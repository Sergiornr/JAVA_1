package entidades;

import java.util.Date;

public class Venta {
    private String nombre;
    private Double montoVenta;
    private Integer idVenta;
    private String vendedor;
    private Date fecha;
    private Double comision;

public boolean verificarDosVentasIguales(Venta otraVenta){
    if (otraVenta == null){
        return false;
    }
    return this.idVenta.equals(otraVenta.idVenta) &&
            this.nombre.equals(otraVenta.nombre)  &&
            this.fecha.equals(otraVenta.fecha);
}
public Venta (String nombreR, Double montoVentaR,Integer idVentaR, String vendedorR, Date fechaR, Double comisionR){
    this.nombre = nombreR;
    this.montoVenta = montoVentaR;
    this. idVenta = idVentaR;
    this.vendedor = vendedorR;
    this.fecha = fechaR;
    this.comision = comisionR;
}
public Double calcularComisionVenta(){
    return (montoVenta * comision/100);
}

    @Override
    public String toString() {
        return "Venta{" +
                "nombre='" + nombre + '\'' +
                ", montoVenta=" + montoVenta +
                ", idVenta=" + idVenta +
                ", vendedor='" + vendedor + '\'' +
                ", fecha=" + fecha +
                ", comision=" + comision +
                '}';
    }
}
