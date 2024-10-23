import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(123789, "Fernandez", 45789765, 120988765);


        CajaAhorro cajaAhorro1 = new CajaAhorro(200000.0, cliente1, 24.9);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(3000.0, cliente1);
        CuentaComitente cuentaComitente = new CuentaComitente(15000.0, cliente1,"1234");
        Cheque cheque1 = new Cheque(40000.0, "Banco Nacion", new Date(124,9,23));
        cajaAhorro1.depositar(30000.0);
        cajaAhorro1.extraer(50000.0);
        System.out.println("metodos de cuenta corriente ");
        cuentaCorriente.extraer(20000.0);
        cuentaCorriente.depositar(30000.0);
        //relacion de uso
        System.out.println("probando metodos ");
        cuentaCorriente.depositarCheque(cheque1);
        cuentaComitente.extraer(60000.0);
        cuentaComitente.depositar(10000.0);






    }

}

