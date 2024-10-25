import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Vendedor vendedor1 = new Vendedor(56123456,"Juan","F",456123,"A",60000.0,54);
     vendedor1.agregarTareas("ordenar estantes");
     vendedor1.listarTareas();



}
    }


