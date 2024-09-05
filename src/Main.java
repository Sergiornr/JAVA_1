import entidades.Producto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Producto ollaAcero = new Producto("Eccen", 50000.0, 70000.0, 20 );
        ollaAcero.stockDisponible();
        System.out.println(ollaAcero.stockDisponible());
        ollaAcero.calcularGanancia();
        System.out.println(" La ganancia es de : " + ollaAcero.calcularGanancia());





    }
}