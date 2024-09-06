import entidades.Cuenta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Cuenta sergio = new Cuenta("Juan Perez", 54078976,200000.0,34455566,"JuanPerez12");

        System.out.println(sergio.toString());
        sergio.retirarCuenta(300000);
        sergio.transferirCuenta( 30000);
       // System.out.println(ollaAcero.stockDisponible());
        //ollaAcero.calcularGanancia();
       // System.out.println(" La ganancia es de : " + ollaAcero.calcularGanancia());





    }
}