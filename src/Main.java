import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(56123456, "Juan", "Flores", 456167, "A", 80000.0, 54);
        Vendedor vendedor2 = new Vendedor(56123456, "Damian", "Gomez", 456123, "B", 60000.0, 56);
        Vendedor vendedor3 = new Vendedor(56123459, "Pedro", "Soria", 456144, "C", 70000.0, 50);
        Vendedor vendedor4 = new Vendedor(56133465, "Javier", "Perez", 1145639874, "H", 90000.0, 95);

        Producto ollaAcero = new Producto(654321, "Ollas de acero para la cocina");
        Producto ollaAluminio = new Producto(654325, "Ollas de aluminio para la cocina");


        vendedor1.agregarTareas("ordenar estantes");
        vendedor1.listarTareas();
        vendedor1.eliminarTareas("ordenar estantes");
        vendedor1.listarTareas();

        //pro


        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        vendedores.add(vendedor3);
        vendedores.add(vendedor4);
        vendedores.remove(vendedor1);
        vendedores.forEach(vendedor -> System.out.println(vendedor));
        Collections.sort(vendedores);
        vendedores.forEach(vendedor -> System.out.println(vendedor));



        System.out.println("comienza ejercicios con set");
        Set<Vendedor> vendedoreset = new HashSet<>();
        vendedoreset.add(vendedor1);
        vendedoreset.add(vendedor1);
        vendedoreset.add(vendedor2);
        vendedoreset.add(vendedor2);
        vendedoreset.add(vendedor4);

        System.out.println("lista hashmap");
        Map<Integer, Producto> productos = new HashMap<>();
        productos.put(ollaAcero.getClave(), ollaAcero);
        productos.put(ollaAluminio.getClave(), ollaAluminio);
        //eliminar vendedor
        //vendedoreset.remove(vendedor1);
        vendedoreset.forEach(vendedor -> System.out.println(vendedor));
        System.out.println("Probamos metodos del main");
        System.out.println("metodo agregar");
        agregarVendedor(vendedoreset, vendedor1);
        System.out.println("metodo agregando dni repetido");
        agregarVendedor(vendedoreset, vendedor2);
        agregarVendedor(vendedoreset, vendedor3);
        System.out.println("metodo eliminar");
        eliminarVendedor(vendedoreset, vendedor2);
        eliminarVendedor(vendedoreset, vendedor1);
        System.out.println("Buscar vendedor por dni: 56123459");
        buscarVendedorPorDni(vendedoreset, 56123459);
        System.out.println("Buscar vendedor por dni: 56123456(repite dni)");
        buscarVendedorPorDni(vendedoreset, 56123456);
        System.out.println("Buscar vendedor por dni: 56123451");
        buscarVendedorPorDni(vendedoreset, 56123451);
        System.out.println("Buscar vendedor por dni: 56133465");
        buscarVendedorPorDni(vendedoreset, 56133465);
        System.out.println("Imprimir apellido ordenado alfabeticamente");
        imprimirApellidosOrdenados(vendedores);
        System.out.println("Buscar producto con clave");
        buscarProductos(productos, 654321);
        buscarProductos(productos, 654328);
        buscarProductos(productos, 654325);
        System.out.println("eliminar Productos");
        eliminarProductos(productos, ollaAcero);
        System.out.println("Agregar productos");
        agregarProductos(productos,ollaAluminio);
        agregarProductos(productos,ollaAcero);
        //agregarProductos(productos,ollaTeflon);


        //Map<Integer,Vendedor>vendedoresMap = new HashMap<>();
        // vendedoresMap.put(vendedor1.getDni(),vendedor1);


        // vendedoresMap.keySet().forEach(k -> System.out.println(vendedoresMap.get(k)));


    }

    public static void agregarVendedor(Set<Vendedor> Lista, Vendedor vendedor) {
        Lista.add(vendedor);
        for (Vendedor v : Lista) {
            System.out.println(v);
        }
    }

    public static void eliminarVendedor(Set<Vendedor> Lista, Vendedor vendedor) {
        if (!Lista.contains(vendedor)) {
            System.out.println("El vendedor no esta en la lista");
        } else {
            Lista.remove(vendedor);
            for (Vendedor v : Lista) {
                System.out.println(v);
            }
        }

    }

    public static void buscarVendedorPorDni(Set<Vendedor> Lista, Integer dni) {
        if (dni == null) {
            System.out.println("Ingrese un dni valido");
        } else {
            for (Vendedor vendedor : Lista) {
                if (vendedor.getDni().equals(dni)) {
                    System.out.println(vendedor.toString());
                }
            }
        }
    }

    public static void imprimirApellidosOrdenados(List<Vendedor> Lista) {
        List<String> apellidos = new ArrayList<>();
        for (Vendedor vendedor : Lista) {
            apellidos.add(vendedor.getApellido());
        }
        Collections.sort(apellidos);
        {
            for (String apellido : apellidos) {
                System.out.println(apellido);
            }
        }
    }

    public static void buscarProductos(Map<Integer, Producto> productos, Integer clave) {
        if (clave == null) {
            System.out.println("Ingrese una clave valida");
        } else {
            if (!productos.containsKey(clave)) {
                System.out.println("Clave inexistente");
            } else {
                System.out.println(productos.get(clave));
            }
        }
    }

    public static void eliminarProductos(Map<Integer, Producto> productos, Producto producto) {
        if (!productos.containsKey(producto.getClave())) {
            System.out.println("Producto inexistente");
        } else {
            productos.remove(producto.getClave());
            for (Integer clave : productos.keySet()) {
                System.out.println(productos.get(clave));
            }
        }
    }

    public static void agregarProductos(Map<Integer, Producto> productos, Producto producto) {
        if (productos.containsKey(producto.getClave())) {
            System.out.println("El producto "+ producto+" ya existe en el catalogo ");
        } else {
            productos.put(producto.getClave(), producto);
            System.out.println("Producto "+ producto +" agregado al catalogo");
        }

    }


}
