import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
        //sube Necesitamos crear una  clase Sube que tenga los siguientes atributos: codigo,
        // saldoDisponible,limiteSaldoNegativo. El limite de saldo es común a todas las instancias por lo que
        // corresponde que sea estatico y solo pueda ser modificado por la clase.
        // Armar el constructor y todos los getters y setters
        public static void main(String[] args) {

            Sube sube1= new Sube(123,2000.0 );
            System.out.println("ver el límite del saldo negativo");
            System.out.println( "desde la clase "+ Sube.getLimiteSaldoNegativo2()
                    + "\n"+ "desde el objeto "+ sube1.getLimiteSaldoNegativo()
            );

            Sube.setLimiteSaldoNegativo(5000.0);
            System.out.println(Sube.getLimiteSaldoNegativo2());







        }



    }















