import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(56123456, "Juan", "F", 456167, "A", 80000.0, 54);
        Vendedor vendedor2 = new Vendedor(56123456, "Damian", "g", 456123, "B", 60000.0, 56);
        Vendedor vendedor3 = new Vendedor(56123459,"Pedro","s",456144,"C",70000.0,50);

        vendedor1.agregarTareas("ordenar estantes");
        vendedor1.listarTareas();
        vendedor1.eliminarTareas("ordenar estantes");
        vendedor1.listarTareas();

        //pro



        List<Vendedor>vendedores= new ArrayList<>();
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        vendedores.add(vendedor3);
        vendedores.remove(vendedor1);
        vendedores.forEach(vendedor -> System.out.println(vendedor));
        Collections.sort(vendedores);
        vendedores.forEach(vendedor -> System.out.println(vendedor));

        System.out.println("comienza ejercicios con set");
        Set<Vendedor>vendedoreset = new HashSet<>();
        vendedoreset.add(vendedor1);
        vendedoreset.add(vendedor1);
        vendedoreset.add(vendedor2);
        vendedoreset.add(vendedor2);
        //eliminar vendedor
        //vendedoreset.remove(vendedor1);
        vendedoreset.forEach(vendedor -> System.out.println(vendedor));
        System.out.println("Probamos metodos del main");
        System.out.println("metodo agregar");
        agregarVendedor(vendedoreset,vendedor1);
        System.out.println("metodo agregando dni repetido");
        agregarVendedor(vendedoreset,vendedor2);
        agregarVendedor(vendedoreset,vendedor3);
        System.out.println("metodo eliminar");
        eliminarVendedor(vendedoreset,vendedor2);
        eliminarVendedor(vendedoreset,vendedor1);
        System.out.println("Buscar vendedor por dni: 56123456");
        buscarVendedorPorDni(56123455,vendedoreset);





        //Map<Integer,Vendedor>vendedoresMap = new HashMap<>();
       // vendedoresMap.put(vendedor1.getDni(),vendedor1);


       // vendedoresMap.keySet().forEach(k -> System.out.println(vendedoresMap.get(k)));










    }

    public static void agregarVendedor(Set<Vendedor> Lista ,Vendedor vendedor){
        Lista.add(vendedor);
        for(Vendedor v: Lista){
            System.out.println(v);
        }
    }
    public static void eliminarVendedor(Set<Vendedor> Lista, Vendedor vendedor){
        if (!Lista.contains(vendedor)) {
            System.out.println("El vendedor no esta en la lista");
        } else {
            Lista.remove(vendedor);
            for (Vendedor v: Lista){
                System.out.println(v);
            }
        }

    }
    public static void buscarVendedorPorDni(Integer dni,Set<Vendedor> vendedores){
        if(dni == null){
            System.out.println("Ingrese un dni valido");
        }else{
            for(Vendedor vendedor:vendedores){
                if(vendedor.getDni().equals(dni)){
                    System.out.println(vendedor.toString());
                }
            }
        }
    }
}


