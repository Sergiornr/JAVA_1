import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Cliente cliente1 = new Cliente(123789,"Fernandez",45789765,120988765);

CajaAhorro cajaAhorro1 = new CajaAhorro(200000.0,cliente1,24.9);
//CuentaCorriente cuentaCorriente = new CuentaCorriente(289765.0,cliente1,600000.0);
 cajaAhorro1.depositarEfectivo(30000.0);
 cajaAhorro1.extraerEfectivo(50000.0);






    }

}

