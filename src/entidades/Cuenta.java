package entidades;

public class Cuenta {
    //Pablo es cliente de un banco X,
    // cuando abrió su caja de ahorro brindó su nombre, dni,
    // saldo inicial y le asignaron un número de cuenta.
    // A través de la web el banco X  le permite retirar,
    // depositar y recibir transferencias a su CBU pero para eso,
    // precisa que le indiquen su saldo, el titular, su CBU y alias.
    //
    //Realizar el UML correspondiente para utilizar la clase caja de ahorros en un programa del banco.
    //Crear una nueva rama con el n° de clase, guardar en la carpeta src el diagrama realizado y
    // escribir el código correspondiente.
    private String titular;
    private Integer dni;
    private Double saldoInicial;
    private Integer cbu;
    private String alias;
// retirarEfectivo seria una mejor opcion
    public void retirarCuenta(Double monto){


        if (saldoInicial >= monto){
            saldoInicial = this.saldoInicial- monto;
            System.out.println(saldoInicial);
        }else {
            System.out.println("Fondos Insuficientes");
        }
    }
    public void transferirCuenta( Double monto){
if (monto <= saldoInicial){
    saldoInicial= saldoInicial - monto;
    System.out.println("Transferencia exitosa"+ saldoInicial);
}else {
    System.out.println("Error de Transferencia");
}
    }
    public void depositarCuenta(double deposito){

    }
    public Cuenta(String titularC,Integer dniC,Double saldoInicialC,Integer cbuC,String aliasC){
        this.titular = titularC;
        this.dni = dniC;
        this.saldoInicial= saldoInicialC;
        this.cbu = cbuC;
        this.alias = aliasC;
    }


    public Integer getcbu(){
        return this.cbu;
}


}

