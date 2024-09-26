package entidades;

public class Producto {

 //Necesitamos diseñar un sistema que permita a un vendedor consultar  por un producto.
    // Los productos tienen nombre, precio de compra, precio de venta y stock disponibles.
    // Se espera que los productos puedan informar si hay stock disponible y
    // cuál es la ganancia obtenida por cada venta, según los precios disponibles.

    private String nombre;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stock;


    public Double getPrecioVenta() {
        return precioVenta;
    }
    public Integer getStock(){return stock;}

    public boolean stockDisponible(){
        return stock > 0;
    }
    public Double calcularGanancia(){
       return precioVenta - precioCompra;
    }
public int compararNombre(Producto otroProducto){
        return this.nombre.compareTo(otroProducto.nombre);
}

public Producto(String nombreR, Double precioCompraR, Double precioVentaR, Integer stockR){
        this.nombre = nombreR;
        this.precioCompra = precioCompraR;
        this.precioVenta = precioVentaR;
        this.stock = stockR;

}
public Integer compararProducto(Producto otroProducto){
        if (this.stock > otroProducto.getStock()){
            return 1;

        } else if (this.stock < otroProducto.getStock()){
            return -1;
        } else {
            return 0;
        }
}



//public Double calcularCostoTotal() {
 //       return precioCompra * cantidad;
//}
}