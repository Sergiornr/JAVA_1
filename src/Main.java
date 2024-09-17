import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Main {
    public static String comparandoNombres() {
        //Recibimos la info
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese apellido y nombre separado por coma");
        String cadena1 = scanner.nextLine();
        System.out.println("ingrese el segundo apellido y nombre separado por coma");
        String cadena2 = scanner.nextLine();


        // retorna la mayor cadena -1,0,1
        if (cadena1.compareTo(cadena2) == -1) {
            return cadena2;
        } else if (cadena1.compareTo(cadena2) == 0) {
            return "son iguales";
        } else {
            return cadena1;
        }


    }

    public static void crearArrayAPartir2Cadenas() {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingresa dos pelis separadas por coma");
        String pelis1 = scanner.nextLine();
        System.out.println(" ingresa otras dos pelis separadas por coma");
        String pelis2 = scanner.nextLine();


        String[] arrayNuevo = new String[4];
        arrayNuevo[0] = pelis1;
        arrayNuevo[1] = pelis2;


        for (int i = 0; i < arrayNuevo.length; i++) {
            System.out.println(arrayNuevo[i]);
        }
    }

    public static void crearArrayAPartir2Cadenas() {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingresa dos pelis separadas por coma");
        String pelis1 = scanner.nextLine();


    }

}