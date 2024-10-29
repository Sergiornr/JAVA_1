import entidades.Producto;
import entidades.Venta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto ollaAluminio = new Producto("Essen",60000.0, 80000.0,100);
        Producto ollaAcero = new Producto("Eccen", 50000.0, 70000.0, 20 );
        ollaAcero.stockDisponible();
        ollaAluminio.stockDisponible();
        System.out.println(" La ganancia es de : " + ollaAcero.calcularGanancia());
        Venta venta1 = new Venta(ollaAcero, 123654, "juan","29/10/2024",56);
        Venta venta2 = new Venta(ollaAcero, 123654, "juan", "29/10/2024",56);
        Venta venta3 = new Venta(ollaAluminio,457890,"Martin", "20/10/2024", 10);
        venta1.verificarDosVentasIguales(venta2);
        venta1.verificarDosVentasIguales(venta3);
        System.out.println("calcular monto de venta " + venta1.calcularMontoVenta());
        //comparando productos en base al stock
        ollaAcero.compararStock(ollaAluminio);
        System.out.println("comision: "+ venta1.calcularComisionVenta());
        System.out.println("El costo total es de : $"+ venta1.calcularCostoTotal());
        System.out.println(" la info de venta es: "+ venta1.toString());
// comparar productos en base al stock

        ArrayList <Producto> listaProductos = new ArrayList<>();
        listaProductos.add(ollaAcero);
        listaProductos.add(ollaAluminio);
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(" lista de productos" + listaProductos.get(i));
        }
    }

}