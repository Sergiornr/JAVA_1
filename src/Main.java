import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        faltasDisponibles(23,75);
        faltas(23,0.75);

        System.out.println(" Mensaje de prueba");




    }
    //1. Escribir una función para calcular la cantidad de faltas
    //disponibles de acuerdo a un porcentaje de asistencia y
    //cantidad de encuentros determinado¿Cuál es el resultado para
    //una cursada de 23 encuentros que requiere un 75% de
    //asistencia? ¿Y para el caso de este módulo?
    public static void faltasDisponibles (Integer encuentros, Integer porcentajeA){

        Integer faltasDisponibles = encuentros - encuentros * porcentajeA/100;
        System.out.println("Las faltas permitidas son : " + faltasDisponibles);

    }
    public static void faltas (int clases, double porcentajeB){

        int faltas =  clases - (int) (clases * porcentajeB);
        System.out.println(" La cantidad de faltas son : " + faltas);

    }
}