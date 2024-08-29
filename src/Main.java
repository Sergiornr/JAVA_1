import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 LocalDate fechaNacimiento = LocalDate.of(2001,10,6);
        System.out.println(entrada(fechaNacimiento,false));
        contarS(" Los soles estan cerca");
    }

    //Crea una función que de acuerdo a la edad del usuario( recibe fecha de nacimiento) y
    // si tiene entrada indique si puede o no asistir al evento, debe ser mayor.
    public static boolean entrada (LocalDate fechaNacimiento, boolean tieneEntrada) {

        // primero necesito saber si es mayor de edad
        Integer edad = LocalDate.now().getYear() - fechaNacimiento.getYear();

        // segundo necesito saber si tiene entrada valida.

        if (tieneEntrada && edad >= 18){

            return true;
        } else {
            return false;
        }

    }


    //Escribí una función que reciba una cadena de texto y
    // cuente la cantidad de “s”. Retorna la cantidad encontrada.

    public static int contarS (String texto){

       int contador = 0;
        for (int i = 0; i < texto.length(); i++){

            if (texto.charAt(i) == 's'){
                contador ++;
            }

        }
        System.out.println(" La cantidad de s en el texto son : " + contador);
        return contador;
    }


}