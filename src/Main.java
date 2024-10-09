import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LavadorVajilla empleado1 = new LavadorVajilla("SERGIO", 45678909, 234566);
        EmpleadoLimpiezaGeneral empleado100 = new EmpleadoLimpiezaGeneral("FEDERICO", 67890987, 345678, 7);
        empleado1.romperVajilla(5, 3000.0);
        empleado1.calcularSueldoMes();
        empleado100.realizarHorasExtra(15);
        System.out.println(empleado100.calcularValorHorasExtra());
        empleado100.calcularSueldoMes();
        System.out.println(empleado1.hashCode()+"\n"+
        empleado1.toString()+"\n"+
        empleado1.equals(empleado100));
    }
}



