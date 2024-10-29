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

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void stockDisponible(){
       if(this.getStock() > 0 ){
           System.out.println("Hay stock disponible");
       } else {
           System.out.println("No hay stock disponible");
       }
    }
    public Double calcularGanancia(){
       return precioVenta - precioCompra;
    }
public Producto(String nombreR, Double precioCompraR, Double precioVentaR, Integer stockR){
        this.nombre = nombreR;
        this.precioCompra = precioCompraR;
        this.precioVenta = precioVentaR;
        this.stock = stockR;

}
public void compararStock(Producto producto){
        if (this.stock > producto.getStock()){
            System.out.println("El producto tiene mas stock");

        } else if (this.stock < producto.getStock()){
            System.out.println("El producto tiene menos stock");
        } else {
            System.out.println("El producto tiene igual stock");
        }
}

    @Override
    public String toString() {
        return "Producto{" +
                "stock=" + stock +
                '}';
    }


}
