import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Mamifero ornitorrinco = new Ornitorrinco("Perry",7,5);
ornitorrinco.comer();
ornitorrinco.amamantar();
((Oviparo)ornitorrinco).ponerHuevos();
    }
}



