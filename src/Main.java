import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(123789, "Fernandez", 45789765, 120988765);

        CajaAhorro cajaAhorro1 = new CajaAhorro(200000.0, cliente1, 24.9);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(3000.0, cliente1);
        CuentaComitente cuentaComitente = new CuentaComitente(15000.0, cliente1, "1234");
        Cheque cheque1 = new Cheque(40000.0, "Banco Nacion", 12 / 9 / 2024);
        cajaAhorro1.depositarEfectivo(30000.0);
        cajaAhorro1.extraerEfectivo(50000.0);
        System.out.println("metodos de cuenta corriente ");
        cuentaCorriente.extraerEfectivo(20000.0);
        cuentaCorriente.depositarEfectivo(30000.0);
        // extraer sin clave
        boolean pudoExtraer = cuentaComitente.extraer(7000);
        System.out.println("Pudo extraer $7000 sin clave?: " + pudoExtraer);
        //extraer con clave
        pudoExtraer = cuentaComitente.extraer(7000.0, "1234");
        System.out.println("Pudo extraer $7000 con clave?: " + pudoExtraer);



    }

}

