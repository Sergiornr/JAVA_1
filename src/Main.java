import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(2001, 10, 6);
        System.out.println(entrada(fechaNacimiento, false));
        contarS(" Los soles estan cerca");
        System.out.println(compararCadenaDeTexto());
//listarPeliculas();
        enlistarPeliculas();
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
        //Crea una variable que guardará la primera película que
//comience con “L”, se debe recorrer el array buscando el primer
//resultado.
        System.out.println(" array de peliculas que comienzan con L");
        String[] peliculas4 = new String[4];
        peliculas4[0]="Gladiador";
        peliculas4[1]="Interestelar";
        peliculas4[2]="Avatar";
        peliculas4[3]="Los 7 magnificos";
        Arrays.sort(peliculas4);
        for(String pelicula :peliculas4)

        {
            if (pelicula.startsWith("L")) {
                System.out.println("La primera pelicula que empieza con L es: " + pelicula);
            } else {
                System.out.println("No hay peliculas que empiecen con L");
            }
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

   public static void enlistarPeliculas() {
       Scanner scanner = new Scanner(System.in);
       String[] ordenPeliculas = new String[2];
       System.out.println("Ingrese pelicula 1");
       String peli1 = scanner.nextLine();
       ordenPeliculas[0] = peli1;
       System.out.println("Ingrese pelicula 2");
       String peli2 = scanner.nextLine();
       ordenPeliculas[1] = peli2;
       Arrays.sort(ordenPeliculas);
       for (int i = 0; i < ordenPeliculas.length; i++) {

           System.out.println(ordenPeliculas[i].toUpperCase());


       }
   }
    //Necesitamos un programa que reciba dos cadenas de texto y
    // que  cada una contenga dos películas separadas por una coma.
    //
    //El método debe retornar la que tenga mayor cantidad de caracteres.
    //Debe generar un array de cuatro elementos.
    //Debe guardar las cuatro películas en el array e imprimirlas por consola.
   public static  String compararCadenaDeTexto(){
    Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese cadena de texto separado por una coma");
       String cadena1=scanner.nextLine();
       System.out.println("Ingrese segunda cadena de texto separado por una coma");
       String cadena2=scanner.nextLine();
       if (cadena1.compareTo(cadena2) == -1){
           return cadena2;
       } else if (cadena1.compareTo(cadena2)== 0) {
           return "Son iguales";
       } else {
           return cadena1;
       }
   }














    //Crea una función que de acuerdo a la edad del usuario( recibe fecha de nacimiento) y
    // si tiene entrada indique si puede o no asistir al evento, debe ser mayor.
   public static boolean entrada( LocalDate fechaNacimiento, boolean tieneEntrada){

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




