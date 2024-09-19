import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //sube Necesitamos crear una  clase Sube que tenga los siguientes atributos: codigo,
        // saldoDisponible,limiteSaldoNegativo. El limite de saldo es común a todas las instancias por lo que
        // corresponde que sea estatico y solo pueda ser modificado por la clase.
        // Armar el constructor y todos los getters y setters


        Sube sube1 = new Sube(123456, 30000);
        System.out.println("ver el límite del saldo negativo " + sube1.getLimiteSaldoNegativo());
         sube1.setSaldoDisponible(2000.00);
        System.out.println(sube1.getSaldoDisponible());
        Sube.setLimiteSaldoNegativo(600.00);
        System.out.println(" ver el nuevo saldo negativo " + sube1.getLimiteSaldoNegativo());

        System.out.println(" llamo a el metodo to.string " + sube1.toString());


    }


}















