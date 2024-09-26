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
        System.out.println(ollaAcero.stockDisponible());
        ollaAcero.calcularGanancia();
        System.out.println(" La ganancia es de : " + ollaAcero.calcularGanancia());
        Venta venta1 = new Venta(ollaAcero, 123654, "juan", new Date(124,2,20),56);
        Venta venta2 = new Venta(ollaAcero, 123654, "juan", new Date(124,2,20),56);
        //Venta venta3 = new Venta(venta3,86000.0,1432, martin, 15/05/2024, 10);
        System.out.println("venta1 y venta2 son iguales?" + venta1.verificarDosVentasIguales(venta2));
        //System.out.println("venta1 y venta3 son iguales?" + venta1.verificarDosVentasIguales(venta3));
        System.out.println("calcular monto de venta " + venta1.calcularMontoVenta());
        System.out.println("comparando Producto1 y Producto2 "+ ollaAcero.compararProducto(ollaAluminio));
        System.out.println("comision: "+ venta1.calcularComisionVenta());
        //System.out.println("el costo total de ollaAcero es: " + ollaAcero.calcularCostoTotal());
// comparar productos en base al stock

        ArrayList <Producto> listaProductos = new ArrayList<>();
        listaProductos.add(ollaAcero);
        listaProductos.add(ollaAluminio);
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(" lista de productos" + listaProductos.get(i));
        }
    }

}