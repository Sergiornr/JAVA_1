import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(56123456, "Juan", "F", 456167, "A", 80000.0, 54);
        Vendedor vendedor2 = new Vendedor(56123453, "Damian", "g", 456123, "B", 60000.0, 56);
        Vendedor vendedor3 = new Vendedor(56123459,"Pedro","s",456144,"C",70000.0,50);

        vendedor1.agregarTareas("ordenar estantes");
        vendedor1.listarTareas();
        List<Vendedor>vendedores= new ArrayList<>();
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        vendedores.add(vendedor3);
        vendedores.forEach(vendedor -> System.out.println(vendedor));
        Collections.sort(vendedores);
        vendedores.forEach(vendedor -> System.out.println(vendedor));
        Set<Vendedor>vendedoreset = new HashSet<>();
        vendedoreset.add(vendedor1);
        vendedoreset.add(vendedor1);
        vendedoreset.add(vendedor2);
        vendedoreset.add(vendedor2);
        vendedoreset.forEach(vendedor -> System.out.println(vendedor));






    }

    public static void agregarVendedor(Vendedor vendedor,Set<>){
        vendedor
    }
}


