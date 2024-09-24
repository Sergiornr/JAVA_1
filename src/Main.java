import entidades.Producto;
import entidades.Venta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Producto ollaAcero = new Producto("Eccen", 50000.0, 70000.0, 20, 78 );
        ollaAcero.stockDisponible();
        System.out.println(ollaAcero.stockDisponible());
        ollaAcero.calcularGanancia();
        System.out.println(" La ganancia es de : " + ollaAcero.calcularGanancia());
        Venta venta1 = new Venta(venta1,78000.0, 1234, juan, 10/02/2024, 10);
        Venta venta2 = new Venta(venta2,78000.0,1256, pedro, 10/03/2024, 10);
        Venta venta3 = new Venta(venta3,86000.0,1432, martin, 15/05/2024, 10
        );
        System.out.println("venta1 y venta2 son iguales?" + venta1.verificarDosVentasIguales(venta2));
        System.out.println("venta1 y venta3 son iguales?" + venta1.verificarDosVentasIguales(venta3));
Producto ollaAluminio = new Producto(Essen,60000.0, 80000.0,100, 56);
        System.out.println("comparando Producto1 y Producto2 "+ ollaAcero.compararNombre(ollaAluminio));
        System.out.println("comision: "+ venta1.calcularComisionVenta());
        System.out.println("el costo total de ollaAcero es: " + ollaAcero.calcularCostoTotal());

    }
}