package entidades;

import entidades.Producto;

public class Venta {

    private Producto producto;
    private Double montoVenta;
    private Integer idVenta;
    private String vendedor;
    private String fecha;
    private static Double comision = 10.0;
    private Integer cantidad;

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }


    public Venta(Producto productoR, Integer idVentaR, String vendedorR, String fechaR, Integer cantidadR) {
        this.producto = productoR;
        this.idVenta = idVentaR;
        this.vendedor = vendedorR;
        this.fecha = fechaR;
        this.cantidad = cantidadR;
    }


    public void verificarDosVentasIguales(Venta venta) {
        if (this.idVenta.equals(venta.idVenta)) {
            System.out.println(" Las ventas son iguales");
        } else {
            System.out.println("Las ventas no son iguales");
        }


    }

    // esto es un método de instancia
    public Double calcularMontoVenta() {
        // guardamos el valor del monto total de la venta en la propiedad correspondiente de esta clase
        this.montoVenta = this.producto.getPrecioVenta() * this.cantidad;
        return this.montoVenta;
    }

    public Double calcularComisionVenta() {
        return (montoVenta * comision / 100);
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

    public Double calcularCostoTotal() {
        return producto.getPrecioVenta() * cantidad;
    }
}
