import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Mascota perro1 = new Mascota("copito",3,"canina");
    Mascota gato1 = new Mascota("guanina",2,"gatuna");
    Dueño sergio1 = new Dueño("sergio", 255256," CALLE 12");
    sergio1.registrarMascota(perro1);
    }
}



