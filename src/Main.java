import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(2001, 10, 6);
        System.out.println(entrada(fechaNacimiento, false));
        contarS(" Los soles estan cerca");

listarPeliculas();
        division("100", "30");
        //Crea un array de cuatro películas  e imprimirlas por orden alfabético.
        System.out.println(" array de peliculas ");
        String[] peliculas = new String[4];
        peliculas[0] = "Gladiador";
        peliculas[1] = "Interestelar";
        peliculas[2] = "Avatar";
        peliculas[3] = "War horse";
        Arrays.sort(peliculas);
        for (
                int i = 0;
                i < peliculas.length; i++) {

            System.out.println(peliculas[i]);

        }
        //2. Crea un nuevo array que contenga la lista de películas en
        //mayúscula.
        System.out.println(" array de peliculas ");
        String[] Movies = new String[5];
        Movies[0] = "Titanic";
        Movies[1] = "Armagedon";
        Movies[2] = "rocky";
        Movies[3] = "El señor de los anillos";
        Movies[4] = "La guerra de los mundos";

        for (
                int i = 0;
                i < Movies.length; i++) {
            Movies[i] = Movies[i].toUpperCase();

            System.out.println(Movies[i]);

        }
    }

    //1. Crea un array de cuatro películas e imprimirlas por orden
//alfabético. Aplicando Scanner

    public static void listarPeliculas() {
        Scanner scanner = new Scanner(System.in);
        String[] peliculasOrdenadas = new String[2];
        System.out.println("Ingrese pelicula 1");
        String peli1 = scanner.nextLine();
        peliculasOrdenadas[0] = peli1;
        System.out.println("Ingrese pelicula 2");
        String peli2 = scanner.nextLine();
        peliculasOrdenadas[1] = peli2;
        Arrays.sort(peliculasOrdenadas);
        for (int i = 0; i < peliculasOrdenadas.length; i++) {

            System.out.println(peliculasOrdenadas[i]);


        }

    }


//2. Crea un nuevo array que contenga la lista de películas en mayúscula. Aplicando Scanner


    //Crea una función que de acuerdo a la edad del usuario( recibe fecha de nacimiento) y
    // si tiene entrada indique si puede o no asistir al evento, debe ser mayor.
    public static boolean entrada(LocalDate fechaNacimiento, boolean tieneEntrada) {

        // primero necesito saber si es mayor de edad
        Integer edad = LocalDate.now().getYear() - fechaNacimiento.getYear();

        // segundo necesito saber si tiene entrada valida.

        if (tieneEntrada && edad >= 18) {

            return true;
        } else {
            return false;
        }

    }


    //Escribí una función que reciba una cadena de texto y
    // cuente la cantidad de “s”. Retorna la cantidad encontrada.

    public static int contarS(String texto) {

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) == 's') {
                contador++;
            }

        }
        System.out.println(" La cantidad de s en el texto son : " + contador);
        return contador;
    }

    //3. Necesitamos crear una función que reciba dos números en
//formato texto y retorne el cociente de dividir el primero
//por el segundo.
    public static Integer division(String num1t, String num2t) {

        Integer num1 = Integer.parseInt(num1t);
        Integer num2 = Integer.parseInt(num2t);
        Integer divisionNumeros = num1 / num2;
        System.out.println(divisionNumeros);
        return divisionNumeros;

    }


}




